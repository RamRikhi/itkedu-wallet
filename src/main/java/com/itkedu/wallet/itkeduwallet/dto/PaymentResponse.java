package com.itkedu.wallet.itkeduwallet.dto;

import java.util.UUID;

public record PaymentResponse(
        UUID walletId,
        double amount,
        OperationType operationType
) {
}
