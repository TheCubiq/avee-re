package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.daaw.C0972co;
import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class ph8 implements ga3 {

    /* renamed from: a */
    public final /* synthetic */ ia3 f22948a;

    /* renamed from: b */
    public final /* synthetic */ Context f22949b;

    /* renamed from: c */
    public final /* synthetic */ Uri f22950c;

    public ph8(zzs zzsVar, ia3 ia3Var, Context context, Uri uri) {
        this.f22948a = ia3Var;
        this.f22949b = context;
        this.f22950c = uri;
    }

    @Override // com.daaw.ga3
    public final void zza() {
        C0972co m25193a = new C0972co.C0973a(this.f22948a.m20008a()).m25193a();
        m25193a.f5979a.setPackage(n08.m15611a(this.f22949b));
        m25193a.m25194a(this.f22949b, this.f22950c);
        this.f22948a.m20003f((Activity) this.f22949b);
    }
}
