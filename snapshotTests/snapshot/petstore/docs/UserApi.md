# UserApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array
[**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Updated user



## createUser

> createUser(userDto)

Create user

This can only be done by the logged in user.

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        UserDto userDto = new UserDto(); // UserDto | Created user object
        try {
            apiInstance.createUser(userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#createUser");
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
 **userDto** | [**UserDto**](UserDto.md)| Created user object | [optional]

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
| **0** | successful operation |  -  |


## createUsersWithArrayInput

> createUsersWithArrayInput(userDto)

Creates list of users with given input array

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        List<UserDto> userDto = Arrays.asList(); // List<UserDto> | List of user object
        try {
            apiInstance.createUsersWithArrayInput(userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
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
 **userDto** | [**List&lt;UserDto&gt;**](UserDto.md)| List of user object | [optional]

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
| **0** | successful operation |  -  |


## createUsersWithListInput

> createUsersWithListInput(userDto)

Creates list of users with given input array

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        List<UserDto> userDto = Arrays.asList(); // List<UserDto> | List of user object
        try {
            apiInstance.createUsersWithListInput(userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#createUsersWithListInput");
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
 **userDto** | [**List&lt;UserDto&gt;**](UserDto.md)| List of user object | [optional]

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
| **0** | successful operation |  -  |


## deleteUser

> deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        String username = "username_example"; // String | The name that needs to be deleted
        try {
            apiInstance.deleteUser(username);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#deleteUser");
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
 **username** | **String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## getUserByName

> UserDto getUserByName(username)

Get user by user name

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
        try {
            UserDto result = apiInstance.getUserByName(username);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#getUserByName");
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
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## loginUser

> String loginUser(username, password)

Logs user into the system

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        String username = "username_example"; // String | The user name for login
        String password = "password_example"; // String | The password for login in clear text
        try {
            String result = apiInstance.loginUser(username, password);
            System.out.println(result);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#loginUser");
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
 **username** | **String**| The user name for login | [optional]
 **password** | **String**| The password for login in clear text | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username/password supplied |  -  |


## logoutUser

> logoutUser()

Logs out current logged in user session

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        try {
            apiInstance.logoutUser();
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#logoutUser");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## updateUser

> updateUser(username, userDto)

Updated user

This can only be done by the logged in user.

### Example

```java
import io.github.jhannes.openapi.petstore.api.*;
import io.github.jhannes.openapi.petstore.models.*;
import org.actioncontroller.client.ApiClientProxy;
import org.actioncontroller.client.HttpClientException;
import org.actioncontroller.client.HttpURLConnectionApiClient;

public class Example {
    public static void main(String[] args) {
        HttpURLConnectionApiClient client = new HttpURLConnectionApiClient("http://petstore.swagger.io/v2");
        UserApi apiInstance = ApiClientProxy.create(UserApi.class, httpClient);

        String username = "username_example"; // String | name that need to be deleted
        UserDto userDto = new UserDto(); // UserDto | Updated user object
        try {
            apiInstance.updateUser(username, userDto);
        } catch (HttpClientException e) {
            System.err.println("Exception when calling UserApi#updateUser");
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
 **username** | **String**| name that need to be deleted |
 **userDto** | [**UserDto**](UserDto.md)| Updated user object | [optional]

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
| **400** | Invalid user supplied |  -  |
| **404** | User not found |  -  |

