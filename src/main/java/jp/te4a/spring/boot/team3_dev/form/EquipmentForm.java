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
  @Size(min = 3)
  private String title;
  @Size(min = 3, max = 20)
  @Writer(ok="東北タロウ")
  private String writer;
  private String publisher;
  @Min(0)
  private Integer price;
}
