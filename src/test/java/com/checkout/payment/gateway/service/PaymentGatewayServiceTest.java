package com.checkout.payment.gateway.service;

import static org.junit.jupiter.api.Assertions.*;

import com.checkout.payment.gateway.controller.PaymentGatewayController;
import com.checkout.payment.gateway.repository.PaymentsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

class PaymentGatewayServiceTest {


  @InjectMocks
  private PaymentGatewayService paymentGatewayService;

  @Mock
  private PaymentsRepository paymentsRepository;



  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }
  //unit


  //integration

}