package com.example.jumak.controller.order;

import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.domain.vo.order.PaymentVo;
import com.example.jumak.service.order.OrderService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderRestController {
    private final OrderService orderService;

    @GetMapping("/delivery")
    public OrderVo orderDelivery(@SessionAttribute("userNumber") Long userNumber){
       return orderService.findByUNumber(userNumber);
    }

    @PostMapping("/payment")
    public void paymentOrder(@RequestBody PaymentVo paymentVo){
        orderService.deliveryRegister(paymentVo);
        orderService.paymentRegister(paymentVo);
    }



}
