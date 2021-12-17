/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.petstore.api;

import io.github.jhannes.openapi.petstore.model.*;

import java.time.OffsetDateTime;
import io.github.jhannes.openapi.petstore.model.OrderDto;

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

public interface StoreApi {
        /**
         * Delete purchase order by ID
         * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
         * @param orderId ID of the order that needs to be deleted (required)
         */
        @DELETE("/store/order/{orderId}")
        public void deleteOrder(
                @PathParam("orderId") String orderId
        ) throws IOException;
        /**
         * Returns pet inventories by status
         * Returns a map of status codes to quantities
         * @param effectiveDateTime  (optional)
         * @return Map&lt;String, Integer&gt;
         */
        @GET("/store/inventory")
        @JsonBody
        public Map<String, Integer> getInventory(
                @RequestParam("effectiveDateTime") Optional<OffsetDateTime> effectiveDateTime
        ) throws IOException;
        /**
         * Find purchase order by ID
         * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
         * @param orderId ID of pet that needs to be fetched (required)
         * @return OrderDto
         */
        @GET("/store/order/{orderId}")
        @JsonBody
        public OrderDto getOrderById(
                @PathParam("orderId") String orderId
        ) throws IOException;
        /**
         * Place an order for a pet
         * 
         * @param orderDto order placed for purchasing the pet (optional)
         * @return OrderDto
         */
        @POST("/store/order")
        @JsonBody
        public OrderDto placeOrder(
                @JsonBody OrderDto orderDto
        ) throws IOException;
}
