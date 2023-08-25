package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.f81;
import com.daaw.k81;
import com.daaw.sj0;
/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0348d {

    /* renamed from: a */
    public final String f1739a;

    /* renamed from: b */
    public boolean f1740b;

    /* renamed from: c */
    public final f81 f1741c;

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        if (enumC0346b == AbstractC0344c.EnumC0346b.ON_DESTROY) {
            this.f1740b = false;
            sj0Var.mo2327a().mo29046c(this);
        }
    }

    /* renamed from: h */
    public void m29063h(k81 k81Var, AbstractC0344c abstractC0344c) {
        if (this.f1740b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1740b = true;
        abstractC0344c.mo29048a(this);
        k81Var.m17966h(this.f1739a, this.f1741c.m22851c());
    }

    /* renamed from: i */
    public boolean m29062i() {
        return this.f1740b;
    }
}
