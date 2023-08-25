package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0344c;
import com.daaw.sj0;
/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public class C0361j {

    /* renamed from: a */
    public final C0349e f1783a;

    /* renamed from: b */
    public final Handler f1784b = new Handler();

    /* renamed from: c */
    public RunnableC0362a f1785c;

    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: classes.dex */
    public static class RunnableC0362a implements Runnable {

        /* renamed from: p */
        public final C0349e f1786p;

        /* renamed from: q */
        public final AbstractC0344c.EnumC0346b f1787q;

        /* renamed from: r */
        public boolean f1788r = false;

        public RunnableC0362a(C0349e c0349e, AbstractC0344c.EnumC0346b enumC0346b) {
            this.f1786p = c0349e;
            this.f1787q = enumC0346b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1788r) {
                return;
            }
            this.f1786p.m29041h(this.f1787q);
            this.f1788r = true;
        }
    }

    public C0361j(sj0 sj0Var) {
        this.f1783a = new C0349e(sj0Var);
    }

    /* renamed from: a */
    public AbstractC0344c m29005a() {
        return this.f1783a;
    }

    /* renamed from: b */
    public void m29004b() {
        m29000f(AbstractC0344c.EnumC0346b.ON_START);
    }

    /* renamed from: c */
    public void m29003c() {
        m29000f(AbstractC0344c.EnumC0346b.ON_CREATE);
    }

    /* renamed from: d */
    public void m29002d() {
        m29000f(AbstractC0344c.EnumC0346b.ON_STOP);
        m29000f(AbstractC0344c.EnumC0346b.ON_DESTROY);
    }

    /* renamed from: e */
    public void m29001e() {
        m29000f(AbstractC0344c.EnumC0346b.ON_START);
    }

    /* renamed from: f */
    public final void m29000f(AbstractC0344c.EnumC0346b enumC0346b) {
        RunnableC0362a runnableC0362a = this.f1785c;
        if (runnableC0362a != null) {
            runnableC0362a.run();
        }
        RunnableC0362a runnableC0362a2 = new RunnableC0362a(this.f1783a, enumC0346b);
        this.f1785c = runnableC0362a2;
        this.f1784b.postAtFrontOfQueue(runnableC0362a2);
    }
}
