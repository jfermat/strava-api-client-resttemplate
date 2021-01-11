# DetailedSegmentEffort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the segment on which this effort was performed |  [optional]
**activity** | [**MetaActivity**](MetaActivity.md) |  |  [optional]
**athlete** | [**MetaAthlete**](MetaAthlete.md) |  |  [optional]
**movingTime** | **Integer** | The effort&#x27;s moving time |  [optional]
**startIndex** | **Integer** | The start index of this effort in its activity&#x27;s stream |  [optional]
**endIndex** | **Integer** | The end index of this effort in its activity&#x27;s stream |  [optional]
**averageCadence** | **Float** | The effort&#x27;s average cadence |  [optional]
**averageWatts** | **Float** | The average wattage of this effort |  [optional]
**deviceWatts** | **Boolean** | For riding efforts, whether the wattage was reported by a dedicated recording device |  [optional]
**averageHeartrate** | **Float** | The heart heart rate of the athlete during this effort |  [optional]
**maxHeartrate** | **Float** | The maximum heart rate of the athlete during this effort |  [optional]
**segment** | [**SummarySegment**](SummarySegment.md) |  |  [optional]
**komRank** | **Integer** | The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload |  [optional]
**prRank** | **Integer** | The rank of the effort on the athlete&#x27;s leaderboard if it belongs in the top 3 at the time of upload |  [optional]
**hidden** | **Boolean** | Whether this effort should be hidden when viewed within an activity |  [optional]
