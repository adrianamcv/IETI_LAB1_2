package edu.eci.apiRestful.service;

import edu.eci.apiRestful.data.Task;
import edu.eci.apiRestful.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap< String , Task> tasks =  new  HashMap <> ();
    private Date date = new Date();

    @Override
    public Task create(TaskDto task) {
        Task task1 = new Task(String.valueOf(tasks.size()+1), task);
        tasks.put(task1.getId(), task1);
        return task1;
    }

    @Override
    public Task findById(String id) {
        Task task = tasks.get(id);
        return task;
    }

    @Override
    public List<Task> all() {
        ArrayList<Task> taskList = new ArrayList<>(tasks.values());
        return taskList;
    }

    @Override
    public boolean deleteById(String id) {
       return tasks.remove(id) != null;
    }

    @Override
    public Task update(TaskDto task, String id) {
        Task task1 = new Task(id, task);
        tasks.put(id, task1);
        return task1;
    }
}
