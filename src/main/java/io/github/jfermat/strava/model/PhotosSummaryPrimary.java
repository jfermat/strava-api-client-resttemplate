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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PhotosSummaryPrimary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-10T09:15:14.081+01:00[Europe/Paris]")
public class PhotosSummaryPrimary {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("source")
  private Integer source = null;

  @JsonProperty("unique_id")
  private String uniqueId = null;

  @JsonProperty("urls")
  private Map<String, String> urls = null;

  public PhotosSummaryPrimary id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PhotosSummaryPrimary source(Integer source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public PhotosSummaryPrimary uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @Schema(description = "")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public PhotosSummaryPrimary urls(Map<String, String> urls) {
    this.urls = urls;
    return this;
  }

  public PhotosSummaryPrimary putUrlsItem(String key, String urlsItem) {
    if (this.urls == null) {
      this.urls = new HashMap<String, String>();
    }
    this.urls.put(key, urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @Schema(description = "")
  public Map<String, String> getUrls() {
    return urls;
  }

  public void setUrls(Map<String, String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotosSummaryPrimary photosSummaryPrimary = (PhotosSummaryPrimary) o;
    return Objects.equals(this.id, photosSummaryPrimary.id) &&
        Objects.equals(this.source, photosSummaryPrimary.source) &&
        Objects.equals(this.uniqueId, photosSummaryPrimary.uniqueId) &&
        Objects.equals(this.urls, photosSummaryPrimary.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, uniqueId, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotosSummaryPrimary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
