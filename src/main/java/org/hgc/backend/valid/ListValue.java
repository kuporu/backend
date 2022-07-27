package org.hgc.backend.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
//指定使用哪个效验器，如果不指定的话，就需要在初始化的时候指定
//可以指定多个不同的效验器，适配不同类型的效验
@Constraint(validatedBy = {ListValueConstraintValidator.class})
public @interface ListValue {
    //JSR303规范中，要求必须有message、groups、payload这三个方法
    //default: 当message为null时,默认会到ValidationMessages.properties配置文件中找com.fcp.common.valid.ListValue.message的值
    String message() default "{com.fcp.common.valid.ListValue.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

	//用来存放符合规则的数字
    int[] value();
}
