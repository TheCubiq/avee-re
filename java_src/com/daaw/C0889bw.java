package com.daaw;

import android.annotation.SuppressLint;
import android.text.Editable;
/* renamed from: com.daaw.bw */
/* loaded from: classes.dex */
public final class C0889bw extends Editable.Factory {

    /* renamed from: a */
    public static final Object f5220a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f5221b;

    /* renamed from: c */
    public static Class<?> f5222c;

    @SuppressLint({"PrivateApi"})
    public C0889bw() {
        try {
            f5222c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0889bw.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f5221b == null) {
            synchronized (f5220a) {
                if (f5221b == null) {
                    f5221b = new C0889bw();
                }
            }
        }
        return f5221b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f5222c;
        return cls != null ? le1.m16996c(cls, charSequence) : super.newEditable(charSequence);
    }
}
