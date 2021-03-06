package jp.te4a.spring.boot.myapp13.form;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class UserForm {
	@NotNull
	@Size(min=6, max=12)
	private String username;
	@Size(min=6, max=12)
	private String password;
}
