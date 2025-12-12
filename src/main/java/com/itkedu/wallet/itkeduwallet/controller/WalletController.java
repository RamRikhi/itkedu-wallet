package com.itkedu.wallet.itkeduwallet.controller;


import com.itkedu.wallet.itkeduwallet.dto.ApiResponse;
import com.itkedu.wallet.itkeduwallet.dto.PaymentRequest;
import com.itkedu.wallet.itkeduwallet.dto.PaymentResponse;
import com.itkedu.wallet.itkeduwallet.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<PaymentResponse>> createPayment(@RequestBody PaymentRequest request) {
        walletService.processPayment(request);
        return null;
    }

    @GetMapping("/{walletId}")
    public ResponseEntity<ApiResponse<PaymentResponse>> getPaymentByWalletId(String walletId) {
        walletService.findPaymentByWalletId(walletId);
        return null;
    }
}
