# AthletesApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoggedInAthlete**](AthletesApi.md#getLoggedInAthlete) | **GET** /athlete | Get Authenticated Athlete
[**getLoggedInAthleteZones**](AthletesApi.md#getLoggedInAthleteZones) | **GET** /athlete/zones | Get Zones
[**getStats**](AthletesApi.md#getStats) | **GET** /athletes/{id}/stats | Get Athlete Stats
[**updateLoggedInAthlete**](AthletesApi.md#updateLoggedInAthlete) | **PUT** /athlete | Update Athlete

<a name="getLoggedInAthlete"></a>
# **getLoggedInAthlete**
> DetailedAthlete getLoggedInAthlete()

Get Authenticated Athlete

Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.AthletesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

AthletesApi apiInstance = new AthletesApi();
try {
    DetailedAthlete result = apiInstance.getLoggedInAthlete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AthletesApi#getLoggedInAthlete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DetailedAthlete**](DetailedAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteZones"></a>
# **getLoggedInAthleteZones**
> Zones getLoggedInAthleteZones()

Get Zones

Returns the the authenticated athlete&#x27;s heart rate and power zones. Requires profile:read_all.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.AthletesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

AthletesApi apiInstance = new AthletesApi();
try {
    Zones result = apiInstance.getLoggedInAthleteZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AthletesApi#getLoggedInAthleteZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Zones**](Zones.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStats"></a>
# **getStats**
> ActivityStats getStats(id)

Get Athlete Stats

Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.AthletesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

AthletesApi apiInstance = new AthletesApi();
Long id = 789L; // Long | The identifier of the athlete. Must match the authenticated athlete.
try {
    ActivityStats result = apiInstance.getStats(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AthletesApi#getStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the athlete. Must match the authenticated athlete. |

### Return type

[**ActivityStats**](ActivityStats.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoggedInAthlete"></a>
# **updateLoggedInAthlete**
> DetailedAthlete updateLoggedInAthlete(weight)

Update Athlete

Update the currently authenticated athlete. Requires profile:write scope.

### Example
```java
// Import classes:
//import io.github.jfermat.strava.invoker.ApiClient;
//import io.github.jfermat.strava.invoker.ApiException;
//import io.github.jfermat.strava.invoker.Configuration;
//import io.github.jfermat.strava.invoker.auth.*;
//import io.github.jfermat.strava.api.AthletesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

AthletesApi apiInstance = new AthletesApi();
Float weight = 3.4F; // Float | The weight of the athlete in kilograms.
try {
    DetailedAthlete result = apiInstance.updateLoggedInAthlete(weight);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AthletesApi#updateLoggedInAthlete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **weight** | **Float**| The weight of the athlete in kilograms. |

### Return type

[**DetailedAthlete**](DetailedAthlete.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

