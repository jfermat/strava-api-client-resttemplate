# DetailedClub

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membership** | [**MembershipEnum**](#MembershipEnum) | The membership status of the logged-in athlete. |  [optional]
**admin** | **Boolean** | Whether the currently logged-in athlete is an administrator of this club. |  [optional]
**owner** | **Boolean** | Whether the currently logged-in athlete is the owner of this club. |  [optional]
**followingCount** | **Integer** | The number of athletes in the club that the logged-in athlete follows. |  [optional]

<a name="MembershipEnum"></a>
## Enum: MembershipEnum
Name | Value
---- | -----
MEMBER | &quot;member&quot;
PENDING | &quot;pending&quot;
