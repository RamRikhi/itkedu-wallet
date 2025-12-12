package com.itkedu.wallet.itkeduwallet.repository;

import com.itkedu.wallet.itkeduwallet.model.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletRepository extends JpaRepository<PaymentEntity, UUID> {
}
