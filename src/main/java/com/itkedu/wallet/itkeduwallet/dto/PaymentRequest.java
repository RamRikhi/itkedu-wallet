package com.itkedu.wallet.itkeduwallet.dto;

import java.util.UUID;

public record PaymentRequest(
        UUID walletId,
        double amount,
        OperationType operationType
) {
}
