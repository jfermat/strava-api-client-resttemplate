# SegmentsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exploreSegments**](SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
[**getLoggedInAthleteStarredSegments**](SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
[**getSegmentById**](SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
[**starSegment**](SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment

<a name="exploreSegments"></a>
# **exploreSegments**
> ExplorerResponse exploreSegments(bounds, activityType, minCat, maxCat)

Explore segments

Returns the top 10 segments matching a specified query.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
List<Float> bounds = Arrays.asList(3.4F); // List<Float> | The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude]
String activityType = "activityType_example"; // String | Desired activity type.
Integer minCat = 56; // Integer | The minimum climbing category.
Integer maxCat = 56; // Integer | The maximum climbing category.
try {
    ExplorerResponse result = apiInstance.exploreSegments(bounds, activityType, minCat, maxCat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#exploreSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bounds** | [**List&lt;Float&gt;**](Float.md)| The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] |
 **activityType** | **String**| Desired activity type. | [optional] [enum: running, riding]
 **minCat** | **Integer**| The minimum climbing category. | [optional] [enum: ]
 **maxCat** | **Integer**| The maximum climbing category. | [optional] [enum: ]

### Return type

[**ExplorerResponse**](ExplorerResponse.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteStarredSegments"></a>
# **getLoggedInAthleteStarredSegments**
> List&lt;SummarySegment&gt; getLoggedInAthleteStarredSegments(page, perPage)

List Starred Segments

List of the authenticated athlete&#x27;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Integer page = 56; // Integer | Page number. Defaults to 1.
Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummarySegment> result = apiInstance.getLoggedInAthleteStarredSegments(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getLoggedInAthleteStarredSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummarySegment&gt;**](SummarySegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentById"></a>
# **getSegmentById**
> DetailedSegment getSegmentById(id)

Get Segment

Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Long id = 789L; // Long | The identifier of the segment.
try {
    DetailedSegment result = apiInstance.getSegmentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment. |

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="starSegment"></a>
# **starSegment**
> DetailedSegment starSegment(starred, id)

Star Segment

Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Boolean starred = true; // Boolean | 
Long id = 789L; // Long | The identifier of the segment to star.
try {
    DetailedSegment result = apiInstance.starSegment(starred, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#starSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **starred** | **Boolean**|  |
 **id** | **Long**| The identifier of the segment to star. |

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

