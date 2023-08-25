package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.f81;
import com.daaw.k81;
import com.daaw.sj0;
/* loaded from: classes.dex */
final class SavedStateHandleController implements d {
    public final String a;
    public boolean b;
    public final f81 c;

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        if (bVar == c.b.ON_DESTROY) {
            this.b = false;
            sj0Var.a().c(this);
        }
    }

    public void h(k81 k81Var, c cVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        cVar.a(this);
        k81Var.h(this.a, this.c.c());
    }

    public boolean i() {
        return this.b;
    }
}
