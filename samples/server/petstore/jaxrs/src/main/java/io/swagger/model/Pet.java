package io.swagger.model;

import io.swagger.model.Category;
import io.swagger.model.Tag;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Pet  { 
  /**
   **/
  private Long id = null;
  /**
   **/
  private Category category = null;
  /**
   **/
  private String name = null;
  /**
   **/
  private List<String> photoUrls = new ArrayList<String>() ;
  /**
   **/
  private List<Tag> tags = new ArrayList<Tag>() ;
  /**
   * pet status in the store
   **/
  private String status = null;
  
  
  @ApiModelProperty(required = false, value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  @ApiModelProperty(required = false, value = "")
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(required = true, value = "")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  
  @ApiModelProperty(required = false, value = "")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  
  @ApiModelProperty(required = false, value = "pet status in the store")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  photoUrls: ").append(photoUrls).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}