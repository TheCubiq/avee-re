package com.daaw;
/* loaded from: classes2.dex */
public class ui1 implements bg {
    public static ui1 a;

    public static ui1 b() {
        if (a == null) {
            a = new ui1();
        }
        return a;
    }

    @Override // com.daaw.bg
    public long a() {
        return System.currentTimeMillis();
    }
}
