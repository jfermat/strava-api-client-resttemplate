# ClubsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClubActivitiesById**](ClubsApi.md#getClubActivitiesById) | **GET** /clubs/{id}/activities | List Club Activities
[**getClubAdminsById**](ClubsApi.md#getClubAdminsById) | **GET** /clubs/{id}/admins | List Club Administrators
[**getClubById**](ClubsApi.md#getClubById) | **GET** /clubs/{id} | Get Club
[**getClubMembersById**](ClubsApi.md#getClubMembersById) | **GET** /clubs/{id}/members | List Club Members
[**getLoggedInAthleteClubs**](ClubsApi.md#getLoggedInAthleteClubs) | **GET** /athlete/clubs | List Athlete Clubs

<a name="getClubActivitiesById"></a>
# **getClubActivitiesById**
> List&lt;SummaryActivity&gt; getClubActivitiesById(id, page, perPage)

List Club Activities

Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.ClubsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

ClubsApi apiInstance = new ClubsApi();
Long id = 789L; // Long | The identifier of the club.
Integer page = 56; // Integer | Page number. Defaults to 1.
Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummaryActivity> result = apiInstance.getClubActivitiesById(id, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClubsApi#getClubActivitiesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the club. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryActivity&gt;**](SummaryActivity.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubAdminsById"></a>
# **getClubAdminsById**
> List&lt;SummaryAthlete&gt; getClubAdminsById(id, page, perPage)

List Club Administrators

Returns a list of the administrators of a given club.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.ClubsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

ClubsApi apiInstance = new ClubsApi();
Long id = 789L; // Long | The identifier of the club.
Integer page = 56; // Integer | Page number. Defaults to 1.
Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummaryAthlete> result = apiInstance.getClubAdminsById(id, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClubsApi#getClubAdminsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the club. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryAthlete&gt;**](SummaryAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubById"></a>
# **getClubById**
> DetailedClub getClubById(id)

Get Club

Returns a given club using its identifier.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.ClubsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

ClubsApi apiInstance = new ClubsApi();
Long id = 789L; // Long | The identifier of the club.
try {
    DetailedClub result = apiInstance.getClubById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClubsApi#getClubById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the club. |

### Return type

[**DetailedClub**](DetailedClub.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClubMembersById"></a>
# **getClubMembersById**
> List&lt;SummaryAthlete&gt; getClubMembersById(id, page, perPage)

List Club Members

Returns a list of the athletes who are members of a given club.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.ClubsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

ClubsApi apiInstance = new ClubsApi();
Long id = 789L; // Long | The identifier of the club.
Integer page = 56; // Integer | Page number. Defaults to 1.
Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummaryAthlete> result = apiInstance.getClubMembersById(id, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClubsApi#getClubMembersById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the club. |
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryAthlete&gt;**](SummaryAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteClubs"></a>
# **getLoggedInAthleteClubs**
> List&lt;SummaryClub&gt; getLoggedInAthleteClubs(page, perPage)

List Athlete Clubs

Returns a list of the clubs whose membership includes the authenticated athlete.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.ClubsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

ClubsApi apiInstance = new ClubsApi();
Integer page = 56; // Integer | Page number. Defaults to 1.
Integer perPage = 30; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummaryClub> result = apiInstance.getLoggedInAthleteClubs(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClubsApi#getLoggedInAthleteClubs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number. Defaults to 1. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional] [default to 30]

### Return type

[**List&lt;SummaryClub&gt;**](SummaryClub.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

