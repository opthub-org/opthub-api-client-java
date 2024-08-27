# ParticipantApi

All URIs are relative to *https://example.com/todo/opthub-api-endpoint*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getParticipant**](ParticipantApi.md#getParticipant) | **GET** /participant/{id} | Retrieve the participant information |


<a id="getParticipant"></a>
# **getParticipant**
> Participant getParticipant(id)

Retrieve the participant information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ParticipantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ParticipantApi apiInstance = new ParticipantApi(defaultClient);
    UUID id = UUID.fromString("912f548d-2bbe-48ab-90ce-e96dae38377d"); // UUID | Participant ID
    try {
      Participant result = apiInstance.getParticipant(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParticipantApi#getParticipant");
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
| **id** | **UUID**| Participant ID | |

### Return type

[**Participant**](Participant.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Participant information |  -  |
| **404** | Participant not found |  -  |

