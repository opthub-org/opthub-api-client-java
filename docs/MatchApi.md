# MatchApi

All URIs are relative to *https://example.com/todo/opthub-api-endpoint*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resolveMatchAliasById**](MatchApi.md#resolveMatchAliasById) | **GET** /competition/match/{matchId}/alias | 競技IDから競技のエイリアスを取得 |
| [**resolveMatchIdByAlias**](MatchApi.md#resolveMatchIdByAlias) | **GET** /competition/match/alias/{alias} | 競技のエイリアスから競技IDを取得 |


<a id="resolveMatchAliasById"></a>
# **resolveMatchAliasById**
> String resolveMatchAliasById(matchId)

競技IDから競技のエイリアスを取得

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchApi apiInstance = new MatchApi(defaultClient);
    UUID matchId = UUID.randomUUID(); // UUID | 競技のID
    try {
      String result = apiInstance.resolveMatchAliasById(matchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchApi#resolveMatchAliasById");
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
| **matchId** | **UUID**| 競技のID | |

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
| **200** | Successful operation |  -  |
| **0** | successful operation |  -  |

<a id="resolveMatchIdByAlias"></a>
# **resolveMatchIdByAlias**
> UUID resolveMatchIdByAlias(alias)

競技のエイリアスから競技IDを取得

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MatchApi apiInstance = new MatchApi(defaultClient);
    String alias = "alias_example"; // String | 競技のエイリアス
    try {
      UUID result = apiInstance.resolveMatchIdByAlias(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchApi#resolveMatchIdByAlias");
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
| **alias** | **String**| 競技のエイリアス | |

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
| **200** | Successful operation |  -  |
| **0** | successful operation |  -  |

