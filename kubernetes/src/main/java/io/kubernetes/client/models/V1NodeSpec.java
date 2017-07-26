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
import io.kubernetes.client.models.V1Taint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeSpec describes the attributes that a node is created with.
 */
@ApiModel(description = "NodeSpec describes the attributes that a node is created with.")

public class V1NodeSpec {
  @SerializedName("externalID")
  private String externalID = null;

  @SerializedName("podCIDR")
  private String podCIDR = null;

  @SerializedName("providerID")
  private String providerID = null;

  @SerializedName("taints")
  private List<V1Taint> taints = new ArrayList<V1Taint>();

  @SerializedName("unschedulable")
  private Boolean unschedulable = null;

  public V1NodeSpec externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * External ID of the node assigned by some machine database (e.g. a cloud provider). Deprecated.
   * @return externalID
  **/
  @ApiModelProperty(example = "null", value = "External ID of the node assigned by some machine database (e.g. a cloud provider). Deprecated.")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public V1NodeSpec podCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
    return this;
  }

   /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
  **/
  @ApiModelProperty(example = "null", value = "PodCIDR represents the pod IP range assigned to the node.")
  public String getPodCIDR() {
    return podCIDR;
  }

  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }

  public V1NodeSpec providerID(String providerID) {
    this.providerID = providerID;
    return this;
  }

   /**
   * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
   * @return providerID
  **/
  @ApiModelProperty(example = "null", value = "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")
  public String getProviderID() {
    return providerID;
  }

  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  public V1NodeSpec taints(List<V1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public V1NodeSpec addTaintsItem(V1Taint taintsItem) {
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * If specified, the node's taints.
   * @return taints
  **/
  @ApiModelProperty(example = "null", value = "If specified, the node's taints.")
  public List<V1Taint> getTaints() {
    return taints;
  }

  public void setTaints(List<V1Taint> taints) {
    this.taints = taints;
  }

  public V1NodeSpec unschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return this;
  }

   /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
  **/
  @ApiModelProperty(example = "null", value = "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")
  public Boolean getUnschedulable() {
    return unschedulable;
  }

  public void setUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSpec v1NodeSpec = (V1NodeSpec) o;
    return Objects.equals(this.externalID, v1NodeSpec.externalID) &&
        Objects.equals(this.podCIDR, v1NodeSpec.podCIDR) &&
        Objects.equals(this.providerID, v1NodeSpec.providerID) &&
        Objects.equals(this.taints, v1NodeSpec.taints) &&
        Objects.equals(this.unschedulable, v1NodeSpec.unschedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalID, podCIDR, providerID, taints, unschedulable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSpec {\n");
    
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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

