package org.junit.runners.model;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
/* loaded from: classes2.dex */
class NoGenericTypeParametersValidator {
    private final Method method;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NoGenericTypeParametersValidator(Method method) {
        this.method = method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validate(List<Throwable> list) {
        for (Type type : this.method.getGenericParameterTypes()) {
            validateNoTypeParameterOnType(type, list);
        }
    }

    private void validateNoTypeParameterOnType(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.method.getName() + "() contains unresolved type variable " + type));
        } else if (type instanceof ParameterizedType) {
            validateNoTypeParameterOnParameterizedType((ParameterizedType) type, list);
        } else if (type instanceof WildcardType) {
            validateNoTypeParameterOnWildcardType((WildcardType) type, list);
        } else if (type instanceof GenericArrayType) {
            validateNoTypeParameterOnGenericArrayType((GenericArrayType) type, list);
        }
    }

    private void validateNoTypeParameterOnParameterizedType(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type type : parameterizedType.getActualTypeArguments()) {
            validateNoTypeParameterOnType(type, list);
        }
    }

    private void validateNoTypeParameterOnWildcardType(WildcardType wildcardType, List<Throwable> list) {
        for (Type type : wildcardType.getUpperBounds()) {
            validateNoTypeParameterOnType(type, list);
        }
        for (Type type2 : wildcardType.getLowerBounds()) {
            validateNoTypeParameterOnType(type2, list);
        }
    }

    private void validateNoTypeParameterOnGenericArrayType(GenericArrayType genericArrayType, List<Throwable> list) {
        validateNoTypeParameterOnType(genericArrayType.getGenericComponentType(), list);
    }
}
