package com.tys.olshop.item.api.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author TYS
 * @date 2020/4/19 22:04
 */
@Data
@Accessors(chain = true)
@Table(name = "tb_specification")
public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String specifications;
}
