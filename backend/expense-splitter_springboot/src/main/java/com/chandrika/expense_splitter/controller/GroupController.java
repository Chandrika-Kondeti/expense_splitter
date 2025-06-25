package com.chandrika.expense_splitter.controller;

import com.chandrika.expense_splitter.model.Group;
import com.chandrika.expense_splitter.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupRepository groupRepository;

    //createGroup
    @PostMapping
    public Group createGroup(@RequestBody Group group){
        return groupRepository.save(group);
    }
    //getAllgroups
    @GetMapping
    public List<Group> getAllGroups(){
        return groupRepository.findAll();
    }

}
