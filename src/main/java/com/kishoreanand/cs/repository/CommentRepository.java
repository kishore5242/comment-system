package com.kishoreanand.cs.repository;

import org.springframework.data.repository.CrudRepository;

import com.kishoreanand.cs.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
