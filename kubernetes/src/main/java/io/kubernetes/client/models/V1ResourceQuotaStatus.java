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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourceQuotaStatus defines the enforced hard limits and observed use.
 */
@ApiModel(description = "ResourceQuotaStatus defines the enforced hard limits and observed use.")

public class V1ResourceQuotaStatus {
  @SerializedName("hard")
  private Map<String, String> hard = new HashMap<String, String>();

  @SerializedName("used")
  private Map<String, String> used = new HashMap<String, String>();

  public V1ResourceQuotaStatus hard(Map<String, String> hard) {
    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaStatus putHardItem(String key, String hardItem) {
    this.hard.put(key, hardItem);
    return this;
  }

   /**
   * Hard is the set of enforced hard limits for each named resource. More info: https://git.k8s.io/community/contributors/design-proposals/admission_control_resource_quota.md
   * @return hard
  **/
  @ApiModelProperty(example = "null", value = "Hard is the set of enforced hard limits for each named resource. More info: https://git.k8s.io/community/contributors/design-proposals/admission_control_resource_quota.md")
  public Map<String, String> getHard() {
    return hard;
  }

  public void setHard(Map<String, String> hard) {
    this.hard = hard;
  }

  public V1ResourceQuotaStatus used(Map<String, String> used) {
    this.used = used;
    return this;
  }

  public V1ResourceQuotaStatus putUsedItem(String key, String usedItem) {
    this.used.put(key, usedItem);
    return this;
  }

   /**
   * Used is the current observed total usage of the resource in the namespace.
   * @return used
  **/
  @ApiModelProperty(example = "null", value = "Used is the current observed total usage of the resource in the namespace.")
  public Map<String, String> getUsed() {
    return used;
  }

  public void setUsed(Map<String, String> used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaStatus v1ResourceQuotaStatus = (V1ResourceQuotaStatus) o;
    return Objects.equals(this.hard, v1ResourceQuotaStatus.hard) &&
        Objects.equals(this.used, v1ResourceQuotaStatus.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaStatus {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

