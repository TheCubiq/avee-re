package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class lf0 {

    /* renamed from: com.daaw.lf0$a */
    /* loaded from: classes.dex */
    public static class C2035a {
        /* renamed from: a */
        public static ColorStateList m16975a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m16974b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m16973c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m16972d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m16979a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C2035a.m16975a(imageView);
        }
        if (imageView instanceof zl1) {
            return ((zl1) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m16978b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C2035a.m16974b(imageView);
        }
        if (imageView instanceof zl1) {
            return ((zl1) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m16977c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (imageView instanceof zl1) {
                ((zl1) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        C2035a.m16973c(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C2035a.m16975a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: d */
    public static void m16976d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (imageView instanceof zl1) {
                ((zl1) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        C2035a.m16972d(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C2035a.m16975a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
