package com.Indeed.server.dao;

import com.Indeed.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository <PostModel, String> {

}
