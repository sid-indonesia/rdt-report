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
@Table(name="covid_rdt_test", indexes={@Index(name="covid_rdt_test_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CovidRdtTest implements Serializable {

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
    private String gps;
    @Column(name="gps_latitude")
    private String gpsLatitude;
    @Column(name="gps_longitude")
    private String gpsLongitude;
    @Column(name="gps_altitude")
    private String gpsAltitude;
    @Column(name="gps_accuracy")
    private String gpsAccuracy;
    @Column(name="lbl_patient_name")
    private String lblPatientName;
    @Column(name="lbl_patient_gender_and_id")
    private String lblPatientGenderAndId;
    @Column(name="health_facility_name")
    private String healthFacilityName;
    @Column(name="qr_code_reader")
    private String qrCodeReader;
    @Column(name="rdt_type")
    private String rdtType;
    @Column(name="rdt_batch_id")
    private String rdtBatchId;
    @Column(name="rdt_id")
    private String rdtId;
    @Column(name="unique_id")
    private String uniqueId;
    @Column(name="lot_no")
    private String lotNo;
    @Column(name="exp_date")
    private String expDate;
    private String gtin;
    @Column(name="temp_sensor")
    private String tempSensor;
    @Column(name="rdt_capture")
    private String rdtCapture;
    @Column(name="rdt_device_id")
    private String rdtDeviceId;
    @Column(name="rdt_capture_duration")
    private String rdtCaptureDuration;
    @Column(name="flash_on")
    private String flashOn;
    @Column(name="cassette_boundary")
    private String cassetteBoundary;
    @Column(name="cropped_img_id")
    private String croppedImgId;
    @Column(name="time_img_saved")
    private String timeImgSaved;
    @Column(name="is_manual_capture")
    private String isManualCapture;
    @Column(name="detected_component_type")
    private String detectedComponentType;
    @Column(name="chw_result_antigen")
    private String chwResultAntigen;
    @Column(name="chw_rdt_type")
    private String chwRdtType;
    @Column(name="chw_result_antibody")
    private String chwResultAntibody;
    @Column(name="antibody_type")
    private String antibodyType;
    @Column(name="rdt_manufacturer")
    private String rdtManufacturer;
    @Column(name="rdt_device_name")
    private String rdtDeviceName;
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
