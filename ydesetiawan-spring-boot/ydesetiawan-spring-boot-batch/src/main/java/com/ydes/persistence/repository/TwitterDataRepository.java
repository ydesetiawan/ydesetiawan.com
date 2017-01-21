package com.ydes.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ydes.persistence.model.TwitterData;

/**
 * @author edys
 * @version 1.0, Jan 21, 2017
 * @since
 */
public interface TwitterDataRepository extends
        JpaRepository<TwitterData, String> {

    List<TwitterData> findAllByOrderByPostingDateAsc();
}
