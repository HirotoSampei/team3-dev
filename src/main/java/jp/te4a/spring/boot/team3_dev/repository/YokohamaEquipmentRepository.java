package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import jp.te4a.spring.boot.team3_dev.bean.Yokohama;

@Repository
public interface YokohamaEquipmentRepository extends JpaRepository<Yokohama, Integer>{
	@Query("SELECT X FROM Yokohama X ORDER BY X.machine_id")
	  List<Yokohama> findAllOrderByMachine_id();

}

