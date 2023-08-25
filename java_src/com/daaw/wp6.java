package com.daaw;
/* loaded from: classes.dex */
public enum wp6 {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    public final String p;

    wp6(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
