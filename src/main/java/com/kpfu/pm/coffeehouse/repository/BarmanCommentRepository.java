package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.BarmanComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarmanCommentRepository extends CrudRepository<BarmanComment,Long> {


    BarmanComment save(BarmanComment barmanComment);
}
