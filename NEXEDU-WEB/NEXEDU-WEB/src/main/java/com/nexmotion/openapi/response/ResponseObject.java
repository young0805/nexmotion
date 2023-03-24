package com.nexmotion.openapi.response;

/**
 * @author : 김관우
 * @Date : 2016/11/04
 * 
 * Copyright (c) 2016 Nexmotion, Inc All rights reserved.
 *
 * REVISION HISTORY (reverse chronological order)
 * ============================================================================= 
 * 2016/11/04 김관우 작성 : ResponseVO.java
 * =============================================================================
 */
public class ResponseObject {

  private String returnCode;
  private Object data;

  public String getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

}
