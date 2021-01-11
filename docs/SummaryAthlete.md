# SummaryAthlete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceState** | **Integer** | Resource state, indicates level of detail. Possible values: 1 -&gt; \&quot;meta\&quot;, 2 -&gt; \&quot;summary\&quot;, 3 -&gt; \&quot;detail\&quot; |  [optional]
**firstname** | **String** | The athlete&#x27;s first name. |  [optional]
**lastname** | **String** | The athlete&#x27;s last name. |  [optional]
**profileMedium** | **String** | URL to a 62x62 pixel profile picture. |  [optional]
**profile** | **String** | URL to a 124x124 pixel profile picture. |  [optional]
**city** | **String** | The athlete&#x27;s city. |  [optional]
**state** | **String** | The athlete&#x27;s state or geographical region. |  [optional]
**country** | **String** | The athlete&#x27;s country. |  [optional]
**sex** | [**SexEnum**](#SexEnum) | The athlete&#x27;s sex. |  [optional]
**premium** | **Boolean** | Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription. |  [optional]
**summit** | **Boolean** | Whether the athlete has any Summit subscription. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the athlete was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the athlete was last updated. |  [optional]

<a name="SexEnum"></a>
## Enum: SexEnum
Name | Value
---- | -----
M | &quot;M&quot;
F | &quot;F&quot;
