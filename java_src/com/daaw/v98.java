package com.daaw;
/* loaded from: classes2.dex */
public final class v98 implements vd8 {

    /* renamed from: a */
    public static final v98 f30066a = new v98();

    /* renamed from: c */
    public static v98 m7310c() {
        return f30066a;
    }

    @Override // com.daaw.vd8
    /* renamed from: a */
    public final td8 mo7240a(Class cls) {
        if (ja8.class.isAssignableFrom(cls)) {
            try {
                return (td8) ja8.m18674B(cls.asSubclass(ja8.class)).mo4853C(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vd8
    /* renamed from: b */
    public final boolean mo7239b(Class cls) {
        return ja8.class.isAssignableFrom(cls);
    }
}
