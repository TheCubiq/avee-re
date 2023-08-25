package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.ht1;
import com.daaw.k81;
import com.daaw.m81;
import com.daaw.mt1;
import com.daaw.nt1;
import com.daaw.sj0;
/* loaded from: classes.dex */
public class LegacySavedStateHandleController {

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C0336a implements k81.InterfaceC1920a {
        @Override // com.daaw.k81.InterfaceC1920a
        /* renamed from: a */
        public void mo17964a(m81 m81Var) {
            if (!(m81Var instanceof nt1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            mt1 mo13652g = ((nt1) m81Var).mo13652g();
            k81 mo16178i = m81Var.mo16178i();
            for (String str : mo13652g.m15776c()) {
                LegacySavedStateHandleController.m29074a(mo13652g.m15777b(str), mo16178i, m81Var.mo2327a());
            }
            if (mo13652g.m15776c().isEmpty()) {
                return;
            }
            mo16178i.m17965i(C0336a.class);
        }
    }

    /* renamed from: a */
    public static void m29074a(ht1 ht1Var, k81 k81Var, AbstractC0344c abstractC0344c) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) ht1Var.m20431c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m29062i()) {
            return;
        }
        savedStateHandleController.m29063h(k81Var, abstractC0344c);
        m29073b(k81Var, abstractC0344c);
    }

    /* renamed from: b */
    public static void m29073b(final k81 k81Var, final AbstractC0344c abstractC0344c) {
        AbstractC0344c.EnumC0347c mo29047b = abstractC0344c.mo29047b();
        if (mo29047b == AbstractC0344c.EnumC0347c.INITIALIZED || mo29047b.m29049a(AbstractC0344c.EnumC0347c.STARTED)) {
            k81Var.m17965i(C0336a.class);
        } else {
            abstractC0344c.mo29048a(new InterfaceC0348d() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0348d
                /* renamed from: a */
                public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                    if (enumC0346b == AbstractC0344c.EnumC0346b.ON_START) {
                        AbstractC0344c.this.mo29046c(this);
                        k81Var.m17965i(C0336a.class);
                    }
                }
            });
        }
    }
}
