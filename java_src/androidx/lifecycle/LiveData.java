package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.C2825r5;
import com.daaw.qt0;
import com.daaw.sj0;
import com.daaw.v71;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f1717k = new Object();

    /* renamed from: a */
    public final Object f1718a = new Object();

    /* renamed from: b */
    public v71<qt0<? super T>, LiveData<T>.AbstractC0339c> f1719b = new v71<>();

    /* renamed from: c */
    public int f1720c = 0;

    /* renamed from: d */
    public boolean f1721d;

    /* renamed from: e */
    public volatile Object f1722e;

    /* renamed from: f */
    public volatile Object f1723f;

    /* renamed from: g */
    public int f1724g;

    /* renamed from: h */
    public boolean f1725h;

    /* renamed from: i */
    public boolean f1726i;

    /* renamed from: j */
    public final Runnable f1727j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0339c implements InterfaceC0348d {

        /* renamed from: e */
        public final sj0 f1728e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f1729f;

        @Override // androidx.lifecycle.InterfaceC0348d
        /* renamed from: a */
        public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
            AbstractC0344c.EnumC0347c mo29047b = this.f1728e.mo2327a().mo29047b();
            if (mo29047b == AbstractC0344c.EnumC0347c.DESTROYED) {
                this.f1729f.mo15134i(this.f1732a);
                return;
            }
            AbstractC0344c.EnumC0347c enumC0347c = null;
            while (enumC0347c != mo29047b) {
                m29067h(mo29065j());
                enumC0347c = mo29047b;
                mo29047b = this.f1728e.mo2327a().mo29047b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0339c
        /* renamed from: i */
        public void mo29066i() {
            this.f1728e.mo2327a().mo29046c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0339c
        /* renamed from: j */
        public boolean mo29065j() {
            return this.f1728e.mo2327a().mo29047b().m29049a(AbstractC0344c.EnumC0347c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public class RunnableC0337a implements Runnable {
        public RunnableC0337a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1718a) {
                obj = LiveData.this.f1723f;
                LiveData.this.f1723f = LiveData.f1717k;
            }
            LiveData.this.mo15133j(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public class C0338b extends LiveData<T>.AbstractC0339c {
        public C0338b(qt0<? super T> qt0Var) {
            super(qt0Var);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0339c
        /* renamed from: j */
        public boolean mo29065j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC0339c {

        /* renamed from: a */
        public final qt0<? super T> f1732a;

        /* renamed from: b */
        public boolean f1733b;

        /* renamed from: c */
        public int f1734c = -1;

        public AbstractC0339c(qt0<? super T> qt0Var) {
            this.f1732a = qt0Var;
        }

        /* renamed from: h */
        public void m29067h(boolean z) {
            if (z == this.f1733b) {
                return;
            }
            this.f1733b = z;
            LiveData.this.m29071b(z ? 1 : -1);
            if (this.f1733b) {
                LiveData.this.m29069d(this);
            }
        }

        /* renamed from: i */
        public void mo29066i() {
        }

        /* renamed from: j */
        public abstract boolean mo29065j();
    }

    public LiveData() {
        Object obj = f1717k;
        this.f1723f = obj;
        this.f1727j = new RunnableC0337a();
        this.f1722e = obj;
        this.f1724g = -1;
    }

    /* renamed from: a */
    public static void m29072a(String str) {
        if (C2825r5.m11733e().mo1976b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: b */
    public void m29071b(int i) {
        int i2 = this.f1720c;
        this.f1720c = i + i2;
        if (this.f1721d) {
            return;
        }
        this.f1721d = true;
        while (true) {
            try {
                int i3 = this.f1720c;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo15136f();
                } else if (z2) {
                    mo15135g();
                }
                i2 = i3;
            } finally {
                this.f1721d = false;
            }
        }
    }

    /* renamed from: c */
    public final void m29070c(LiveData<T>.AbstractC0339c abstractC0339c) {
        if (abstractC0339c.f1733b) {
            if (!abstractC0339c.mo29065j()) {
                abstractC0339c.m29067h(false);
                return;
            }
            int i = abstractC0339c.f1734c;
            int i2 = this.f1724g;
            if (i >= i2) {
                return;
            }
            abstractC0339c.f1734c = i2;
            abstractC0339c.f1732a.mo12225a((Object) this.f1722e);
        }
    }

    /* renamed from: d */
    public void m29069d(LiveData<T>.AbstractC0339c abstractC0339c) {
        if (this.f1725h) {
            this.f1726i = true;
            return;
        }
        this.f1725h = true;
        do {
            this.f1726i = false;
            if (abstractC0339c == null) {
                v71<qt0<? super T>, LiveData<T>.AbstractC0339c>.C3311d m7373f = this.f1719b.m7373f();
                while (m7373f.hasNext()) {
                    m29070c((AbstractC0339c) m7373f.next().getValue());
                    if (this.f1726i) {
                        break;
                    }
                }
            } else {
                m29070c(abstractC0339c);
                abstractC0339c = null;
            }
        } while (this.f1726i);
        this.f1725h = false;
    }

    /* renamed from: e */
    public void m29068e(qt0<? super T> qt0Var) {
        m29072a("observeForever");
        C0338b c0338b = new C0338b(qt0Var);
        LiveData<T>.AbstractC0339c mo7370k = this.f1719b.mo7370k(qt0Var, c0338b);
        if (mo7370k instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo7370k != null) {
            return;
        }
        c0338b.m29067h(true);
    }

    /* renamed from: f */
    public void mo15136f() {
    }

    /* renamed from: g */
    public void mo15135g() {
    }

    /* renamed from: h */
    public void mo17480h(T t) {
        boolean z;
        synchronized (this.f1718a) {
            z = this.f1723f == f1717k;
            this.f1723f = t;
        }
        if (z) {
            C2825r5.m11733e().mo1975c(this.f1727j);
        }
    }

    /* renamed from: i */
    public void mo15134i(qt0<? super T> qt0Var) {
        m29072a("removeObserver");
        LiveData<T>.AbstractC0339c mo7369m = this.f1719b.mo7369m(qt0Var);
        if (mo7369m == null) {
            return;
        }
        mo7369m.mo29066i();
        mo7369m.m29067h(false);
    }

    /* renamed from: j */
    public void mo15133j(T t) {
        m29072a("setValue");
        this.f1724g++;
        this.f1722e = t;
        m29069d(null);
    }
}
