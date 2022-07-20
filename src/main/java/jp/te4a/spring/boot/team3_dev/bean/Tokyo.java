package jp.te4a.spring.boot.team3_dev.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Value;
@Entity
@Table(name = "tokyo_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tokyo {
	@Id
	private String machine_id ;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String model_number;
	@Column(nullable = false)
	private String maker;
	@Column(nullable = false)
	private String spec;
	//purchase_date
	@Value("#{new java.text.SimpleDateFormat(\"${mydate.format}\").parse(\"${mydate.value}\")}")
	private Date purchase_date;
	private int useful_date;
	private String depreciation;
	private boolean availability;
	private boolean loanability;
	@Column(nullable = false)
	private String location;
	//expiration_date
	@Value("#{new java.text.SimpleDateFormat(\"${mydate.format}\").parse(\"${mydate.value}\")}")
	private Date expiration_date;
	private Integer price;
}
