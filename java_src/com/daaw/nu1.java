package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class nu1 {

    /* renamed from: a */
    public static Method f20735a;

    /* renamed from: b */
    public static boolean f20736b;

    /* renamed from: c */
    public static Field f20737c;

    /* renamed from: d */
    public static boolean f20738d;

    /* renamed from: a */
    public void mo14790a(View view) {
        throw null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    public final void m14789b() {
        if (f20736b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f20735a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f20736b = true;
    }

    /* renamed from: c */
    public float mo14788c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo14787d(View view) {
        throw null;
    }

    /* renamed from: e */
    public void mo14786e(View view, int i, int i2, int i3, int i4) {
        m14789b();
        Method method = f20735a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo14785f(View view, float f) {
        throw null;
    }

    /* renamed from: g */
    public void mo14784g(View view, int i) {
        if (!f20738d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f20737c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f20738d = true;
        }
        Field field = f20737c;
        if (field != null) {
            try {
                f20737c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo14783h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo14783h(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo14782i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo14782i(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
