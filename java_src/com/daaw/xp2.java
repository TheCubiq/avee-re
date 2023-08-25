package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class xp2 implements Iterator {

    /* renamed from: p */
    public final Iterator f32862p;

    /* renamed from: q */
    public final /* synthetic */ zzau f32863q;

    public xp2(zzau zzauVar) {
        Bundle bundle;
        this.f32863q = zzauVar;
        bundle = zzauVar.f37067p;
        this.f32862p = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f32862p.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32862p.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
