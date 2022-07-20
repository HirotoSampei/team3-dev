package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.te4a.spring.boot.team3_dev.bean.Sendai;


@Repository
public interface SendaiEquipmentRepository extends JpaRepository<Sendai, Integer>{
	@Query("SELECT X FROM Sendai X ORDER BY X.machine_id")
	  List<Sendai> findAllOrderByMachine_id();

}

