package Dheircode;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class userTest {

    private User user;

    @Before
    public void setUp() {
        user = new User();

       
        user.setUserId("admin");
        user.setPassword("1234");
        user.firstName = "samuel";
        user.email = "sami@gmail.com";
        user.phoneNo = "0912345678";
        user.role = "ADMIN";
        user.kebele = "Kebele 05";
    }

    // -------- Login Tests --------

    @Test
    public void testLoginSuccess() {
        boolean result = user.login("admin", "1234");

        assertTrue(result);
        assertTrue(user.isLoggedIn());
        assertEquals("ACTIVE", user.status);
    }

    @Test
    public void testLoginFailure() {
        boolean result = user.login("admin", "wrong");

        assertFalse(result);
        assertFalse(user.isLoggedIn());
        assertEquals("INACTIVE", user.status);
    }

    // -------- Logout Test --------

    @Test
    public void testLogout() {
        user.login("admin", "1234");
        user.logout();

        assertFalse(user.isLoggedIn());
        assertEquals("INACTIVE", user.status);
    }


    @Test
    public void testViewDashboardLoggedIn() {
        user.login("admin", "1234");
        assertEquals("Welcome samuel", user.viewDashboard());
    }

    @Test
    public void testViewDashboardLoggedOut() {
        assertEquals("Access Denied", user.viewDashboard());
    }

    // -------- Getter & Setter Tests --------

    @Test
    public void testSetAndGetId() {
        user.setId(10);
        assertEquals(10, user.getId());
    }

    @Test
    public void testSetAndGetUserId() {
        user.setUserId("user01");
        assertEquals("user01", user.getUserId());
    }

    // -------- Public Field Tests --------

    @Test
    public void testPublicFields() {
        assertEquals("samuel", user.firstName);
        assertEquals("sami@gmail.com", user.email);
        assertEquals("0912345678", user.phoneNo);
        assertEquals("ADMIN", user.role);
        assertEquals("Kebele 05", user.kebele);
    }
}

