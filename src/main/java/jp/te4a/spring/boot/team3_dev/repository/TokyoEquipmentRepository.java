package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import jp.te4a.spring.boot.team3_dev.bean.Tokyo;

@Repository
public interface TokyoEquipmentRepository extends JpaRepository<Tokyo, Integer>{
	@Query("SELECT X FROM Tokyo X ORDER BY X.machine_id")
	  List<Tokyo> findAllOrderByMachine_id();

}
