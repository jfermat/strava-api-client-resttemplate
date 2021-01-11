# Lap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique identifier of this lap |  [optional]
**activity** | [**MetaActivity**](MetaActivity.md) |  |  [optional]
**athlete** | [**MetaAthlete**](MetaAthlete.md) |  |  [optional]
**averageCadence** | **Float** | The lap&#x27;s average cadence |  [optional]
**averageSpeed** | **Float** | The lap&#x27;s average speed |  [optional]
**distance** | **Float** | The lap&#x27;s distance, in meters |  [optional]
**elapsedTime** | **Integer** | The lap&#x27;s elapsed time, in seconds |  [optional]
**startIndex** | **Integer** | The start index of this effort in its activity&#x27;s stream |  [optional]
**endIndex** | **Integer** | The end index of this effort in its activity&#x27;s stream |  [optional]
**lapIndex** | **Integer** | The index of this lap in the activity it belongs to |  [optional]
**maxSpeed** | **Float** | The maximum speed of this lat, in meters per second |  [optional]
**movingTime** | **Integer** | The lap&#x27;s moving time, in seconds |  [optional]
**name** | **String** | The name of the lap |  [optional]
**paceZone** | **Integer** | The athlete&#x27;s pace zone during this lap |  [optional]
**split** | **Integer** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the lap was started. |  [optional]
**startDateLocal** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the lap was started in the local timezone. |  [optional]
**totalElevationGain** | **Float** | The elevation gain of this lap, in meters |  [optional]
