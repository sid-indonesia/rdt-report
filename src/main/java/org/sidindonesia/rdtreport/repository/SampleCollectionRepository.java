package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.SampleCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleCollectionRepository extends JpaRepository<SampleCollection, Long> {
}
