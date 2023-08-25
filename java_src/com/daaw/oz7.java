package com.daaw;
/* loaded from: classes.dex */
public abstract class oz7 {
    public static oz7 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new jz7(cls.getSimpleName()) : new lz7(cls.getSimpleName());
    }

    public abstract void a(String str);
}
