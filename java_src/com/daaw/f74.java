package com.daaw;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class f74 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ List f9212a;

    /* renamed from: b */
    public final /* synthetic */ String f9213b;

    /* renamed from: c */
    public final /* synthetic */ Uri f9214c;

    /* renamed from: d */
    public final /* synthetic */ h74 f9215d;

    public f74(h74 h74Var, List list, String str, Uri uri) {
        this.f9215d = h74Var;
        this.f9212a = list;
        this.f9213b = str;
        this.f9214c = uri;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        this.f9215d.m20952s((Map) obj, this.f9212a, this.f9213b);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        k04.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.f9214c)));
    }
}
