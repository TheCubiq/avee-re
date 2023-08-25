package com.daaw;
/* loaded from: classes.dex */
public abstract class oz7 {
    /* renamed from: b */
    public static oz7 m13793b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new jz7(cls.getSimpleName()) : new lz7(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo13794a(String str);
}
