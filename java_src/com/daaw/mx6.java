package com.daaw;

import android.os.IBinder;
import java.util.List;
/* loaded from: classes.dex */
public final class mx6 extends dx6 {

    /* renamed from: q */
    public final /* synthetic */ IBinder f19273q;

    /* renamed from: r */
    public final /* synthetic */ px6 f19274r;

    public mx6(px6 px6Var, IBinder iBinder) {
        this.f19274r = px6Var;
        this.f19273q = iBinder;
    }

    @Override // com.daaw.dx6
    /* renamed from: a */
    public final void mo14744a() {
        List<Runnable> list;
        List list2;
        this.f19274r.f23516a.f24619m = yw6.m3147g3(this.f19273q);
        qx6.m11957n(this.f19274r.f23516a);
        this.f19274r.f23516a.f24613g = false;
        list = this.f19274r.f23516a.f24610d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f19274r.f23516a.f24610d;
        list2.clear();
    }
}
