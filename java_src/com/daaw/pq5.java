package com.daaw;
/* loaded from: classes.dex */
public enum pq5 {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED("unspecified");
    
    public final String p;

    pq5(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
