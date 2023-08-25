package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class b22 {

    /* renamed from: a */
    public final int f4229a;

    public b22(int i) {
        this.f4229a = i;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m26523e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo7553a(Status status);

    /* renamed from: b */
    public abstract void mo7552b(Exception exc);

    /* renamed from: c */
    public abstract void mo7551c(i02<?> i02Var);

    /* renamed from: d */
    public abstract void mo4272d(tz1 tz1Var, boolean z);
}
