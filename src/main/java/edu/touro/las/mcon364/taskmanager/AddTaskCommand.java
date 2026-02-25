package edu.touro.las.mcon364.taskmanager;

public non-sealed class AddTaskCommand implements Command {
    private final TaskRegistry registry;
    private final Task task;

    public AddTaskCommand(TaskRegistry registry, Task task) {
        this.registry = registry;
        if (task.name() == null || task.name().isBlank()) {
            throw new InvalidTaskException("Task cannot be nameless");
        }
        this.task = task;
    }

    public void execute() {
        registry.add(task);
    }
}
