package com.chandrika.expense_splitter.controller;

import com.chandrika.expense_splitter.model.Expense;
import com.chandrika.expense_splitter.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseRepository expenseRepository;

    //addExpense
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        expense.setDate(LocalDate.now());
        return expenseRepository.save(expense);
    }

    //getGroupExpense
    @GetMapping("/group/{GroupId}")
    public List<Expense> getGroupExpenses(@PathVariable("GroupId") String groupId){
        return expenseRepository.findByGroupId(groupId);
    }
}
