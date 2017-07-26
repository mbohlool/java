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
import io.kubernetes.client.models.V1beta1RoleRef;
import io.kubernetes.client.models.V1beta1Subject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
 */
@ApiModel(description = "RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.")

public class V1beta1RoleBinding {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("roleRef")
  private V1beta1RoleRef roleRef = null;

  @SerializedName("subjects")
  private List<V1beta1Subject> subjects = new ArrayList<V1beta1Subject>();

  public V1beta1RoleBinding apiVersion(String apiVersion) {
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

  public V1beta1RoleBinding kind(String kind) {
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

  public V1beta1RoleBinding metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object's metadata.
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Standard object's metadata.")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1RoleBinding roleRef(V1beta1RoleRef roleRef) {
    this.roleRef = roleRef;
    return this;
  }

   /**
   * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
   * @return roleRef
  **/
  @ApiModelProperty(example = "null", required = true, value = "RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.")
  public V1beta1RoleRef getRoleRef() {
    return roleRef;
  }

  public void setRoleRef(V1beta1RoleRef roleRef) {
    this.roleRef = roleRef;
  }

  public V1beta1RoleBinding subjects(List<V1beta1Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public V1beta1RoleBinding addSubjectsItem(V1beta1Subject subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Subjects holds references to the objects the role applies to.
   * @return subjects
  **/
  @ApiModelProperty(example = "null", required = true, value = "Subjects holds references to the objects the role applies to.")
  public List<V1beta1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<V1beta1Subject> subjects) {
    this.subjects = subjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RoleBinding v1beta1RoleBinding = (V1beta1RoleBinding) o;
    return Objects.equals(this.apiVersion, v1beta1RoleBinding.apiVersion) &&
        Objects.equals(this.kind, v1beta1RoleBinding.kind) &&
        Objects.equals(this.metadata, v1beta1RoleBinding.metadata) &&
        Objects.equals(this.roleRef, v1beta1RoleBinding.roleRef) &&
        Objects.equals(this.subjects, v1beta1RoleBinding.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, roleRef, subjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RoleBinding {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    roleRef: ").append(toIndentedString(roleRef)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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

