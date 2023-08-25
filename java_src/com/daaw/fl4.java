package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class fl4 {
    public static final fl4 d = new fl4(null, new gs3[0], 0, -9223372036854775807L, 0);
    public static final gs3 e = new gs3(0).b(0);
    public static final th8 f = new th8() { // from class: com.daaw.w22
    };
    public final gs3[] c;
    public final long b = 0;
    public final int a = 0;

    public fl4(Object obj, gs3[] gs3VarArr, long j, long j2, int i) {
        this.c = gs3VarArr;
    }

    public final gs3 a(int i) {
        return i < 0 ? e : this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fl4.class == obj.getClass()) {
            fl4 fl4Var = (fl4) obj;
            if (it5.t(null, null) && Arrays.equals(this.c, fl4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
