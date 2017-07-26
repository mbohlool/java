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
 * NamespaceStatus is information about the current status of a Namespace.
 */
@ApiModel(description = "NamespaceStatus is information about the current status of a Namespace.")

public class V1NamespaceStatus {
  @SerializedName("phase")
  private String phase = null;

  public V1NamespaceStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase is the current lifecycle phase of the namespace. More info: https://git.k8s.io/community/contributors/design-proposals/namespaces.md#phases
   * @return phase
  **/
  @ApiModelProperty(example = "null", value = "Phase is the current lifecycle phase of the namespace. More info: https://git.k8s.io/community/contributors/design-proposals/namespaces.md#phases")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceStatus v1NamespaceStatus = (V1NamespaceStatus) o;
    return Objects.equals(this.phase, v1NamespaceStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceStatus {\n");
    
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

