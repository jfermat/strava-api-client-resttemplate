# SummarySegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique identifier of this segment |  [optional]
**name** | **String** | The name of this segment |  [optional]
**activityType** | [**ActivityTypeEnum**](#ActivityTypeEnum) |  |  [optional]
**distance** | **Float** | The segment&#x27;s distance, in meters |  [optional]
**averageGrade** | **Float** | The segment&#x27;s average grade, in percents |  [optional]
**maximumGrade** | **Float** | The segments&#x27;s maximum grade, in percents |  [optional]
**elevationHigh** | **Float** | The segments&#x27;s highest elevation, in meters |  [optional]
**elevationLow** | **Float** | The segments&#x27;s lowest elevation, in meters |  [optional]
**startLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**endLatlng** | [**LatLng**](LatLng.md) |  |  [optional]
**climbCategory** | **Integer** | The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category. |  [optional]
**city** | **String** | The segments&#x27;s city. |  [optional]
**state** | **String** | The segments&#x27;s state or geographical region. |  [optional]
**country** | **String** | The segment&#x27;s country. |  [optional]
**_private** | **Boolean** | Whether this segment is private. |  [optional]
**athletePrEffort** | [**SummarySegmentEffort**](SummarySegmentEffort.md) |  |  [optional]
**athleteSegmentStats** | [**SummaryPRSegmentEffort**](SummaryPRSegmentEffort.md) |  |  [optional]

<a name="ActivityTypeEnum"></a>
## Enum: ActivityTypeEnum
Name | Value
---- | -----
RIDE | &quot;Ride&quot;
RUN | &quot;Run&quot;
