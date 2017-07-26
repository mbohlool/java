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
import io.kubernetes.client.models.V1beta1IngressBackend;
import io.kubernetes.client.models.V1beta1IngressRule;
import io.kubernetes.client.models.V1beta1IngressTLS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@ApiModel(description = "IngressSpec describes the Ingress the user wishes to exist.")

public class V1beta1IngressSpec {
  @SerializedName("backend")
  private V1beta1IngressBackend backend = null;

  @SerializedName("rules")
  private List<V1beta1IngressRule> rules = new ArrayList<V1beta1IngressRule>();

  @SerializedName("tls")
  private List<V1beta1IngressTLS> tls = new ArrayList<V1beta1IngressTLS>();

  public V1beta1IngressSpec backend(V1beta1IngressBackend backend) {
    this.backend = backend;
    return this;
  }

   /**
   * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
   * @return backend
  **/
  @ApiModelProperty(example = "null", value = "A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.")
  public V1beta1IngressBackend getBackend() {
    return backend;
  }

  public void setBackend(V1beta1IngressBackend backend) {
    this.backend = backend;
  }

  public V1beta1IngressSpec rules(List<V1beta1IngressRule> rules) {
    this.rules = rules;
    return this;
  }

  public V1beta1IngressSpec addRulesItem(V1beta1IngressRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.")
  public List<V1beta1IngressRule> getRules() {
    return rules;
  }

  public void setRules(List<V1beta1IngressRule> rules) {
    this.rules = rules;
  }

  public V1beta1IngressSpec tls(List<V1beta1IngressTLS> tls) {
    this.tls = tls;
    return this;
  }

  public V1beta1IngressSpec addTlsItem(V1beta1IngressTLS tlsItem) {
    this.tls.add(tlsItem);
    return this;
  }

   /**
   * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
   * @return tls
  **/
  @ApiModelProperty(example = "null", value = "TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.")
  public List<V1beta1IngressTLS> getTls() {
    return tls;
  }

  public void setTls(List<V1beta1IngressTLS> tls) {
    this.tls = tls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IngressSpec v1beta1IngressSpec = (V1beta1IngressSpec) o;
    return Objects.equals(this.backend, v1beta1IngressSpec.backend) &&
        Objects.equals(this.rules, v1beta1IngressSpec.rules) &&
        Objects.equals(this.tls, v1beta1IngressSpec.tls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backend, rules, tls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IngressSpec {\n");
    
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

