package com.daaw;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class hu1 {

    /* renamed from: a */
    public static Method f12929a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f12929a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f12929a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static void m20418a(View view, Rect rect, Rect rect2) {
        Method method = f12929a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m20417b(View view) {
        return xs1.m4768E(view) == 1;
    }

    /* renamed from: c */
    public static void m20416c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
