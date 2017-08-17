package com.mmall.vo;

import com.mmall.pojo.OrderItem;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mark on 17-8-17.
 */
public class OrderProductVo {

    private List<OrderItemVo> orderItemVoList;
    private BigDecimal payment;
    private String imageHost;

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public List<OrderItemVo> getOrderItemVoList() {

        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }
}
