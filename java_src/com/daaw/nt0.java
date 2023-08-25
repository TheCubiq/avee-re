package com.daaw;

import android.os.IBinder;
import com.daaw.yd0;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class nt0<T> extends yd0.a {
    public final Object p;

    public nt0(Object obj) {
        this.p = obj;
    }

    public static <T> T M(yd0 yd0Var) {
        if (yd0Var instanceof nt0) {
            return (T) ((nt0) yd0Var).p;
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
        ry0.j(field);
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

    public static <T> yd0 g3(T t) {
        return new nt0(t);
    }
}
