package com.tsm.user.repository;

import com.tsm.user.entiry.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends CrudRepository<Score,Integer> , JpaRepository<Score,Integer> {
    Optional<Score> findById(Integer id);
}
