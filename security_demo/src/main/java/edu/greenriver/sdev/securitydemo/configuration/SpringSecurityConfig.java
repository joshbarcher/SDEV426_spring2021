package edu.greenriver.sdev.securitydemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
    //we have to define a spring bean that will hash passwords...
    @Bean
    public BCryptPasswordEncoder encoder()
    {
        //this method registers an object from an existing class as a bean
        return new BCryptPasswordEncoder();
    }

    //set up our authentication mechanism
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        //configure in-memory user records, with a few default accounts...
        auth.inMemoryAuthentication()
            .withUser("admin_account").password(encoder().encode("password123?!")).roles("admin", "regular_user");
    }
}
