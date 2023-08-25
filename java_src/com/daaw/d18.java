package com.daaw;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d18 {

    /* renamed from: a */
    public final Context f6371a;

    /* renamed from: b */
    public xp4 f6372b;

    /* renamed from: c */
    public iz6 f6373c;

    /* renamed from: d */
    public iz6 f6374d;

    /* renamed from: e */
    public iz6 f6375e;

    /* renamed from: f */
    public iz6 f6376f;

    /* renamed from: g */
    public iz6 f6377g;

    /* renamed from: h */
    public ey6 f6378h;

    /* renamed from: i */
    public Looper f6379i;

    /* renamed from: j */
    public o98 f6380j;

    /* renamed from: k */
    public int f6381k;

    /* renamed from: l */
    public boolean f6382l;

    /* renamed from: m */
    public aa8 f6383m;

    /* renamed from: n */
    public long f6384n;

    /* renamed from: o */
    public long f6385o;

    /* renamed from: p */
    public boolean f6386p;

    /* renamed from: q */
    public boolean f6387q;

    /* renamed from: r */
    public zo7 f6388r;

    public d18(final Context context, g64 g64Var, byte[] bArr) {
        gz7 gz7Var = new gz7(g64Var, null);
        j08 j08Var = new j08(context);
        iz6 iz6Var = new iz6() { // from class: com.daaw.r08
            @Override // com.daaw.iz6
            public final Object zza() {
                return new rv8(context);
            }
        };
        u08 u08Var = new iz6() { // from class: com.daaw.u08
            @Override // com.daaw.iz6
            public final Object zza() {
                return new cq7();
            }
        };
        x08 x08Var = new x08(context);
        a18 a18Var = new ey6() { // from class: com.daaw.a18
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new tg8((xp4) obj);
            }
        };
        Objects.requireNonNull(context);
        this.f6371a = context;
        this.f6373c = gz7Var;
        this.f6374d = j08Var;
        this.f6375e = iz6Var;
        this.f6376f = u08Var;
        this.f6377g = x08Var;
        this.f6378h = a18Var;
        this.f6379i = it5.m19397e();
        this.f6380j = o98.f21185c;
        this.f6381k = 1;
        this.f6382l = true;
        this.f6383m = aa8.f3027g;
        this.f6388r = new zo7(0.97f, 1.03f, 1000L, 1.0E-7f, it5.m19394f0(20L), it5.m19394f0(500L), 0.999f, null);
        this.f6372b = xp4.f32865a;
        this.f6384n = 500L;
        this.f6385o = 2000L;
        this.f6386p = true;
    }

    /* renamed from: a */
    public static /* synthetic */ or8 m24797a(Context context) {
        return new wq8(context, new e09());
    }
}
