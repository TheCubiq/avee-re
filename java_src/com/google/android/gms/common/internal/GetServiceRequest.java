package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ef8;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3989b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new ef8();

    /* renamed from: D */
    public static final Scope[] f36620D = new Scope[0];

    /* renamed from: E */
    public static final Feature[] f36621E = new Feature[0];

    /* renamed from: A */
    public int f36622A;

    /* renamed from: B */
    public boolean f36623B;

    /* renamed from: C */
    public String f36624C;

    /* renamed from: p */
    public final int f36625p;

    /* renamed from: q */
    public final int f36626q;

    /* renamed from: r */
    public int f36627r;

    /* renamed from: s */
    public String f36628s;

    /* renamed from: t */
    public IBinder f36629t;

    /* renamed from: u */
    public Scope[] f36630u;

    /* renamed from: v */
    public Bundle f36631v;

    /* renamed from: w */
    public Account f36632w;

    /* renamed from: x */
    public Feature[] f36633x;

    /* renamed from: y */
    public Feature[] f36634y;

    /* renamed from: z */
    public boolean f36635z;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f36620D : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f36621E : featureArr;
        featureArr2 = featureArr2 == null ? f36621E : featureArr2;
        this.f36625p = i;
        this.f36626q = i2;
        this.f36627r = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f36628s = "com.google.android.gms";
        } else {
            this.f36628s = str;
        }
        if (i < 2) {
            this.f36632w = iBinder != null ? BinderC3988a.m1157M(InterfaceC3989b.AbstractBinderC3990a.m1156I(iBinder)) : null;
        } else {
            this.f36629t = iBinder;
            this.f36632w = account;
        }
        this.f36630u = scopeArr;
        this.f36631v = bundle;
        this.f36633x = featureArr;
        this.f36634y = featureArr2;
        this.f36635z = z;
        this.f36622A = i4;
        this.f36623B = z2;
        this.f36624C = str2;
    }

    /* renamed from: h */
    public final String m1166h() {
        return this.f36624C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ef8.m23494a(this, parcel, i);
    }
}
