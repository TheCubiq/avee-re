package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class xp2 implements Iterator {
    public final Iterator p;
    public final /* synthetic */ zzau q;

    public xp2(zzau zzauVar) {
        Bundle bundle;
        this.q = zzauVar;
        bundle = zzauVar.p;
        this.p = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.p.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
