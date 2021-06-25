package com.sha.transactionservice2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="user_id", nullable= false)
    private Long userId;

    @Column(name="product_id", nullable = false)
    private Long productId;

    @Column (name="transaction_time")
    private LocalDateTime transactionTime;


}
