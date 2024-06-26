package com.ohgiraffers.techmya.admin.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("orderlist")
    public String pageOrderList() {
        return "admin/order/orderlist";
    }
}
