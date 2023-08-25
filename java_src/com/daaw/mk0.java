package com.daaw;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class mk0 {
    public static <T extends sj0 & nt1> mk0 b(T t) {
        return new nk0(t, t.g());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
