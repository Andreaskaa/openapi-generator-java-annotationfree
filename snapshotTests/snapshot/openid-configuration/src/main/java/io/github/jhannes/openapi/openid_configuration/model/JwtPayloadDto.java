/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.openid_configuration.model;

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
* JwtPayloadDto
*/
public class JwtPayloadDto {

    private String iss;

    private String sub;

    private String aud;

    private String name = null;

    private String email = null;

    private String orgId = null;

    private String org = null;

    private String pid = null;

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
                "iss",
                "sub",
                "aud",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getIss())) result.add("iss");
        if (isMissing(getSub())) result.add("sub");
        if (isMissing(getAud())) result.add("aud");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public void mergeFrom(JwtPayloadDto target) {
        if (target.getIss() != null) this.setIss(target.getIss());
        if (target.getSub() != null) this.setSub(target.getSub());
        if (target.getAud() != null) this.setAud(target.getAud());
        if (target.getName() != null) this.setName(target.getName());
        if (target.getEmail() != null) this.setEmail(target.getEmail());
        if (target.getOrgId() != null) this.setOrgId(target.getOrgId());
        if (target.getOrg() != null) this.setOrg(target.getOrg());
        if (target.getPid() != null) this.setPid(target.getPid());
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
     * Issuer - the URI for the login provider
     * @return iss
     */
    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public JwtPayloadDto iss(String iss) {
        this.iss = iss;
        return this;
    }

    /**
     * Subject - the unique identifier for the logged in user
     * @return sub
     */
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public JwtPayloadDto sub(String sub) {
        this.sub = sub;
        return this;
    }

    /**
     * Audience - the client_id that the JWT was issued to
     * @return aud
     */
    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public JwtPayloadDto aud(String aud) {
        this.aud = aud;
        return this;
    }

    /**
     * The name of the logged in user
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JwtPayloadDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The email of the logged in user
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JwtPayloadDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The unique identifier of the organization that the user has selected
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public JwtPayloadDto orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * The name of the organization that the user has selected
     * @return org
     */
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public JwtPayloadDto org(String org) {
        this.org = org;
        return this;
    }

    /**
     * For JWT from ID-porten, contains national identity number
     * example: 24079420405
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public JwtPayloadDto pid(String pid) {
        this.pid = pid;
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
        JwtPayloadDto jwtPayload = (JwtPayloadDto) o;
        return Objects.equals(this.getIss(), jwtPayload.getIss()) &&
                Objects.equals(this.getSub(), jwtPayload.getSub()) &&
                Objects.equals(this.getAud(), jwtPayload.getAud()) &&
                Objects.equals(this.getName(), jwtPayload.getName()) &&
                Objects.equals(this.getEmail(), jwtPayload.getEmail()) &&
                Objects.equals(this.getOrgId(), jwtPayload.getOrgId()) &&
                Objects.equals(this.getOrg(), jwtPayload.getOrg()) &&
                Objects.equals(this.getPid(), jwtPayload.getPid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIss(), getSub(), getAud(), getName(), getEmail(), getOrgId(), getOrg(), getPid());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JwtPayloadDto {\n");
        sb.append("    iss: ").append(toIndentedString(getIss())).append("\n");
        sb.append("    sub: ").append(toIndentedString(getSub())).append("\n");
        sb.append("    aud: ").append(toIndentedString(getAud())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    email: ").append(toIndentedString(getEmail())).append("\n");
        sb.append("    orgId: ").append(toIndentedString(getOrgId())).append("\n");
        sb.append("    org: ").append(toIndentedString(getOrg())).append("\n");
        sb.append("    pid: ").append(toIndentedString(getPid())).append("\n");
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

