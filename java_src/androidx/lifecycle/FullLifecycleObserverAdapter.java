package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.o40;
import com.daaw.sj0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC0348d {

    /* renamed from: a */
    public final o40 f1711a;

    /* renamed from: b */
    public final InterfaceC0348d f1712b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0334a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1713a;

        static {
            int[] iArr = new int[AbstractC0344c.EnumC0346b.values().length];
            f1713a = iArr;
            try {
                iArr[AbstractC0344c.EnumC0346b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1713a[AbstractC0344c.EnumC0346b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(o40 o40Var, InterfaceC0348d interfaceC0348d) {
        this.f1711a = o40Var;
        this.f1712b = interfaceC0348d;
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        switch (C0334a.f1713a[enumC0346b.ordinal()]) {
            case 1:
                this.f1711a.mo14571d(sj0Var);
                break;
            case 2:
                this.f1711a.mo14573b(sj0Var);
                break;
            case 3:
                this.f1711a.mo14570e(sj0Var);
                break;
            case 4:
                this.f1711a.mo14569f(sj0Var);
                break;
            case 5:
                this.f1711a.mo14572c(sj0Var);
                break;
            case 6:
                this.f1711a.mo14568g(sj0Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0348d interfaceC0348d = this.f1712b;
        if (interfaceC0348d != null) {
            interfaceC0348d.mo18735a(sj0Var, enumC0346b);
        }
    }
}
