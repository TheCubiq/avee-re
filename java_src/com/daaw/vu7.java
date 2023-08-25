package com.daaw;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
/* loaded from: classes.dex */
public final class vu7 extends jn3 {

    /* renamed from: z */
    public static final th8 f30606z = new th8() { // from class: com.daaw.jt7
    };

    /* renamed from: s */
    public final int f30607s;

    /* renamed from: t */
    public final String f30608t;

    /* renamed from: u */
    public final int f30609u;

    /* renamed from: v */
    public final f92 f30610v;

    /* renamed from: w */
    public final int f30611w;

    /* renamed from: x */
    public final md3 f30612x;

    /* renamed from: y */
    public final boolean f30613y;

    public vu7(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vu7(int i, Throwable th, String str, int i2, String str2, int i3, f92 f92Var, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, f92Var, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + String.valueOf(f92Var) + ", format_supported=" + it5.m19383m(i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vu7(String str, Throwable th, int i, int i2, String str2, int i3, f92 f92Var, int i4, md3 md3Var, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5 = i2;
        if (z) {
            if (i5 != 1) {
                z2 = false;
                uo4.m7874d(z2);
                uo4.m7874d(th != null);
                this.f30607s = i5;
                this.f30608t = str2;
                this.f30609u = i3;
                this.f30610v = f92Var;
                this.f30611w = i4;
                this.f30612x = md3Var;
                this.f30613y = z;
            }
            i5 = 1;
        }
        z2 = true;
        uo4.m7874d(z2);
        uo4.m7874d(th != null);
        this.f30607s = i5;
        this.f30608t = str2;
        this.f30609u = i3;
        this.f30610v = f92Var;
        this.f30611w = i4;
        this.f30612x = md3Var;
        this.f30613y = z;
    }

    /* renamed from: b */
    public static vu7 m6773b(Throwable th, String str, int i, f92 f92Var, int i2, boolean z, int i3) {
        return new vu7(1, th, null, i3, str, i, f92Var, f92Var == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static vu7 m6772c(IOException iOException, int i) {
        return new vu7(0, iOException, i);
    }

    /* renamed from: d */
    public static vu7 m6771d(RuntimeException runtimeException, int i) {
        return new vu7(2, runtimeException, i);
    }

    /* renamed from: a */
    public final vu7 m6774a(md3 md3Var) {
        String message = getMessage();
        int i = it5.f13991a;
        return new vu7(message, getCause(), this.f15230p, this.f30607s, this.f30608t, this.f30609u, this.f30610v, this.f30611w, md3Var, this.f15231q, this.f30613y);
    }
}
