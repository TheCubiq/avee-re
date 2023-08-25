package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.ht1;
import com.daaw.k81;
import com.daaw.m81;
import com.daaw.mt1;
import com.daaw.nt1;
import com.daaw.sj0;
/* loaded from: classes.dex */
public class LegacySavedStateHandleController {

    /* loaded from: classes.dex */
    public static final class a implements k81.a {
        @Override // com.daaw.k81.a
        public void a(m81 m81Var) {
            if (!(m81Var instanceof nt1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            mt1 g = ((nt1) m81Var).g();
            k81 i = m81Var.i();
            for (String str : g.c()) {
                LegacySavedStateHandleController.a(g.b(str), i, m81Var.a());
            }
            if (g.c().isEmpty()) {
                return;
            }
            i.i(a.class);
        }
    }

    public static void a(ht1 ht1Var, k81 k81Var, c cVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) ht1Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.i()) {
            return;
        }
        savedStateHandleController.h(k81Var, cVar);
        b(k81Var, cVar);
    }

    public static void b(final k81 k81Var, final c cVar) {
        c.EnumC0020c b = cVar.b();
        if (b == c.EnumC0020c.INITIALIZED || b.a(c.EnumC0020c.STARTED)) {
            k81Var.i(a.class);
        } else {
            cVar.a(new d() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.d
                public void a(sj0 sj0Var, c.b bVar) {
                    if (bVar == c.b.ON_START) {
                        c.this.c(this);
                        k81Var.i(a.class);
                    }
                }
            });
        }
    }
}
