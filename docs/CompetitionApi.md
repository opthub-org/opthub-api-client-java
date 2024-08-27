# CompetitionApi

All URIs are relative to *https://example.com/todo/opthub-api-endpoint*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resolveCompetitionAliasById**](CompetitionApi.md#resolveCompetitionAliasById) | **GET** /competition/{id}/alias | Retrieve the competition alias from the competition ID |
| [**resolveCompetitionIdByAlias**](CompetitionApi.md#resolveCompetitionIdByAlias) | **GET** /competition/alias/{alias} | Retrieve the competition ID from the competition alias |


<a id="resolveCompetitionAliasById"></a>
# **resolveCompetitionAliasById**
> String resolveCompetitionAliasById(id)

Retrieve the competition alias from the competition ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompetitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CompetitionApi apiInstance = new CompetitionApi(defaultClient);
    UUID id = UUID.fromString("42c999a1-a30c-47ef-b656-eb49f67488dc"); // UUID | Competition ID
    try {
      String result = apiInstance.resolveCompetitionAliasById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompetitionApi#resolveCompetitionAliasById");
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
| **id** | **UUID**| Competition ID | |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Competition alias |  -  |
| **404** | Competition not found |  -  |

<a id="resolveCompetitionIdByAlias"></a>
# **resolveCompetitionIdByAlias**
> UUID resolveCompetitionIdByAlias(alias)

Retrieve the competition ID from the competition alias

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompetitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CompetitionApi apiInstance = new CompetitionApi(defaultClient);
    String alias = "competition123"; // String | Competition alias
    try {
      UUID result = apiInstance.resolveCompetitionIdByAlias(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompetitionApi#resolveCompetitionIdByAlias");
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
| **alias** | **String**| Competition alias | |

### Return type

[**UUID**](UUID.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Competition ID |  -  |
| **404** | Competition not found |  -  |

