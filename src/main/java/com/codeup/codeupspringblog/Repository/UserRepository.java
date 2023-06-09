package com.codeup.codeupspringblog.Repository;

import com.codeup.codeupspringblog.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
