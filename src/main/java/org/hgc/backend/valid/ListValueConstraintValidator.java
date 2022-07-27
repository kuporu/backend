package org.hgc.backend.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
* ListValue:使用的效验注解类型
* Integer: 被验证目标类型。我们验证的目标都是数字所以是Integer
*/
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {
    private Set<Integer> contain = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.value();
        if (values==null) return;
		
		//将符合规则的值放到容器中
        for (int value : values) {
            contain.add(value);
        }
    }

	//该方法判断参数合不合法
    //value是需要验证的值,即用户输入的参数
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
    	//返回用户输入的参数是否在容器中
        return contain.contains(value);
    }
}
