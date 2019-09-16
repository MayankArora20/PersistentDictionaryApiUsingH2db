package com.HappiestMinds.Persistent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorsResp> handleError(Exception e)
	{
		ErrorsResp res=new ErrorsResp();
		res.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		res.setMessage(e.getMessage());
		return new ResponseEntity<ErrorsResp>(res,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
