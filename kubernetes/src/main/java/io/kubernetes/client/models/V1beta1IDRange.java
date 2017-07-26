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
 * ID Range provides a min/max of an allowed range of IDs.
 */
@ApiModel(description = "ID Range provides a min/max of an allowed range of IDs.")

public class V1beta1IDRange {
  @SerializedName("max")
  private Long max = null;

  @SerializedName("min")
  private Long min = null;

  public V1beta1IDRange max(Long max) {
    this.max = max;
    return this;
  }

   /**
   * Max is the end of the range, inclusive.
   * @return max
  **/
  @ApiModelProperty(example = "null", required = true, value = "Max is the end of the range, inclusive.")
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public V1beta1IDRange min(Long min) {
    this.min = min;
    return this;
  }

   /**
   * Min is the start of the range, inclusive.
   * @return min
  **/
  @ApiModelProperty(example = "null", required = true, value = "Min is the start of the range, inclusive.")
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IDRange v1beta1IDRange = (V1beta1IDRange) o;
    return Objects.equals(this.max, v1beta1IDRange.max) &&
        Objects.equals(this.min, v1beta1IDRange.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IDRange {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

