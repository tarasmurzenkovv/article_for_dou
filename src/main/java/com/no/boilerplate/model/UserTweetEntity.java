package com.no.boilerplate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class UserTweetEntity {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long tweetId;

  private Integer userAge;
  private String tags;
  private String userNickName;
}
