package org.sidindonesia.rdtreport.domain;

import java.io.Serializable;
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
@Table(name="covid_xray", indexes={@Index(name="covid_xray_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CovidXray implements Serializable {

	@Id
    @Column(name="event_id", unique=true, nullable=false, precision=19)
    private long eventId;
    @Column(name="base_entity_id", length=36)
    private String baseEntityId;
    @Column(name="source_date_deleted")
    private LocalDateTime sourceDateDeleted;
    @Column(name="source_server_version", precision=10)
    private int sourceServerVersion;
    @Column(name="document_id", length=36)
    private String documentId;
    private String rev;
    private String team;
    private String type;
    @Column(name="team_id")
    private String teamId;
    @Column(name="details_form_version")
    private String detailsFormVersion;
    @Column(name="details_app_version_name")
    private String detailsAppVersionName;
    @Column(name="client_version_epoch")
    private String clientVersionEpoch;
    @Column(name="server_version")
    private String serverVersion;
    private String duration;
    @Column(name="event_date")
    private LocalDateTime eventDate;
    @Column(name="entity_type")
    private String entityType;
    @Column(name="location_id", length=36)
    private String locationId;
    @Column(name="provider_id")
    private String providerId;
    @Column(name="date_created")
    private LocalDateTime dateCreated;
    @Column(name="form_submission_id", length=36)
    private String formSubmissionId;
    @Column(name="is_xray_taken")
    private String isXrayTaken;
    @Column(name="lung_xray_result")
    private String lungXrayResult;
    @Column(name="date_xray_conducted")
    private String dateXrayConducted;
    @Column(name="start_date_time")
    private String startDateTime;
    @Column(name="end_date_time")
    private String endDateTime;
    private String deviceid;
    @Column(name="phone_os_version")
    private String phoneOsVersion;
    @Column(name="app_version")
    private String appVersion;
    @Column(name="phone_manufacturer")
    private String phoneManufacturer;
    @Column(name="phone_model")
    private String phoneModel;
    @Column(name="last_known_location")
    private String lastKnownLocation;
}
