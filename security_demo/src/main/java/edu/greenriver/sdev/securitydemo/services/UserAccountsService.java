package edu.greenriver.sdev.securitydemo.services;

import edu.greenriver.sdev.securitydemo.model.MyUser;
import edu.greenriver.sdev.securitydemo.repositories.IMyUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAccountsService implements UserDetailsService
{
    //I need access to MyUser objects and the database records backing them
    private IMyUserRepository repo;

    public UserAccountsService(IMyUserRepository repo) //<-- dependency injection!
    {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        MyUser user = repo.getByUsernameEquals(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
