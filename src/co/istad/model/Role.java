package co.istad.model;

import co.istad.util.RoleName;

import java.util.Objects;

public class Role {
    private Long id;
    private RoleName roleName;
    private String description;

    public Role() {
    }

    public Role(Long id, RoleName roleName, String description) {
        this.id = id;
        this.roleName = roleName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role role)) return false;
        return getId().equals(role.getId()) && getRoleName() == role.getRoleName() && getDescription().equals(role.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoleName(), getDescription());
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName=" + roleName +
                ", description='" + description + '\'' +
                '}';
    }
}
