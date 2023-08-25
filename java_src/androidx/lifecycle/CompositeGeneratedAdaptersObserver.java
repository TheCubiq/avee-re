package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.cq0;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements d {
    public final b[] a;

    public CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.a = bVarArr;
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        cq0 cq0Var = new cq0();
        for (b bVar2 : this.a) {
            bVar2.a(sj0Var, bVar, false, cq0Var);
        }
        for (b bVar3 : this.a) {
            bVar3.a(sj0Var, bVar, true, cq0Var);
        }
    }
}
