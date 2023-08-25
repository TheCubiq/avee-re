package com.daaw;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class lx5 {

    /* renamed from: a */
    public final ConcurrentHashMap f17894a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ya5 f17895b;

    public lx5(ya5 ya5Var) {
        this.f17895b = ya5Var;
    }

    @CheckForNull
    /* renamed from: a */
    public final dp3 m16380a(String str) {
        if (this.f17894a.containsKey(str)) {
            return (dp3) this.f17894a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void m16379b(String str) {
        try {
            this.f17894a.put(str, this.f17895b.m3951b(str));
        } catch (RemoteException e) {
            k04.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
