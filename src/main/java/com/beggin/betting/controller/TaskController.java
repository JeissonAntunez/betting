package com.beggin.betting.controller;

import com.beggin.betting.entity.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;


    @GetMapping
    public List<Task> getAllTasks(){
        return  tasks;
    }
}
