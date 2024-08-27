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

public class MatchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MatchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MatchApi(ApiClient apiClient) {
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
     * Build call for resolveMatchAliasById
     * @param matchId Match ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveMatchAliasByIdCall(UUID matchId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/competition/match/{matchId}/alias"
            .replace("{" + "matchId" + "}", localVarApiClient.escapeString(matchId.toString()));

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
    private okhttp3.Call resolveMatchAliasByIdValidateBeforeCall(UUID matchId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'matchId' is set
        if (matchId == null) {
            throw new ApiException("Missing the required parameter 'matchId' when calling resolveMatchAliasById(Async)");
        }

        return resolveMatchAliasByIdCall(matchId, _callback);

    }

    /**
     * Retrieve the match alias from the match ID
     * 
     * @param matchId Match ID (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public String resolveMatchAliasById(UUID matchId) throws ApiException {
        ApiResponse<String> localVarResp = resolveMatchAliasByIdWithHttpInfo(matchId);
        return localVarResp.getData();
    }

    /**
     * Retrieve the match alias from the match ID
     * 
     * @param matchId Match ID (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> resolveMatchAliasByIdWithHttpInfo(UUID matchId) throws ApiException {
        okhttp3.Call localVarCall = resolveMatchAliasByIdValidateBeforeCall(matchId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the match alias from the match ID (asynchronously)
     * 
     * @param matchId Match ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match alias </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveMatchAliasByIdAsync(UUID matchId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = resolveMatchAliasByIdValidateBeforeCall(matchId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resolveMatchIdByAlias
     * @param alias Match alias (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveMatchIdByAliasCall(String alias, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/competition/match/alias/{alias}"
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
    private okhttp3.Call resolveMatchIdByAliasValidateBeforeCall(String alias, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new ApiException("Missing the required parameter 'alias' when calling resolveMatchIdByAlias(Async)");
        }

        return resolveMatchIdByAliasCall(alias, _callback);

    }

    /**
     * Retrieve the match ID from the match alias
     * 
     * @param alias Match alias (required)
     * @return UUID
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public UUID resolveMatchIdByAlias(String alias) throws ApiException {
        ApiResponse<UUID> localVarResp = resolveMatchIdByAliasWithHttpInfo(alias);
        return localVarResp.getData();
    }

    /**
     * Retrieve the match ID from the match alias
     * 
     * @param alias Match alias (required)
     * @return ApiResponse&lt;UUID&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UUID> resolveMatchIdByAliasWithHttpInfo(String alias) throws ApiException {
        okhttp3.Call localVarCall = resolveMatchIdByAliasValidateBeforeCall(alias, null);
        Type localVarReturnType = new TypeToken<UUID>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the match ID from the match alias (asynchronously)
     * 
     * @param alias Match alias (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Match ID </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Match not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resolveMatchIdByAliasAsync(String alias, final ApiCallback<UUID> _callback) throws ApiException {

        okhttp3.Call localVarCall = resolveMatchIdByAliasValidateBeforeCall(alias, _callback);
        Type localVarReturnType = new TypeToken<UUID>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
