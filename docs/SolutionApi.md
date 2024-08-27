# SolutionApi

All URIs are relative to *https://example.com/todo/opthub-api-endpoint*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSolution**](SolutionApi.md#createSolution) | **POST** /competition/match/{matchId}/solution | Create solution |
| [**getSolution**](SolutionApi.md#getSolution) | **GET** /competition/match/{matchId}/solution | Retrive solution |


<a id="createSolution"></a>
# **createSolution**
> CreateSolutionResponse createSolution(matchId, variable)

Create solution

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    UUID matchId = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match ID
    List<Double> variable = Arrays.asList(); // List<Double> | Solution space variable
    try {
      CreateSolutionResponse result = apiInstance.createSolution(matchId, variable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#createSolution");
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
| **matchId** | **UUID**| Match ID | |
| **variable** | [**List&lt;Double&gt;**](Double.md)| Solution space variable | |

### Return type

[**CreateSolutionResponse**](CreateSolutionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information of the created solution |  -  |
| **404** | Match ID not found |  -  |

<a id="getSolution"></a>
# **getSolution**
> Solution getSolution(matchId, participantId, trialNo)

Retrive solution

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    UUID matchId = UUID.fromString("5d7fc778-3e59-4128-a797-2e423c0aa461"); // UUID | Match ID
    UUID participantId = UUID.fromString("912f548d-2bbe-48ab-90ce-e96dae38377d"); // UUID | Participant ID
    Integer trialNo = 4; // Integer | Trial number
    try {
      Solution result = apiInstance.getSolution(matchId, participantId, trialNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#getSolution");
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
| **matchId** | **UUID**| Match ID | |
| **participantId** | **UUID**| Participant ID | |
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
| **200** | Information of the solution |  -  |
| **404** | The created solution specified in the query was not found |  -  |

