package edu.touro.las.mcon364.taskmanager;

public sealed interface Command
        permits AddTaskCommand, UpdateTaskCommand, RemoveTaskCommand, UpdateTaskStatusCommand
    { void execute(); }
