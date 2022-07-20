package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.te4a.spring.boot.team3_dev.bean.Saitama;


@Repository
public interface SaitamaEquipmentRepository extends JpaRepository<Saitama, Integer>{
	@Query("SELECT X FROM Saitama X ORDER BY X.machine_id")
	  List<Saitama> findAllOrderByMachine_id();

}

