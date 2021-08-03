/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.poly.model;

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
* IllegalEmailAddressErrorDto
*/
public class IllegalEmailAddressErrorDto implements CreationErrorDto, UpdateErrorDto {

    private String code;

    private String inputEmailAddress;

    private List<String> validDomains = new ArrayList<>();

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
                "code",
                "inputEmailAddress",
                "validDomains",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCode())) result.add("code");
        if (isMissing(getInputEmailAddress())) result.add("inputEmailAddress");
        if (isMissing(getValidDomains())) result.add("validDomains");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null || list.isEmpty();
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public IllegalEmailAddressErrorDto code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get inputEmailAddress
     * @return inputEmailAddress
     */
    public String getInputEmailAddress() {
        return inputEmailAddress;
    }

    public void setInputEmailAddress(String inputEmailAddress) {
        this.inputEmailAddress = inputEmailAddress;
    }

    public IllegalEmailAddressErrorDto inputEmailAddress(String inputEmailAddress) {
        this.inputEmailAddress = inputEmailAddress;
        return this;
    }

    public <T> IllegalEmailAddressErrorDto validDomains(Collection<T> items, Function<T, String> mapper) {
        return validDomains(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getValidDomains(Function<String, T> mapper) {
        return getValidDomains().stream().map(mapper).collect(Collectors.toList());
    }

    public IllegalEmailAddressErrorDto addValidDomainsItem(String validDomainsItem) {
        this.validDomains.add(validDomainsItem);
        return this;
    }

    /**
     * Get validDomains
     * @return validDomains
     */
    public List<String> getValidDomains() {
        return validDomains;
    }

    public void setValidDomains(List<String> validDomains) {
        this.validDomains = validDomains;
    }

    public IllegalEmailAddressErrorDto validDomains(List<String> validDomains) {
        this.validDomains = validDomains;
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
        IllegalEmailAddressErrorDto illegalEmailAddressError = (IllegalEmailAddressErrorDto) o;
        return Objects.equals(this.getCode(), illegalEmailAddressError.getCode()) &&
                Objects.equals(this.getInputEmailAddress(), illegalEmailAddressError.getInputEmailAddress()) &&
                Objects.equals(this.getValidDomains(), illegalEmailAddressError.getValidDomains());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getInputEmailAddress(), getValidDomains());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IllegalEmailAddressErrorDto {\n");
        sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
        sb.append("    inputEmailAddress: ").append(toIndentedString(getInputEmailAddress())).append("\n");
        sb.append("    validDomains: ").append(toIndentedString(getValidDomains())).append("\n");
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

