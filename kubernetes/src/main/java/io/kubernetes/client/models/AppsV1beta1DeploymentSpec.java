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
import io.kubernetes.client.models.AppsV1beta1DeploymentStrategy;
import io.kubernetes.client.models.AppsV1beta1RollbackConfig;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@ApiModel(description = "DeploymentSpec is the specification of the desired behavior of the Deployment.")

public class AppsV1beta1DeploymentSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("progressDeadlineSeconds")
  private Integer progressDeadlineSeconds = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("rollbackTo")
  private AppsV1beta1RollbackConfig rollbackTo = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("strategy")
  private AppsV1beta1DeploymentStrategy strategy = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public AppsV1beta1DeploymentSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(example = "null", value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public AppsV1beta1DeploymentSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that the deployment is paused.
   * @return paused
  **/
  @ApiModelProperty(example = "null", value = "Indicates that the deployment is paused.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public AppsV1beta1DeploymentSpec progressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

   /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Once autoRollback is implemented, the deployment controller will automatically rollback failed deployments. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   * @return progressDeadlineSeconds
  **/
  @ApiModelProperty(example = "null", value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Once autoRollback is implemented, the deployment controller will automatically rollback failed deployments. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.")
  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }

  public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }

  public AppsV1beta1DeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(example = "null", value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public AppsV1beta1DeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 2.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(example = "null", value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 2.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public AppsV1beta1DeploymentSpec rollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
    return this;
  }

   /**
   * The config this deployment is rolling back to. Will be cleared after rollback is done.
   * @return rollbackTo
  **/
  @ApiModelProperty(example = "null", value = "The config this deployment is rolling back to. Will be cleared after rollback is done.")
  public AppsV1beta1RollbackConfig getRollbackTo() {
    return rollbackTo;
  }

  public void setRollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
  }

  public AppsV1beta1DeploymentSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
   * @return selector
  **/
  @ApiModelProperty(example = "null", value = "Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public AppsV1beta1DeploymentSpec strategy(AppsV1beta1DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * The deployment strategy to use to replace existing pods with new ones.
   * @return strategy
  **/
  @ApiModelProperty(example = "null", value = "The deployment strategy to use to replace existing pods with new ones.")
  public AppsV1beta1DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(AppsV1beta1DeploymentStrategy strategy) {
    this.strategy = strategy;
  }

  public AppsV1beta1DeploymentSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the pods that will be created.
   * @return template
  **/
  @ApiModelProperty(example = "null", required = true, value = "Template describes the pods that will be created.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsV1beta1DeploymentSpec appsV1beta1DeploymentSpec = (AppsV1beta1DeploymentSpec) o;
    return Objects.equals(this.minReadySeconds, appsV1beta1DeploymentSpec.minReadySeconds) &&
        Objects.equals(this.paused, appsV1beta1DeploymentSpec.paused) &&
        Objects.equals(this.progressDeadlineSeconds, appsV1beta1DeploymentSpec.progressDeadlineSeconds) &&
        Objects.equals(this.replicas, appsV1beta1DeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, appsV1beta1DeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.rollbackTo, appsV1beta1DeploymentSpec.rollbackTo) &&
        Objects.equals(this.selector, appsV1beta1DeploymentSpec.selector) &&
        Objects.equals(this.strategy, appsV1beta1DeploymentSpec.strategy) &&
        Objects.equals(this.template, appsV1beta1DeploymentSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, rollbackTo, selector, strategy, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1DeploymentSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    rollbackTo: ").append(toIndentedString(rollbackTo)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

