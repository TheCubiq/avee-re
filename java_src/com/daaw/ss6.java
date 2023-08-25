package com.daaw;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes.dex */
public final class ss6 {

    /* renamed from: a */
    public final Context f26607a;

    /* renamed from: b */
    public final Looper f26608b;

    public ss6(Context context, Looper looper) {
        this.f26607a = context;
        this.f26608b = looper;
    }

    /* renamed from: a */
    public final void m9920a(String str) {
        gt6 m16566L = lt6.m16566L();
        m16566L.m21234s(this.f26607a.getPackageName());
        m16566L.m21232u(2);
        dt6 m23188L = et6.m23188L();
        m23188L.m23951s(str);
        m23188L.m23950t(2);
        m16566L.m21233t(m23188L);
        new ts6(this.f26607a, this.f26608b, (lt6) m16566L.m22315n()).m8840a();
    }
}
