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
 * NetworkPolicyPort describes a port to allow traffic on
 */
@ApiModel(description = "NetworkPolicyPort describes a port to allow traffic on")

public class V1NetworkPolicyPort {
  @SerializedName("port")
  private String port = null;

  @SerializedName("protocol")
  private String protocol = null;

  public V1NetworkPolicyPort port(String port) {
    this.port = port;
    return this;
  }

   /**
   * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.
   * @return port
  **/
  @ApiModelProperty(example = "null", value = "The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public V1NetworkPolicyPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP.
   * @return protocol
  **/
  @ApiModelProperty(example = "null", value = "The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicyPort v1NetworkPolicyPort = (V1NetworkPolicyPort) o;
    return Objects.equals(this.port, v1NetworkPolicyPort.port) &&
        Objects.equals(this.protocol, v1NetworkPolicyPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyPort {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

