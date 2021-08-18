package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.BasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicEntityRepository extends JpaRepository<BasicEntity, String> {
}
