package org.sidindonesia.rdtreport.controller;

import java.util.List;
import java.util.Optional;

import org.sidindonesia.rdtreport.service.BasicEntityService;
import org.sidindonesia.rdtreport.service.dto.BasicEntityDTO;
import org.sidindonesia.rdtreport.util.PaginationUtil;
import org.sidindonesia.rdtreport.util.ResponseUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/BasicEntity")
public class BasicEntityController {

	private final BasicEntityService basicEntityService;

	/**
	 * {@code GET /api/BasicEntity} : get all basic entities with all the details.
	 *
	 * @param pageable the pagination information.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         all basic entities.
	 */
	@GetMapping
	public ResponseEntity<List<BasicEntityDTO>> getAllBasicEntities(Pageable pageable) {
		log.debug("REST request to get all BasicEntity");
		final Page<BasicEntityDTO> page = basicEntityService.getAllBasicEntitiesAsDTOs(pageable);
		HttpHeaders headers = PaginationUtil
			.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
		return ResponseEntity.ok().headers(headers).body(page.getContent());
	}

	/**
	 * {@code GET /api/BasicEntity/:id} : get the "id" user.
	 *
	 * @param id the id of the user to find.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the "id" user, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/{id}")
	public ResponseEntity<BasicEntityDTO> getBasicEntityById(@PathVariable String id) {
		log.debug("REST request to get Basic Entity : {}", id);
		Optional<BasicEntityDTO> optDTO = basicEntityService.getBasicEntityAsDTOById(id);
		return ResponseUtil.wrapOrNotFound(optDTO);
	}
}
