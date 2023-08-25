package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.sr3;
import com.daaw.z22;
/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public final class C3991c extends z22 implements InterfaceC3989b {
    public C3991c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3989b
    public final Account zzb() {
        Parcel m2966D = m2966D(2, m2965I());
        Account account = (Account) sr3.m9943a(m2966D, Account.CREATOR);
        m2966D.recycle();
        return account;
    }
}
