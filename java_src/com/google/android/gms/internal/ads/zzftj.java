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

    /* renamed from: p */
    public final int f37016p;

    /* renamed from: q */
    public fj2 f37017q = null;

    /* renamed from: r */
    public byte[] f37018r;

    public zzftj(int i, byte[] bArr) {
        this.f37016p = i;
        this.f37018r = bArr;
        zzb();
    }

    /* renamed from: h */
    public final fj2 m1091h() {
        if (this.f37017q == null) {
            try {
                this.f37017q = fj2.m22596G0(this.f37018r, vr7.m6834a());
                this.f37018r = null;
            } catch (xs7 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.f37017q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37016p);
        byte[] bArr = this.f37018r;
        if (bArr == null) {
            bArr = this.f37017q.mo4516a();
        }
        z71.m2728f(parcel, 2, bArr, false);
        z71.m2732b(parcel, m2733a);
    }

    public final void zzb() {
        fj2 fj2Var = this.f37017q;
        if (fj2Var != null || this.f37018r == null) {
            if (fj2Var == null || this.f37018r != null) {
                if (fj2Var != null && this.f37018r != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (fj2Var != null || this.f37018r != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
