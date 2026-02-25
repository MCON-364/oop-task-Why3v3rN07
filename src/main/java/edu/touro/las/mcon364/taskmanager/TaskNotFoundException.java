package edu.touro.las.mcon364.taskmanager;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
    public TaskNotFoundException() { super("No task with that name found"); }
}
