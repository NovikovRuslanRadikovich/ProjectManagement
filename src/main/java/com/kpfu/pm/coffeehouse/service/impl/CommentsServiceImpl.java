package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.repository.CommentReposiory;
import com.kpfu.pm.coffeehouse.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentsServiceImpl implements CommentService {


    @Autowired
    CommentReposiory commentReposiory;
}
