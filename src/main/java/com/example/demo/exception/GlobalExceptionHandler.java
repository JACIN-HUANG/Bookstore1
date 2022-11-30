package com.example.demo.exception;
import com.example.demo.response.ResponseData;
import com.example.demo.utils.ResponseDataUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler<T> {

    @ResponseBody
    @ExceptionHandler(value = BaseException.class)
    public ResponseData  runtimeException(BaseException e) {
       return ResponseDataUtil.buildError(e.getErrorCode(),e.getErrorMsg());
    }

}

