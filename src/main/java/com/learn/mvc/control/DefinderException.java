package com.learn.mvc.control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author youzhanghao [m13732916591_1@163.com]
 * @Description:
 * @Date 2019/8/14
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "internal server error htt")
public class DefinderException extends Exception {
}
