package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class fl4 {

    /* renamed from: d */
    public static final fl4 f9664d = new fl4(null, new gs3[0], 0, -9223372036854775807L, 0);

    /* renamed from: e */
    public static final gs3 f9665e = new gs3(0).m21253b(0);

    /* renamed from: f */
    public static final th8 f9666f = new th8() { // from class: com.daaw.w22
    };

    /* renamed from: c */
    public final gs3[] f9669c;

    /* renamed from: b */
    public final long f9668b = 0;

    /* renamed from: a */
    public final int f9667a = 0;

    public fl4(Object obj, gs3[] gs3VarArr, long j, long j2, int i) {
        this.f9669c = gs3VarArr;
    }

    /* renamed from: a */
    public final gs3 m22505a(int i) {
        return i < 0 ? f9665e : this.f9669c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fl4.class == obj.getClass()) {
            fl4 fl4Var = (fl4) obj;
            if (it5.m19376t(null, null) && Arrays.equals(this.f9669c, fl4Var.f9669c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f9669c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
