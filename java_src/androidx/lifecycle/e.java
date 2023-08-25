package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.c;
import com.daaw.m00;
import com.daaw.r5;
import com.daaw.rj0;
import com.daaw.sj0;
import com.daaw.v71;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class e extends c {
    public m00<rj0, a> b;
    public c.EnumC0020c c;
    public final WeakReference<sj0> d;
    public int e;
    public boolean f;
    public boolean g;
    public ArrayList<c.EnumC0020c> h;
    public final boolean i;

    /* loaded from: classes.dex */
    public static class a {
        public c.EnumC0020c a;
        public d b;

        public a(rj0 rj0Var, c.EnumC0020c enumC0020c) {
            this.b = f.f(rj0Var);
            this.a = enumC0020c;
        }

        public void a(sj0 sj0Var, c.b bVar) {
            c.EnumC0020c b = bVar.b();
            this.a = e.k(this.a, b);
            this.b.a(sj0Var, bVar);
            this.a = b;
        }
    }

    public e(sj0 sj0Var) {
        this(sj0Var, true);
    }

    public e(sj0 sj0Var, boolean z) {
        this.b = new m00<>();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList<>();
        this.d = new WeakReference<>(sj0Var);
        this.c = c.EnumC0020c.INITIALIZED;
        this.i = z;
    }

    public static c.EnumC0020c k(c.EnumC0020c enumC0020c, c.EnumC0020c enumC0020c2) {
        return (enumC0020c2 == null || enumC0020c2.compareTo(enumC0020c) >= 0) ? enumC0020c : enumC0020c2;
    }

    @Override // androidx.lifecycle.c
    public void a(rj0 rj0Var) {
        sj0 sj0Var;
        f("addObserver");
        c.EnumC0020c enumC0020c = this.c;
        c.EnumC0020c enumC0020c2 = c.EnumC0020c.DESTROYED;
        if (enumC0020c != enumC0020c2) {
            enumC0020c2 = c.EnumC0020c.INITIALIZED;
        }
        a aVar = new a(rj0Var, enumC0020c2);
        if (this.b.k(rj0Var, aVar) == null && (sj0Var = this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            c.EnumC0020c e = e(rj0Var);
            this.e++;
            while (aVar.a.compareTo(e) < 0 && this.b.contains(rj0Var)) {
                n(aVar.a);
                c.b c = c.b.c(aVar.a);
                if (c == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(sj0Var, c);
                m();
                e = e(rj0Var);
            }
            if (!z) {
                p();
            }
            this.e--;
        }
    }

    @Override // androidx.lifecycle.c
    public c.EnumC0020c b() {
        return this.c;
    }

    @Override // androidx.lifecycle.c
    public void c(rj0 rj0Var) {
        f("removeObserver");
        this.b.m(rj0Var);
    }

    public final void d(sj0 sj0Var) {
        Iterator<Map.Entry<rj0, a>> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext() && !this.g) {
            Map.Entry<rj0, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.a.compareTo(this.c) > 0 && !this.g && this.b.contains(next.getKey())) {
                c.b a2 = c.b.a(value.a);
                if (a2 == null) {
                    throw new IllegalStateException("no event down from " + value.a);
                }
                n(a2.b());
                value.a(sj0Var, a2);
                m();
            }
        }
    }

    public final c.EnumC0020c e(rj0 rj0Var) {
        Map.Entry<rj0, a> n = this.b.n(rj0Var);
        c.EnumC0020c enumC0020c = null;
        c.EnumC0020c enumC0020c2 = n != null ? n.getValue().a : null;
        if (!this.h.isEmpty()) {
            ArrayList<c.EnumC0020c> arrayList = this.h;
            enumC0020c = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.c, enumC0020c2), enumC0020c);
    }

    @SuppressLint({"RestrictedApi"})
    public final void f(String str) {
        if (!this.i || r5.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(sj0 sj0Var) {
        v71<rj0, a>.d f = this.b.f();
        while (f.hasNext() && !this.g) {
            Map.Entry next = f.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.c) < 0 && !this.g && this.b.contains((rj0) next.getKey())) {
                n(aVar.a);
                c.b c = c.b.c(aVar.a);
                if (c == null) {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
                aVar.a(sj0Var, c);
                m();
            }
        }
    }

    public void h(c.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.b());
    }

    public final boolean i() {
        if (this.b.size() == 0) {
            return true;
        }
        c.EnumC0020c enumC0020c = this.b.d().getValue().a;
        c.EnumC0020c enumC0020c2 = this.b.h().getValue().a;
        return enumC0020c == enumC0020c2 && this.c == enumC0020c2;
    }

    @Deprecated
    public void j(c.EnumC0020c enumC0020c) {
        f("markState");
        o(enumC0020c);
    }

    public final void l(c.EnumC0020c enumC0020c) {
        c.EnumC0020c enumC0020c2 = this.c;
        if (enumC0020c2 == enumC0020c) {
            return;
        }
        if (enumC0020c2 == c.EnumC0020c.INITIALIZED && enumC0020c == c.EnumC0020c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.c);
        }
        this.c = enumC0020c;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        p();
        this.f = false;
        if (this.c == c.EnumC0020c.DESTROYED) {
            this.b = new m00<>();
        }
    }

    public final void m() {
        ArrayList<c.EnumC0020c> arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(c.EnumC0020c enumC0020c) {
        this.h.add(enumC0020c);
    }

    public void o(c.EnumC0020c enumC0020c) {
        f("setCurrentState");
        l(enumC0020c);
    }

    public final void p() {
        sj0 sj0Var = this.d.get();
        if (sj0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i = i();
            this.g = false;
            if (i) {
                return;
            }
            if (this.c.compareTo(this.b.d().getValue().a) < 0) {
                d(sj0Var);
            }
            Map.Entry<rj0, a> h = this.b.h();
            if (!this.g && h != null && this.c.compareTo(h.getValue().a) > 0) {
                g(sj0Var);
            }
        }
    }
}
