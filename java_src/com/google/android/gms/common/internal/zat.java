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
    public final int p;
    public final Account q;
    public final int r;
    public final GoogleSignInAccount s;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.p = i;
        this.q = account;
        this.r = i2;
        this.s = googleSignInAccount;
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.p(parcel, 2, this.q, i, false);
        z71.k(parcel, 3, this.r);
        z71.p(parcel, 4, this.s, i, false);
        z71.b(parcel, a);
    }
}
