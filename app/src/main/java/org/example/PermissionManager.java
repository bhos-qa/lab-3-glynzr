package org.example;

public class PermissionManager {

    private PermissionLevel mCurrentLevel = PermissionLevel.USER;


    public String getRoleName(PermissionLevel level) {
        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                throw new IllegalArgumentException("Invalid permission level");
        }
    }


    public void setPermissionLevel(PermissionLevel level) {
        this.mCurrentLevel = level;
    }


    public PermissionLevel getCurrentPermissionLevel() {
        return this.mCurrentLevel;
    }
}

