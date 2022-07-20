package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Yokohama;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.YokohamaEquipmentRepository;
@Service
public class YokohamaEquipmentService {
  @Autowired
  YokohamaEquipmentRepository yokohamaRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Yokohama yokohama = new Yokohama();
	  BeanUtils.copyProperties(equipmentForm, yokohama);
	  yokohamaRepository.save(yokohama);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  Yokohama yokohama = new Yokohama();
	  	BeanUtils.copyProperties(equipmentForm, yokohama);
	   yokohamaRepository.save(yokohama);
	  	return equipmentForm;
	  }
	  public void delete(Yokohama machine_id) {  yokohamaRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Yokohama> beanList = yokohamaRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Yokohama yokohama: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(yokohama, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Yokohama> yokohama = yokohamaRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(yokohama, equipmentForm);
	    return equipmentForm;
	  }
	}
