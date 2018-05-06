package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.CoffeeHouseComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeHouseCommentReposiory extends CrudRepository<CoffeeHouseComment,Long> {

    CoffeeHouseComment save(CoffeeHouseComment comment);
}
