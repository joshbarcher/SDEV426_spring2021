package edu.greenriver.sdev.securitydemo.configuration;

import edu.greenriver.sdev.securitydemo.repositories.IMyUserRepository;
import edu.greenriver.sdev.securitydemo.services.UserAccountsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
    private UserAccountsService service;

    public SpringSecurityConfig(UserAccountsService service) //<-- dependency injection!
    {
        this.service = service;
    }

    //we have to define a spring bean that will hash passwords...
    @Bean
    public BCryptPasswordEncoder encoder()
    {
        //this method registers an object from an existing class as a bean
        return new BCryptPasswordEncoder();
    }

    //set up our authentication mechanism...
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        //configure in-memory user records, with a few default accounts...
        /*auth.inMemoryAuthentication()
            .withUser("admin_account").password(encoder().encode("password123?!")).roles("admin", "regular_user")
            .and()
            .withUser("user_account").password(encoder().encode("password456?!")).roles("regular_user");*/

        auth
            .userDetailsService(service)
            .passwordEncoder(encoder());
    }

    //configuring access to certain directories...
    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web
            .ignoring().antMatchers("/resources/**") //any subdirectory of the resources directory
            .and()
            .ignoring().antMatchers("/h2-console/**"); //any subdirectory of the h2 console
    }

    //configure a custom login/logout page, user roles and permissions
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
            .authorizeRequests()
                .antMatchers("/user/**").hasAnyRole("regular_user", "admin")
                .antMatchers("/admin/**").hasAnyRole("admin")
            .and()
            .formLogin()
                .permitAll()
                .loginProcessingUrl("/login");
    }
}
