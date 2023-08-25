package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;
/* loaded from: classes.dex */
public final class cd4 implements sf6 {

    /* renamed from: a */
    public final bb4 f5742a;

    /* renamed from: b */
    public Context f5743b;

    /* renamed from: c */
    public String f5744c;

    /* renamed from: d */
    public zzq f5745d;

    public /* synthetic */ cd4(bb4 bb4Var, yc4 yc4Var) {
        this.f5742a = bb4Var;
    }

    @Override // com.daaw.sf6
    /* renamed from: a */
    public final /* synthetic */ sf6 mo10385a(zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.f5745d = zzqVar;
        return this;
    }

    @Override // com.daaw.sf6
    /* renamed from: b */
    public final /* synthetic */ sf6 mo10384b(Context context) {
        Objects.requireNonNull(context);
        this.f5743b = context;
        return this;
    }

    @Override // com.daaw.sf6
    public final /* synthetic */ sf6 zzb(String str) {
        Objects.requireNonNull(str);
        this.f5744c = str;
        return this;
    }

    @Override // com.daaw.sf6
    public final tf6 zzd() {
        e08.m23800c(this.f5743b, Context.class);
        e08.m23800c(this.f5744c, String.class);
        e08.m23800c(this.f5745d, zzq.class);
        return new ed4(this.f5742a, this.f5743b, this.f5744c, this.f5745d, null);
    }
}
