package com.daaw;
/* renamed from: com.daaw.ws */
/* loaded from: classes2.dex */
public enum EnumC3464ws {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: p */
    public final int f31482p;

    EnumC3464ws(int i) {
        this.f31482p = i;
    }

    /* renamed from: a */
    public static EnumC3464ws m5831a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: b */
    public int m5830b() {
        return this.f31482p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f31482p);
    }
}
