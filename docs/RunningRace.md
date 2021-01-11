# RunningRace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique identifier of this race. |  [optional]
**name** | **String** | The name of this race. |  [optional]
**runningRaceType** | **Integer** | The type of this race. |  [optional]
**distance** | **Float** | The race&#x27;s distance, in meters. |  [optional]
**startDateLocal** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the race begins started in the local timezone. |  [optional]
**city** | **String** | The name of the city in which the race is taking place. |  [optional]
**state** | **String** | The name of the state or geographical region in which the race is taking place. |  [optional]
**country** | **String** | The name of the country in which the race is taking place. |  [optional]
**routeIds** | **List&lt;Long&gt;** | The set of routes that cover this race&#x27;s course. |  [optional]
**measurementPreference** | [**MeasurementPreferenceEnum**](#MeasurementPreferenceEnum) | The unit system in which the race should be displayed. |  [optional]
**url** | **String** | The vanity URL of this race on Strava. |  [optional]
**websiteUrl** | **String** | The URL of this race&#x27;s website. |  [optional]

<a name="MeasurementPreferenceEnum"></a>
## Enum: MeasurementPreferenceEnum
Name | Value
---- | -----
FEET | &quot;feet&quot;
METERS | &quot;meters&quot;
