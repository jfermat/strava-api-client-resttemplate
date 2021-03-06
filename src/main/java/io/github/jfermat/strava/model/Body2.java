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
import java.io.File;
/**
 * Body2
 */


public class Body2 {
  @JsonProperty("file")
  private File file = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("trainer")
  private String trainer = null;

  @JsonProperty("commute")
  private String commute = null;

  /**
   * The format of the uploaded file.
   */
  public enum DataTypeEnum {
    FIT("fit"),
    FIT_GZ("fit.gz"),
    TCX("tcx"),
    TCX_GZ("tcx.gz"),
    GPX("gpx"),
    GPX_GZ("gpx.gz");

    private String value;

    DataTypeEnum(String value) {
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
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("data_type")
  private DataTypeEnum dataType = null;

  @JsonProperty("external_id")
  private String externalId = null;

  public Body2 file(File file) {
    this.file = file;
    return this;
  }

   /**
   * The uploaded file.
   * @return file
  **/
  @Schema(description = "The uploaded file.")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Body2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The desired name of the resulting activity.
   * @return name
  **/
  @Schema(description = "The desired name of the resulting activity.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body2 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The desired description of the resulting activity.
   * @return description
  **/
  @Schema(description = "The desired description of the resulting activity.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Body2 trainer(String trainer) {
    this.trainer = trainer;
    return this;
  }

   /**
   * Whether the resulting activity should be marked as having been performed on a trainer.
   * @return trainer
  **/
  @Schema(description = "Whether the resulting activity should be marked as having been performed on a trainer.")
  public String getTrainer() {
    return trainer;
  }

  public void setTrainer(String trainer) {
    this.trainer = trainer;
  }

  public Body2 commute(String commute) {
    this.commute = commute;
    return this;
  }

   /**
   * Whether the resulting activity should be tagged as a commute.
   * @return commute
  **/
  @Schema(description = "Whether the resulting activity should be tagged as a commute.")
  public String getCommute() {
    return commute;
  }

  public void setCommute(String commute) {
    this.commute = commute;
  }

  public Body2 dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The format of the uploaded file.
   * @return dataType
  **/
  @Schema(description = "The format of the uploaded file.")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public Body2 externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The desired external identifier of the resulting activity.
   * @return externalId
  **/
  @Schema(description = "The desired external identifier of the resulting activity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.file, body2.file) &&
        Objects.equals(this.name, body2.name) &&
        Objects.equals(this.description, body2.description) &&
        Objects.equals(this.trainer, body2.trainer) &&
        Objects.equals(this.commute, body2.commute) &&
        Objects.equals(this.dataType, body2.dataType) &&
        Objects.equals(this.externalId, body2.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(file), name, description, trainer, commute, dataType, externalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
    sb.append("    commute: ").append(toIndentedString(commute)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
