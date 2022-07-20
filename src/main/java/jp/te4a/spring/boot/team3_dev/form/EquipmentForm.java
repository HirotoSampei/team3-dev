package jp.te4a.spring.boot.team3_dev.form;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jp.te4a.spring.boot.team3_dev.validate.Writer;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EquipmentForm {
  private Integer id ;
  @NotNull
  @Size(max = 9)
  private String machine_id;
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
  private String publisher;
  @Min(0)
  private Integer price;
}
