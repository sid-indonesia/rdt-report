package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.PatientDiagnostics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDiagnosticsRepository extends JpaRepository<PatientDiagnostics, Long> {
}
