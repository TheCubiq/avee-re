package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class z16 implements h76 {

    /* renamed from: a */
    public final String f34337a;

    /* renamed from: b */
    public final int f34338b;

    public z16(String str, int i) {
        this.f34337a = str;
        this.f34338b = i;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f34337a) || this.f34338b == -1) {
            return;
        }
        Bundle m25318a = cj6.m25318a(bundle, "pii");
        bundle.putBundle("pii", m25318a);
        m25318a.putString("pvid", this.f34337a);
        m25318a.putInt("pvid_s", this.f34338b);
    }
}
