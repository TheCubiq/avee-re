package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.c;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements d {
    public final Object a;
    public final a.C0019a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        this.b.a(sj0Var, bVar, this.a);
    }
}
