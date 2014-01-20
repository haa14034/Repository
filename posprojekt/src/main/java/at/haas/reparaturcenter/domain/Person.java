package at.haas.reparaturcenter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import at.haas.reparaturcenter.ensure.Ensure;

@Entity
@Table(name = "Person")
public class Person extends BasePersistable{

	private static final long serialVersionUID = 1L;
	
	@Size(max = 30)
	@NotNull
    @Column(name = "name", nullable = false, length = 30)
	private String name;
	
	protected Person() {
        // required for JPA
    }
	
	public Person(String name){
		Ensure.notEmpty("name", name);
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
