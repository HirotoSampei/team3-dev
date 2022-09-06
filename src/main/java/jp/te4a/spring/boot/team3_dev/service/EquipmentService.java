package jp.te4a.spring.boot.team3_dev.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Equipment;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.EquipmentRepository;
import jp.te4a.spring.boot.team3_dev.repository.SortRepository;
@Service
public class EquipmentService {
  @Autowired
  EquipmentRepository equipmentRepository;
  @Autowired
  SortRepository sortRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Equipment equipment = new Equipment();
	  java.sql.Date sqlDate1 = java.sql.Date.valueOf(equipmentForm.getPurchase_date());
	  equipment.setPurchase_date(sqlDate1);
	  java.sql.Date sqlDate2 = java.sql.Date.valueOf(equipmentForm.getExpiration_date());
	  equipment.setExpiration_date(sqlDate2);
      BeanUtils.copyProperties(equipmentForm, equipment);
	  equipmentRepository.save(equipment);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  	Equipment equipment = new Equipment();
	  	java.sql.Date sqlDate1 = java.sql.Date.valueOf(equipmentForm.getPurchase_date());
		equipment.setPurchase_date(sqlDate1);  
		java.sql.Date sqlDate2 = java.sql.Date.valueOf(equipmentForm.getExpiration_date());
		  equipment.setExpiration_date(sqlDate2);
	  	BeanUtils.copyProperties(equipmentForm, equipment);
	  	equipmentRepository.save(equipment);
	  	return equipmentForm;
	  }
	  public void delete(Integer machine_id) {  equipmentRepository.deleteById(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Equipment> beanList = equipmentRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Equipment equipment: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      LocalDate localdate1 = equipment.getPurchase_date().toLocalDate();
	      equipmentForm.setPurchase_date(localdate1);
	      LocalDate localdate2 = equipment.getExpiration_date().toLocalDate();
	      equipmentForm.setExpiration_date(localdate2);
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
	  
	  public List<EquipmentForm> sort(String location) {
		    List<Equipment> sortList = sortRepository.findByLocation(location);
		    List<EquipmentForm> sortFormList = new ArrayList<EquipmentForm>();
		    for(Equipment equipment: sortList) {
			      EquipmentForm equipmentForm = new EquipmentForm();
			      LocalDate localdate1 = equipment.getPurchase_date().toLocalDate();
			      equipmentForm.setPurchase_date(localdate1);
			      LocalDate localdate2 = equipment.getExpiration_date().toLocalDate();
			      equipmentForm.setExpiration_date(localdate2);
			      BeanUtils.copyProperties(equipment, equipmentForm);
			      sortFormList.add(equipmentForm);
			    }
			    return sortFormList;
			}
		    /*EquipmentForm equipmentForm = new EquipmentForm();
		    BeanUtils.copyProperties(equipment, equipmentForm);
		    return equipmentForm;*/		  
	}
