package androidx.lifecycle;

import androidx.lifecycle.c;
import com.daaw.qt0;
import com.daaw.r5;
import com.daaw.sj0;
import com.daaw.v71;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();
    public final Object a = new Object();
    public v71<qt0<? super T>, LiveData<T>.c> b = new v71<>();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements d {
        public final sj0 e;
        public final /* synthetic */ LiveData f;

        @Override // androidx.lifecycle.d
        public void a(sj0 sj0Var, c.b bVar) {
            c.EnumC0020c b = this.e.a().b();
            if (b == c.EnumC0020c.DESTROYED) {
                this.f.i(this.a);
                return;
            }
            c.EnumC0020c enumC0020c = null;
            while (enumC0020c != b) {
                h(j());
                enumC0020c = b;
                b = this.e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            this.e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j() {
            return this.e.a().b().a(c.EnumC0020c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.j(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(qt0<? super T> qt0Var) {
            super(qt0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {
        public final qt0<? super T> a;
        public boolean b;
        public int c = -1;

        public c(qt0<? super T> qt0Var) {
            this.a = qt0Var;
        }

        public void h(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData.this.b(z ? 1 : -1);
            if (this.b) {
                LiveData.this.d(this);
            }
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (r5.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    f();
                } else if (z2) {
                    g();
                }
                i2 = i3;
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (cVar.b) {
            if (!cVar.j()) {
                cVar.h(false);
                return;
            }
            int i = cVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.c = i2;
            cVar.a.a((Object) this.e);
        }
    }

    public void d(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar == null) {
                v71<qt0<? super T>, LiveData<T>.c>.d f = this.b.f();
                while (f.hasNext()) {
                    c((c) f.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.i);
        this.h = false;
    }

    public void e(qt0<? super T> qt0Var) {
        a("observeForever");
        b bVar = new b(qt0Var);
        LiveData<T>.c k2 = this.b.k(qt0Var, bVar);
        if (k2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (k2 != null) {
            return;
        }
        bVar.h(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            r5.e().c(this.j);
        }
    }

    public void i(qt0<? super T> qt0Var) {
        a("removeObserver");
        LiveData<T>.c m = this.b.m(qt0Var);
        if (m == null) {
            return;
        }
        m.i();
        m.h(false);
    }

    public void j(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        d(null);
    }
}
