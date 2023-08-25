package com.daaw;
/* loaded from: classes2.dex */
public final class mh implements gl<Object> {
    public static final mh p = new mh();

    @Override // com.daaw.gl
    public void b(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // com.daaw.gl
    public nl getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
