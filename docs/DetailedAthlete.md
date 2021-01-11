# DetailedAthlete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**followerCount** | **Integer** | The athlete&#x27;s follower count. |  [optional]
**friendCount** | **Integer** | The athlete&#x27;s friend count. |  [optional]
**measurementPreference** | [**MeasurementPreferenceEnum**](#MeasurementPreferenceEnum) | The athlete&#x27;s preferred unit system. |  [optional]
**ftp** | **Integer** | The athlete&#x27;s FTP (Functional Threshold Power). |  [optional]
**weight** | **Float** | The athlete&#x27;s weight. |  [optional]
**clubs** | [**List&lt;SummaryClub&gt;**](SummaryClub.md) | The athlete&#x27;s clubs. |  [optional]
**bikes** | [**List&lt;SummaryGear&gt;**](SummaryGear.md) | The athlete&#x27;s bikes. |  [optional]
**shoes** | [**List&lt;SummaryGear&gt;**](SummaryGear.md) | The athlete&#x27;s shoes. |  [optional]

<a name="MeasurementPreferenceEnum"></a>
## Enum: MeasurementPreferenceEnum
Name | Value
---- | -----
FEET | &quot;feet&quot;
METERS | &quot;meters&quot;
