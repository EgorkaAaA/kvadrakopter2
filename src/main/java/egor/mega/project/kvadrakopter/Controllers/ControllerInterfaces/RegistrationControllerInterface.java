package egor.mega.project.kvadrakopter.Controllers.ControllerInterfaces;

import egor.mega.project.kvadrakopter.Entityes.UserEntity;
import org.springframework.http.ResponseEntity;

public interface RegistrationControllerInterface {
    ResponseEntity<UserEntity> registrationEndPoint(UserEntity user);

    ResponseEntity<UserEntity> vkAuthEndPoint(UserEntity user);
}
