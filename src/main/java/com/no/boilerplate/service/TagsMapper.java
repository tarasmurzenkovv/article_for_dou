package com.no.boilerplate.service;

import org.mapstruct.Mapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface TagsMapper {

    default String foldTags(List<String> tags) {
        return String.join(" ", tags);
    }

    default List<String> unFoldTags(String foldedTags) {
        return Arrays.stream(foldedTags.split(" ")).collect(Collectors.toList());
    }
}
