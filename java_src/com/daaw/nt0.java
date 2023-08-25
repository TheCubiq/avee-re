package com.daaw;

import android.os.IBinder;
import com.daaw.yd0;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class nt0<T> extends yd0.AbstractBinderC3691a {

    /* renamed from: p */
    public final Object f20630p;

    public nt0(Object obj) {
        this.f20630p = obj;
    }

    /* renamed from: M */
    public static <T> T m14831M(yd0 yd0Var) {
        if (yd0Var instanceof nt0) {
            return (T) ((nt0) yd0Var).f20630p;
        }
        IBinder asBinder = yd0Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        ry0.m10830j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    /* renamed from: g3 */
    public static <T> yd0 m14830g3(T t) {
        return new nt0(t);
    }
}
