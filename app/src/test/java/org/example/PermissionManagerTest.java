package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class PermissionManagerTest {
    @Test
    void testGetRoleName() {
        PermissionManager manager = new PermissionManager();
        // Test the getRoleName method for each enum value
        assertEquals("USER", manager.getRoleName());
    }
    @Test
    void testSetCurrentLevel() {
        PermissionManager manager = new PermissionManager();
        // Test setting the current level
        manager.setRoleName(PermissionLevel.USER);
        assertEquals("USER", manager.getRoleName());
        manager.setRoleName(PermissionLevel.ADMIN);
        assertEquals("ADMIN", manager.getRoleName());
        manager.setRoleName(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", manager.getRoleName());
    }
}
