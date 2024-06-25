package com.sh.shop_kick_n_go.order.model.dao;

import com.sh.shop_kick_n_go.order.model.dto.CancelOrderDto;
import com.sh.shop_kick_n_go.order.model.dto.DeliveryDto;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderDto> findAllOrder();

    List<OrderDto> findAllDelivery();

    List<OrderDto> findAllCancelOrder();
}
