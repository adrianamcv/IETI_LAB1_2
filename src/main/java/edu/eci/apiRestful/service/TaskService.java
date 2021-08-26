package edu.eci.apiRestful.service;

import edu.eci.apiRestful.data.Task;
import edu.eci.apiRestful.dto.TaskDto;

import java.util.List;

public interface TaskService {
        Task create( TaskDto task );
        Task findById( String id );
        List<Task> all();
        boolean deleteById( String id );
        Task update( TaskDto task, String id );
    }
