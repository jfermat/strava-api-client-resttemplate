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
import io.github.jfermat.strava.model.SummaryAthlete;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * Comment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-10T09:15:14.081+01:00[Europe/Paris]")
public class Comment {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("athlete")
  private SummaryAthlete athlete = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  public Comment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this comment
   * @return id
  **/
  @Schema(description = "The unique identifier of this comment")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Comment activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The identifier of the activity this comment is related to
   * @return activityId
  **/
  @Schema(description = "The identifier of the activity this comment is related to")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The content of the comment
   * @return text
  **/
  @Schema(description = "The content of the comment")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Comment athlete(SummaryAthlete athlete) {
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @Schema(description = "")
  public SummaryAthlete getAthlete() {
    return athlete;
  }

  public void setAthlete(SummaryAthlete athlete) {
    this.athlete = athlete;
  }

  public Comment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which this comment was created.
   * @return createdAt
  **/
  @Schema(description = "The time at which this comment was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.activityId, comment.activityId) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.athlete, comment.athlete) &&
        Objects.equals(this.createdAt, comment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, text, athlete, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
