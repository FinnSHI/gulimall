package com.finn.gulimall.seckill.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.finn.gulimall.seckill.vo.SkuInfoVO;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description: Redis中存放的skuInfo的信息
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-07-09 21:39
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeckillSkuRedisEntity {

    /**
     * 活动id
     */
    private Long promotionId;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀总量
     */
    private Integer seckillCount;

    /**
     * 每人限购数量
     */
    private Integer seckillLimit;

    /**
     * 排序
     */
    private Integer seckillSort;

    // sku的详细信息
    private SkuInfoVO skuInfo;

    // 当前商品秒杀的开始时间
    private Long startTime;

    // 当前商品秒杀的结束时间
    private Long endTime;

    // 当前商品秒杀的随机码
    private String randomCode;
}
