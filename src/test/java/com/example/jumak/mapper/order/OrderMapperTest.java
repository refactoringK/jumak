package com.example.jumak.mapper.order;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderMapperTest {
    @Autowired
    OrderMapper orderMapper;

    OrderFinishVo orderFinishVo;
    OrderVo orderVo;

    @BeforeEach
    void setUp(){
        orderFinishVo = new OrderFinishVo();
        orderVo = new OrderVo();
    }

     @Test
    void selectByNumber() {
      orderMapper.selectByNumber();

    }



}