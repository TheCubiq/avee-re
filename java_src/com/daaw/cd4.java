package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;
/* loaded from: classes.dex */
public final class cd4 implements sf6 {
    public final bb4 a;
    public Context b;
    public String c;
    public zzq d;

    public /* synthetic */ cd4(bb4 bb4Var, yc4 yc4Var) {
        this.a = bb4Var;
    }

    @Override // com.daaw.sf6
    public final /* synthetic */ sf6 a(zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.d = zzqVar;
        return this;
    }

    @Override // com.daaw.sf6
    public final /* synthetic */ sf6 b(Context context) {
        Objects.requireNonNull(context);
        this.b = context;
        return this;
    }

    @Override // com.daaw.sf6
    public final /* synthetic */ sf6 zzb(String str) {
        Objects.requireNonNull(str);
        this.c = str;
        return this;
    }

    @Override // com.daaw.sf6
    public final tf6 zzd() {
        e08.c(this.b, Context.class);
        e08.c(this.c, String.class);
        e08.c(this.d, zzq.class);
        return new ed4(this.a, this.b, this.c, this.d, null);
    }
}
