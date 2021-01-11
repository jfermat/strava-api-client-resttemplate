# BaseStream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalSize** | **Integer** | The number of data points in this stream |  [optional]
**resolution** | [**ResolutionEnum**](#ResolutionEnum) | The level of detail (sampling) in which this stream was returned |  [optional]
**seriesType** | [**SeriesTypeEnum**](#SeriesTypeEnum) | The base series used in the case the stream was downsampled |  [optional]

<a name="ResolutionEnum"></a>
## Enum: ResolutionEnum
Name | Value
---- | -----
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;

<a name="SeriesTypeEnum"></a>
## Enum: SeriesTypeEnum
Name | Value
---- | -----
DISTANCE | &quot;distance&quot;
TIME | &quot;time&quot;
