package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class p06 implements h76 {

    /* renamed from: a */
    public final String f22190a;

    public p06(String str) {
        this.f22190a = str;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f22190a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
