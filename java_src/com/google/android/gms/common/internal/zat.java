package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.u22;
import com.daaw.z71;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new u22();

    /* renamed from: p */
    public final int f36652p;

    /* renamed from: q */
    public final Account f36653q;

    /* renamed from: r */
    public final int f36654r;

    /* renamed from: s */
    public final GoogleSignInAccount f36655s;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f36652p = i;
        this.f36653q = account;
        this.f36654r = i2;
        this.f36655s = googleSignInAccount;
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36652p);
        z71.m2718p(parcel, 2, this.f36653q, i, false);
        z71.m2723k(parcel, 3, this.f36654r);
        z71.m2718p(parcel, 4, this.f36655s, i, false);
        z71.m2732b(parcel, m2733a);
    }
}
