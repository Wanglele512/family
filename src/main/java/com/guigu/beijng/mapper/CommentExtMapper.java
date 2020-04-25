package com.guigu.beijng.mapper;

import com.guigu.beijng.model.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}