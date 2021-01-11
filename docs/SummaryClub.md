# SummaryClub

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileMedium** | **String** | URL to a 60x60 pixel profile picture. |  [optional]
**coverPhoto** | **String** | URL to a ~1185x580 pixel cover photo. |  [optional]
**coverPhotoSmall** | **String** | URL to a ~360x176  pixel cover photo. |  [optional]
**sportType** | [**SportTypeEnum**](#SportTypeEnum) |  |  [optional]
**city** | **String** | The club&#x27;s city. |  [optional]
**state** | **String** | The club&#x27;s state or geographical region. |  [optional]
**country** | **String** | The club&#x27;s country. |  [optional]
**_private** | **Boolean** | Whether the club is private. |  [optional]
**memberCount** | **Integer** | The club&#x27;s member count. |  [optional]
**featured** | **Boolean** | Whether the club is featured or not. |  [optional]
**verified** | **Boolean** | Whether the club is verified or not. |  [optional]
**url** | **String** | The club&#x27;s vanity URL. |  [optional]

<a name="SportTypeEnum"></a>
## Enum: SportTypeEnum
Name | Value
---- | -----
CYCLING | &quot;cycling&quot;
RUNNING | &quot;running&quot;
TRIATHLON | &quot;triathlon&quot;
OTHER | &quot;other&quot;
