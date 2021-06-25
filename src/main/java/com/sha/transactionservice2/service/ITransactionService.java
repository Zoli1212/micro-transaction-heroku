package com.sha.transactionservice2.service;

import com.sha.transactionservice2.model.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ITransactionService {


    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
