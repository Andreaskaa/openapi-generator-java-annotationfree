# DefaultApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](DefaultApi.md#addPet) | **POST** /{storeId}/pets | 
[**addPetWithForm**](DefaultApi.md#addPetWithForm) | **POST** /pets/{petId} | 
[**getPetLocations**](DefaultApi.md#getPetLocations) | **GET** /pet/locations | 
[**listPets**](DefaultApi.md#listPets) | **GET** /{storeId}/pets | 



## addPet

> addPet(storeId, petDto)



### Example

```java
import io.github.jhannes.openapi.bigExample.api.*;
import io.github.jhannes.openapi.bigExample.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        UUID storeId = UUID.randomUUID(); // UUID | 
        PetDto petDto = new PetDto(); // PetDto | 
        try {
            apiInstance.addPet(storeId, petDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#addPet");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **UUID**|  |
 **petDto** | [**PetDto**](PetDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## addPetWithForm

> addPetWithForm(petId, name, status)



### Example

```java
import io.github.jhannes.openapi.bigExample.api.*;
import io.github.jhannes.openapi.bigExample.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        UUID petId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | Updated name of the pet
        String status = "status_example"; // String | Updated status of the pet
        try {
            apiInstance.addPetWithForm(petId, name, status);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#addPetWithForm");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **UUID**|  |
 **name** | **String**| Updated name of the pet | [optional]
 **status** | **String**| Updated status of the pet | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getPetLocations

> PetLocationsDto getPetLocations()



### Example

```java
import io.github.jhannes.openapi.bigExample.api.*;
import io.github.jhannes.openapi.bigExample.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        try {
            PetLocationsDto result = apiInstance.getPetLocations();
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#getPetLocations");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PetLocationsDto**](PetLocationsDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the pet locations |  -  |


## listPets

> PetDto listPets(storeId, status, tags, bornAfter)



### Example

```java
import io.github.jhannes.openapi.bigExample.api.*;
import io.github.jhannes.openapi.bigExample.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("/v1");
        DefaultApi apiInstance = ApiClientProxy.create(DefaultApi.class, httpClient);

        UUID storeId = UUID.randomUUID(); // UUID | 
        List<String> status = Arrays.asList(); // List<String> | 
        List<String> tags = Arrays.asList(); // List<String> | 
        LocalDate bornAfter = LocalDate.now(); // LocalDate | 
        try {
            PetDto result = apiInstance.listPets(storeId, status, tags, bornAfter);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling DefaultApi#listPets");
            System.err.println("Status code: " + e.getStatusCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("URL: " + e.getUrl());
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **UUID**|  |
 **status** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **bornAfter** | **LocalDate**|  | [optional]

### Return type

[**PetDto**](PetDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

