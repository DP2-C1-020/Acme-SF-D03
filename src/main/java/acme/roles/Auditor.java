
package acme.roles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			firm;

	@NotBlank
	@Length(max = 25)
	@Column(unique = true)
	protected String			professionalID;

	@NotBlank
	@Length(max = 100)
	protected String			certifications;

	@URL
	protected String			link;

}
