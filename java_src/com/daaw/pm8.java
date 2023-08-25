package com.daaw;

import android.content.Context;
import com.daaw.C1897k3;
import com.daaw.v70;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public final class pm8 extends v70<C1897k3.InterfaceC1901d.C1904c> implements InterfaceC2013l5 {

    /* renamed from: m */
    public static final C1897k3.C1907g<hl4> f23061m;

    /* renamed from: n */
    public static final C1897k3.AbstractC1898a<hl4, C1897k3.InterfaceC1901d.C1904c> f23062n;

    /* renamed from: o */
    public static final C1897k3<C1897k3.InterfaceC1901d.C1904c> f23063o;

    /* renamed from: k */
    public final Context f23064k;

    /* renamed from: l */
    public final x70 f23065l;

    static {
        C1897k3.C1907g<hl4> c1907g = new C1897k3.C1907g<>();
        f23061m = c1907g;
        uh8 uh8Var = new uh8();
        f23062n = uh8Var;
        f23063o = new C1897k3<>("AppSet.API", uh8Var, c1907g);
    }

    public pm8(Context context, x70 x70Var) {
        super(context, f23063o, C1897k3.InterfaceC1901d.f15632a, v70.C3306a.f29971c);
        this.f23064k = context;
        this.f23065l = x70Var;
    }

    @Override // com.daaw.InterfaceC2013l5
    /* renamed from: a */
    public final rj1<C2151m5> mo3453a() {
        return this.f23065l.mo5490h(this.f23064k, 212800000) == 0 ? m7383e(sj1.m10304a().m10296d(he5.f12476a).m10298b(new q31() { // from class: com.daaw.hf8
            @Override // com.daaw.q31
            /* renamed from: a */
            public final void mo12791a(Object obj, Object obj2) {
                ((v07) ((hl4) obj).getService()).m7558M(new zza(null, null), new bk8(pm8.this, (tj1) obj2));
            }
        }).m10297c(false).m10295e(27601).m10299a()) : dk1.m24305d(new C2009l3(new Status(17)));
    }
}
