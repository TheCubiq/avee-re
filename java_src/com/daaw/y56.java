package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class y56 implements h76 {
    public final String a;
    public final String b;

    public y56(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) zzba.zzc().b(g93.r6)).booleanValue() ? this.b : this.a);
    }
}
