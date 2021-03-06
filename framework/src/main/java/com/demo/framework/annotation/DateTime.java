package com.demo.framework.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.demo.framework.validate.DateTimeValidator;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { DateTimeValidator.class })
public @interface DateTime {
	String format() default "yyyy-MM-dd HH:mm:ss";
	
	String message() default "时间格式不正确 [{format}]";
	
	Class<?>[] groups() default { };
	 
	Class<? extends Payload>[] payload() default { };
	
}
