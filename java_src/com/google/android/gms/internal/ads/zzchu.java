package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.c80;
import com.daaw.q04;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzchu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzchu> CREATOR = new q04();
    public String p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;

    public zzchu(int i, int i2, boolean z, boolean z2) {
        this(224400000, i2, true, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzchu(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r12 = "0"
            goto L7
        L5:
            java.lang.String r12 = "1"
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchu.<init>(int, int, boolean, boolean, boolean):void");
    }

    public zzchu(String str, int i, int i2, boolean z, boolean z2) {
        this.p = str;
        this.q = i;
        this.r = i2;
        this.s = z;
        this.t = z2;
    }

    public static zzchu h() {
        return new zzchu((int) c80.a, (int) c80.a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 2, this.p, false);
        z71.k(parcel, 3, this.q);
        z71.k(parcel, 4, this.r);
        z71.c(parcel, 5, this.s);
        z71.c(parcel, 6, this.t);
        z71.b(parcel, a);
    }
}
