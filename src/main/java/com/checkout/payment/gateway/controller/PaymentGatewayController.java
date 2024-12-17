package com.checkout.payment.gateway.controller;

import com.checkout.payment.gateway.model.PostPaymentResponse;
import com.checkout.payment.gateway.service.PaymentGatewayService;
import java.util.UUID;
import com.checkout.payment.gateway.utility.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentGatewayController {

  @Autowired
  private PaymentGatewayService paymentGatewayService;

  @GetMapping("/payment/{id}")
  public ResponseEntity<Object> getPostPaymentEventById(@PathVariable UUID id) {

    try {
      return new ResponseEntity<>(paymentGatewayService.getPaymentById(id), HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
      ApiResponse apiResponse = new ApiResponse(e.getMessage(), null,
          HttpStatus.BAD_REQUEST.value());
      return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
    }

  }
}
