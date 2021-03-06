package egor.mega.project.kvadrakopter.Controllers.ControllerInterfaces;

import egor.mega.project.kvadrakopter.Entityes.UserEntity;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface GetsUpdateDeleteEndPointsUserInterface {
    ResponseEntity<UserEntity> getUserById(long id);

    ResponseEntity<List<UserEntity>> getAllUsers();

    ResponseEntity<UserEntity> updateUserById(long id);

    ResponseEntity<UserEntity> deleteUserBuId(long id);
}
