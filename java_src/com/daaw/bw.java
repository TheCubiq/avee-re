package com.daaw;

import android.annotation.SuppressLint;
import android.text.Editable;
/* loaded from: classes.dex */
public final class bw extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public bw() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, bw.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bw();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? le1.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
