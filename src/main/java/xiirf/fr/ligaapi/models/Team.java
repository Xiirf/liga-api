package xiirf.fr.ligaapi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

// Annotation spring: https://zetcode.com/springboot/annotations/

@Entity 
@Data
@Table(name = "teams")
@NoArgsConstructor
public class Team {
	@Id
	@Column(name = "team_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // L'attribut id représente le team_id définit par @Column
	private String name;
	private String logo;
	private Date createdAt;
}
