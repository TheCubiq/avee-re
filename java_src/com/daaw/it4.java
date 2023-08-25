package com.daaw;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class it4 implements Runnable {

    /* renamed from: p */
    public final WeakReference f13990p;

    @Override // java.lang.Runnable
    public final void run() {
        jt4 jt4Var = (jt4) this.f13990p.get();
        if (jt4Var != null) {
            jt4Var.m17378B0(new jw4() { // from class: com.daaw.dt4
                @Override // com.daaw.jw4
                public final void zza(Object obj) {
                    ((kt4) obj).zza();
                }
            });
        }
    }
}
