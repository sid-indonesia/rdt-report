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
@Table(name="sample_delivery_details", indexes={@Index(name="sample_delivery_details_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SampleDeliveryDetails implements Serializable {

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
    @Column(name="qr_code_reader")
    private String qrCodeReader;
    @Column(name="courier_name")
    private String courierName;
    @Column(name="courier_phone_number")
    private String courierPhoneNumber;
    @Column(name="courier_id")
    private String courierId;
    @Column(name="sender_name")
    private String senderName;
    @Column(name="sender_phone_number")
    private String senderPhoneNumber;
    @Column(name="sender_email")
    private String senderEmail;
    @Column(name="batch_id")
    private String batchId;
    @Column(name="start_date_time")
    private String startDateTime;
    @Column(name="end_date_time")
    private String endDateTime;
    private String deviceid;
    private String subscriberid;
    private String simserial;
    @Column(name="phone_manufacturer")
    private String phoneManufacturer;
    @Column(name="app_version")
    private String appVersion;
    @Column(name="phone_os_version")
    private String phoneOsVersion;
    @Column(name="phone_model")
    private String phoneModel;
    @Column(name="last_known_location")
    private String lastKnownLocation;
}
