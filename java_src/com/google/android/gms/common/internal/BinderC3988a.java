package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC3989b;
/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public class BinderC3988a extends InterfaceC3989b.AbstractBinderC3990a {
    /* renamed from: M */
    public static Account m1157M(InterfaceC3989b interfaceC3989b) {
        Account account = null;
        if (interfaceC3989b != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = interfaceC3989b.zzb();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
