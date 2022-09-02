package jp.te4a.spring.boot.team3_dev.controller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.te4a.spring.boot.team3_dev.bean.Equipment;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.service.EquipmentService;

@Controller
@RequestMapping("equipment")
public class EquipmentController {
  @Autowired
  EquipmentService equipmentService;
  @ModelAttribute
  EquipmentForm setUpForm() {
    return new EquipmentForm();
  }
  @GetMapping
  String list(Model model) {
    model.addAttribute("equipment_table", equipmentService.findAll());
    return "equipment/list";
  }
  @GetMapping(path="register")
  String register() {
    return "equipment/register";
  }
  @PostMapping(path="create")
  String create(@Validated EquipmentForm form, BindingResult result , Model model) {
    if(result.hasErrors()) {
      return "equipment/register";
    }
    
    equipmentService.create(form);
    return "redirect:/equipment";
  }

  @PostMapping(path = "edit", params = "form")
  String editForm(@RequestParam Integer machine_id, EquipmentForm form) {
    EquipmentForm equipmentForm = equipmentService.findOne(machine_id);
    BeanUtils.copyProperties(equipmentForm,  form);
    return "equipment/edit";
  }
  @PostMapping(path = "edit")
  String edit(@RequestParam Integer machine_id, @Validated EquipmentForm form,
                                                                                                                           BindingResult result) {
  if(result.hasErrors()) {
  return editForm(machine_id, form);
  }
  equipmentService.update(form);
  return "redirect:/equipment";
  }

  @PostMapping(path = "delete")
  String delete(@RequestParam Equipment machine_id) {
    equipmentService.delete(machine_id);
    return "redirect:/equipment";
  }
  @PostMapping(path = "edit", params = "goToTop")
  String goToTop() {
    return "redirect:/equipment";
  }
  
  @PostMapping(path = "sort", params = "form")
  String editForm(@RequestParam String location, EquipmentForm form) {
    EquipmentForm equipmentForm = equipmentService.sort(location);
    BeanUtils.copyProperties(equipmentForm,  form);
    return "redirect:/equipment";
  }
 
}
