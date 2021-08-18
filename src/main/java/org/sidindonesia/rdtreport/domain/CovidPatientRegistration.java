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
@Table(name="covid_patient_registration", indexes={@Index(name="covid_patient_registration_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CovidPatientRegistration implements Serializable {

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
    @Column(name="patient_id")
    private String patientId;
    @Column(name="medical_record_id")
    private String medicalRecordId;
    @Column(name="national_id_type")
    private String nationalIdType;
    @Column(name="government_id_no")
    private String governmentIdNo;
    private String age;
    @Column(name="patient_occupation")
    private String patientOccupation;
    @Column(name="patient_phone_number")
    private String patientPhoneNumber;
    @Column(name="patient_email_address")
    private String patientEmailAddress;
    @Column(name="gvt_id_street_address")
    private String gvtIdStreetAddress;
    @Column(name="gvt_id_province")
    private String gvtIdProvince;
    @Column(name="gvt_id_city")
    private String gvtIdCity;
    @Column(name="domicile_same_as_gvt_id_address")
    private String domicileSameAsGvtIdAddress;
    @Column(name="domicile_street_address")
    private String domicileStreetAddress;
    @Column(name="domicile_province")
    private String domicileProvince;
    @Column(name="domicile_city")
    private String domicileCity;
    @Column(name="patient_whatsapp")
    private String patientWhatsapp;
    @Column(name="head_of_household")
    private String headOfHousehold;
    @Column(name="head_of_household_no")
    private String headOfHouseholdNo;
    @Column(name="head_of_household_address")
    private String headOfHouseholdAddress;
    @Column(name="taken_tests_before")
    private String takenTestsBefore;
    @Column(name="no_of_covid_tests")
    private String noOfCovidTests;
    @Column(name="latest_covid_test_date")
    private String latestCovidTestDate;
    @Column(name="test_location")
    private String testLocation;
    @Column(name="type_of_test")
    private String typeOfTest;
    @Column(name="antigen_pcr_or_genose_result")
    private String antigenPcrOrGenoseResult;
    @Column(name="follow_up")
    private String followUp;
    @Column(name="start_date_time")
    private String startDateTime;
    @Column(name="end_date_time")
    private String endDateTime;
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
