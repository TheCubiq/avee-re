package org.junit.runner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runner.manipulation.Ordering;
import org.junit.validator.ValidateWith;
@Target({ElementType.TYPE})
@ValidateWith(OrderWithValidator.class)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface OrderWith {
    Class<? extends Ordering.Factory> value();
}
