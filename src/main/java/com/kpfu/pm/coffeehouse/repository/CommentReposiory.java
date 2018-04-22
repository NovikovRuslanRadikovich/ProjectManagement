package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentReposiory extends JpaRepository<Comment,Long> {
}
