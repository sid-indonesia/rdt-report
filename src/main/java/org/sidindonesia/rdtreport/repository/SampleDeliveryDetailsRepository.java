package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.SampleDeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleDeliveryDetailsRepository extends JpaRepository<SampleDeliveryDetails, Long> {
}
