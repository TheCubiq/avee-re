package com.daaw;

import com.google.android.gms.common.api.Status;
/* renamed from: com.daaw.l3 */
/* loaded from: classes.dex */
public class C2009l3 extends Exception {
    @Deprecated

    /* renamed from: p */
    public final Status f16983p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2009l3(Status status) {
        super(r0 + ": " + r1);
        int m1197q = status.m1197q();
        String m1196s = status.m1196s() != null ? status.m1196s() : "";
        this.f16983p = status;
    }

    /* renamed from: a */
    public Status m17191a() {
        return this.f16983p;
    }

    /* renamed from: b */
    public int m17190b() {
        return this.f16983p.m1197q();
    }
}
