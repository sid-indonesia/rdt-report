package org.sidindonesia.rdtreport.service.dto;

import org.sidindonesia.rdtreport.domain.BasicEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DTO representing a basic entity, with only the public attributes.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor // Empty constructor needed for Jackson.
public class BasicEntityDTO {

	private String id;

	private String givenName;

	private String familyName;

	public BasicEntityDTO(BasicEntity basicEntity) {
		this.id = basicEntity.getId();
		// Customize it here if you need, or not, givenName/familyName/etc
		this.givenName = basicEntity.getGivenName();
		this.familyName = basicEntity.getFamilyName();
	}
}
