package com.no.boilerplate.service;

import com.no.boilerplate.model.ImmutableUserTweet;

import com.no.boilerplate.model.UserTweet;
import com.no.boilerplate.model.UserTweetEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = TagsMapper.class)
public interface UserTweetMapper {

    @Mappings({
            @Mapping(target = "tweetId", ignore = true),
            @Mapping(target = "tags", source = "availableTags")
    })
    UserTweetEntity map(UserTweet userTweet);

    @InheritInverseConfiguration
    ImmutableUserTweet map(UserTweetEntity userTweetEntity);
}
