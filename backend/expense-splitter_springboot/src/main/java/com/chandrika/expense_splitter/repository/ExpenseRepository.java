package com.chandrika.expense_splitter.repository;

import com.chandrika.expense_splitter.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findByGroupId(String groupId);
}
