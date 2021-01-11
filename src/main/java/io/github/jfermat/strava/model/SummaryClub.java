/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.jfermat.strava.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.jfermat.strava.model.MetaClub;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SummaryClub
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-10T09:15:14.081+01:00[Europe/Paris]")
public class SummaryClub extends MetaClub {
  @JsonProperty("profile_medium")
  private String profileMedium = null;

  @JsonProperty("cover_photo")
  private String coverPhoto = null;

  @JsonProperty("cover_photo_small")
  private String coverPhotoSmall = null;

  /**
   * Gets or Sets sportType
   */
  public enum SportTypeEnum {
    CYCLING("cycling"),
    RUNNING("running"),
    TRIATHLON("triathlon"),
    OTHER("other");

    private String value;

    SportTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SportTypeEnum fromValue(String text) {
      for (SportTypeEnum b : SportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("sport_type")
  private SportTypeEnum sportType = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("private")
  private Boolean _private = null;

  @JsonProperty("member_count")
  private Integer memberCount = null;

  @JsonProperty("featured")
  private Boolean featured = null;

  @JsonProperty("verified")
  private Boolean verified = null;

  @JsonProperty("url")
  private String url = null;

  public SummaryClub profileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
    return this;
  }

   /**
   * URL to a 60x60 pixel profile picture.
   * @return profileMedium
  **/
  @Schema(description = "URL to a 60x60 pixel profile picture.")
  public String getProfileMedium() {
    return profileMedium;
  }

  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }

  public SummaryClub coverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

   /**
   * URL to a ~1185x580 pixel cover photo.
   * @return coverPhoto
  **/
  @Schema(description = "URL to a ~1185x580 pixel cover photo.")
  public String getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public SummaryClub coverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
    return this;
  }

   /**
   * URL to a ~360x176  pixel cover photo.
   * @return coverPhotoSmall
  **/
  @Schema(description = "URL to a ~360x176  pixel cover photo.")
  public String getCoverPhotoSmall() {
    return coverPhotoSmall;
  }

  public void setCoverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
  }

  public SummaryClub sportType(SportTypeEnum sportType) {
    this.sportType = sportType;
    return this;
  }

   /**
   * Get sportType
   * @return sportType
  **/
  @Schema(description = "")
  public SportTypeEnum getSportType() {
    return sportType;
  }

  public void setSportType(SportTypeEnum sportType) {
    this.sportType = sportType;
  }

  public SummaryClub city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The club&#x27;s city.
   * @return city
  **/
  @Schema(description = "The club's city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SummaryClub state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The club&#x27;s state or geographical region.
   * @return state
  **/
  @Schema(description = "The club's state or geographical region.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SummaryClub country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The club&#x27;s country.
   * @return country
  **/
  @Schema(description = "The club's country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SummaryClub _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the club is private.
   * @return _private
  **/
  @Schema(description = "Whether the club is private.")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public SummaryClub memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * The club&#x27;s member count.
   * @return memberCount
  **/
  @Schema(description = "The club's member count.")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public SummaryClub featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Whether the club is featured or not.
   * @return featured
  **/
  @Schema(description = "Whether the club is featured or not.")
  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public SummaryClub verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Whether the club is verified or not.
   * @return verified
  **/
  @Schema(description = "Whether the club is verified or not.")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public SummaryClub url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The club&#x27;s vanity URL.
   * @return url
  **/
  @Schema(description = "The club's vanity URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryClub summaryClub = (SummaryClub) o;
    return Objects.equals(this.profileMedium, summaryClub.profileMedium) &&
        Objects.equals(this.coverPhoto, summaryClub.coverPhoto) &&
        Objects.equals(this.coverPhotoSmall, summaryClub.coverPhotoSmall) &&
        Objects.equals(this.sportType, summaryClub.sportType) &&
        Objects.equals(this.city, summaryClub.city) &&
        Objects.equals(this.state, summaryClub.state) &&
        Objects.equals(this.country, summaryClub.country) &&
        Objects.equals(this._private, summaryClub._private) &&
        Objects.equals(this.memberCount, summaryClub.memberCount) &&
        Objects.equals(this.featured, summaryClub.featured) &&
        Objects.equals(this.verified, summaryClub.verified) &&
        Objects.equals(this.url, summaryClub.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileMedium, coverPhoto, coverPhotoSmall, sportType, city, state, country, _private, memberCount, featured, verified, url, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClub {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    profileMedium: ").append(toIndentedString(profileMedium)).append("\n");
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    coverPhotoSmall: ").append(toIndentedString(coverPhotoSmall)).append("\n");
    sb.append("    sportType: ").append(toIndentedString(sportType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
