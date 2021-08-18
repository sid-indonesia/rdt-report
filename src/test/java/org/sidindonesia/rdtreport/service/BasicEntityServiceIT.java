package org.sidindonesia.rdtreport.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sidindonesia.rdtreport.IntegrationTest;
import org.sidindonesia.rdtreport.domain.BasicEntity;
import org.sidindonesia.rdtreport.repository.BasicEntityRepository;
import org.sidindonesia.rdtreport.service.dto.BasicEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

/**
 * Integration tests for {@link BasicEntityService}.
 */
@IntegrationTest
@Transactional
class BasicEntityServiceIT {

	private static final String DEFAULT_ID = "UUIDUUID-UUID-UUID-UUID-UUIDUUIDUUID";

	private static final String DEFAULT_ID_2 = "UUID2UUI-D2UU-ID2U-UID2-UUID2UUID2UU";

	private static final String DEFAULT_EMAIL = "johndoe@localhost";

	private static final String DEFAULT_EMAIL_2 = "johndoe2@localhost";

	private static final String DEFAULT_GIVEN_NAME = "john";

	private static final String DEFAULT_FAMILY_NAME = "doe";

	private static final String DEFAULT_CREATED_BY = "TEST";

	@Autowired
	private BasicEntityRepository basicEntityRepository;

	@Autowired
	private BasicEntityService basicEntityService;

	private BasicEntity basicEntity;

	@BeforeEach
	public void setUp() {
		createBasicEntity(DEFAULT_ID, DEFAULT_EMAIL, DEFAULT_GIVEN_NAME, DEFAULT_FAMILY_NAME, DEFAULT_CREATED_BY);

		basicEntityRepository.save(basicEntity);
	}

	@Test
	void testDefaultBasicEntityDetails() {
		BasicEntityDTO basicEntityDTO = basicEntityService.getBasicEntityAsDTOById(DEFAULT_ID).get();

		assertThat(basicEntityDTO.getId()).isEqualTo(DEFAULT_ID);
		assertDefaultBasicEntityDTO(basicEntityDTO);
	}

	@Test
	void testGetAllBasicEntitesAsDTOs() {
		// given
		createBasicEntity(DEFAULT_ID_2, DEFAULT_EMAIL_2, DEFAULT_GIVEN_NAME, DEFAULT_FAMILY_NAME, DEFAULT_CREATED_BY);
		basicEntityRepository.save(basicEntity);

		// when
		Page<BasicEntityDTO> basicEntityDTOs = basicEntityService.getAllBasicEntitiesAsDTOs(PageRequest.of(0, 10));

		// then
		basicEntityDTOs.forEach(this::assertDefaultBasicEntityDTO);
	}

	private void assertDefaultBasicEntityDTO(BasicEntityDTO basicEntityDTO) {
		assertThat(basicEntityDTO.getGivenName()).isEqualTo(DEFAULT_GIVEN_NAME);
		assertThat(basicEntityDTO.getFamilyName()).isEqualTo(DEFAULT_FAMILY_NAME);
	}

	private void createBasicEntity(String id, String email, String givenName, String familyName, String createdBy) {
		basicEntity = new BasicEntity();
		basicEntity.setId(id);
		basicEntity.setEmail(email);
		basicEntity.setGivenName(givenName);
		basicEntity.setFamilyName(familyName);
		basicEntity.setCreatedBy(createdBy);
	}
}
