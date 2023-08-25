package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class o06 implements i76 {

    /* renamed from: a */
    public final g77 f20909a;

    /* renamed from: b */
    public final ri6 f20910b;

    /* renamed from: c */
    public final dj6 f20911c;

    public o06(g77 g77Var, ri6 ri6Var, dj6 dj6Var) {
        this.f20909a = g77Var;
        this.f20910b = ri6Var;
        this.f20911c = dj6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ p06 m14653a() {
        String str = null;
        if (((Boolean) zzba.zzc().m23658b(g93.f10408E6)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.f20910b.f25344d))) {
            str = dj6.m24342a();
        }
        return new p06(str);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 5;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f20909a.mo20112M(new Callable() { // from class: com.daaw.n06
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o06.this.m14653a();
            }
        });
    }
}
