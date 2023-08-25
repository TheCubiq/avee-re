package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.daaw.wx2;
/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public interface InterfaceC3989b extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC3990a extends wx2 implements InterfaceC3989b {
        /* renamed from: I */
        public static InterfaceC3989b m1156I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC3989b ? (InterfaceC3989b) queryLocalInterface : new C3991c(iBinder);
        }
    }

    Account zzb();
}
