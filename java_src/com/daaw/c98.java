package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class c98 extends pb7 {

    /* renamed from: e */
    public final int f5647e;

    /* renamed from: f */
    public final int f5648f;

    /* renamed from: g */
    public final int[] f5649g;

    /* renamed from: h */
    public final int[] f5650h;

    /* renamed from: i */
    public final l64[] f5651i;

    /* renamed from: j */
    public final Object[] f5652j;

    /* renamed from: k */
    public final HashMap f5653k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c98(Collection collection, wt8 wt8Var, byte[] bArr) {
        super(false, wt8Var, null);
        int i = 0;
        int size = collection.size();
        this.f5649g = new int[size];
        this.f5650h = new int[size];
        this.f5651i = new l64[size];
        this.f5652j = new Object[size];
        this.f5653k = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            v78 v78Var = (v78) it.next();
            this.f5651i[i3] = v78Var.zza();
            this.f5650h[i3] = i;
            this.f5649g[i3] = i2;
            i += this.f5651i[i3].mo4509c();
            i2 += this.f5651i[i3].mo4510b();
            this.f5652j[i3] = v78Var.zzb();
            this.f5653k.put(this.f5652j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f5647e = i;
        this.f5648f = i2;
    }

    @Override // com.daaw.l64
    /* renamed from: b */
    public final int mo4510b() {
        return this.f5648f;
    }

    @Override // com.daaw.l64
    /* renamed from: c */
    public final int mo4509c() {
        return this.f5647e;
    }

    @Override // com.daaw.pb7
    /* renamed from: p */
    public final int mo13466p(Object obj) {
        Integer num = (Integer) this.f5653k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.daaw.pb7
    /* renamed from: q */
    public final int mo13465q(int i) {
        return it5.m19419M(this.f5649g, i + 1, false, false);
    }

    @Override // com.daaw.pb7
    /* renamed from: r */
    public final int mo13464r(int i) {
        return it5.m19419M(this.f5650h, i + 1, false, false);
    }

    @Override // com.daaw.pb7
    /* renamed from: s */
    public final int mo13463s(int i) {
        return this.f5649g[i];
    }

    @Override // com.daaw.pb7
    /* renamed from: t */
    public final int mo13462t(int i) {
        return this.f5650h[i];
    }

    @Override // com.daaw.pb7
    /* renamed from: u */
    public final l64 mo13461u(int i) {
        return this.f5651i[i];
    }

    @Override // com.daaw.pb7
    /* renamed from: v */
    public final Object mo13460v(int i) {
        return this.f5652j[i];
    }

    /* renamed from: y */
    public final List m25480y() {
        return Arrays.asList(this.f5651i);
    }
}
