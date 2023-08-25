package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ef8;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new ef8();
    public static final Scope[] D = new Scope[0];
    public static final Feature[] E = new Feature[0];
    public int A;
    public boolean B;
    public String C;
    public final int p;
    public final int q;
    public int r;
    public String s;
    public IBinder t;
    public Scope[] u;
    public Bundle v;
    public Account w;
    public Feature[] x;
    public Feature[] y;
    public boolean z;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? D : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? E : featureArr;
        featureArr2 = featureArr2 == null ? E : featureArr2;
        this.p = i;
        this.q = i2;
        this.r = i3;
        if ("com.google.android.gms".equals(str)) {
            this.s = "com.google.android.gms";
        } else {
            this.s = str;
        }
        if (i < 2) {
            this.w = iBinder != null ? a.M(b.a.I(iBinder)) : null;
        } else {
            this.t = iBinder;
            this.w = account;
        }
        this.u = scopeArr;
        this.v = bundle;
        this.x = featureArr;
        this.y = featureArr2;
        this.z = z;
        this.A = i4;
        this.B = z2;
        this.C = str2;
    }

    public final String h() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ef8.a(this, parcel, i);
    }
}
