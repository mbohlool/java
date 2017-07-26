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
import io.kubernetes.client.models.V1Capabilities;
import io.kubernetes.client.models.V1SELinuxOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 */
@ApiModel(description = "SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")

public class V1SecurityContext {
  @SerializedName("capabilities")
  private V1Capabilities capabilities = null;

  @SerializedName("privileged")
  private Boolean privileged = null;

  @SerializedName("readOnlyRootFilesystem")
  private Boolean readOnlyRootFilesystem = null;

  @SerializedName("runAsNonRoot")
  private Boolean runAsNonRoot = null;

  @SerializedName("runAsUser")
  private Long runAsUser = null;

  @SerializedName("seLinuxOptions")
  private V1SELinuxOptions seLinuxOptions = null;

  public V1SecurityContext capabilities(V1Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.")
  public V1Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(V1Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public V1SecurityContext privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

   /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
   * @return privileged
  **/
  @ApiModelProperty(example = "null", value = "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public V1SecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

   /**
   * Whether this container has a read-only root filesystem. Default is false.
   * @return readOnlyRootFilesystem
  **/
  @ApiModelProperty(example = "null", value = "Whether this container has a read-only root filesystem. Default is false.")
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public V1SecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

   /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
  **/
  @ApiModelProperty(example = "null", value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public V1SecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsUser
  **/
  @ApiModelProperty(example = "null", value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1SecurityContext seLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return seLinuxOptions
  **/
  @ApiModelProperty(example = "null", value = "The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SecurityContext v1SecurityContext = (V1SecurityContext) o;
    return Objects.equals(this.capabilities, v1SecurityContext.capabilities) &&
        Objects.equals(this.privileged, v1SecurityContext.privileged) &&
        Objects.equals(this.readOnlyRootFilesystem, v1SecurityContext.readOnlyRootFilesystem) &&
        Objects.equals(this.runAsNonRoot, v1SecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, v1SecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxOptions, v1SecurityContext.seLinuxOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, privileged, readOnlyRootFilesystem, runAsNonRoot, runAsUser, seLinuxOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecurityContext {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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

