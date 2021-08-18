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
@Table(name="sample_collection", indexes={@Index(name="sample_collection_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SampleCollection implements Serializable {

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
    @Column(name="sampler_name")
    private String samplerName;
    @Column(name="sampler_id")
    private String samplerId;
    @Column(name="sampler_phone_number")
    private String samplerPhoneNumber;
    @Column(name="sample_type")
    private String sampleType;
    @Column(name="saliva_collection_kit_brand")
    private String salivaCollectionKitBrand;
    @Column(name="type_of_blood")
    private String typeOfBlood;
    @Column(name="blood_component")
    private String bloodComponent;
    @Column(name="sputum_collection_tube_brand")
    private String sputumCollectionTubeBrand;
    @Column(name="swab_type")
    private String swabType;
    @Column(name="other_sample_type")
    private String otherSampleType;
    @Column(name="type_of_media")
    private String typeOfMedia;
    @Column(name="other_media")
    private String otherMedia;
    @Column(name="media_expiration_date")
    private String mediaExpirationDate;
    @Column(name="media_lot_number")
    private String mediaLotNumber;
    @Column(name="health_facility_type")
    private String healthFacilityType;
    @Column(name="name_of_health_facility")
    private String nameOfHealthFacility;
    @Column(name="doctor_name")
    private String doctorName;
    @Column(name="doctor_phone_number")
    private String doctorPhoneNumber;
    @Column(name="hospital_sample_number")
    private String hospitalSampleNumber;
    @Column(name="patient_health_status")
    private String patientHealthStatus;
    @Column(name="qr_code_reader")
    private String qrCodeReader;
    @Column(name="covid_sample_id")
    private String covidSampleId;
    @Column(name="unique_id")
    private String uniqueId;
    @Column(name="temp_sensor")
    private String tempSensor;
    @Column(name="patient_info_unique_id")
    private String patientInfoUniqueId;
    @Column(name="patient_info_name")
    private String patientInfoName;
    @Column(name="patient_info_dob")
    private String patientInfoDob;
    @Column(name="sputum_color")
    private String sputumColor;
    @Column(name="quantity_of_serum")
    private String quantityOfSerum;
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
