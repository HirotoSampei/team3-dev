package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Equipment;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.EquipmentRepository;
@Service
public class EquipmentService {
  @Autowired
  EquipmentRepository equipmentRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Equipment equipment = new Equipment();
	  java.sql.Date sqlDate = java.sql.Date.valueOf(equipmentForm.getPurchase_date());
	  equipment.setPurchase_date(sqlDate);
      BeanUtils.copyProperties(equipmentForm, equipment);
	  equipmentRepository.save(equipment);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  	Equipment equipment = new Equipment();
	  	java.sql.Date sqlDate = java.sql.Date.valueOf(equipmentForm.getPurchase_date());
		equipment.setPurchase_date(sqlDate);  
	  	BeanUtils.copyProperties(equipmentForm, equipment);
	  	equipmentRepository.save(equipment);
	  	return equipmentForm;
	  }
	  public void delete(Equipment machine_id) {  equipmentRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Equipment> beanList = equipmentRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Equipment equipment: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(equipment, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Equipment> equipment = equipmentRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(equipment, equipmentForm);
	    return equipmentForm;
	  }
	}
