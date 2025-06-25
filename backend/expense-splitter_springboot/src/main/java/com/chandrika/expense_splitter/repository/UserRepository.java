package com.chandrika.expense_splitter.repository;

import com.chandrika.expense_splitter.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
