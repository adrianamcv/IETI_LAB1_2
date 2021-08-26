package edu.eci.apiRestful.controller;

import edu.eci.apiRestful.data.Task;
import edu.eci.apiRestful.dto.TaskDto;
import edu.eci.apiRestful.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )

public class TaskController {
    private final TaskService userService;

    public TaskController(@Autowired TaskService userService )
    {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all()
    {
        List<Task> tasks = userService.all();
        return new ResponseEntity<>(tasks, HttpStatus.FOUND);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById(@PathVariable String id )
    {
        Task task = userService.findById(id);
        return new ResponseEntity<>(task, HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto)
    {
        Task task = userService.create(taskDto);
        return new ResponseEntity<>(task,HttpStatus.ACCEPTED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id )
    {
        Task task = userService.update(taskDto,id);
        return new ResponseEntity<>(task,HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete(@PathVariable String id )
    {
        boolean result = userService.deleteById(id);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

}
