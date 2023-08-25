package com.daaw;

import android.content.Context;
import com.daaw.k3;
import com.daaw.v70;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public final class pm8 extends v70<k3.d.c> implements l5 {
    public static final k3.g<hl4> m;
    public static final k3.a<hl4, k3.d.c> n;
    public static final k3<k3.d.c> o;
    public final Context k;
    public final x70 l;

    static {
        k3.g<hl4> gVar = new k3.g<>();
        m = gVar;
        uh8 uh8Var = new uh8();
        n = uh8Var;
        o = new k3<>("AppSet.API", uh8Var, gVar);
    }

    public pm8(Context context, x70 x70Var) {
        super(context, o, k3.d.a, v70.a.c);
        this.k = context;
        this.l = x70Var;
    }

    @Override // com.daaw.l5
    public final rj1<m5> a() {
        return this.l.h(this.k, 212800000) == 0 ? e(sj1.a().d(he5.a).b(new q31() { // from class: com.daaw.hf8
            @Override // com.daaw.q31
            public final void a(Object obj, Object obj2) {
                ((v07) ((hl4) obj).getService()).M(new zza(null, null), new bk8(pm8.this, (tj1) obj2));
            }
        }).c(false).e(27601).a()) : dk1.d(new l3(new Status(17)));
    }
}
