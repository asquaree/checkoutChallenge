package com.checkout.payment.gateway.controller;


import com.checkout.payment.gateway.service.PaymentGatewayService;
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

@ExtendWith(MockitoExtension.class)
public class PaymentGatewayControllerUnitTest {

  @InjectMocks
  private PaymentGatewayController paymentGatewayController;

  @Mock
  private PaymentGatewayService paymentGatewayService;

  private MockMvc mvc;


  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    mvc = MockMvcBuilders.standaloneSetup(paymentGatewayController).build();
  }
  
  
}
