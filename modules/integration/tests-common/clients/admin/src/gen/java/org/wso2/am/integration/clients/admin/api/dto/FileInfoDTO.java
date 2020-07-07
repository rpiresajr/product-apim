/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileInfoDTO
 */

public class FileInfoDTO {
  @SerializedName("relativePath")
  private String relativePath = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  public FileInfoDTO relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

   /**
   * relative location of the file (excluding the base context and host of the Admin API)
   * @return relativePath
  **/
  @ApiModelProperty(example = "api-categories/01234567-0123-0123-0123-012345678901/thumbnail", value = "relative location of the file (excluding the base context and host of the Admin API)")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public FileInfoDTO mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * media-type of the file
   * @return mediaType
  **/
  @ApiModelProperty(example = "image/jpeg", value = "media-type of the file")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInfoDTO fileInfo = (FileInfoDTO) o;
    return Objects.equals(this.relativePath, fileInfo.relativePath) &&
        Objects.equals(this.mediaType, fileInfo.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativePath, mediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInfoDTO {\n");
    
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

