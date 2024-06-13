package org.example.gtics_lab8_20191641.repository;

import org.example.gtics_lab8_20191641.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

}