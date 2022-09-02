package jp.te4a.spring.boot.team3_dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import jp.te4a.spring.boot.team3_dev.bean.Equipment;

@Repository
public interface SortRepository extends JpaRepository<Equipment, String>{
	  List<Equipment> findByLocation(String location);
}