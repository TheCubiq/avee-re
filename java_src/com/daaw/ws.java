package com.daaw;
/* loaded from: classes2.dex */
public enum ws {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public final int p;

    ws(int i) {
        this.p = i;
    }

    public static ws a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int b() {
        return this.p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.p);
    }
}
