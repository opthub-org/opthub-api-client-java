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
import org.openapitools.client.model.MatchTrialStatus;

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
 * Information of the created Solution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T06:41:36.573601911Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class MatchTrialResponse {
  public static final String SERIALIZED_NAME_TRIAL_NO = "trialNo";
  @SerializedName(SERIALIZED_NAME_TRIAL_NO)
  private Integer trialNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MatchTrialStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public MatchTrialResponse() {
  }

  public MatchTrialResponse trialNo(Integer trialNo) {
    this.trialNo = trialNo;
    return this;
  }

  /**
   * Trial number
   * @return trialNo
   */
  @javax.annotation.Nonnull
  public Integer getTrialNo() {
    return trialNo;
  }

  public void setTrialNo(Integer trialNo) {
    this.trialNo = trialNo;
  }


  public MatchTrialResponse status(MatchTrialStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public MatchTrialStatus getStatus() {
    return status;
  }

  public void setStatus(MatchTrialStatus status) {
    this.status = status;
  }


  public MatchTrialResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date and time
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchTrialResponse matchTrialResponse = (MatchTrialResponse) o;
    return Objects.equals(this.trialNo, matchTrialResponse.trialNo) &&
        Objects.equals(this.status, matchTrialResponse.status) &&
        Objects.equals(this.createdAt, matchTrialResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialNo, status, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchTrialResponse {\n");
    sb.append("    trialNo: ").append(toIndentedString(trialNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("trialNo");
    openapiFields.add("status");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("trialNo");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MatchTrialResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchTrialResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchTrialResponse is not found in the empty JSON string", MatchTrialResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchTrialResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchTrialResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MatchTrialResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `status`
      MatchTrialStatus.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchTrialResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchTrialResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchTrialResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchTrialResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchTrialResponse>() {
           @Override
           public void write(JsonWriter out, MatchTrialResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchTrialResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MatchTrialResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MatchTrialResponse
   * @throws IOException if the JSON string is invalid with respect to MatchTrialResponse
   */
  public static MatchTrialResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchTrialResponse.class);
  }

  /**
   * Convert an instance of MatchTrialResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

