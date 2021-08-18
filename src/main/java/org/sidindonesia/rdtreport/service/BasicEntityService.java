package org.sidindonesia.rdtreport.service;

import java.util.Optional;

import org.sidindonesia.rdtreport.repository.BasicEntityRepository;
import org.sidindonesia.rdtreport.service.dto.BasicEntityDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
@Service
public class BasicEntityService {

	private final BasicEntityRepository basicEntityRepository;

	public Optional<BasicEntityDTO> getBasicEntityAsDTOById(String id) {
		log.debug("Request to get Basic Entity : {}", id);
		return basicEntityRepository.findById(id).map(BasicEntityDTO::new);
	}

	public Page<BasicEntityDTO> getAllBasicEntitiesAsDTOs(Pageable pageable) {
		return basicEntityRepository.findAll(pageable).map(BasicEntityDTO::new);
	}
}
