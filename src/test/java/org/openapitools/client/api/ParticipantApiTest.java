/*
 * OptHub REST API
 * OptHub Public REST API.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: dev@opthub.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Participant;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParticipantApi
 */
@Disabled
public class ParticipantApiTest {

    private final ParticipantApi api = new ParticipantApi();

    /**
     * Retrieve the participant information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParticipantTest() throws ApiException {
        UUID id = null;
        Participant response = api.getParticipant(id);
        // TODO: test validations
    }

}