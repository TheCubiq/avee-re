package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r66 implements h76 {

    /* renamed from: a */
    public final String f24895a;

    /* renamed from: b */
    public final String f24896b;

    /* renamed from: c */
    public final String f24897c;

    /* renamed from: d */
    public final String f24898d;

    /* renamed from: e */
    public final Long f24899e;

    public r66(String str, String str2, String str3, String str4, Long l) {
        this.f24895a = str;
        this.f24896b = str2;
        this.f24897c = str3;
        this.f24898d = str4;
        this.f24899e = l;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        cj6.m25316c(bundle, "gmp_app_id", this.f24895a);
        cj6.m25316c(bundle, "fbs_aiid", this.f24896b);
        cj6.m25316c(bundle, "fbs_aeid", this.f24897c);
        cj6.m25316c(bundle, "apm_id_origin", this.f24898d);
        Long l = this.f24899e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
