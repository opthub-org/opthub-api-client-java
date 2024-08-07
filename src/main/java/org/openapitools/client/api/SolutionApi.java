/*
 * OptHub REST API
 * OptHubの公開REST APIです。
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


import org.openapitools.client.model.CreateSolutionResponse;
import org.openapitools.client.model.Solution;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SolutionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SolutionApi(ApiClient apiClient) {
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
     * Build call for createSolution
     * @param matchId 競技のID (required)
     * @param variable 解空間の変数 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSolutionCall(UUID matchId, List<Double> variable, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/solution";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (matchId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("matchId", matchId));
        }

        if (variable != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "variable", variable));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSolutionValidateBeforeCall(UUID matchId, List<Double> variable, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'matchId' is set
        if (matchId == null) {
            throw new ApiException("Missing the required parameter 'matchId' when calling createSolution(Async)");
        }

        // verify the required parameter 'variable' is set
        if (variable == null) {
            throw new ApiException("Missing the required parameter 'variable' when calling createSolution(Async)");
        }

        return createSolutionCall(matchId, variable, _callback);

    }

    /**
     * 解の作成
     * 
     * @param matchId 競技のID (required)
     * @param variable 解空間の変数 (required)
     * @return CreateSolutionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public CreateSolutionResponse createSolution(UUID matchId, List<Double> variable) throws ApiException {
        ApiResponse<CreateSolutionResponse> localVarResp = createSolutionWithHttpInfo(matchId, variable);
        return localVarResp.getData();
    }

    /**
     * 解の作成
     * 
     * @param matchId 競技のID (required)
     * @param variable 解空間の変数 (required)
     * @return ApiResponse&lt;CreateSolutionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateSolutionResponse> createSolutionWithHttpInfo(UUID matchId, List<Double> variable) throws ApiException {
        okhttp3.Call localVarCall = createSolutionValidateBeforeCall(matchId, variable, null);
        Type localVarReturnType = new TypeToken<CreateSolutionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 解の作成 (asynchronously)
     * 
     * @param matchId 競技のID (required)
     * @param variable 解空間の変数 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSolutionAsync(UUID matchId, List<Double> variable, final ApiCallback<CreateSolutionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSolutionValidateBeforeCall(matchId, variable, _callback);
        Type localVarReturnType = new TypeToken<CreateSolutionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSolution
     * @param matchId 競技のID (required)
     * @param participantId 参加者のID (required)
     * @param trialNo 試行番号 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSolutionCall(UUID matchId, UUID participantId, Integer trialNo, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/solution";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (matchId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("matchId", matchId));
        }

        if (participantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("participantId", participantId));
        }

        if (trialNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trialNo", trialNo));
        }

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
    private okhttp3.Call getSolutionValidateBeforeCall(UUID matchId, UUID participantId, Integer trialNo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'matchId' is set
        if (matchId == null) {
            throw new ApiException("Missing the required parameter 'matchId' when calling getSolution(Async)");
        }

        // verify the required parameter 'participantId' is set
        if (participantId == null) {
            throw new ApiException("Missing the required parameter 'participantId' when calling getSolution(Async)");
        }

        // verify the required parameter 'trialNo' is set
        if (trialNo == null) {
            throw new ApiException("Missing the required parameter 'trialNo' when calling getSolution(Async)");
        }

        return getSolutionCall(matchId, participantId, trialNo, _callback);

    }

    /**
     * 解の取得
     * 
     * @param matchId 競技のID (required)
     * @param participantId 参加者のID (required)
     * @param trialNo 試行番号 (required)
     * @return Solution
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public Solution getSolution(UUID matchId, UUID participantId, Integer trialNo) throws ApiException {
        ApiResponse<Solution> localVarResp = getSolutionWithHttpInfo(matchId, participantId, trialNo);
        return localVarResp.getData();
    }

    /**
     * 解の取得
     * 
     * @param matchId 競技のID (required)
     * @param participantId 参加者のID (required)
     * @param trialNo 試行番号 (required)
     * @return ApiResponse&lt;Solution&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Solution> getSolutionWithHttpInfo(UUID matchId, UUID participantId, Integer trialNo) throws ApiException {
        okhttp3.Call localVarCall = getSolutionValidateBeforeCall(matchId, participantId, trialNo, null);
        Type localVarReturnType = new TypeToken<Solution>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 解の取得 (asynchronously)
     * 
     * @param matchId 競技のID (required)
     * @param participantId 参加者のID (required)
     * @param trialNo 試行番号 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSolutionAsync(UUID matchId, UUID participantId, Integer trialNo, final ApiCallback<Solution> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSolutionValidateBeforeCall(matchId, participantId, trialNo, _callback);
        Type localVarReturnType = new TypeToken<Solution>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
