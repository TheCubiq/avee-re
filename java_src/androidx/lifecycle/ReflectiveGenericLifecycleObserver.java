package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0340a;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0348d {

    /* renamed from: a */
    public final Object f1736a;

    /* renamed from: b */
    public final C0340a.C0341a f1737b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1736a = obj;
        this.f1737b = C0340a.f1743c.m29059c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        this.f1737b.m29056a(sj0Var, enumC0346b, this.f1736a);
    }
}
