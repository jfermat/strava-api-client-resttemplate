# StreamsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivityStreams**](StreamsApi.md#getActivityStreams) | **GET** /activities/{id}/streams | Get Activity Streams
[**getRouteStreams**](StreamsApi.md#getRouteStreams) | **GET** /routes/{id}/streams | Get Route Streams
[**getSegmentEffortStreams**](StreamsApi.md#getSegmentEffortStreams) | **GET** /segment_efforts/{id}/streams | Get Segment Effort Streams
[**getSegmentStreams**](StreamsApi.md#getSegmentStreams) | **GET** /segments/{id}/streams | Get Segment Streams

<a name="getActivityStreams"></a>
# **getActivityStreams**
> StreamSet getActivityStreams(id, keys, keyByType)

Get Activity Streams

Returns the given activity&#x27;s streams. Requires activity:read scope. Requires activity:read_all scope for Only Me activities.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
Long id = 789L; // Long | The identifier of the activity.
List<String> keys = Arrays.asList("keys_example"); // List<String> | Desired stream types.
Boolean keyByType = true; // Boolean | Must be true.
try {
    StreamSet result = apiInstance.getActivityStreams(id, keys, keyByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getActivityStreams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the activity. |
 **keys** | [**List&lt;String&gt;**](String.md)| Desired stream types. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRouteStreams"></a>
# **getRouteStreams**
> StreamSet getRouteStreams(id)

Get Route Streams

Returns the given route&#x27;s streams. Requires read_all scope for private routes.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
Long id = 789L; // Long | The identifier of the route.
try {
    StreamSet result = apiInstance.getRouteStreams(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getRouteStreams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the route. |

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentEffortStreams"></a>
# **getSegmentEffortStreams**
> StreamSet getSegmentEffortStreams(id, keys, keyByType)

Get Segment Effort Streams

Returns a set of streams for a segment effort completed by the authenticated athlete. Requires read_all scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
Long id = 789L; // Long | The identifier of the segment effort.
List<String> keys = Arrays.asList("keys_example"); // List<String> | The types of streams to return.
Boolean keyByType = true; // Boolean | Must be true.
try {
    StreamSet result = apiInstance.getSegmentEffortStreams(id, keys, keyByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getSegmentEffortStreams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment effort. |
 **keys** | [**List&lt;String&gt;**](String.md)| The types of streams to return. | [enum: time, distance, latlng, altitude, velocity_smooth, heartrate, cadence, watts, temp, moving, grade_smooth]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentStreams"></a>
# **getSegmentStreams**
> StreamSet getSegmentStreams(id, keys, keyByType)

Get Segment Streams

Returns the given segment&#x27;s streams. Requires read_all scope for private segments.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.StreamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

StreamsApi apiInstance = new StreamsApi();
Long id = 789L; // Long | The identifier of the segment.
List<String> keys = Arrays.asList("keys_example"); // List<String> | The types of streams to return.
Boolean keyByType = true; // Boolean | Must be true.
try {
    StreamSet result = apiInstance.getSegmentStreams(id, keys, keyByType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamsApi#getSegmentStreams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment. |
 **keys** | [**List&lt;String&gt;**](String.md)| The types of streams to return. | [enum: distance, latlng, altitude]
 **keyByType** | **Boolean**| Must be true. | [default to true]

### Return type

[**StreamSet**](StreamSet.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

