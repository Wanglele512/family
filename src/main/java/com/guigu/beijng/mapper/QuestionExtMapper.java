package com.guigu.beijng.mapper;

import com.guigu.beijng.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionExtMapper {
    int incView(Question question);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

}