package lesson12.task3.project;

import java.util.List;
import java.util.Objects;

public class Project {

    private Integer id;
    private String startDate;
    private String endDate;
    private String name;
    private List<Integer> childIds;
    private List<Permissions> permissions;
    private Project parentProject;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(getId(), project.getId()) &&
                Objects.equals(getStartDate(), project.getStartDate()) &&
                Objects.equals(getEndDate(), project.getEndDate()) &&
                Objects.equals(getName(), project.getName()) &&
                Objects.equals(getChildIds(), project.getChildIds()) &&
                Objects.equals(getPermissions(), project.getPermissions()) &&
                Objects.equals(getParentProject(), project.getParentProject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStartDate(), getEndDate(), getName(), getChildIds(), getPermissions(), getParentProject());
    }

    public String getEndDate() {
        return endDate;
    }

    public Project setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Project setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public Project setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public Project setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
        return this;
    }

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public Project setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
        return this;
    }

    public Project getParentProject() {
        return parentProject;
    }

    public Project setParentProject(Project parentProject) {
        this.parentProject = parentProject;
        return this;
    }
}
