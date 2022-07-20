package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.te4a.spring.boot.team3_dev.bean.Nigata;


@Repository
public interface NigataEquipmentRepository extends JpaRepository<Nigata, Integer>{
	@Query("SELECT X FROM Nigata X ORDER BY X.machine_id")
	  List<Nigata> findAllOrderByMachine_id();

}

