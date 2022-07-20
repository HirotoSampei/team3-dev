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

import jp.te4a.spring.boot.team3_dev.bean.Yokohama;
import jp.te4a.spring.boot.team3_dev.form.EquipmentForm;
import jp.te4a.spring.boot.team3_dev.service.YokohamaEquipmentService;

@Controller
@RequestMapping("yokohama")
public class YokohamaEquipmentController {
  @Autowired
  YokohamaEquipmentService yokohamaService;
  @ModelAttribute 
  EquipmentForm setUpForm() {
    return new EquipmentForm();
  }
  @GetMapping
  String list(Model model) {
    model.addAttribute("books", yokohamaService.findAll());
    return "books/list";
  }
  @PostMapping(path="create")
  String create(@Validated EquipmentForm form, BindingResult result , Model model) {
    if(result.hasErrors()) {
      return list(model);
    }
    yokohamaService.create(form);
    return "redirect:/books";
  }

  @PostMapping(path = "edit", params = "form")
  String editForm(@RequestParam Integer machine_id, EquipmentForm form) {
    EquipmentForm equipmentForm = yokohamaService.findOne(machine_id);
    BeanUtils.copyProperties(equipmentForm,  form);
    return "books/edit";
  }
  @PostMapping(path = "edit")
  String edit(@RequestParam Integer machine_id, @Validated EquipmentForm form,
                                                                                                                           BindingResult result) {
  if(result.hasErrors()) {
  return editForm(machine_id, form);
  }
  yokohamaService.update(form);
  return "redirect:/books";
  }

  @PostMapping(path = "delete")
  String delete(@RequestParam Yokohama machine_id) {
    yokohamaService.delete(machine_id);
    return "redirect:/books";
  }
  @PostMapping(path = "edit", params = "goToTop")
  String goToTop() {
    return "redirect:/books";
  }
}
