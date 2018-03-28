/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStatePermissionBeans;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStateValidationBeans;

/**
 * LifecycleStateCheckItemBeanList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:28:03.315+05:30")
public class LifecycleStateCheckItemBeanList {
  @JsonProperty("permissionBeans")
  private List<LifecycleStatePermissionBeans> permissionBeans = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("validationBeans")
  private List<LifecycleStateValidationBeans> validationBeans = null;

  @JsonProperty("targets")
  private List<String> targets = null;

  @JsonProperty("value")
  private Boolean value = null;

  public LifecycleStateCheckItemBeanList permissionBeans(List<LifecycleStatePermissionBeans> permissionBeans) {
    this.permissionBeans = permissionBeans;
    return this;
  }

  public LifecycleStateCheckItemBeanList addPermissionBeansItem(LifecycleStatePermissionBeans permissionBeansItem) {
    if (this.permissionBeans == null) {
      this.permissionBeans = new ArrayList<LifecycleStatePermissionBeans>();
    }
    this.permissionBeans.add(permissionBeansItem);
    return this;
  }

   /**
   * Get permissionBeans
   * @return permissionBeans
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStatePermissionBeans> getPermissionBeans() {
    return permissionBeans;
  }

  public void setPermissionBeans(List<LifecycleStatePermissionBeans> permissionBeans) {
    this.permissionBeans = permissionBeans;
  }

  public LifecycleStateCheckItemBeanList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Deprecate old versions after publish the API", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LifecycleStateCheckItemBeanList validationBeans(List<LifecycleStateValidationBeans> validationBeans) {
    this.validationBeans = validationBeans;
    return this;
  }

  public LifecycleStateCheckItemBeanList addValidationBeansItem(LifecycleStateValidationBeans validationBeansItem) {
    if (this.validationBeans == null) {
      this.validationBeans = new ArrayList<LifecycleStateValidationBeans>();
    }
    this.validationBeans.add(validationBeansItem);
    return this;
  }

   /**
   * Get validationBeans
   * @return validationBeans
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateValidationBeans> getValidationBeans() {
    return validationBeans;
  }

  public void setValidationBeans(List<LifecycleStateValidationBeans> validationBeans) {
    this.validationBeans = validationBeans;
  }

  public LifecycleStateCheckItemBeanList targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public LifecycleStateCheckItemBeanList addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<String>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @ApiModelProperty(value = "")
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }

  public LifecycleStateCheckItemBeanList value(Boolean value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleStateCheckItemBeanList lifecycleStateCheckItemBeanList = (LifecycleStateCheckItemBeanList) o;
    return Objects.equals(this.permissionBeans, lifecycleStateCheckItemBeanList.permissionBeans) &&
        Objects.equals(this.name, lifecycleStateCheckItemBeanList.name) &&
        Objects.equals(this.validationBeans, lifecycleStateCheckItemBeanList.validationBeans) &&
        Objects.equals(this.targets, lifecycleStateCheckItemBeanList.targets) &&
        Objects.equals(this.value, lifecycleStateCheckItemBeanList.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionBeans, name, validationBeans, targets, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleStateCheckItemBeanList {\n");
    
    sb.append("    permissionBeans: ").append(toIndentedString(permissionBeans)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validationBeans: ").append(toIndentedString(validationBeans)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

