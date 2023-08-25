package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.sr3;
import com.daaw.z22;
/* loaded from: classes.dex */
public final class c extends z22 implements b {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel D = D(2, I());
        Account account = (Account) sr3.a(D, Account.CREATOR);
        D.recycle();
        return account;
    }
}
