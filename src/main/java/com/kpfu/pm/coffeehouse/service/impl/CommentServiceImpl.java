package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.dto.CommentDto;
import com.kpfu.pm.coffeehouse.dto.response.CommentResponseDto;
import com.kpfu.pm.coffeehouse.entity.*;
import com.kpfu.pm.coffeehouse.repository.BarmanCommentRepository;
import com.kpfu.pm.coffeehouse.repository.CoffeeHouseCommentReposiory;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import com.kpfu.pm.coffeehouse.service.CommentService;
import com.kpfu.pm.coffeehouse.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CoffeeHouseCommentReposiory coffeeHouseCommentReposiory;

    @Autowired
    BarmanCommentRepository barmanCommentRepository;

    @Autowired
    SecurityService securityService;

    @Autowired
    CoffeeHouseService coffeeHouseService;

    @Autowired
    BarmanService barmanService;

    @Override
    public void createCommentOfCoffeeHouse(CommentDto commentDto) {
        CoffeeHouseComment coffeeHouseComment = new CoffeeHouseComment();
        coffeeHouseComment.setComment_text(commentDto.getCommentText());

        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(commentDto.getAddressant_id());
        coffeeHouseComment.setCommentscoffeeHouse(coffeeHouse);

        User user = securityService.getCurrentUser();
        coffeeHouseComment.setOwner(user);

        coffeeHouseCommentReposiory.save(coffeeHouseComment);

    }

    @Override
    public void createCommentOfBarman(CommentDto commentDto) {
        BarmanComment barmanComment = new BarmanComment();
        barmanComment.setComment_text(commentDto.getCommentText());

        Barman barman = barmanService.findOneById(commentDto.getAddressant_id());

        barmanComment.setCommentsbarman(barman);

        User user = securityService.getCurrentUser();
        barmanComment.setOwner(user);

        barmanCommentRepository.save(barmanComment);
    }


    @Override
    public List<CommentResponseDto> getAllByCoffeeHouse(long coffeeHouseId) {
        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeeHouseId);
        return coffeeHouse.getCoffeeHouseComments().stream().map(this::toCommentResponseDto).
                collect(Collectors.toList());
    }

    @Override
    public List<CommentResponseDto> getAllByBarman(long barmanId) {
        Barman barman = barmanService.findOneById(barmanId);

        return barman.getBarmanComments().stream().map(this::toCommentResponseDto).
                collect(Collectors.toList());
    }

    CommentResponseDto toCommentResponseDto(Comment comment) {
        CommentResponseDto commentResponseDto = new CommentResponseDto();
        commentResponseDto.setCommentText(comment.getComment_text());
        commentResponseDto.setOwner_name(comment.getOwner().getUsername());
        return commentResponseDto;
    }


}
