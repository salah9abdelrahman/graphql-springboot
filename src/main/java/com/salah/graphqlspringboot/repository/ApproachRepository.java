package com.salah.graphqlspringboot.repository;

import com.salah.graphqlspringboot.model.Approach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApproachRepository extends JpaRepository<Approach, Long> {
}
