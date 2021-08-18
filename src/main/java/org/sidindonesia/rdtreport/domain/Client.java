package org.sidindonesia.rdtreport.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="client", indexes={@Index(name="client_source_id_IX", columnList="source_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Client implements Serializable {

    @Column(name="server_version")
    private String serverVersion;
	@Id
    @Column(name="source_id", unique=true, nullable=false, precision=19)
    private long sourceId;
    @Column(name="source_date_deleted")
    private LocalDateTime sourceDateDeleted;
    @Column(name="source_server_version", precision=10)
    private int sourceServerVersion;
    @Column(name="document_id", length=36)
    private String documentId;
    private String rev;
    private String type;
    private String gender;
    @Column(name="team_id")
    private String teamId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String address1;
    @Column(name="birth_date")
    private LocalDate birthDate;
    @Column(name="date_created")
    private LocalDateTime dateCreated;
    @Column(name="location_id", length=36)
    private String locationId;
    @Column(name="date_edited")
    private LocalDateTime dateEdited;
    @Column(name="base_entity_id", length=36)
    private String baseEntityId;
}
