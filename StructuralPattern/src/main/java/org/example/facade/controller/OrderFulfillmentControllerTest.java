package org.example.facade.controller;

import org.example.facade.facade.OrderServiceFacadeImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderFulfillmentControllerTest {
    @GetMapping("/{id}")
    public ResponseEntity getFacade(@PathVariable int id) {

        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(id);
        boolean result=controller.orderFulfilled;

        if (result) {
            return ResponseEntity.ok("Order placed successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to place order.");
        }

    }
}