package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.daaw.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C1773j {
    /* renamed from: a */
    public static /* synthetic */ boolean m19216a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
