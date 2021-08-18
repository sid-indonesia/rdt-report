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
@Table(name="patient_diagnostics", indexes={@Index(name="patient_diagnostics_event_id_IX", columnList="event_id", unique=true)})
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PatientDiagnostics implements Serializable {

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
    @Column(name="health_worker_name")
    private String healthWorkerName;
    @Column(name="health_worker_id")
    private String healthWorkerId;
    @Column(name="health_worker_phone_number")
    private String healthWorkerPhoneNumber;
    @Column(name="facility_type")
    private String facilityType;
    @Column(name="other_facility_type")
    private String otherFacilityType;
    @Column(name="facility_name")
    private String facilityName;
    @Column(name="patient_age")
    private String patientAge;
    @Column(name="patient_sex")
    private String patientSex;
    @Column(name="using_ventilator")
    private String usingVentilator;
    @Column(name="has_chronic_liver_disease_history")
    private String hasChronicLiverDiseaseHistory;
    @Column(name="has_cancer_history")
    private String hasCancerHistory;
    @Column(name="has_chronic_heart_disease_history")
    private String hasChronicHeartDiseaseHistory;
    @Column(name="has_chronic_lung_disease_history")
    private String hasChronicLungDiseaseHistory;
    @Column(name="has_chronic_kidney_disease_history")
    private String hasChronicKidneyDiseaseHistory;
    @Column(name="has_diabetes")
    private String hasDiabetes;
    @Column(name="has_gout_history")
    private String hasGoutHistory;
    @Column(name="has_autoimmune_disease_history")
    private String hasAutoimmuneDiseaseHistory;
    @Column(name="has_neurological_disease")
    private String hasNeurologicalDisease;
    @Column(name="has_hiv")
    private String hasHiv;
    @Column(name="has_hypertension")
    private String hasHypertension;
    @Column(name="has_other_health_issues")
    private String hasOtherHealthIssues;
    @Column(name="additional_health_issues")
    private String additionalHealthIssues;
    @Column(name="date_of_onset_of_symptoms")
    private String dateOfOnsetOfSymptoms;
    @Column(name="has_fever")
    private String hasFever;
    @Column(name="fever_temperature")
    private String feverTemperature;
    @Column(name="has_fever_history")
    private String hasFeverHistory;
    @Column(name="has_nausea")
    private String hasNausea;
    @Column(name="has_diarrhoea")
    private String hasDiarrhoea;
    @Column(name="has_sore_throat")
    private String hasSoreThroat;
    @Column(name="has_cough")
    private String hasCough;
    @Column(name="has_cold")
    private String hasCold;
    @Column(name="has_lost_smell")
    private String hasLostSmell;
    @Column(name="has_decreased_taste_sensitivity")
    private String hasDecreasedTasteSensitivity;
    @Column(name="has_shortness_of_breath")
    private String hasShortnessOfBreath;
    @Column(name="has_abnormal_headaches")
    private String hasAbnormalHeadaches;
    @Column(name="has_chest_pains")
    private String hasChestPains;
    @Column(name="has_muscle_pains")
    private String hasMusclePains;
    @Column(name="has_abdominal_pain")
    private String hasAbdominalPain;
    @Column(name="has_fatigue")
    private String hasFatigue;
    @Column(name="feels_malaised")
    private String feelsMalaised;
    @Column(name="has_international_travel_history")
    private String hasInternationalTravelHistory;
    @Column(name="international_travel_location")
    private String internationalTravelLocation;
    @Column(name="international_country")
    private String internationalCountry;
    @Column(name="international_city")
    private String internationalCity;
    @Column(name="international_travel_date")
    private String internationalTravelDate;
    @Column(name="international_arrival_date")
    private String internationalArrivalDate;
    @Column(name="has_local_transmission_area_travel_history")
    private String hasLocalTransmissionAreaTravelHistory;
    @Column(name="local_area_province")
    private String localAreaProvince;
    @Column(name="local_area_city")
    private String localAreaCity;
    @Column(name="local_area_travel_date")
    private String localAreaTravelDate;
    @Column(name="local_area_arrival_date")
    private String localAreaArrivalDate;
    @Column(name="has_close_contact_with_sick_traveller")
    private String hasCloseContactWithSickTraveller;
    @Column(name="has_close_contact_with_covid_patient")
    private String hasCloseContactWithCovidPatient;
    @Column(name="covid_close_contacts")
    private String covidCloseContacts;
    @Column(name="has_contact_with_ari_patients")
    private String hasContactWithAriPatients;
    @Column(name="close_ari_patient_contacts")
    private String closeAriPatientContacts;
    @Column(name="has_contact_with_hospitalized_ard_patients")
    private String hasContactWithHospitalizedArdPatients;
    @Column(name="hospitalized_ard_patient_contacts")
    private String hospitalizedArdPatientContacts;
    @Column(name="has_contact_with_dead_ard_patients")
    private String hasContactWithDeadArdPatients;
    @Column(name="dead_ard_patient_contacts")
    private String deadArdPatientContacts;
    @Column(name="has_close_contact_with_infectious_animal")
    private String hasCloseContactWithInfectiousAnimal;
    @Column(name="is_part_of_ari_cluster")
    private String isPartOfAriCluster;
    @Column(name="is_patient_health_worker")
    private String isPatientHealthWorker;
    @Column(name="what_ppe")
    private String whatPpe;
    @Column(name="performed_aerosol_procedures")
    private String performedAerosolProcedures;
    @Column(name="covid_close_contacts_count")
    private String covidCloseContactsCount;
    @Column(name="close_ari_patient_contacts_count")
    private String closeAriPatientContactsCount;
    @Column(name="hospitalized_ard_patient_contacts_count")
    private String hospitalizedArdPatientContactsCount;
    @Column(name="dead_ard_patient_contacts_count")
    private String deadArdPatientContactsCount;
    @Column(name="covid_close_contacts_names")
    private String covidCloseContactsNames;
    @Column(name="covid_close_contacts_phone_numbers")
    private String covidCloseContactsPhoneNumbers;
    @Column(name="covid_close_contacts_relationships")
    private String covidCloseContactsRelationships;
    @Column(name="has_close_contact_with_infectious_animals")
    private String hasCloseContactWithInfectiousAnimals;
    @Column(name="covid_close_contacts_date_of_first_contacts")
    private String covidCloseContactsDateOfFirstContacts;
    @Column(name="covid_close_contacts_date_of_last_contacts")
    private String covidCloseContactsDateOfLastContacts;
    @Column(name="close_contact_ari_patient_names")
    private String closeContactAriPatientNames;
    @Column(name="close_contact_ari_patient_phone_numbers")
    private String closeContactAriPatientPhoneNumbers;
    @Column(name="close_contact_ari_patient_relationships")
    private String closeContactAriPatientRelationships;
    @Column(name="close_contact_ari_patient_date_of_first_contacts")
    private String closeContactAriPatientDateOfFirstContacts;
    @Column(name="close_contact_ari_patient_date_of_last_contacts")
    private String closeContactAriPatientDateOfLastContacts;
    @Column(name="hospitalized_ard_patient_names")
    private String hospitalizedArdPatientNames;
    @Column(name="hospitalized_ard_patient_phone_numbers")
    private String hospitalizedArdPatientPhoneNumbers;
    @Column(name="hospitalized_ard_patient_relationships")
    private String hospitalizedArdPatientRelationships;
    @Column(name="hospitalized_ard_patient_date_of_first_contacts")
    private String hospitalizedArdPatientDateOfFirstContacts;
    @Column(name="hospitalized_ard_patient_date_of_last_contacts")
    private String hospitalizedArdPatientDateOfLastContacts;
    @Column(name="hospitalized_ard_patient_locations")
    private String hospitalizedArdPatientLocations;
    @Column(name="dead_ard_patient_names")
    private String deadArdPatientNames;
    @Column(name="dead_ard_patient_phone_numbers")
    private String deadArdPatientPhoneNumbers;
    @Column(name="dead_ard_patient_relationships")
    private String deadArdPatientRelationships;
    @Column(name="dead_ard_patient_date_of_first_contacts")
    private String deadArdPatientDateOfFirstContacts;
    @Column(name="dead_ard_patient_date_of_last_contacts")
    private String deadArdPatientDateOfLastContacts;
    @Column(name="dead_ard_patient_locations")
    private String deadArdPatientLocations;
    @Column(name="patient_case_category")
    private String patientCaseCategory;
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
