package com.checkout.payment.gateway.controller;


import com.checkout.payment.gateway.service.PaymentGatewayService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.MissingServletRequestParameterException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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


  @Test
  public void payment() throws Exception {

//     } String result = mockMvc.perform(MockMvcRequestBuilders.post(ENDPOINT)
//          .param(DATE_TIME, "16-12-2024 14:30:00")
//          .param(SOURCE, "Delhi")
//          .param(DESTINATION, "Mumbai") // Missing "distanceRange"
//      )
//      .andExpect(status().is4xxClientError()) // Expect 400 HTTP error
//      .andReturn()
//      .getResponse()
//      .getContentAsString();
//
//  assertThrows(MissingServletRequestParameterException.class, () -> {
//    throw new MissingServletRequestParameterException("distanceRange", "Double");
//  });
////        assertEquals("Param missing", result, "Expected an error message indicating the missing 'distanceRange' parameter.");
//
  }

}
