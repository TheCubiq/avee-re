package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements d {
    public final b a;

    public SingleGeneratedAdapterObserver(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        this.a.a(sj0Var, bVar, false, null);
        this.a.a(sj0Var, bVar, true, null);
    }
}
