package com.daaw;
/* loaded from: classes.dex */
public enum eq6 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    public final String p;

    eq6(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
