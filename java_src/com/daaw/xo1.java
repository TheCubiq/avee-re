package com.daaw;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class xo1 extends wo1 {
    @Override // com.daaw.wo1
    /* renamed from: l */
    public Typeface mo4884l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f31415g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f31421m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.daaw.wo1
    /* renamed from: x */
    public Method mo4883x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
