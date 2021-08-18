package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.CovidPatientRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidPatientRegistrationRepository extends JpaRepository<CovidPatientRegistration, Long> {
}
