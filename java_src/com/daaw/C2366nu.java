package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: com.daaw.nu */
/* loaded from: classes.dex */
public final class C2366nu {

    /* renamed from: a */
    public static Method f20728a;

    /* renamed from: b */
    public static boolean f20729b;

    /* renamed from: c */
    public static Method f20730c;

    /* renamed from: d */
    public static boolean f20731d;

    /* renamed from: com.daaw.nu$a */
    /* loaded from: classes.dex */
    public static class C2367a {
        /* renamed from: a */
        public static int m14808a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        public static Drawable m14807b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        public static Drawable m14806c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        public static boolean m14805d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        public static void m14804e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: com.daaw.nu$b */
    /* loaded from: classes.dex */
    public static class C2368b {
        /* renamed from: a */
        public static void m14803a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m14802b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m14801c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m14800d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m14799e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        public static void m14798f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m14797g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        public static void m14796h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m14795i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: com.daaw.nu$c */
    /* loaded from: classes.dex */
    public static class C2369c {
        /* renamed from: a */
        public static int m14794a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m14793b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m14826a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14803a(drawable, theme);
        }
    }

    /* renamed from: b */
    public static boolean m14825b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C2368b.m14802b(drawable);
        }
        return false;
    }

    /* renamed from: c */
    public static void m14824c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable mo25723b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            mo25723b = C2367a.m14806c((InsetDrawable) drawable);
        } else if (!(drawable instanceof az1)) {
            if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                return;
            }
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable m14807b = C2367a.m14807b(drawableContainerState, i2);
                if (m14807b != null) {
                    m14824c(m14807b);
                }
            }
            return;
        } else {
            mo25723b = ((az1) drawable).mo25723b();
        }
        m14824c(mo25723b);
    }

    /* renamed from: d */
    public static int m14823d(Drawable drawable) {
        return C2367a.m14808a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m14822e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C2368b.m14801c(drawable);
        }
        return null;
    }

    /* renamed from: f */
    public static int m14821f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2369c.m14794a(drawable);
        }
        if (!f20731d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f20730c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f20731d = true;
        }
        Method method = f20730c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f20730c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m14820g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14800d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m14819h(Drawable drawable) {
        return C2367a.m14805d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m14818i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m14817j(Drawable drawable, boolean z) {
        C2367a.m14804e(drawable, z);
    }

    /* renamed from: k */
    public static void m14816k(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14799e(drawable, f, f2);
        }
    }

    /* renamed from: l */
    public static void m14815l(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14798f(drawable, i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public static boolean m14814m(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2369c.m14793b(drawable, i);
        }
        if (!f20729b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f20728a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f20729b = true;
        }
        Method method = f20728a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f20728a = null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m14813n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14797g(drawable, i);
        } else if (drawable instanceof ql1) {
            ((ql1) drawable).setTint(i);
        }
    }

    /* renamed from: o */
    public static void m14812o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14796h(drawable, colorStateList);
        } else if (drawable instanceof ql1) {
            ((ql1) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: p */
    public static void m14811p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2368b.m14795i(drawable, mode);
        } else if (drawable instanceof ql1) {
            ((ql1) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m14810q(Drawable drawable) {
        return drawable instanceof az1 ? (T) ((az1) drawable).mo25723b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m14809r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof ql1) ? new cz1(drawable) : drawable : !(drawable instanceof ql1) ? new bz1(drawable) : drawable;
    }
}
