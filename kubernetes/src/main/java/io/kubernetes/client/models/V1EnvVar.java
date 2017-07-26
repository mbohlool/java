/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.7.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1EnvVarSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvVar represents an environment variable present in a Container.
 */
@ApiModel(description = "EnvVar represents an environment variable present in a Container.")

public class V1EnvVar {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("valueFrom")
  private V1EnvVarSource valueFrom = null;

  public V1EnvVar name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the environment variable. Must be a C_IDENTIFIER.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EnvVar value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public V1EnvVar valueFrom(V1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Source for the environment variable's value. Cannot be used if value is not empty.
   * @return valueFrom
  **/
  @ApiModelProperty(example = "null", value = "Source for the environment variable's value. Cannot be used if value is not empty.")
  public V1EnvVarSource getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(V1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EnvVar v1EnvVar = (V1EnvVar) o;
    return Objects.equals(this.name, v1EnvVar.name) &&
        Objects.equals(this.value, v1EnvVar.value) &&
        Objects.equals(this.valueFrom, v1EnvVar.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, valueFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvVar {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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

