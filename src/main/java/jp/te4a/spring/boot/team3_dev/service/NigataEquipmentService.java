package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Nigata;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.NigataEquipmentRepository;
@Service
public class NigataEquipmentService {
  @Autowired
  NigataEquipmentRepository nigataRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Nigata nigata = new Nigata();
	  BeanUtils.copyProperties(equipmentForm, nigata);
	  nigataRepository.save(nigata);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  	Nigata nigata = new Nigata();
	  	BeanUtils.copyProperties(equipmentForm, nigata);
	  	nigataRepository.save(nigata);
	  	return equipmentForm;
	  }
	  public void delete(Nigata machine_id) {  nigataRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Nigata> beanList = nigataRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Nigata nigata: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(nigata, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Nigata> nigata = nigataRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(nigata, equipmentForm);
	    return equipmentForm;
	  }
	}
