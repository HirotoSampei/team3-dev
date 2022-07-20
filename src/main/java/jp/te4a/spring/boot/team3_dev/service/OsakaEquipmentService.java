package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Osaka;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.OsakaEquipmentRepository;
@Service
public class OsakaEquipmentService {
  @Autowired
  OsakaEquipmentRepository osakaRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Osaka osaka = new Osaka();
	  BeanUtils.copyProperties(equipmentForm, osaka);
	  osakaRepository.save(osaka);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  Osaka osaka = new Osaka();
	  	BeanUtils.copyProperties(equipmentForm, osaka);
	  	osakaRepository.save(osaka);
	  	return equipmentForm;
	  }
	  public void delete(Osaka machine_id) {  osakaRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Osaka> beanList = osakaRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Osaka osaka: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(osaka, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Osaka> osaka = osakaRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(osaka, equipmentForm);
	    return equipmentForm;
	  }
	}
