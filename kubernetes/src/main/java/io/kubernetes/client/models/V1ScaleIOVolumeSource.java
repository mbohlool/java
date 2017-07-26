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
import io.kubernetes.client.models.V1LocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 */
@ApiModel(description = "ScaleIOVolumeSource represents a persistent ScaleIO volume")

public class V1ScaleIOVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("protectionDomain")
  private String protectionDomain = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private V1LocalObjectReference secretRef = null;

  @SerializedName("sslEnabled")
  private Boolean sslEnabled = null;

  @SerializedName("storageMode")
  private String storageMode = null;

  @SerializedName("storagePool")
  private String storagePool = null;

  @SerializedName("system")
  private String system = null;

  @SerializedName("volumeName")
  private String volumeName = null;

  public V1ScaleIOVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(example = "null", value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ScaleIOVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * The host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @ApiModelProperty(example = "null", required = true, value = "The host address of the ScaleIO API Gateway.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public V1ScaleIOVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

   /**
   * The name of the Protection Domain for the configured storage (defaults to \"default\").
   * @return protectionDomain
  **/
  @ApiModelProperty(example = "null", value = "The name of the Protection Domain for the configured storage (defaults to \"default\").")
  public String getProtectionDomain() {
    return protectionDomain;
  }

  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }

  public V1ScaleIOVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ScaleIOVolumeSource secretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
   * @return secretRef
  **/
  @ApiModelProperty(example = "null", required = true, value = "SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public V1ScaleIOVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * Flag to enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @ApiModelProperty(example = "null", value = "Flag to enable/disable SSL communication with Gateway, default false")
  public Boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public V1ScaleIOVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

   /**
   * Indicates whether the storage for a volume should be thick or thin (defaults to \"thin\").
   * @return storageMode
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the storage for a volume should be thick or thin (defaults to \"thin\").")
  public String getStorageMode() {
    return storageMode;
  }

  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }

  public V1ScaleIOVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

   /**
   * The Storage Pool associated with the protection domain (defaults to \"default\").
   * @return storagePool
  **/
  @ApiModelProperty(example = "null", value = "The Storage Pool associated with the protection domain (defaults to \"default\").")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  public V1ScaleIOVolumeSource system(String system) {
    this.system = system;
    return this;
  }

   /**
   * The name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the storage system as configured in ScaleIO.")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public V1ScaleIOVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @ApiModelProperty(example = "null", value = "The name of a volume already created in the ScaleIO system that is associated with this volume source.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScaleIOVolumeSource v1ScaleIOVolumeSource = (V1ScaleIOVolumeSource) o;
    return Objects.equals(this.fsType, v1ScaleIOVolumeSource.fsType) &&
        Objects.equals(this.gateway, v1ScaleIOVolumeSource.gateway) &&
        Objects.equals(this.protectionDomain, v1ScaleIOVolumeSource.protectionDomain) &&
        Objects.equals(this.readOnly, v1ScaleIOVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ScaleIOVolumeSource.secretRef) &&
        Objects.equals(this.sslEnabled, v1ScaleIOVolumeSource.sslEnabled) &&
        Objects.equals(this.storageMode, v1ScaleIOVolumeSource.storageMode) &&
        Objects.equals(this.storagePool, v1ScaleIOVolumeSource.storagePool) &&
        Objects.equals(this.system, v1ScaleIOVolumeSource.system) &&
        Objects.equals(this.volumeName, v1ScaleIOVolumeSource.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScaleIOVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

