package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckedTextView;
/* renamed from: com.daaw.ye */
/* loaded from: classes.dex */
public final class C3695ye {

    /* renamed from: com.daaw.ye$a */
    /* loaded from: classes.dex */
    public static class C3696a {
        /* renamed from: a */
        public static Drawable m3837a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: com.daaw.ye$b */
    /* loaded from: classes.dex */
    public static class C3697b {
        /* renamed from: a */
        public static void m3836a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        public static void m3835b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m3840a(CheckedTextView checkedTextView) {
        return C3696a.m3837a(checkedTextView);
    }

    /* renamed from: b */
    public static void m3839b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3697b.m3836a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof wl1) {
            ((wl1) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public static void m3838c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3697b.m3835b(checkedTextView, mode);
        } else if (checkedTextView instanceof wl1) {
            ((wl1) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
