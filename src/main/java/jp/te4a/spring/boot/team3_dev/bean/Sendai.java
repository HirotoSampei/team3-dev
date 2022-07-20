package jp.te4a.spring.boot.team3_dev.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Table(name = "sendai_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sendai {
  @Id
  @GeneratedValue
  private Integer id ;
  @Column(nullable = false)
  private String title;
  private String writer;
  private String publisher;
  private Integer price;
}
