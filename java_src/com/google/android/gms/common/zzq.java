package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.bl4;
import com.daaw.ly8;
import com.daaw.up8;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new up8();
    public final boolean p;
    @Nullable
    public final String q;
    public final int r;
    public final int s;

    public zzq(boolean z, String str, int i, int i2) {
        this.p = z;
        this.q = str;
        this.r = ly8.a(i) - 1;
        this.s = bl4.a(i2) - 1;
    }

    @Nullable
    public final String h() {
        return this.q;
    }

    public final boolean q() {
        return this.p;
    }

    public final int s() {
        return bl4.a(this.s);
    }

    public final int t() {
        return ly8.a(this.r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.c(parcel, 1, this.p);
        z71.q(parcel, 2, this.q, false);
        z71.k(parcel, 3, this.r);
        z71.k(parcel, 4, this.s);
        z71.b(parcel, a);
    }
}
