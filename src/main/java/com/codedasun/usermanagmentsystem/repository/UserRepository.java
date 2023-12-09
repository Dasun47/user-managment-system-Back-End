package com.codedasun.usermanagmentsystem.repository;

import com.codedasun.usermanagmentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
