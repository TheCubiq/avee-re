package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d06 implements h76 {

    /* renamed from: a */
    public final boolean f6350a;

    public d06(boolean z) {
        this.f6350a = z;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f6350a ? "0" : "1");
    }
}
