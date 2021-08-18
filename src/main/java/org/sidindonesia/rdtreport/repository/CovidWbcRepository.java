package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.CovidWbc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidWbcRepository extends JpaRepository<CovidWbc, Long> {
}
