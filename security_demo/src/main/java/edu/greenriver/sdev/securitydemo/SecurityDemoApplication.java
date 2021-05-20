package edu.greenriver.sdev.securitydemo;

import edu.greenriver.sdev.securitydemo.model.Authority;
import edu.greenriver.sdev.securitydemo.model.MyUser;
import edu.greenriver.sdev.securitydemo.repositories.IMyUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityDemoApplication
{
    public static void main(String[] args)
    {
        ApplicationContext container = SpringApplication.run(SecurityDemoApplication.class, args);

        IMyUserRepository repo = container.getBean(IMyUserRepository.class);
        BCryptPasswordEncoder encoder = container.getBean(BCryptPasswordEncoder.class);

        MyUser testUser = MyUser.builder()
            .username("user_account")
            .password(encoder.encode("password123?!"))
            .authorities(new ArrayList<>())
            .build();
        repo.save(testUser);

        testUser.getAuthorities().add(Authority.builder().authority("regular_user").build());
        repo.save(testUser);
    }
}
