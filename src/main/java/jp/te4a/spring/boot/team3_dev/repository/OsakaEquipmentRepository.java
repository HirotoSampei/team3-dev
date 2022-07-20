package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.te4a.spring.boot.team3_dev.bean.Osaka;


@Repository
public interface OsakaEquipmentRepository extends JpaRepository<Osaka, Integer>{
	@Query("SELECT X FROM Osaka X ORDER BY X.machine_id")
	  List<Osaka> findAllOrderByMachine_id();

}

