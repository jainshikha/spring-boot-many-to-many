package com.bezkoder.spring.hibernate.manytomany.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data

public class TutorialRes implements Serializable {
  private static final long serialVersionUID = 1L;
  @JsonProperty("id")
  private long id;

  @JsonProperty( "title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("published")
  private boolean published;

  private List<Tag> tags = new ArrayList<>();

}
