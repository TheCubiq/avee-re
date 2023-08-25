package com.daaw;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.daaw.vu */
/* loaded from: classes.dex */
public class C3373vu {

    /* renamed from: a */
    public static final int[] f30586a = {16842912};

    /* renamed from: b */
    public static final int[] f30587b = new int[0];

    /* renamed from: c */
    public static final Rect f30588c = new Rect();

    /* renamed from: com.daaw.vu$a */
    /* loaded from: classes.dex */
    public static class C3374a {

        /* renamed from: a */
        public static final boolean f30589a;

        /* renamed from: b */
        public static final Method f30590b;

        /* renamed from: c */
        public static final Field f30591c;

        /* renamed from: d */
        public static final Field f30592d;

        /* renamed from: e */
        public static final Field f30593e;

        /* renamed from: f */
        public static final Field f30594f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field3 = null;
                    }
                    try {
                        field4 = cls.getField("bottom");
                        z = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field4 = null;
                        z = false;
                        if (z) {
                        }
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            }
            if (z) {
                f30590b = null;
                f30591c = null;
                f30592d = null;
                f30593e = null;
                f30594f = null;
                f30589a = false;
                return;
            }
            f30590b = method;
            f30591c = field;
            f30592d = field2;
            f30593e = field3;
            f30594f = field4;
            f30589a = true;
        }

        /* renamed from: a */
        public static Rect m6784a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f30589a) {
                try {
                    Object invoke = f30590b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f30591c.getInt(invoke), f30592d.getInt(invoke), f30593e.getInt(invoke), f30594f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C3373vu.f30588c;
        }
    }

    /* renamed from: com.daaw.vu$b */
    /* loaded from: classes.dex */
    public static class C3375b {
        /* renamed from: a */
        public static Insets m6783a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m6789a(Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof az1) {
                drawable2 = ((az1) drawable).mo25723b();
            } else if (drawable instanceof C3594xu) {
                drawable2 = ((C3594xu) drawable).m4507a();
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m6789a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState instanceof DrawableContainer.DrawableContainerState) {
            for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m6789a(drawable3)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public static void m6788b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (!(i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) && (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        m6787c(drawable);
    }

    /* renamed from: c */
    public static void m6787c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f30586a);
        } else {
            drawable.setState(f30587b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m6786d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets m6783a = C3375b.m6783a(drawable);
            return new Rect(m6783a.left, m6783a.top, m6783a.right, m6783a.bottom);
        }
        return C3374a.m6784a(C2366nu.m14810q(drawable));
    }

    /* renamed from: e */
    public static PorterDuff.Mode m6785e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
