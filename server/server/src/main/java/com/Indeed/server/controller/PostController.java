package com.Indeed.server.controller;

import com.Indeed.server.constants.ApiConstants;
import com.Indeed.server.dto.PostDTO;
import com.Indeed.server.model.PostModel;
import com.Indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
class PostController {

    final PostService postService;

    @PostMapping(ApiConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post ######");


        return this.postService.savePost(postDTORequest);
    }

    @GetMapping(ApiConstants.GET_ALL_POST)
    public List<PostModel> getAllPosts() {
        log.info("Getting all posts #######");
        return this.postService.getAllPosts();
    }
}


