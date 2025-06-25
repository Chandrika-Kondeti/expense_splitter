package com.chandrika.expense_splitter.repository;

import com.chandrika.expense_splitter.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
}
