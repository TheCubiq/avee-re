package com.daaw;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class hy0 {

    /* renamed from: a */
    public static Method f13054a;

    /* renamed from: b */
    public static boolean f13055b;

    /* renamed from: c */
    public static Field f13056c;

    /* renamed from: d */
    public static boolean f13057d;

    /* renamed from: com.daaw.hy0$a */
    /* loaded from: classes.dex */
    public static class C1629a {
        /* renamed from: a */
        public static void m20328a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: com.daaw.hy0$b */
    /* loaded from: classes.dex */
    public static class C1630b {
        /* renamed from: a */
        public static boolean m20327a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m20326b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m20325c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        public static void m20324d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m20331a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C1630b.m20325c(popupWindow, z);
        } else if (i >= 21) {
            if (!f13057d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f13056c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f13057d = true;
            }
            Field field = f13056c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m20330b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1630b.m20324d(popupWindow, i);
            return;
        }
        if (!f13055b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f13054a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f13055b = true;
        }
        Method method = f13054a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m20329c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C1629a.m20328a(popupWindow, view, i, i2, i3);
    }
}
