package com.itkedu.wallet.itkeduwallet.service;

import com.itkedu.wallet.itkeduwallet.dto.ApiResponse;
import com.itkedu.wallet.itkeduwallet.dto.PaymentRequest;
import com.itkedu.wallet.itkeduwallet.dto.PaymentResponse;
import org.springframework.stereotype.Service;


@Service
public class WalletServiceImpl implements WalletService{
    @Override
    public ApiResponse<PaymentResponse> processPayment(PaymentRequest request) {
        return null;
    }

    @Override
    public ApiResponse<PaymentResponse> findPaymentByWalletId(String paymentId) {
        return null;
    }
}
