# openapi-java-client

OptHub REST API
- API version: 0.1.1
  - Build date: 2024-08-27T09:21:17.033728995Z[Etc/UTC]
  - Generator version: 7.8.0-SNAPSHOT

OptHub Public REST API.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.1.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:0.1.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-0.1.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.com/todo/opthub-api-endpoint");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AliasApi apiInstance = new AliasApi(defaultClient);
    UUID id = UUID.fromString("42c999a1-a30c-47ef-b656-eb49f67488dc"); // UUID | Competition ID
    try {
      String result = apiInstance.resolveCompetitionAliasById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasApi#resolveCompetitionAliasById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://example.com/todo/opthub-api-endpoint*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AliasApi* | [**resolveCompetitionAliasById**](docs/AliasApi.md#resolveCompetitionAliasById) | **GET** /competition/{id}/alias | Retrieve the competition alias from the competition ID
*AliasApi* | [**resolveCompetitionIdByAlias**](docs/AliasApi.md#resolveCompetitionIdByAlias) | **GET** /competition/alias/{alias} | Retrieve the competition ID from the competition alias
*AliasApi* | [**resolveMatchAliasById**](docs/AliasApi.md#resolveMatchAliasById) | **GET** /competition/match/{matchId}/alias | Retrieve the match alias from the match ID
*AliasApi* | [**resolveMatchIdByAlias**](docs/AliasApi.md#resolveMatchIdByAlias) | **GET** /competition/match/alias/{alias} | Retrieve the match ID from the match alias
*CompetitionApi* | [**resolveCompetitionAliasById**](docs/CompetitionApi.md#resolveCompetitionAliasById) | **GET** /competition/{id}/alias | Retrieve the competition alias from the competition ID
*CompetitionApi* | [**resolveCompetitionIdByAlias**](docs/CompetitionApi.md#resolveCompetitionIdByAlias) | **GET** /competition/alias/{alias} | Retrieve the competition ID from the competition alias
*MatchApi* | [**resolveMatchAliasById**](docs/MatchApi.md#resolveMatchAliasById) | **GET** /competition/match/{matchId}/alias | Retrieve the match alias from the match ID
*MatchApi* | [**resolveMatchIdByAlias**](docs/MatchApi.md#resolveMatchIdByAlias) | **GET** /competition/match/alias/{alias} | Retrieve the match ID from the match alias
*ParticipantApi* | [**getParticipant**](docs/ParticipantApi.md#getParticipant) | **GET** /participant/{id} | Retrieve the participant information
*SolutionApi* | [**createSolution**](docs/SolutionApi.md#createSolution) | **POST** /competition/match/{matchId}/solution | Create solution
*SolutionApi* | [**getSolution**](docs/SolutionApi.md#getSolution) | **GET** /competition/match/{matchId}/solution | Retrive solution


## Documentation for Models

 - [CreateSolutionResponse](docs/CreateSolutionResponse.md)
 - [GetSolutionError](docs/GetSolutionError.md)
 - [Participant](docs/Participant.md)
 - [ParticipantType](docs/ParticipantType.md)
 - [Solution](docs/Solution.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@opthub.ai

