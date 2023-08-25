package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r66 implements h76 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public r66(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        cj6.c(bundle, "gmp_app_id", this.a);
        cj6.c(bundle, "fbs_aiid", this.b);
        cj6.c(bundle, "fbs_aeid", this.c);
        cj6.c(bundle, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
