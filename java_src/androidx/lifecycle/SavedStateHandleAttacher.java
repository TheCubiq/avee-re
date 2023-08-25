package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.h81;
import com.daaw.sj0;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0348d {

    /* renamed from: a */
    public final h81 f1738a;

    public SavedStateHandleAttacher(h81 h81Var) {
        ug0.m8268f(h81Var, "provider");
        this.f1738a = h81Var;
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        ug0.m8268f(sj0Var, "source");
        ug0.m8268f(enumC0346b, "event");
        if (enumC0346b == AbstractC0344c.EnumC0346b.ON_CREATE) {
            sj0Var.mo2327a().mo29046c(this);
            this.f1738a.m20947c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0346b).toString());
    }
}
