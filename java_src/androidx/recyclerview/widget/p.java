package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.daaw.by0;
import com.daaw.cd1;
import com.daaw.dy0;
import com.daaw.sl0;
/* loaded from: classes.dex */
public class p {
    public final cd1<RecyclerView.c0, a> a = new cd1<>();
    public final sl0<RecyclerView.c0> b = new sl0<>();

    /* loaded from: classes.dex */
    public static class a {
        public static by0<a> d = new dy0(20);
        public int a;
        public RecyclerView.l.c b;
        public RecyclerView.l.c c;

        public static void a() {
            do {
            } while (d.b() != null);
        }

        public static a b() {
            a b = d.b();
            return b == null ? new a() : b;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    public void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    public void b(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.c0 c0Var) {
        this.b.k(j, c0Var);
    }

    public void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.b();
    }

    public RecyclerView.c0 g(long j) {
        return this.b.e(j);
    }

    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    public final RecyclerView.l.c l(RecyclerView.c0 c0Var, int i) {
        a m;
        RecyclerView.l.c cVar;
        int f = this.a.f(c0Var);
        if (f >= 0 && (m = this.a.m(f)) != null) {
            int i2 = m.a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                m.a = i3;
                if (i == 4) {
                    cVar = m.b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = m.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.k(f);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.l.c m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    public RecyclerView.l.c n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    public void o(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 i = this.a.i(size);
            a k = this.a.k(size);
            int i2 = k.a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.b;
                    cVar2 = cVar != null ? k.c : null;
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.d(i, k.b, k.c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.b;
                        } else if ((i2 & 8) == 0) {
                        }
                        a.c(k);
                    }
                    bVar.b(i, k.b, k.c);
                    a.c(k);
                }
                bVar.c(i, cVar, cVar2);
                a.c(k);
            }
            bVar.a(i);
            a.c(k);
        }
    }

    public void p(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.c0 c0Var) {
        int o = this.b.o() - 1;
        while (true) {
            if (o < 0) {
                break;
            } else if (c0Var == this.b.p(o)) {
                this.b.n(o);
                break;
            } else {
                o--;
            }
        }
        a remove = this.a.remove(c0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
