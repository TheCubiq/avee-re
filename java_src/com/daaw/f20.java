package com.daaw;
/* loaded from: classes2.dex */
public class f20 extends y10 {
    public final a p;

    /* loaded from: classes2.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public f20(a aVar) {
        this.p = aVar;
    }

    public f20(String str, a aVar) {
        super(str);
        this.p = aVar;
    }
}
