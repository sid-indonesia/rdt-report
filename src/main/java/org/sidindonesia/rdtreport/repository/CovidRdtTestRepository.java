package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.CovidRdtTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidRdtTestRepository extends JpaRepository<CovidRdtTest, Long> {
}
