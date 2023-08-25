package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* renamed from: com.daaw.yi */
/* loaded from: classes.dex */
public final class C3708yi {

    /* renamed from: a */
    public static Field f33685a;

    /* renamed from: b */
    public static boolean f33686b;

    /* renamed from: com.daaw.yi$a */
    /* loaded from: classes.dex */
    public static class C3709a {
        /* renamed from: a */
        public static ColorStateList m3730a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m3729b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m3728c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m3727d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: com.daaw.yi$b */
    /* loaded from: classes.dex */
    public static class C3710b {
        /* renamed from: a */
        public static Drawable m3726a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m3734a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3710b.m3726a(compoundButton);
        }
        if (!f33686b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f33685a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f33686b = true;
        }
        Field field = f33685a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f33685a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m3733b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3709a.m3730a(compoundButton);
        }
        if (compoundButton instanceof xl1) {
            return ((xl1) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m3732c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3709a.m3728c(compoundButton, colorStateList);
        } else if (compoundButton instanceof xl1) {
            ((xl1) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m3731d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3709a.m3727d(compoundButton, mode);
        } else if (compoundButton instanceof xl1) {
            ((xl1) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
