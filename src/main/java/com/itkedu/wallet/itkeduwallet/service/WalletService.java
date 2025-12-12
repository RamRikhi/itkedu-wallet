package com.itkedu.wallet.itkeduwallet.service;

import com.itkedu.wallet.itkeduwallet.dto.ApiResponse;
import com.itkedu.wallet.itkeduwallet.dto.PaymentRequest;
import com.itkedu.wallet.itkeduwallet.dto.PaymentResponse;

public interface WalletService {

    ApiResponse<PaymentResponse> processPayment(PaymentRequest request);
    ApiResponse<PaymentResponse> findPaymentByWalletId(String paymentId);
}
