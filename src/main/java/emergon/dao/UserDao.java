package emergon.dao;

import emergon.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MyUser, Integer> {
    
    MyUser findByUsername(String username);
}
