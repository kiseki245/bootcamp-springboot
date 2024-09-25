package com.bootcamp.demo_calculator.model;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Serialization: Java Object -> JSON Pain Text

// @Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Bag {
  @JsonProperty(value = "booklist")
  private List<Book> books;
  private Color color;

  public static enum Color {
    RED, YELLOW, BLUE;
  }
}
