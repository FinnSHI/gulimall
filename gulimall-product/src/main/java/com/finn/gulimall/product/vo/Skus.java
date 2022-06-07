package com.finn.gulimall.product.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/*
 * @description:
 * @author: Finn
 * @create: 2022/06/07 20:56
 */
@Data
public class Skus {

    private List<Attr> attr;

    private String skuName;

    private BigDecimal price;

    private String skuTitle;

    private String skuSubtitle;

    private List<Images> images;

    private List<String> descar;

    private int fullCount;

    private BigDecimal discount;

    private int countStatus;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    private int priceStatus;

    private List<MemberPrice> memberPrice;
}