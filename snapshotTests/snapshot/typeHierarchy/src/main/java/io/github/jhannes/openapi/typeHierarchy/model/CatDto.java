/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.typeHierarchy.model;

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
* CatDto
*/
public class CatDto extends PetBaseDto implements PetDto {

    private Boolean hunts = null;

    private Integer age = null;

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
                "pet_type",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = super.missingRequiredFields();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        super.readOnlyFieldsWithValue(result);
        if (!isMissing(getAge())) {
            result.add("CatDto.age");
        }
    }

    public <T extends CatDto> T copyTo(T target) {
        super.copyTo(target);
        if (this.getHunts() != null) target.setHunts(this.getHunts());
        if (this.getAge() != null) target.setAge(this.getAge());
        return target;
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
     * Get hunts
     * @return hunts
     */
    public Boolean getHunts() {
        return hunts;
    }

    public void setHunts(Boolean hunts) {
        this.hunts = hunts;
    }

    public CatDto hunts(Boolean hunts) {
        this.hunts = hunts;
        return this;
    }

    /**
     * Get age
     * read only
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /** <strong>read only</strong> */
    public void setAge(Integer age) {
        this.age = age;
    }

    public CatDto age(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public CatDto id(String id) {
        super.id(id);
        return this;
    }

    @Override
    public CatDto petType(String petType) {
        super.petType(petType);
        return this;
    }

    @Override
    public CatDto name(String name) {
        super.name(name);
        return this;
    }

    @Override
    public CatDto birthDate(String birthDate) {
        super.birthDate(birthDate);
        return this;
    }

    @Override
    public CatDto ownerAddress(AddressDto ownerAddress) {
        super.ownerAddress(ownerAddress);
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
        CatDto cat = (CatDto) o;
        return Objects.equals(this.getHunts(), cat.getHunts()) &&
                Objects.equals(this.getAge(), cat.getAge()) &&
                Objects.equals(this.getId(), cat.getId()) &&
                Objects.equals(this.getPetType(), cat.getPetType()) &&
                Objects.equals(this.getName(), cat.getName()) &&
                Objects.equals(this.getBirthDate(), cat.getBirthDate()) &&
                Objects.equals(this.getOwnerAddress(), cat.getOwnerAddress()) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHunts(), getAge(), getId(), getPetType(), getName(), getBirthDate(), getOwnerAddress());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    hunts: ").append(toIndentedString(getHunts())).append("\n");
        sb.append("    age: ").append(toIndentedString(getAge())).append("\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    pet_type: ").append(toIndentedString(getPetType())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    birth_date: ").append(toIndentedString(getBirthDate())).append("\n");
        sb.append("    ownerAddress: ").append(toIndentedString(getOwnerAddress())).append("\n");
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

