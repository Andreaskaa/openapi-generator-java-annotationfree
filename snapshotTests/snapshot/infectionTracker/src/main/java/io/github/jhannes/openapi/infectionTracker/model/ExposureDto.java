/*
 * Infection Tracker
 * Infection Tracker - A case management system for tracking the spread of diseases
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.infectionTracker.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* ExposureDto
*/
public class ExposureDto {

    private UUID id = null;

    private String exposedPersonName = null;

    private String exposedPersonPhoneNumber = null;

    private LocalDate exposedDate = null;

    private String exposureLocation = null;

    private String notes = null;

    private UUID caseWorker = null;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        UNIDENTIFIED("unidentified"),

        IDENTIFIED("identified"),

        CONTACTED("contacted"),

        TESTED("tested"),

        INFECTED("infected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    private StatusEnum status;

    public static String[] readOnlyFields() {
        return new String[] {
                "id",
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
                "status",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getStatus())) result.add("status");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("ExposureDto.id");
        }
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null;
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get id
     * read only
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /** <strong>read only</strong> */
    public void setId(UUID id) {
        this.id = id;
    }

    public ExposureDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get exposedPersonName
     * example: Jane Doe
     * @return exposedPersonName
     */
    public String getExposedPersonName() {
        return exposedPersonName;
    }

    public void setExposedPersonName(String exposedPersonName) {
        this.exposedPersonName = exposedPersonName;
    }

    public ExposureDto exposedPersonName(String exposedPersonName) {
        this.exposedPersonName = exposedPersonName;
        return this;
    }

    /**
     * Get exposedPersonPhoneNumber
     * @return exposedPersonPhoneNumber
     */
    public String getExposedPersonPhoneNumber() {
        return exposedPersonPhoneNumber;
    }

    public void setExposedPersonPhoneNumber(String exposedPersonPhoneNumber) {
        this.exposedPersonPhoneNumber = exposedPersonPhoneNumber;
    }

    public ExposureDto exposedPersonPhoneNumber(String exposedPersonPhoneNumber) {
        this.exposedPersonPhoneNumber = exposedPersonPhoneNumber;
        return this;
    }

    /**
     * Get exposedDate
     * @return exposedDate
     */
    public LocalDate getExposedDate() {
        return exposedDate;
    }

    public void setExposedDate(LocalDate exposedDate) {
        this.exposedDate = exposedDate;
    }

    public ExposureDto exposedDate(LocalDate exposedDate) {
        this.exposedDate = exposedDate;
        return this;
    }

    /**
     * Address or other identifying description of the location
     * @return exposureLocation
     */
    public String getExposureLocation() {
        return exposureLocation;
    }

    public void setExposureLocation(String exposureLocation) {
        this.exposureLocation = exposureLocation;
    }

    public ExposureDto exposureLocation(String exposureLocation) {
        this.exposureLocation = exposureLocation;
        return this;
    }

    /**
     * Information that may be relevant to identify the person fully or determine if they are infected
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ExposureDto notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * The id of the case worker assigned to follow up this person
     * @return caseWorker
     */
    public UUID getCaseWorker() {
        return caseWorker;
    }

    public void setCaseWorker(UUID caseWorker) {
        this.caseWorker = caseWorker;
    }

    public ExposureDto caseWorker(UUID caseWorker) {
        this.caseWorker = caseWorker;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExposureDto status(StatusEnum status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExposureDto exposure = (ExposureDto) o;
        return Objects.equals(this.getId(), exposure.getId()) &&
                Objects.equals(this.getExposedPersonName(), exposure.getExposedPersonName()) &&
                Objects.equals(this.getExposedPersonPhoneNumber(), exposure.getExposedPersonPhoneNumber()) &&
                Objects.equals(this.getExposedDate(), exposure.getExposedDate()) &&
                Objects.equals(this.getExposureLocation(), exposure.getExposureLocation()) &&
                Objects.equals(this.getNotes(), exposure.getNotes()) &&
                Objects.equals(this.getCaseWorker(), exposure.getCaseWorker()) &&
                Objects.equals(this.getStatus(), exposure.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getExposedPersonName(), getExposedPersonPhoneNumber(), getExposedDate(), getExposureLocation(), getNotes(), getCaseWorker(), getStatus());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExposureDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    exposedPersonName: ").append(toIndentedString(getExposedPersonName())).append("\n");
        sb.append("    exposedPersonPhoneNumber: ").append(toIndentedString(getExposedPersonPhoneNumber())).append("\n");
        sb.append("    exposedDate: ").append(toIndentedString(getExposedDate())).append("\n");
        sb.append("    exposureLocation: ").append(toIndentedString(getExposureLocation())).append("\n");
        sb.append("    notes: ").append(toIndentedString(getNotes())).append("\n");
        sb.append("    caseWorker: ").append(toIndentedString(getCaseWorker())).append("\n");
        sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

