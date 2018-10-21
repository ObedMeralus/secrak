package vn.edu.ifi.secrak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import vn.edu.ifi.secrak.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
