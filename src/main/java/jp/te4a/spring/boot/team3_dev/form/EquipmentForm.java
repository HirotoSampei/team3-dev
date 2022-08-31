package jp.te4a.spring.boot.team3_dev.form;


import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import jp.te4a.spring.boot.team3_dev.validate.Writer;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EquipmentForm {
 
  private Integer machine_id;
  @NotNull
  @Size(max = 40)
  private String name;
  @NotNull
  @Size(max = 200)
  private String model_number;
  @NotNull
  @Size(max = 200)
  private String maker;
  @NotNull
  @Size(max = 200)
  private String spec;
  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate purchase_date;
  private Integer useful_life;
  private String depreciation;
  private Boolean availability;
  private Boolean loanability;
  @NotNull
  @Size(max = 40)
  private String location;
  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate expiration_date;
  
}
