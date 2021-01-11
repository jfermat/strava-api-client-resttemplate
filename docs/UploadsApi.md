# UploadsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUpload**](UploadsApi.md#createUpload) | **POST** /uploads | Upload Activity
[**getUploadById**](UploadsApi.md#getUploadById) | **GET** /uploads/{uploadId} | Get Upload

<a name="createUpload"></a>
# **createUpload**
> Upload createUpload(file, name, description, trainer, commute, dataType, externalId)

Upload Activity

Uploads a new data file to create an activity from. Requires activity:write scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.UploadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

UploadsApi apiInstance = new UploadsApi();
File file = new File("file_example"); // File | 
String name = "name_example"; // String | 
String description = "description_example"; // String | 
String trainer = "trainer_example"; // String | 
String commute = "commute_example"; // String | 
String dataType = "dataType_example"; // String | 
String externalId = "externalId_example"; // String | 
try {
    Upload result = apiInstance.createUpload(file, name, description, trainer, commute, dataType, externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#createUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **name** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **trainer** | **String**|  | [optional]
 **commute** | **String**|  | [optional]
 **dataType** | **String**|  | [optional] [enum: fit, fit.gz, tcx, tcx.gz, gpx, gpx.gz]
 **externalId** | **String**|  | [optional]

### Return type

[**Upload**](Upload.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getUploadById"></a>
# **getUploadById**
> Upload getUploadById(uploadId)

Get Upload

Returns an upload for a given identifier. Requires activity:write scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.UploadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

UploadsApi apiInstance = new UploadsApi();
Long uploadId = 789L; // Long | The identifier of the upload.
try {
    Upload result = apiInstance.getUploadById(uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#getUploadById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **Long**| The identifier of the upload. |

### Return type

[**Upload**](Upload.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

