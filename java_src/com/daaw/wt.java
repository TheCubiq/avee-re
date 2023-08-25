package com.daaw;
/* loaded from: classes.dex */
public enum wt {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    public final boolean p;
    public final boolean q;

    wt(boolean z, boolean z2) {
        this.p = z;
        this.q = z2;
    }

    public boolean a() {
        return this.q;
    }

    public boolean b() {
        return this.p;
    }
}
