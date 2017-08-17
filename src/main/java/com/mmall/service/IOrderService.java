package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by mark on 17-8-15.
 */
public interface IOrderService {

    ServerResponse create(Integer userId, Integer shippingId);

    ServerResponse cancel(Integer userId, Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse getOrderDetail(Integer userId, Long orderNo);

    ServerResponse getOrderList(Integer userId, int pageNum, int pageSize);

    ServerResponse manageList(int pageNum, int pageSize);

    ServerResponse manageDetail(Long orderNo);

    ServerResponse manageSearch(Long orderNo, int pageNum, int pageSize);

    ServerResponse manageSendGoods(Long orderNo);

    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String, String> params);

    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);
}
