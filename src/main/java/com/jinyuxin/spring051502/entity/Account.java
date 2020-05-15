package com.jinyuxin.spring051502.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther SamuelKing
 * @date 2020/5/14 14:53
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
  private Integer id;
  private String name;
  private Float money;

  @Override
  public String toString() {
    return "Account{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", money=" + money +
            '}';
  }
}
