package com.Indeed.server.service;

import com.Indeed.server.dto.PostDTO;
import com.Indeed.server.model.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savePost(PostDTO postDTO);

    public List<PostModel> getAllPosts();
}
