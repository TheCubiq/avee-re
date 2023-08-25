package com.daaw;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* loaded from: classes.dex */
public class m51 {

    /* renamed from: a */
    public static Field f18451a;

    /* renamed from: b */
    public static boolean f18452b;

    /* renamed from: c */
    public static Class<?> f18453c;

    /* renamed from: d */
    public static boolean f18454d;

    /* renamed from: e */
    public static Field f18455e;

    /* renamed from: f */
    public static boolean f18456f;

    /* renamed from: g */
    public static Field f18457g;

    /* renamed from: h */
    public static boolean f18458h;

    /* renamed from: com.daaw.m51$a */
    /* loaded from: classes.dex */
    public static class C2152a {
        /* renamed from: a */
        public static void m16204a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m16209a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m16206d(resources);
        } else if (i >= 23) {
            m16207c(resources);
        } else if (i >= 21) {
            m16208b(resources);
        }
    }

    /* renamed from: b */
    public static void m16208b(Resources resources) {
        if (!f18452b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f18451a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18452b = true;
        }
        Field field = f18451a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    public static void m16207c(Resources resources) {
        if (!f18452b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f18451a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18452b = true;
        }
        Object obj = null;
        Field field = f18451a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj == null) {
            return;
        }
        m16205e(obj);
    }

    /* renamed from: d */
    public static void m16206d(Resources resources) {
        Object obj;
        if (!f18458h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f18457g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18458h = true;
        }
        Field field = f18457g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f18452b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f18451a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f18452b = true;
        }
        Field field2 = f18451a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m16205e(obj2);
        }
    }

    /* renamed from: e */
    public static void m16205e(Object obj) {
        if (!f18454d) {
            try {
                f18453c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f18454d = true;
        }
        Class<?> cls = f18453c;
        if (cls == null) {
            return;
        }
        if (!f18456f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f18455e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f18456f = true;
        }
        Field field = f18455e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            C2152a.m16204a(longSparseArray);
        }
    }
}
