package com.daaw;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class f74 implements o67 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ h74 d;

    public f74(h74 h74Var, List list, String str, Uri uri) {
        this.d = h74Var;
        this.a = list;
        this.b = str;
        this.c = uri;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.d.s((Map) obj, this.a, this.b);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        k04.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.c)));
    }
}
