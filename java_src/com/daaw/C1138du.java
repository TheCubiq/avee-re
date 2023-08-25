package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: com.daaw.du */
/* loaded from: classes2.dex */
public final class C1138du<T> extends h91<T> {

    /* renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7804s = AtomicIntegerFieldUpdater.newUpdater(C1138du.class, "_decision");
    private volatile /* synthetic */ int _decision;

    @Override // com.daaw.h91, com.daaw.uh0
    /* renamed from: h */
    public void mo8216h(Object obj) {
        mo19545i0(obj);
    }

    @Override // com.daaw.h91, com.daaw.AbstractC1239f
    /* renamed from: i0 */
    public void mo19545i0(Object obj) {
        if (m23948l0()) {
            return;
        }
        C1008cu.m24976c(vg0.m7191a(this.f12204r), C2862rh.m11315a(obj, this.f12204r), null, 2, null);
    }

    /* renamed from: l0 */
    public final boolean m23948l0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f7804s.compareAndSet(this, 0, 2));
        return true;
    }
}
