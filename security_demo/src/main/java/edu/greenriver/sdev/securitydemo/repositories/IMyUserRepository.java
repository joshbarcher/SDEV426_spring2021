package edu.greenriver.sdev.securitydemo.repositories;

import edu.greenriver.sdev.securitydemo.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMyUserRepository extends JpaRepository<MyUser, Integer>
{
    MyUser getByUsernameEquals(String username);
}
