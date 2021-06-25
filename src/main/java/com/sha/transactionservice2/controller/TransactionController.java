package com.sha.transactionservice2.controller;


import com.sha.transactionservice2.model.Transaction;
import com.sha.transactionservice2.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {


    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransactions(@RequestBody Transaction transaction){

        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);

    }

    @DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId){

        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);


    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllTransactionsOfUser(@PathVariable Long userId)
    {
        return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
    }
}
