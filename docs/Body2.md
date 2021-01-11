# Body2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [**File**](File.md) | The uploaded file. |  [optional]
**name** | **String** | The desired name of the resulting activity. |  [optional]
**description** | **String** | The desired description of the resulting activity. |  [optional]
**trainer** | **String** | Whether the resulting activity should be marked as having been performed on a trainer. |  [optional]
**commute** | **String** | Whether the resulting activity should be tagged as a commute. |  [optional]
**dataType** | [**DataTypeEnum**](#DataTypeEnum) | The format of the uploaded file. |  [optional]
**externalId** | **String** | The desired external identifier of the resulting activity. |  [optional]

<a name="DataTypeEnum"></a>
## Enum: DataTypeEnum
Name | Value
---- | -----
FIT | &quot;fit&quot;
FIT_GZ | &quot;fit.gz&quot;
TCX | &quot;tcx&quot;
TCX_GZ | &quot;tcx.gz&quot;
GPX | &quot;gpx&quot;
GPX_GZ | &quot;gpx.gz&quot;
