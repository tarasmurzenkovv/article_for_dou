package com.no.boilerplate.model;

import java.util.List;

import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Modifiable;
import org.immutables.value.Value.Parameter;

@Immutable
@Modifiable
public interface UserTweet {

  @Parameter
  Integer getUserAge();

  List<String> getAvailableTags();

  @Parameter
  String getUserNickName();
}
