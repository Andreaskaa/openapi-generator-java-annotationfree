/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.petstore.model;

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
* OrderDto
*/
public class OrderDto {

    private Long id = null;

    private Long petId = null;

    private Integer quantity = null;

    private OffsetDateTime shipDate = null;

    /**
     * Order Status
     */
    public enum StatusEnum {
        PLACED("placed"),

        APPROVED("approved"),

        DELIVERED("delivered");

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

    private StatusEnum status = null;

    private Boolean complete = null;

    public static String[] readOnlyFields() {
        return new String[] {
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
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
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderDto id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get petId
     * @return petId
     */
    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public OrderDto petId(Long petId) {
        this.petId = petId;
        return this;
    }

    /**
     * Get quantity
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderDto quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get shipDate
     * @return shipDate
     */
    public OffsetDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public OrderDto shipDate(OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Order Status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OrderDto status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get complete
     * @return complete
     */
    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public OrderDto complete(Boolean complete) {
        this.complete = complete;
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
        OrderDto order = (OrderDto) o;
        return Objects.equals(this.getId(), order.getId()) &&
                Objects.equals(this.getPetId(), order.getPetId()) &&
                Objects.equals(this.getQuantity(), order.getQuantity()) &&
                Objects.equals(this.getShipDate(), order.getShipDate()) &&
                Objects.equals(this.getStatus(), order.getStatus()) &&
                Objects.equals(this.getComplete(), order.getComplete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPetId(), getQuantity(), getShipDate(), getStatus(), getComplete());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    petId: ").append(toIndentedString(getPetId())).append("\n");
        sb.append("    quantity: ").append(toIndentedString(getQuantity())).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(getShipDate())).append("\n");
        sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
        sb.append("    complete: ").append(toIndentedString(getComplete())).append("\n");
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

