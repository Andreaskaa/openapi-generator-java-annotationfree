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


package io.github.jhannes.openapi.petstore.api;

import io.github.jhannes.openapi.petstore.ApiException;
import java.io.File;
import io.github.jhannes.openapi.petstore.model.PetDto;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetApi
 */
public class PetApiTest {

    private final PetApi api = new PetApi();

    /**
     * Add a new pet to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        //
        //PetDto petDto = null;
        //
        //api.addPet(petDto);

        // TODO: test validations
    }
    /**
     * Deletes a pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws ApiException {
        //
        //Long petId = null;
        //
        //String apiKey = null;
        //
        //api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    /**
     * downloads image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadImageTest() throws ApiException {
        //
        //Long petId = null;
        //
        //File response = api.downloadImage(petId);

        // TODO: test validations
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws ApiException {
        //
        //List<String> status = null;
        //
        //List<PetDto> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws ApiException {
        //
        //List<String> tags = null;
        //
        //List<PetDto> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    /**
     * Find pet by ID
     *
     * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws ApiException {
        //
        //Long petId = null;
        //
        //PetDto response = api.getPetById(petId);

        // TODO: test validations
    }
    /**
     * Update an existing pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws ApiException {
        //
        //PetDto petDto = null;
        //
        //api.updatePet(petDto);

        // TODO: test validations
    }
    /**
     * Updates a pet in the store with form data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws ApiException {
        //
        //String petId = null;
        //
        //String name = null;
        //
        //String status = null;
        //
        //api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }
    /**
     * uploads an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        //
        //Long petId = null;
        //
        //String additionalMetadata = null;
        //
        //File _file = null;
        //
        //api.uploadFile(petId, additionalMetadata, _file);

        // TODO: test validations
    }
}
