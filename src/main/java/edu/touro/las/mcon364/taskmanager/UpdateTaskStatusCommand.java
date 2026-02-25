package edu.touro.las.mcon364.taskmanager;

public non-sealed class UpdateTaskStatusCommand implements Command {
    private final TaskRegistry registry;
    private final String taskName;
    private final Status newStatus;

    public UpdateTaskStatusCommand(TaskRegistry registry, String taskName, Status newStatus) {
        this.registry = registry;
        this.taskName = taskName;
        this.newStatus = newStatus;
    }

    public void execute() {
        // NOTE: This demonstrates old-style null checking
        // Students should refactor to use Optional and custom exceptions
        Task existing = registry.get(taskName).orElseThrow(() -> new TaskNotFoundException("Task "+taskName+" not found"));

        // Create a new task with updated status (tasks are immutable)
        Task updated = new Task(existing.name(), existing.priority(), newStatus);
        registry.add(updated);  // This replaces the old task
    }
}
