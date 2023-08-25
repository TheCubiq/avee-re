package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
/* loaded from: classes.dex */
public class a extends b.a {
    public static Account M(b bVar) {
        Account account = null;
        if (bVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = bVar.zzb();
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
