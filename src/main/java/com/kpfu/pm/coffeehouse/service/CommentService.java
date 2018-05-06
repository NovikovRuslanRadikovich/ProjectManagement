package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.CommentDto;
import com.kpfu.pm.coffeehouse.dto.response.CommentResponseDto;

import java.util.List;

public interface CommentService {

    void createCommentOfCoffeeHouse(CommentDto commentDto);

    void createCommentOfBarman(CommentDto commentDto);

    List<CommentResponseDto> getAllByCoffeeHouse(long coffeehouseId);

    List<CommentResponseDto> getAllByBarman(long barmanId);
}
