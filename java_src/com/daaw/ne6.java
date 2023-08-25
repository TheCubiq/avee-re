package com.daaw;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class ne6 {
    public static void a(AtomicReference atomicReference, me6 me6Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            me6Var.zza(obj);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            k04.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
