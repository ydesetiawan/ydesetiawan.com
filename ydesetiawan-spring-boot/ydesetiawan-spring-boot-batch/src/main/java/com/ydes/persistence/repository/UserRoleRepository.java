package com.ydes.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ydes.persistence.model.UserRole;

/**
 * @author edys
 * @version 1.0, Jan 20, 2017
 * @since
 */
public interface UserRoleRepository extends JpaRepository<UserRole, String> {

}
