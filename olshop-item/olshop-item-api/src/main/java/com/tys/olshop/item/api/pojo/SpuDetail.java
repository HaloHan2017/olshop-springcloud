package com.tys.olshop.item.api.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author TYS
 * @date 2020/4/19 22:36
 */
@Data
@Accessors(chain = true)
@Table(name = "tb_spu_detail")
public class SpuDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long spuId;
    private String description;
    private String specTemplate;
    private String specifications;
    private String packingList;
    private String afterService;
}
