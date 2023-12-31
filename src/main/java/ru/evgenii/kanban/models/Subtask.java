package ru.evgenii.kanban.models;

import ru.evgenii.kanban.utils.TaskStatus;
import ru.evgenii.kanban.utils.TaskType;

import java.util.Objects;

public class Subtask extends Task {
    private Epic epic;

    public Subtask(String name, String description, Epic epic) {
        super(name, description, TaskType.SUBTASK);
        this.epic = epic;
    }

    public Subtask(String name, String description, Epic epic, String startTime, int duration) {
        super(name, description, TaskType.SUBTASK, startTime, duration);
        this.epic = epic;
    }

    public Subtask(int id, String name, String description, TaskStatus status, TaskType taskType, Epic epic) {
        super(id, name, description, status, taskType);
        this.epic = epic;
    }

    public Subtask(int id, String name, String description, TaskStatus status, TaskType taskType, Epic epic, String startTime, int duration) {
        super(id, name, description, status, taskType, startTime, duration);
        this.epic = epic;
    }

    public Subtask(int id) {
        super(id);
    }

    public Epic getEpic() {
        return epic;
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "epic=" + epic.getId() +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", taskType=" + taskType +
                ", duration=" + duration +
                ", startTime=" + startTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Subtask subtask = (Subtask) o;
        return epic.getId() == subtask.epic.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), epic.getId());
    }
}
