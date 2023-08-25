package com.daaw;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class lx5 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ya5 b;

    public lx5(ya5 ya5Var) {
        this.b = ya5Var;
    }

    @CheckForNull
    public final dp3 a(String str) {
        if (this.a.containsKey(str)) {
            return (dp3) this.a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.a.put(str, this.b.b(str));
        } catch (RemoteException e) {
            k04.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
