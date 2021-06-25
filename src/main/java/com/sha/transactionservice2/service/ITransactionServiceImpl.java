package com.sha.transactionservice2.service;


import com.sha.transactionservice2.model.Transaction;
import com.sha.transactionservice2.repo.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ITransactionServiceImpl implements ITransactionService {


    @Autowired
    private ITransactionRepository transactionRepository;


    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());

        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId){

        transactionRepository.deleteById(transactionId);

    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }
}
