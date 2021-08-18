package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.CovidXray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidXrayRepository extends JpaRepository<CovidXray, Long> {
}
