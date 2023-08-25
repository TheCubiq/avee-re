package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.h81;
import com.daaw.sj0;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements d {
    public final h81 a;

    public SavedStateHandleAttacher(h81 h81Var) {
        ug0.f(h81Var, "provider");
        this.a = h81Var;
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        ug0.f(sj0Var, "source");
        ug0.f(bVar, "event");
        if (bVar == c.b.ON_CREATE) {
            sj0Var.a().c(this);
            this.a.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
