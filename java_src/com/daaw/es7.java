package com.daaw;
/* loaded from: classes.dex */
public final class es7 implements vt7 {
    public static final es7 a = new es7();

    public static es7 c() {
        return a;
    }

    @Override // com.daaw.vt7
    public final ut7 a(Class cls) {
        if (ls7.class.isAssignableFrom(cls)) {
            try {
                return (ut7) ls7.m(cls.asSubclass(ls7.class)).I(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vt7
    public final boolean b(Class cls) {
        return ls7.class.isAssignableFrom(cls);
    }
}
