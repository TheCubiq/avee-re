package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.fj2;
import com.daaw.st6;
import com.daaw.vr7;
import com.daaw.xs7;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzftj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzftj> CREATOR = new st6();
    public final int p;
    public fj2 q = null;
    public byte[] r;

    public zzftj(int i, byte[] bArr) {
        this.p = i;
        this.r = bArr;
        zzb();
    }

    public final fj2 h() {
        if (this.q == null) {
            try {
                this.q = fj2.G0(this.r, vr7.a());
                this.r = null;
            } catch (xs7 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        byte[] bArr = this.r;
        if (bArr == null) {
            bArr = this.q.a();
        }
        z71.f(parcel, 2, bArr, false);
        z71.b(parcel, a);
    }

    public final void zzb() {
        fj2 fj2Var = this.q;
        if (fj2Var != null || this.r == null) {
            if (fj2Var == null || this.r != null) {
                if (fj2Var != null && this.r != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (fj2Var != null || this.r != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
