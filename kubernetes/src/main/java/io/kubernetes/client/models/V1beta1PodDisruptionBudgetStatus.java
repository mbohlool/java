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
import org.joda.time.DateTime;

/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 */
@ApiModel(description = "PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.")

public class V1beta1PodDisruptionBudgetStatus {
  @SerializedName("currentHealthy")
  private Integer currentHealthy = null;

  @SerializedName("desiredHealthy")
  private Integer desiredHealthy = null;

  @SerializedName("disruptedPods")
  private Map<String, DateTime> disruptedPods = new HashMap<String, DateTime>();

  @SerializedName("disruptionsAllowed")
  private Integer disruptionsAllowed = null;

  @SerializedName("expectedPods")
  private Integer expectedPods = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  public V1beta1PodDisruptionBudgetStatus currentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
    return this;
  }

   /**
   * current number of healthy pods
   * @return currentHealthy
  **/
  @ApiModelProperty(example = "null", required = true, value = "current number of healthy pods")
  public Integer getCurrentHealthy() {
    return currentHealthy;
  }

  public void setCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
  }

  public V1beta1PodDisruptionBudgetStatus desiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return this;
  }

   /**
   * minimum desired number of healthy pods
   * @return desiredHealthy
  **/
  @ApiModelProperty(example = "null", required = true, value = "minimum desired number of healthy pods")
  public Integer getDesiredHealthy() {
    return desiredHealthy;
  }

  public void setDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
  }

  public V1beta1PodDisruptionBudgetStatus disruptedPods(Map<String, DateTime> disruptedPods) {
    this.disruptedPods = disruptedPods;
    return this;
  }

  public V1beta1PodDisruptionBudgetStatus putDisruptedPodsItem(String key, DateTime disruptedPodsItem) {
    this.disruptedPods.put(key, disruptedPodsItem);
    return this;
  }

   /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
   * @return disruptedPods
  **/
  @ApiModelProperty(example = "null", required = true, value = "DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.")
  public Map<String, DateTime> getDisruptedPods() {
    return disruptedPods;
  }

  public void setDisruptedPods(Map<String, DateTime> disruptedPods) {
    this.disruptedPods = disruptedPods;
  }

  public V1beta1PodDisruptionBudgetStatus disruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

   /**
   * Number of pod disruptions that are currently allowed.
   * @return disruptionsAllowed
  **/
  @ApiModelProperty(example = "null", required = true, value = "Number of pod disruptions that are currently allowed.")
  public Integer getDisruptionsAllowed() {
    return disruptionsAllowed;
  }

  public void setDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
  }

  public V1beta1PodDisruptionBudgetStatus expectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
    return this;
  }

   /**
   * total number of pods counted by this disruption budget
   * @return expectedPods
  **/
  @ApiModelProperty(example = "null", required = true, value = "total number of pods counted by this disruption budget")
  public Integer getExpectedPods() {
    return expectedPods;
  }

  public void setExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
  }

  public V1beta1PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB's object generation.
   * @return observedGeneration
  **/
  @ApiModelProperty(example = "null", value = "Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB's object generation.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodDisruptionBudgetStatus v1beta1PodDisruptionBudgetStatus = (V1beta1PodDisruptionBudgetStatus) o;
    return Objects.equals(this.currentHealthy, v1beta1PodDisruptionBudgetStatus.currentHealthy) &&
        Objects.equals(this.desiredHealthy, v1beta1PodDisruptionBudgetStatus.desiredHealthy) &&
        Objects.equals(this.disruptedPods, v1beta1PodDisruptionBudgetStatus.disruptedPods) &&
        Objects.equals(this.disruptionsAllowed, v1beta1PodDisruptionBudgetStatus.disruptionsAllowed) &&
        Objects.equals(this.expectedPods, v1beta1PodDisruptionBudgetStatus.expectedPods) &&
        Objects.equals(this.observedGeneration, v1beta1PodDisruptionBudgetStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodDisruptionBudgetStatus {\n");
    
    sb.append("    currentHealthy: ").append(toIndentedString(currentHealthy)).append("\n");
    sb.append("    desiredHealthy: ").append(toIndentedString(desiredHealthy)).append("\n");
    sb.append("    disruptedPods: ").append(toIndentedString(disruptedPods)).append("\n");
    sb.append("    disruptionsAllowed: ").append(toIndentedString(disruptionsAllowed)).append("\n");
    sb.append("    expectedPods: ").append(toIndentedString(expectedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

