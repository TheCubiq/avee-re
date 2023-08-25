package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.daaw.co;
import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class ph8 implements ga3 {
    public final /* synthetic */ ia3 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    public ph8(zzs zzsVar, ia3 ia3Var, Context context, Uri uri) {
        this.a = ia3Var;
        this.b = context;
        this.c = uri;
    }

    @Override // com.daaw.ga3
    public final void zza() {
        co a = new co.a(this.a.a()).a();
        a.a.setPackage(n08.a(this.b));
        a.a(this.b, this.c);
        this.a.f((Activity) this.b);
    }
}
