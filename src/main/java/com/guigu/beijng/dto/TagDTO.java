package com.guigu.beijng.dto;

import lombok.Data;

import java.util.List;
@Data
public class TagDTO {

    private String categoryName;
    private List<String> tags;
}
