package kodlama.io.databaseExample.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "ProgrammingLanguage")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy ="programmingLanguage",cascade = CascadeType.ALL )
	private List<Technology> technologies;
	
}
