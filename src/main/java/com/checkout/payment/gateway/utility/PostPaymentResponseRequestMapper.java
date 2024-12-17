package com.checkout.payment.gateway.utility;

import com.checkout.payment.gateway.model.PostPaymentRequest;
import com.checkout.payment.gateway.model.PostPaymentResponse;

import java.util.UUID;

public class PostPaymentResponseRequestMapper {

  public static PostPaymentResponse requestResponseMapper(PostPaymentRequest paymentRequest, UUID id) {

    PostPaymentResponse paymentResponse= new PostPaymentResponse();
    paymentResponse.setAmount(paymentRequest.getAmount());
    paymentResponse.setCurrency(paymentRequest.getCurrency());
    paymentResponse.setId(id);
    paymentResponse.setCardNumberLastFour(paymentRequest.getCardNumberLastFour());
    paymentResponse.setExpiryMonth(paymentRequest.getExpiryMonth());
    paymentResponse.setExpiryYear(paymentRequest.getExpiryYear());
    return paymentResponse;
  }

}
