package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class v36 implements h76 {

    /* renamed from: a */
    public final String f29836a;

    /* renamed from: b */
    public final boolean f29837b;

    public v36(String str, boolean z) {
        this.f29836a = str;
        this.f29837b = z;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f29836a);
        if (this.f29837b) {
            bundle.putString("de", "1");
        }
    }
}
