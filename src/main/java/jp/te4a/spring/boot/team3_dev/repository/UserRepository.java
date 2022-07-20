package jp.te4a.spring.boot.team3_dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.te4a.spring.boot.team3_dev.bean.UserBean;

public interface UserRepository extends JpaRepository<UserBean, String>{
}
