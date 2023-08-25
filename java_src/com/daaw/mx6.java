package com.daaw;

import android.os.IBinder;
import java.util.List;
/* loaded from: classes.dex */
public final class mx6 extends dx6 {
    public final /* synthetic */ IBinder q;
    public final /* synthetic */ px6 r;

    public mx6(px6 px6Var, IBinder iBinder) {
        this.r = px6Var;
        this.q = iBinder;
    }

    @Override // com.daaw.dx6
    public final void a() {
        List<Runnable> list;
        List list2;
        this.r.a.m = yw6.g3(this.q);
        qx6.n(this.r.a);
        this.r.a.g = false;
        list = this.r.a.d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.r.a.d;
        list2.clear();
    }
}
