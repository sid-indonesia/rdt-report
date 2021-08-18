package org.sidindonesia.rdtreport.repository;

import org.sidindonesia.rdtreport.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
