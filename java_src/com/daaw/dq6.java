package com.daaw;
/* loaded from: classes.dex */
public enum dq6 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    public final String p;

    dq6(String str) {
        this.p = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
