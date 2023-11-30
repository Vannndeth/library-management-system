package co.istad.util;

public enum Permission {
    CREATE("write"),
    READ("read"),
    UPDATE("update"),
    DELETE("delete");
    private String description;
    Permission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
