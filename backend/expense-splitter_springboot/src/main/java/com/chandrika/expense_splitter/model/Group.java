package com.chandrika.expense_splitter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "group")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    @Id
    private String id;

    private String groupName;
    private List<String> members;
}
