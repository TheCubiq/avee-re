package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class c98 extends pb7 {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final l64[] i;
    public final Object[] j;
    public final HashMap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c98(Collection collection, wt8 wt8Var, byte[] bArr) {
        super(false, wt8Var, null);
        int i = 0;
        int size = collection.size();
        this.g = new int[size];
        this.h = new int[size];
        this.i = new l64[size];
        this.j = new Object[size];
        this.k = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            v78 v78Var = (v78) it.next();
            this.i[i3] = v78Var.zza();
            this.h[i3] = i;
            this.g[i3] = i2;
            i += this.i[i3].c();
            i2 += this.i[i3].b();
            this.j[i3] = v78Var.zzb();
            this.k.put(this.j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.e = i;
        this.f = i2;
    }

    @Override // com.daaw.l64
    public final int b() {
        return this.f;
    }

    @Override // com.daaw.l64
    public final int c() {
        return this.e;
    }

    @Override // com.daaw.pb7
    public final int p(Object obj) {
        Integer num = (Integer) this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.daaw.pb7
    public final int q(int i) {
        return it5.M(this.g, i + 1, false, false);
    }

    @Override // com.daaw.pb7
    public final int r(int i) {
        return it5.M(this.h, i + 1, false, false);
    }

    @Override // com.daaw.pb7
    public final int s(int i) {
        return this.g[i];
    }

    @Override // com.daaw.pb7
    public final int t(int i) {
        return this.h[i];
    }

    @Override // com.daaw.pb7
    public final l64 u(int i) {
        return this.i[i];
    }

    @Override // com.daaw.pb7
    public final Object v(int i) {
        return this.j[i];
    }

    public final List y() {
        return Arrays.asList(this.i);
    }
}
