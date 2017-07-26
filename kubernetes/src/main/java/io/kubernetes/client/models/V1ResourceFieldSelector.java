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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 */
@ApiModel(description = "ResourceFieldSelector represents container resources (cpu, memory) and their output format")

public class V1ResourceFieldSelector {
  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("divisor")
  private String divisor = null;

  @SerializedName("resource")
  private String resource = null;

  public V1ResourceFieldSelector containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Container name: required for volumes, optional for env vars
   * @return containerName
  **/
  @ApiModelProperty(example = "null", value = "Container name: required for volumes, optional for env vars")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public V1ResourceFieldSelector divisor(String divisor) {
    this.divisor = divisor;
    return this;
  }

   /**
   * Specifies the output format of the exposed resources, defaults to \"1\"
   * @return divisor
  **/
  @ApiModelProperty(example = "null", value = "Specifies the output format of the exposed resources, defaults to \"1\"")
  public String getDivisor() {
    return divisor;
  }

  public void setDivisor(String divisor) {
    this.divisor = divisor;
  }

  public V1ResourceFieldSelector resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Required: resource to select
   * @return resource
  **/
  @ApiModelProperty(example = "null", required = true, value = "Required: resource to select")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceFieldSelector v1ResourceFieldSelector = (V1ResourceFieldSelector) o;
    return Objects.equals(this.containerName, v1ResourceFieldSelector.containerName) &&
        Objects.equals(this.divisor, v1ResourceFieldSelector.divisor) &&
        Objects.equals(this.resource, v1ResourceFieldSelector.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceFieldSelector {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

