package com.itkedu.wallet.itkeduwallet.dto;

import java.util.List;

public record ApiResponse<T>(
        String status,
        int code,
        String message,
        T data,
        Metadata metadata,
        List<ErrorDetail> errors
) {
}
