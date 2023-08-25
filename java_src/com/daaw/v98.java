package com.daaw;
/* loaded from: classes2.dex */
public final class v98 implements vd8 {
    public static final v98 a = new v98();

    public static v98 c() {
        return a;
    }

    @Override // com.daaw.vd8
    public final td8 a(Class cls) {
        if (ja8.class.isAssignableFrom(cls)) {
            try {
                return (td8) ja8.B(cls.asSubclass(ja8.class)).C(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vd8
    public final boolean b(Class cls) {
        return ja8.class.isAssignableFrom(cls);
    }
}
