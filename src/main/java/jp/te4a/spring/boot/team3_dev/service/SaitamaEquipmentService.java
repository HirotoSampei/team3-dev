package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Saitama;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.SaitamaEquipmentRepository;
@Service
public class SaitamaEquipmentService {
  @Autowired
  SaitamaEquipmentRepository saitamaRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Saitama saitama = new Saitama();
	  BeanUtils.copyProperties(equipmentForm, saitama);
	  saitamaRepository.save(saitama);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  	Saitama saitama = new Saitama();
	  	BeanUtils.copyProperties(equipmentForm, saitama);
	  	saitamaRepository.save(saitama);
	  	return equipmentForm;
	  }
	  public void delete(Saitama machine_id) {  saitamaRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Saitama> beanList = saitamaRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Saitama saitama: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(saitama, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Saitama> saitama = saitamaRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(saitama, equipmentForm);
	    return equipmentForm;
	  }
	}
