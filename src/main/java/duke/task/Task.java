package duke.task;

import duke.DukeException;

public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Instantiate Task object.
     *
     * @param description description of task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Instantiate Task object with completion status specified.
     *
     * @param description description of task.
     * @param isDone indicates whether task is completed.
     */
    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public void markDone() throws DukeException {
        this.isDone = true;
    }

    public boolean getIsDone() throws DukeException {
        return this.isDone;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean checkIfDuplicate(Task otherTask) {
        return description.equals(otherTask.getDescription());
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }
}

