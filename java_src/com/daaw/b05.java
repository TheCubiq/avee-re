package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class b05 implements wz7 {

    /* renamed from: a */
    public final sz4 f4213a;

    /* renamed from: b */
    public final m08 f4214b;

    /* renamed from: c */
    public final m08 f4215c;

    /* renamed from: d */
    public final m08 f4216d;

    /* renamed from: e */
    public final m08 f4217e;

    public b05(sz4 sz4Var, m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f4213a = sz4Var;
        this.f4214b = m08Var;
        this.f4215c = m08Var2;
        this.f4216d = m08Var3;
        this.f4217e = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f4214b.zzb();
        final zzchu m8405a = ((u94) this.f4215c).m8405a();
        final th6 m10155a = ((sm4) this.f4216d).m10155a();
        final ri6 m25128a = ((cq4) this.f4217e).m25128a();
        return new ly4(new fs4() { // from class: com.daaw.rz4
            @Override // com.daaw.fs4
            public final void zzn() {
                zzt.zzs().zzn(context, m8405a.f36993p, m10155a.f27657D.toString(), m25128a.f25346f);
            }
        }, z04.f34310f);
    }
}
