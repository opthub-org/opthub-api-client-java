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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompetitionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompetitionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompetitionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for resolveCompetitionAliasById
     * @param id Competition ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveCompetitionAliasByIdCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/competition/{id}/alias"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resolveCompetitionAliasByIdValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling resolveCompetitionAliasById(Async)");
        }

        return resolveCompetitionAliasByIdCall(id, _callback);

    }

    /**
     * Retrieve the competition alias from the competition ID
     * 
     * @param id Competition ID (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public String resolveCompetitionAliasById(UUID id) throws ApiException {
        ApiResponse<String> localVarResp = resolveCompetitionAliasByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve the competition alias from the competition ID
     * 
     * @param id Competition ID (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> resolveCompetitionAliasByIdWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = resolveCompetitionAliasByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the competition alias from the competition ID (asynchronously)
     * 
     * @param id Competition ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveCompetitionAliasByIdAsync(UUID id, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = resolveCompetitionAliasByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resolveCompetitionIdByAlias
     * @param alias Competition alias (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveCompetitionIdByAliasCall(String alias, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/competition/alias/{alias}"
            .replace("{" + "alias" + "}", localVarApiClient.escapeString(alias.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resolveCompetitionIdByAliasValidateBeforeCall(String alias, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new ApiException("Missing the required parameter 'alias' when calling resolveCompetitionIdByAlias(Async)");
        }

        return resolveCompetitionIdByAliasCall(alias, _callback);

    }

    /**
     * Retrieve the competition ID from the competition alias
     * 
     * @param alias Competition alias (required)
     * @return UUID
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public UUID resolveCompetitionIdByAlias(String alias) throws ApiException {
        ApiResponse<UUID> localVarResp = resolveCompetitionIdByAliasWithHttpInfo(alias);
        return localVarResp.getData();
    }

    /**
     * Retrieve the competition ID from the competition alias
     * 
     * @param alias Competition alias (required)
     * @return ApiResponse&lt;UUID&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UUID> resolveCompetitionIdByAliasWithHttpInfo(String alias) throws ApiException {
        okhttp3.Call localVarCall = resolveCompetitionIdByAliasValidateBeforeCall(alias, null);
        Type localVarReturnType = new TypeToken<UUID>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the competition ID from the competition alias (asynchronously)
     * 
     * @param alias Competition alias (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Competition ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Competition not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveCompetitionIdByAliasAsync(String alias, final ApiCallback<UUID> _callback) throws ApiException {

        okhttp3.Call localVarCall = resolveCompetitionIdByAliasValidateBeforeCall(alias, _callback);
        Type localVarReturnType = new TypeToken<UUID>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
