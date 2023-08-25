package com.daaw;
/* loaded from: classes.dex */
public final class es7 implements vt7 {

    /* renamed from: a */
    public static final es7 f8745a = new es7();

    /* renamed from: c */
    public static es7 m23223c() {
        return f8745a;
    }

    @Override // com.daaw.vt7
    /* renamed from: a */
    public final ut7 mo6791a(Class cls) {
        if (ls7.class.isAssignableFrom(cls)) {
            try {
                return (ut7) ls7.m16586m(cls.asSubclass(ls7.class)).mo1768I(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vt7
    /* renamed from: b */
    public final boolean mo6790b(Class cls) {
        return ls7.class.isAssignableFrom(cls);
    }
}
