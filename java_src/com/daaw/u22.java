package com.daaw;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;
/* loaded from: classes.dex */
public final class u22 implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zat createFromParcel(Parcel parcel) {
        int y = y71.y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = y71.r(parcel);
            int l = y71.l(r);
            if (l == 1) {
                i = y71.t(parcel, r);
            } else if (l == 2) {
                account = (Account) y71.e(parcel, r, Account.CREATOR);
            } else if (l == 3) {
                i2 = y71.t(parcel, r);
            } else if (l != 4) {
                y71.x(parcel, r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) y71.e(parcel, r, GoogleSignInAccount.CREATOR);
            }
        }
        y71.k(parcel, y);
        return new zat(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i) {
        return new zat[i];
    }
}
