package com.springview1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositrary extends JpaRepository<User, Integer> {

}
