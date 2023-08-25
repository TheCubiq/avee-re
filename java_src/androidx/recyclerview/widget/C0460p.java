package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.daaw.by0;
import com.daaw.cd1;
import com.daaw.dy0;
import com.daaw.sl0;
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C0460p {

    /* renamed from: a */
    public final cd1<RecyclerView.AbstractC0376c0, C0461a> f2272a = new cd1<>();

    /* renamed from: b */
    public final sl0<RecyclerView.AbstractC0376c0> f2273b = new sl0<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* loaded from: classes.dex */
    public static class C0461a {

        /* renamed from: d */
        public static by0<C0461a> f2274d = new dy0(20);

        /* renamed from: a */
        public int f2275a;

        /* renamed from: b */
        public RecyclerView.AbstractC0385l.C0388c f2276b;

        /* renamed from: c */
        public RecyclerView.AbstractC0385l.C0388c f2277c;

        /* renamed from: a */
        public static void m28099a() {
            do {
            } while (f2274d.mo22136b() != null);
        }

        /* renamed from: b */
        public static C0461a m28098b() {
            C0461a mo22136b = f2274d.mo22136b();
            return mo22136b == null ? new C0461a() : mo22136b;
        }

        /* renamed from: c */
        public static void m28097c(C0461a c0461a) {
            c0461a.f2275a = 0;
            c0461a.f2276b = null;
            c0461a.f2277c = null;
            f2274d.mo22137a(c0461a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0462b {
        /* renamed from: a */
        void mo28096a(RecyclerView.AbstractC0376c0 abstractC0376c0);

        /* renamed from: b */
        void mo28095b(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2);

        /* renamed from: c */
        void mo28094c(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2);

        /* renamed from: d */
        void mo28093d(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c, RecyclerView.AbstractC0385l.C0388c c0388c2);
    }

    /* renamed from: a */
    public void m28116a(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        if (c0461a == null) {
            c0461a = C0461a.m28098b();
            this.f2272a.put(abstractC0376c0, c0461a);
        }
        c0461a.f2275a |= 2;
        c0461a.f2276b = c0388c;
    }

    /* renamed from: b */
    public void m28115b(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        if (c0461a == null) {
            c0461a = C0461a.m28098b();
            this.f2272a.put(abstractC0376c0, c0461a);
        }
        c0461a.f2275a |= 1;
    }

    /* renamed from: c */
    public void m28114c(long j, RecyclerView.AbstractC0376c0 abstractC0376c0) {
        this.f2273b.m10210k(j, abstractC0376c0);
    }

    /* renamed from: d */
    public void m28113d(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        if (c0461a == null) {
            c0461a = C0461a.m28098b();
            this.f2272a.put(abstractC0376c0, c0461a);
        }
        c0461a.f2277c = c0388c;
        c0461a.f2275a |= 8;
    }

    /* renamed from: e */
    public void m28112e(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0385l.C0388c c0388c) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        if (c0461a == null) {
            c0461a = C0461a.m28098b();
            this.f2272a.put(abstractC0376c0, c0461a);
        }
        c0461a.f2276b = c0388c;
        c0461a.f2275a |= 4;
    }

    /* renamed from: f */
    public void m28111f() {
        this.f2272a.clear();
        this.f2273b.m10217b();
    }

    /* renamed from: g */
    public RecyclerView.AbstractC0376c0 m28110g(long j) {
        return this.f2273b.m10214e(j);
    }

    /* renamed from: h */
    public boolean m28109h(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        return (c0461a == null || (c0461a.f2275a & 1) == 0) ? false : true;
    }

    /* renamed from: i */
    public boolean m28108i(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        return (c0461a == null || (c0461a.f2275a & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    public void m28107j() {
        C0461a.m28099a();
    }

    /* renamed from: k */
    public void m28106k(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28101p(abstractC0376c0);
    }

    /* renamed from: l */
    public final RecyclerView.AbstractC0385l.C0388c m28105l(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        C0461a m25432m;
        RecyclerView.AbstractC0385l.C0388c c0388c;
        int m25439f = this.f2272a.m25439f(abstractC0376c0);
        if (m25439f >= 0 && (m25432m = this.f2272a.m25432m(m25439f)) != null) {
            int i2 = m25432m.f2275a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                m25432m.f2275a = i3;
                if (i == 4) {
                    c0388c = m25432m.f2276b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    c0388c = m25432m.f2277c;
                }
                if ((i3 & 12) == 0) {
                    this.f2272a.m25434k(m25439f);
                    C0461a.m28097c(m25432m);
                }
                return c0388c;
            }
        }
        return null;
    }

    /* renamed from: m */
    public RecyclerView.AbstractC0385l.C0388c m28104m(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        return m28105l(abstractC0376c0, 8);
    }

    /* renamed from: n */
    public RecyclerView.AbstractC0385l.C0388c m28103n(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        return m28105l(abstractC0376c0, 4);
    }

    /* renamed from: o */
    public void m28102o(InterfaceC0462b interfaceC0462b) {
        RecyclerView.AbstractC0385l.C0388c c0388c;
        RecyclerView.AbstractC0385l.C0388c c0388c2;
        for (int size = this.f2272a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0376c0 m25436i = this.f2272a.m25436i(size);
            C0461a m25434k = this.f2272a.m25434k(size);
            int i = m25434k.f2275a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    c0388c = m25434k.f2276b;
                    c0388c2 = c0388c != null ? m25434k.f2277c : null;
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            interfaceC0462b.mo28093d(m25436i, m25434k.f2276b, m25434k.f2277c);
                        } else if ((i & 4) != 0) {
                            c0388c = m25434k.f2276b;
                        } else if ((i & 8) == 0) {
                        }
                        C0461a.m28097c(m25434k);
                    }
                    interfaceC0462b.mo28095b(m25436i, m25434k.f2276b, m25434k.f2277c);
                    C0461a.m28097c(m25434k);
                }
                interfaceC0462b.mo28094c(m25436i, c0388c, c0388c2);
                C0461a.m28097c(m25434k);
            }
            interfaceC0462b.mo28096a(m25436i);
            C0461a.m28097c(m25434k);
        }
    }

    /* renamed from: p */
    public void m28101p(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        C0461a c0461a = this.f2272a.get(abstractC0376c0);
        if (c0461a == null) {
            return;
        }
        c0461a.f2275a &= -2;
    }

    /* renamed from: q */
    public void m28100q(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        int m10207o = this.f2273b.m10207o() - 1;
        while (true) {
            if (m10207o < 0) {
                break;
            } else if (abstractC0376c0 == this.f2273b.m10206p(m10207o)) {
                this.f2273b.m10208n(m10207o);
                break;
            } else {
                m10207o--;
            }
        }
        C0461a remove = this.f2272a.remove(abstractC0376c0);
        if (remove != null) {
            C0461a.m28097c(remove);
        }
    }
}
