package com.popcorn.bootui.reposiroty;

import com.popcorn.bootui.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
