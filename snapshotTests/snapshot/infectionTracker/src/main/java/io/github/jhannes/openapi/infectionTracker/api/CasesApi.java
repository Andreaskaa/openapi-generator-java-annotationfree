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

package io.github.jhannes.openapi.infectionTracker.api;

import io.github.jhannes.openapi.infectionTracker.model.*;

import io.github.jhannes.openapi.infectionTracker.model.ExposureDto;
import io.github.jhannes.openapi.infectionTracker.model.InfectionDto;
import io.github.jhannes.openapi.infectionTracker.model.InfectionInformationDto;
import java.util.UUID;

import org.actioncontroller.actions.*;
import org.actioncontroller.values.*;
import org.actioncontroller.values.json.JsonBody;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface CasesApi {
    /**
     * @param caseId  (required)
     * @return InfectionDto
     */
    @GET("/api/cases/{caseId}")
    @JsonBody
    public InfectionDto getCaseDetails(
            @PathParam("caseId") UUID caseId
    ) throws IOException;
    /**
     * @return InfectionDto
     */
    @GET("/api/cases")
    @JsonBody
    public InfectionDto listCases(
    ) throws IOException;
    /**
     * @param infectionInformationDto  (optional)
     */
    @POST("/api/cases")
    public void newCase(
            @JsonBody InfectionInformationDto infectionInformationDto
    ) throws IOException;
    /**
     * @param caseId  (required)
     * @param exposureDto  (optional)
     */
    @POST("/api/cases/{caseId}/exposures")
    public void registerExposure(
            @PathParam("caseId") UUID caseId,
            @JsonBody ExposureDto exposureDto
    ) throws IOException;
}
