package kodlama.io.Kodlama.io.DevsNew.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageTechnologyRequest {
	private String name;
	private int languageId;
}
