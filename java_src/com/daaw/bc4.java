package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;
/* loaded from: classes.dex */
public final class bc4 implements td6 {

    /* renamed from: a */
    public final bb4 f4696a;

    /* renamed from: b */
    public Context f4697b;

    /* renamed from: c */
    public String f4698c;

    /* renamed from: d */
    public zzq f4699d;

    public /* synthetic */ bc4(bb4 bb4Var, ac4 ac4Var) {
        this.f4696a = bb4Var;
    }

    @Override // com.daaw.td6
    /* renamed from: a */
    public final /* synthetic */ td6 mo9272a(zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.f4699d = zzqVar;
        return this;
    }

    @Override // com.daaw.td6
    /* renamed from: b */
    public final /* synthetic */ td6 mo9271b(Context context) {
        Objects.requireNonNull(context);
        this.f4697b = context;
        return this;
    }

    @Override // com.daaw.td6
    public final /* synthetic */ td6 zzb(String str) {
        Objects.requireNonNull(str);
        this.f4698c = str;
        return this;
    }

    @Override // com.daaw.td6
    public final ud6 zzd() {
        e08.m23800c(this.f4697b, Context.class);
        e08.m23800c(this.f4698c, String.class);
        e08.m23800c(this.f4699d, zzq.class);
        return new dc4(this.f4696a, this.f4697b, this.f4698c, this.f4699d, null);
    }
}
