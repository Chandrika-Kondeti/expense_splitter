package com.chandrika.expense_splitter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "expenses" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expense {
    @Id
    private String id;

    private String groupId;
    private String paidBy; //userId
    private Double amount;
    private String Description;
    private List<String> sharedWith;
    private LocalDate date;

}
