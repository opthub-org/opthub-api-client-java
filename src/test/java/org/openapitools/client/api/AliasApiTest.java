/*
 * OptHub REST API
 * OptHub Public REST API.
 *
 * The version of the OpenAPI document: 0.1.1
 * Contact: dev@opthub.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AliasApi
 */
@Disabled
public class AliasApiTest {

    private final AliasApi api = new AliasApi();

    /**
     * Retrieve the competition alias from the competition ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resolveCompetitionAliasByIdTest() throws ApiException {
        UUID id = null;
        String response = api.resolveCompetitionAliasById(id);
        // TODO: test validations
    }

    /**
     * Retrieve the competition ID from the competition alias
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resolveCompetitionIdByAliasTest() throws ApiException {
        String alias = null;
        UUID response = api.resolveCompetitionIdByAlias(alias);
        // TODO: test validations
    }

    /**
     * Retrieve the match alias from the match ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resolveMatchAliasByIdTest() throws ApiException {
        UUID matchId = null;
        String response = api.resolveMatchAliasById(matchId);
        // TODO: test validations
    }

    /**
     * Retrieve the match ID from the match alias
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resolveMatchIdByAliasTest() throws ApiException {
        String alias = null;
        UUID response = api.resolveMatchIdByAlias(alias);
        // TODO: test validations
    }

}
