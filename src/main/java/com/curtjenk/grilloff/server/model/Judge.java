package com.curtjenk.grilloff.server.model;

import javax.persistence.*;

@Entity
@Table(name = "judges")
public class Judge extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//    @GeneratedValue(generator = "judge_generator")
//    @SequenceGenerator(
//    		name = "judge_generator", 
//    		sequenceName = "judge_sequence",
//            initialValue = 1
//    )
    private Long id;
	
	@Column(unique = true)
    private String name;
	
	@Column(unique = true)
    private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
