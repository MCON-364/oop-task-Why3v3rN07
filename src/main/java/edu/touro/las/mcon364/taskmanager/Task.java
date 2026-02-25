package edu.touro.las.mcon364.taskmanager;

public record Task (String name, Priority priority, Status status) {
        public Task(String name, Priority priority) {
            this(name, priority, Status.TODO);
        }
}

