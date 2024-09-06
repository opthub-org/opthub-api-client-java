# MatchTrialsApi

All URIs are relative to *https://api.opthub.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMatchTrial**](MatchTrialsApi.md#createMatchTrial) | **POST** /matches/{match_uuid}/trials | Create a match trial |
| [**getMatchEvaluation**](MatchTrialsApi.md#getMatchEvaluation) | **GET** /matches/{match_uuid}/trials/{trial_no}/evaluation | Retrieve status of a specific match evaluation related to the Solution submitted by the Participant themselves. |
| [**getMatchScore**](MatchTrialsApi.md#getMatchScore) | **GET** /matches/{match_uuid}/trials/{trial_no}/score | Retrieve status of a specific match score related to the Solution submitted by the Participant themselves. |
| [**getMatchTrial**](MatchTrialsApi.md#getMatchTrial) | **GET** /matches/{match_uuid}/trials/{trial_no} | Retrieve status of a specific Match Trial related to the Solution submitted by the Participant themselves. |
| [**getSolution**](MatchTrialsApi.md#getSolution) | **GET** /matches/{match_uuid}/trials/{trial_no}/solution | Retrieve the Solution submitted by the Participant themselves. |


<a id="createMatchTrial"></a>
# **createMatchTrial**
> MatchTrialResponse createMatchTrial(matchUuid, createMatchTrialRequest)

Create a match trial

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchTrialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opthub.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchTrialsApi apiInstance = new MatchTrialsApi(defaultClient);
    UUID matchUuid = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match UUID
    CreateMatchTrialRequest createMatchTrialRequest = new CreateMatchTrialRequest(); // CreateMatchTrialRequest | 
    try {
      MatchTrialResponse result = apiInstance.createMatchTrial(matchUuid, createMatchTrialRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchTrialsApi#createMatchTrial");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchUuid** | **UUID**| Match UUID | |
| **createMatchTrialRequest** | [**CreateMatchTrialRequest**](CreateMatchTrialRequest.md)|  | [optional] |

### Return type

[**MatchTrialResponse**](MatchTrialResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information of the created match trial |  -  |
| **400** | Bad request input |  -  |
| **401** | Authentication error |  -  |
| **403** | Forbidden operation |  -  |
| **404** | The entry specified in the query was not found |  -  |
| **500** | Internal server error |  -  |

<a id="getMatchEvaluation"></a>
# **getMatchEvaluation**
> MatchTrialEvaluation getMatchEvaluation(matchUuid, trialNo)

Retrieve status of a specific match evaluation related to the Solution submitted by the Participant themselves.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchTrialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opthub.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchTrialsApi apiInstance = new MatchTrialsApi(defaultClient);
    UUID matchUuid = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match UUID
    Integer trialNo = 4; // Integer | Trial number
    try {
      MatchTrialEvaluation result = apiInstance.getMatchEvaluation(matchUuid, trialNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchTrialsApi#getMatchEvaluation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchUuid** | **UUID**| Match UUID | |
| **trialNo** | **Integer**| Trial number | |

### Return type

[**MatchTrialEvaluation**](MatchTrialEvaluation.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status information of the match trial |  -  |
| **400** | Bad request input |  -  |
| **401** | Authentication error |  -  |
| **403** | Forbidden operation |  -  |
| **404** | The entry specified in the query was not found |  -  |
| **500** | Internal server error |  -  |

<a id="getMatchScore"></a>
# **getMatchScore**
> MatchTrialScore getMatchScore(matchUuid, trialNo)

Retrieve status of a specific match score related to the Solution submitted by the Participant themselves.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchTrialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opthub.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchTrialsApi apiInstance = new MatchTrialsApi(defaultClient);
    UUID matchUuid = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match UUID
    Integer trialNo = 4; // Integer | Trial number
    try {
      MatchTrialScore result = apiInstance.getMatchScore(matchUuid, trialNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchTrialsApi#getMatchScore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchUuid** | **UUID**| Match UUID | |
| **trialNo** | **Integer**| Trial number | |

### Return type

[**MatchTrialScore**](MatchTrialScore.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status information of the match trial |  -  |
| **400** | Bad request input |  -  |
| **401** | Authentication error |  -  |
| **403** | Forbidden operation |  -  |
| **404** | The entry specified in the query was not found |  -  |
| **500** | Internal server error |  -  |

<a id="getMatchTrial"></a>
# **getMatchTrial**
> MatchTrialResponse getMatchTrial(matchUuid, trialNo)

Retrieve status of a specific Match Trial related to the Solution submitted by the Participant themselves.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchTrialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opthub.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchTrialsApi apiInstance = new MatchTrialsApi(defaultClient);
    UUID matchUuid = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match UUID
    Integer trialNo = 4; // Integer | Trial number
    try {
      MatchTrialResponse result = apiInstance.getMatchTrial(matchUuid, trialNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchTrialsApi#getMatchTrial");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchUuid** | **UUID**| Match UUID | |
| **trialNo** | **Integer**| Trial number | |

### Return type

[**MatchTrialResponse**](MatchTrialResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status information of the match trial |  -  |
| **400** | Bad request input |  -  |
| **401** | Authentication error |  -  |
| **403** | Forbidden operation |  -  |
| **404** | The entry specified in the query was not found |  -  |
| **500** | Internal server error |  -  |

<a id="getSolution"></a>
# **getSolution**
> Solution getSolution(matchUuid, trialNo)

Retrieve the Solution submitted by the Participant themselves.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchTrialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opthub.ai");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchTrialsApi apiInstance = new MatchTrialsApi(defaultClient);
    UUID matchUuid = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match UUID
    Integer trialNo = 4; // Integer | Trial number
    try {
      Solution result = apiInstance.getSolution(matchUuid, trialNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchTrialsApi#getSolution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matchUuid** | **UUID**| Match UUID | |
| **trialNo** | **Integer**| Trial number | |

### Return type

[**Solution**](Solution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Solution information |  -  |
| **400** | Bad request input |  -  |
| **401** | Authentication error |  -  |
| **403** | Forbidden operation |  -  |
| **404** | The entry specified in the query was not found |  -  |
| **500** | Internal server error |  -  |

