package com.daaw;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
/* loaded from: classes.dex */
public class c40 implements w80, m81, nt1 {

    /* renamed from: p */
    public final Fragment f5456p;

    /* renamed from: q */
    public final mt1 f5457q;

    /* renamed from: r */
    public C0349e f5458r = null;

    /* renamed from: s */
    public l81 f5459s = null;

    public c40(Fragment fragment, mt1 mt1Var) {
        this.f5456p = fragment;
        this.f5457q = mt1Var;
    }

    @Override // com.daaw.sj0
    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        m25637e();
        return this.f5458r;
    }

    /* renamed from: b */
    public void m25638b(AbstractC0344c.EnumC0346b enumC0346b) {
        this.f5458r.m29041h(enumC0346b);
    }

    @Override // com.daaw.w80
    /* renamed from: d */
    public /* synthetic */ AbstractC1589hn mo6345d() {
        return v80.m7348a(this);
    }

    /* renamed from: e */
    public void m25637e() {
        if (this.f5458r == null) {
            this.f5458r = new C0349e(this);
            this.f5459s = l81.m17107a(this);
        }
    }

    /* renamed from: f */
    public boolean m25636f() {
        return this.f5458r != null;
    }

    @Override // com.daaw.nt1
    /* renamed from: g */
    public mt1 mo13652g() {
        m25637e();
        return this.f5457q;
    }

    /* renamed from: h */
    public void m25635h(Bundle bundle) {
        this.f5459s.m17104d(bundle);
    }

    @Override // com.daaw.m81
    /* renamed from: i */
    public k81 mo16178i() {
        m25637e();
        return this.f5459s.m17106b();
    }

    /* renamed from: j */
    public void m25634j(Bundle bundle) {
        this.f5459s.m17103e(bundle);
    }

    /* renamed from: k */
    public void m25633k(AbstractC0344c.EnumC0347c enumC0347c) {
        this.f5458r.m29034o(enumC0347c);
    }
}
