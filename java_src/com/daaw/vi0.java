package com.daaw;

import android.os.Build;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class vi0 {

    /* renamed from: a */
    public static Field f30240a;

    /* renamed from: b */
    public static boolean f30241b;

    /* renamed from: a */
    public static void m7140a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f30241b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f30240a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
            }
            f30241b = true;
        }
        Field field = f30240a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
            }
        }
    }

    /* renamed from: b */
    public static void m7139b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m7140a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m7140a(layoutInflater, factory2);
            }
        }
    }
}
