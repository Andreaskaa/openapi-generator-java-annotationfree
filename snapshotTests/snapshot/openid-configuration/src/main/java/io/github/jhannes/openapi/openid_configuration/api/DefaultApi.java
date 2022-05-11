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

package io.github.jhannes.openapi.openid_configuration.api;

import io.github.jhannes.openapi.openid_configuration.model.*;

import io.github.jhannes.openapi.openid_configuration.model.DiscoveryDocumentDto;
import io.github.jhannes.openapi.openid_configuration.model.JwksDocumentDto;

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

public interface DefaultApi {
    /**
     * @return JwksDocumentDto
     */
    @GET("/.well-known/keys")
    @JsonBody
    public JwksDocumentDto wellKnownKeysGet(
    ) throws IOException;
    /**
     * @return DiscoveryDocumentDto
     */
    @GET("/.well-known/openid-configuration")
    @JsonBody
    public DiscoveryDocumentDto wellKnownOpenidConfigurationGet(
    ) throws IOException;
}
