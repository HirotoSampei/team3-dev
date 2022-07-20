package jp.te4a.spring.boot.team3_dev.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.team3_dev.bean.Sendai;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.repository.SendaiEquipmentRepository;
@Service
public class SendaiEquipmentService {
  @Autowired
  SendaiEquipmentRepository sendaiRepository;
  public EquipmentForm create(EquipmentForm equipmentForm) {
	  Sendai sendai = new Sendai();
	  BeanUtils.copyProperties(equipmentForm, sendai);
	  sendaiRepository.save(sendai);
	  return equipmentForm;
  }
  public EquipmentForm update(EquipmentForm equipmentForm) {
	  	Sendai sendai = new Sendai();
	  	BeanUtils.copyProperties(equipmentForm, sendai);
	  	sendaiRepository.save(sendai);
	  	return equipmentForm;
	  }
	  public void delete(Sendai machine_id) {  sendaiRepository.delete(machine_id); }
	  public List<EquipmentForm> findAll() {
	    List<Sendai> beanList = sendaiRepository.findAll();
	    List<EquipmentForm> formList = new ArrayList<EquipmentForm>();
	    for(Sendai sendai: beanList) {
	      EquipmentForm equipmentForm = new EquipmentForm();
	      BeanUtils.copyProperties(sendai, equipmentForm);
	      formList.add(equipmentForm);
	    }
	    return formList;
	    }
	  public EquipmentForm findOne(Integer machine_id) {
	    Optional<Sendai> sendai = sendaiRepository.findById(machine_id);
	    EquipmentForm equipmentForm = new EquipmentForm();
	    BeanUtils.copyProperties(sendai, equipmentForm);
	    return equipmentForm;
	  }
	}
