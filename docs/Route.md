# Route

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**athlete** | [**SummaryAthlete**](SummaryAthlete.md) |  |  [optional]
**description** | **String** | The description of the route |  [optional]
**distance** | **Float** | The route&#x27;s distance, in meters |  [optional]
**elevationGain** | **Float** | The route&#x27;s elevation gain. |  [optional]
**id** | **Long** | The unique identifier of this route |  [optional]
**idStr** | **String** | The unique identifier of the route in string format |  [optional]
**map** | [**PolylineMap**](PolylineMap.md) |  |  [optional]
**name** | **String** | The name of this route |  [optional]
**_private** | **Boolean** | Whether this route is private |  [optional]
**starred** | **Boolean** | Whether this route is starred by the logged-in athlete |  [optional]
**timestamp** | **Integer** | An epoch timestamp of when the route was created |  [optional]
**type** | **Integer** | This route&#x27;s type (1 for ride, 2 for runs) |  [optional]
**subType** | **Integer** | This route&#x27;s sub-type (1 for road, 2 for mountain bike, 3 for cross, 4 for trail, 5 for mixed) |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the route was created |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the route was last updated |  [optional]
**estimatedMovingTime** | **Integer** | Estimated time in seconds for the authenticated athlete to complete route |  [optional]
**segments** | [**List&lt;SummarySegment&gt;**](SummarySegment.md) | The segments traversed by this route |  [optional]
