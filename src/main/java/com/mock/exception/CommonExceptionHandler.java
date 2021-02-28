package com.mock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mock.model.ResponseVO;

@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {

	@ExceptionHandler(CommonException.class)
	public ResponseEntity<ResponseVO<Object>> handleException(Exception e) {
		CommonException taiChiException = (CommonException) e;
		ResponseVO<Object> resp = new ResponseVO<Object>(taiChiException.getCode(),e.getMessage(), null);
		return new ResponseEntity<ResponseVO<Object>>(resp, HttpStatus.OK);
	}
}
