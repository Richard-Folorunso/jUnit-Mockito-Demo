package dev.folorunso.services;

import dev.folorunso.dao.UserDAO;
import dev.folorunso.models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserDAO userDAO;

    @InjectMocks
    UserService userService;

    User testUser;

    @Test
    void testGetUserById_Failure_IDLessThanZero() {
        assertNull(this.userService.getUserById(-1));
    }
}
