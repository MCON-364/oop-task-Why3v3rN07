package edu.touro.las.mcon364.taskmanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TaskRegistry {
    private final Map<String, Task> tasks = new HashMap<>();

    public void add(Task task) {
        tasks.put(task.name(), task);
    }

    public Optional<Task> get(String name) {
        return Optional.ofNullable(tasks.get(name));
    }

    public void remove(String name) {
        tasks.remove(name);
    }

    public Map<String, Task> getAll() {
        return tasks;
    }

    public Map<Priority, List<Task>> getTasksByPriority() {
        Map<Priority, List<Task>> sorted = new HashMap<>();
        for (Task task : tasks.values()) {
            if (!sorted.containsKey(task.priority())) {
                sorted.put(task.priority(), new java.util.ArrayList<>());
            }
            sorted.get(task.priority()).add(task);
        }
        return sorted;
    }
}
