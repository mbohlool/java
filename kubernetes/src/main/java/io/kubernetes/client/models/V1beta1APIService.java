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
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1beta1APIServiceSpec;
import io.kubernetes.client.models.V1beta1APIServiceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * APIService represents a server for a particular GroupVersion. Name must be \&quot;version.group\&quot;.
 */
@ApiModel(description = "APIService represents a server for a particular GroupVersion. Name must be \"version.group\".")

public class V1beta1APIService {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1beta1APIServiceSpec spec = null;

  @SerializedName("status")
  private V1beta1APIServiceStatus status = null;

  public V1beta1APIService apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta1APIService kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta1APIService metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1APIService spec(V1beta1APIServiceSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec contains information for locating and communicating with a server
   * @return spec
  **/
  @ApiModelProperty(example = "null", value = "Spec contains information for locating and communicating with a server")
  public V1beta1APIServiceSpec getSpec() {
    return spec;
  }

  public void setSpec(V1beta1APIServiceSpec spec) {
    this.spec = spec;
  }

  public V1beta1APIService status(V1beta1APIServiceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status contains derived information about an API server
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status contains derived information about an API server")
  public V1beta1APIServiceStatus getStatus() {
    return status;
  }

  public void setStatus(V1beta1APIServiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1APIService v1beta1APIService = (V1beta1APIService) o;
    return Objects.equals(this.apiVersion, v1beta1APIService.apiVersion) &&
        Objects.equals(this.kind, v1beta1APIService.kind) &&
        Objects.equals(this.metadata, v1beta1APIService.metadata) &&
        Objects.equals(this.spec, v1beta1APIService.spec) &&
        Objects.equals(this.status, v1beta1APIService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1APIService {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

