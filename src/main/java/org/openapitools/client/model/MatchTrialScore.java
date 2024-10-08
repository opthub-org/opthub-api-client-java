/*
 * OptHub REST API
 * OptHub Public REST API.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: dev@opthub.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.RunnerStatus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Results of Score calculation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T06:41:36.573601911Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class MatchTrialScore {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RunnerStatus status;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt;

  public MatchTrialScore() {
  }

  public MatchTrialScore status(RunnerStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public RunnerStatus getStatus() {
    return status;
  }

  public void setStatus(RunnerStatus status) {
    this.status = status;
  }


  public MatchTrialScore error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Score calculation error information
   * @return error
   */
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public MatchTrialScore value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the Score
   * @return value
   */
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public MatchTrialScore startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Score calculation start date and time
   * @return startedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public MatchTrialScore finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Score calculation end date and time
   * @return finishedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTrialScore matchTrialScore = (MatchTrialScore) o;
    return Objects.equals(this.status, matchTrialScore.status) &&
        Objects.equals(this.error, matchTrialScore.error) &&
        Objects.equals(this.value, matchTrialScore.value) &&
        Objects.equals(this.startedAt, matchTrialScore.startedAt) &&
        Objects.equals(this.finishedAt, matchTrialScore.finishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, value, startedAt, finishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTrialScore {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("status");
    openapiFields.add("error");
    openapiFields.add("value");
    openapiFields.add("startedAt");
    openapiFields.add("finishedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("startedAt");
    openapiRequiredFields.add("finishedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MatchTrialScore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchTrialScore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchTrialScore is not found in the empty JSON string", MatchTrialScore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchTrialScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchTrialScore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MatchTrialScore.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      RunnerStatus.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchTrialScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchTrialScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchTrialScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchTrialScore.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchTrialScore>() {
           @Override
           public void write(JsonWriter out, MatchTrialScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchTrialScore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MatchTrialScore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MatchTrialScore
   * @throws IOException if the JSON string is invalid with respect to MatchTrialScore
   */
  public static MatchTrialScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchTrialScore.class);
  }

  /**
   * Convert an instance of MatchTrialScore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

