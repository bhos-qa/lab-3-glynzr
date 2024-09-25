package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {

    private PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        // Create a new instance of PermissionManager before each test
        permissionManager = new PermissionManager();
    }

    @Test
    void testGetRoleName_Admin() {
        // Test if getRoleName() returns "Admin" for ADMIN PermissionLevel
        assertEquals("Admin", permissionManager.getRoleName(PermissionLevel.ADMIN));
    }

    @Test
    void testGetRoleName_Developer() {
        // Test if getRoleName() returns "Developer" for DEVELOPER PermissionLevel
        assertEquals("Developer", permissionManager.getRoleName(PermissionLevel.DEVELOPER));
    }

    @Test
    void testGetRoleName_User() {
        // Test if getRoleName() returns "User" for USER PermissionLevel
        assertEquals("User", permissionManager.getRoleName(PermissionLevel.USER));
    }

    @Test
    void testSetPermissionLevel_And_GetCurrentPermissionLevel() {
        // Set permission level to ADMIN and check if mCurrentLevel is updated
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, permissionManager.getCurrentPermissionLevel());

        // Set permission level to DEVELOPER and check if mCurrentLevel is updated
        permissionManager.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER, permissionManager.getCurrentPermissionLevel());

        // Set permission level to USER and check if mCurrentLevel is updated
        permissionManager.setPermissionLevel(PermissionLevel.USER);
        assertEquals(PermissionLevel.USER, permissionManager.getCurrentPermissionLevel());
    }
}
