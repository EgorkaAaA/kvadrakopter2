package egor.mega.project.kvadrakopter.Repositories;

import egor.mega.project.kvadrakopter.Entityes.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserName(String userName);
}
