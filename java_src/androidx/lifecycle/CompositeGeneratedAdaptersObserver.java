package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.cq0;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0348d {

    /* renamed from: a */
    public final InterfaceC0343b[] f1710a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0343b[] interfaceC0343bArr) {
        this.f1710a = interfaceC0343bArr;
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        cq0 cq0Var = new cq0();
        for (InterfaceC0343b interfaceC0343b : this.f1710a) {
            interfaceC0343b.m29053a(sj0Var, enumC0346b, false, cq0Var);
        }
        for (InterfaceC0343b interfaceC0343b2 : this.f1710a) {
            interfaceC0343b2.m29053a(sj0Var, enumC0346b, true, cq0Var);
        }
    }
}
