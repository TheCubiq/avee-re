package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class y56 implements h76 {

    /* renamed from: a */
    public final String f33380a;

    /* renamed from: b */
    public final String f33381b;

    public y56(String str, String str2) {
        this.f33380a = str;
        this.f33381b = str2;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) zzba.zzc().m23658b(g93.f10815r6)).booleanValue() ? this.f33381b : this.f33380a);
    }
}
