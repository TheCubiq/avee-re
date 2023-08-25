package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0444h;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.by0;
import com.daaw.dy0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C0416a implements C0444h.InterfaceC0445a {

    /* renamed from: a */
    public by0<C0418b> f2112a;

    /* renamed from: b */
    public final ArrayList<C0418b> f2113b;

    /* renamed from: c */
    public final ArrayList<C0418b> f2114c;

    /* renamed from: d */
    public final InterfaceC0417a f2115d;

    /* renamed from: e */
    public Runnable f2116e;

    /* renamed from: f */
    public final boolean f2117f;

    /* renamed from: g */
    public final C0444h f2118g;

    /* renamed from: h */
    public int f2119h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0417a {
        /* renamed from: a */
        void mo28321a(int i, int i2);

        /* renamed from: b */
        void mo28320b(C0418b c0418b);

        /* renamed from: c */
        void mo28319c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo28318d(C0418b c0418b);

        /* renamed from: e */
        RecyclerView.AbstractC0376c0 mo28317e(int i);

        /* renamed from: f */
        void mo28316f(int i, int i2);

        /* renamed from: g */
        void mo28315g(int i, int i2);

        /* renamed from: h */
        void mo28314h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static class C0418b {

        /* renamed from: a */
        public int f2120a;

        /* renamed from: b */
        public int f2121b;

        /* renamed from: c */
        public Object f2122c;

        /* renamed from: d */
        public int f2123d;

        public C0418b(int i, int i2, int i3, Object obj) {
            this.f2120a = i;
            this.f2121b = i2;
            this.f2123d = i3;
            this.f2122c = obj;
        }

        /* renamed from: a */
        public String m28313a() {
            int i = this.f2120a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0418b c0418b = (C0418b) obj;
            int i = this.f2120a;
            if (i != c0418b.f2120a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2123d - this.f2121b) == 1 && this.f2123d == c0418b.f2121b && this.f2121b == c0418b.f2123d) {
                return true;
            }
            if (this.f2123d == c0418b.f2123d && this.f2121b == c0418b.f2121b) {
                Object obj2 = this.f2122c;
                Object obj3 = c0418b.f2122c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f2120a * 31) + this.f2121b) * 31) + this.f2123d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m28313a() + ",s:" + this.f2121b + "c:" + this.f2123d + ",p:" + this.f2122c + "]";
        }
    }

    public C0416a(InterfaceC0417a interfaceC0417a) {
        this(interfaceC0417a, false);
    }

    public C0416a(InterfaceC0417a interfaceC0417a, boolean z) {
        this.f2112a = new dy0(30);
        this.f2113b = new ArrayList<>();
        this.f2114c = new ArrayList<>();
        this.f2119h = 0;
        this.f2115d = interfaceC0417a;
        this.f2117f = z;
        this.f2118g = new C0444h(this);
    }

    @Override // androidx.recyclerview.widget.C0444h.InterfaceC0445a
    /* renamed from: a */
    public void mo28201a(C0418b c0418b) {
        if (this.f2117f) {
            return;
        }
        c0418b.f2122c = null;
        this.f2112a.mo22137a(c0418b);
    }

    @Override // androidx.recyclerview.widget.C0444h.InterfaceC0445a
    /* renamed from: b */
    public C0418b mo28200b(int i, int i2, int i3, Object obj) {
        C0418b mo22136b = this.f2112a.mo22136b();
        if (mo22136b == null) {
            return new C0418b(i, i2, i3, obj);
        }
        mo22136b.f2120a = i;
        mo22136b.f2121b = i2;
        mo22136b.f2123d = i3;
        mo22136b.f2122c = obj;
        return mo22136b;
    }

    /* renamed from: c */
    public final void m28342c(C0418b c0418b) {
        m28326s(c0418b);
    }

    /* renamed from: d */
    public final void m28341d(C0418b c0418b) {
        m28326s(c0418b);
    }

    /* renamed from: e */
    public int m28340e(int i) {
        int size = this.f2113b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0418b c0418b = this.f2113b.get(i2);
            int i3 = c0418b.f2120a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0418b.f2121b;
                    if (i4 <= i) {
                        int i5 = c0418b.f2123d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0418b.f2121b;
                    if (i6 == i) {
                        i = c0418b.f2123d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0418b.f2123d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0418b.f2121b <= i) {
                i += c0418b.f2123d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m28339f(C0418b c0418b) {
        boolean z;
        char c;
        int i = c0418b.f2121b;
        int i2 = c0418b.f2123d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2115d.mo28317e(i3) != null || m28337h(i3)) {
                if (c2 == 0) {
                    m28334k(mo28200b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m28326s(mo28200b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c0418b.f2123d) {
            mo28201a(c0418b);
            c0418b = mo28200b(2, i, i4, null);
        }
        if (c2 == 0) {
            m28334k(c0418b);
        } else {
            m28326s(c0418b);
        }
    }

    /* renamed from: g */
    public final void m28338g(C0418b c0418b) {
        int i = c0418b.f2121b;
        int i2 = c0418b.f2123d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f2115d.mo28317e(i) != null || m28337h(i)) {
                if (c == 0) {
                    m28334k(mo28200b(4, i3, i4, c0418b.f2122c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m28326s(mo28200b(4, i3, i4, c0418b.f2122c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != c0418b.f2123d) {
            Object obj = c0418b.f2122c;
            mo28201a(c0418b);
            c0418b = mo28200b(4, i3, i4, obj);
        }
        if (c == 0) {
            m28334k(c0418b);
        } else {
            m28326s(c0418b);
        }
    }

    /* renamed from: h */
    public final boolean m28337h(int i) {
        int size = this.f2114c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0418b c0418b = this.f2114c.get(i2);
            int i3 = c0418b.f2120a;
            if (i3 == 8) {
                if (m28331n(c0418b.f2123d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0418b.f2121b;
                int i5 = c0418b.f2123d + i4;
                while (i4 < i5) {
                    if (m28331n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m28336i() {
        int size = this.f2114c.size();
        for (int i = 0; i < size; i++) {
            this.f2115d.mo28318d(this.f2114c.get(i));
        }
        m28324u(this.f2114c);
        this.f2119h = 0;
    }

    /* renamed from: j */
    public void m28335j() {
        m28336i();
        int size = this.f2113b.size();
        for (int i = 0; i < size; i++) {
            C0418b c0418b = this.f2113b.get(i);
            int i2 = c0418b.f2120a;
            if (i2 == 1) {
                this.f2115d.mo28318d(c0418b);
                this.f2115d.mo28315g(c0418b.f2121b, c0418b.f2123d);
            } else if (i2 == 2) {
                this.f2115d.mo28318d(c0418b);
                this.f2115d.mo28314h(c0418b.f2121b, c0418b.f2123d);
            } else if (i2 == 4) {
                this.f2115d.mo28318d(c0418b);
                this.f2115d.mo28319c(c0418b.f2121b, c0418b.f2123d, c0418b.f2122c);
            } else if (i2 == 8) {
                this.f2115d.mo28318d(c0418b);
                this.f2115d.mo28321a(c0418b.f2121b, c0418b.f2123d);
            }
            Runnable runnable = this.f2116e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m28324u(this.f2113b);
        this.f2119h = 0;
    }

    /* renamed from: k */
    public final void m28334k(C0418b c0418b) {
        int i;
        int i2 = c0418b.f2120a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m28322w = m28322w(c0418b.f2121b, i2);
        int i3 = c0418b.f2121b;
        int i4 = c0418b.f2120a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + c0418b);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0418b.f2123d; i6++) {
            int m28322w2 = m28322w(c0418b.f2121b + (i * i6), c0418b.f2120a);
            int i7 = c0418b.f2120a;
            if (i7 == 2 ? m28322w2 == m28322w : i7 == 4 && m28322w2 == m28322w + 1) {
                i5++;
            } else {
                C0418b mo28200b = mo28200b(i7, m28322w, i5, c0418b.f2122c);
                m28333l(mo28200b, i3);
                mo28201a(mo28200b);
                if (c0418b.f2120a == 4) {
                    i3 += i5;
                }
                m28322w = m28322w2;
                i5 = 1;
            }
        }
        Object obj = c0418b.f2122c;
        mo28201a(c0418b);
        if (i5 > 0) {
            C0418b mo28200b2 = mo28200b(c0418b.f2120a, m28322w, i5, obj);
            m28333l(mo28200b2, i3);
            mo28201a(mo28200b2);
        }
    }

    /* renamed from: l */
    public void m28333l(C0418b c0418b, int i) {
        this.f2115d.mo28320b(c0418b);
        int i2 = c0418b.f2120a;
        if (i2 == 2) {
            this.f2115d.mo28314h(i, c0418b.f2123d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f2115d.mo28319c(i, c0418b.f2123d, c0418b.f2122c);
        }
    }

    /* renamed from: m */
    public int m28332m(int i) {
        return m28331n(i, 0);
    }

    /* renamed from: n */
    public int m28331n(int i, int i2) {
        int size = this.f2114c.size();
        while (i2 < size) {
            C0418b c0418b = this.f2114c.get(i2);
            int i3 = c0418b.f2120a;
            if (i3 == 8) {
                int i4 = c0418b.f2121b;
                if (i4 == i) {
                    i = c0418b.f2123d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0418b.f2123d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0418b.f2121b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0418b.f2123d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0418b.f2123d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m28330o(int i) {
        return (i & this.f2119h) != 0;
    }

    /* renamed from: p */
    public boolean m28329p() {
        return this.f2113b.size() > 0;
    }

    /* renamed from: q */
    public boolean m28328q() {
        return (this.f2114c.isEmpty() || this.f2113b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public boolean m28327r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2113b.add(mo28200b(4, i, i2, obj));
        this.f2119h |= 4;
        return this.f2113b.size() == 1;
    }

    /* renamed from: s */
    public final void m28326s(C0418b c0418b) {
        this.f2114c.add(c0418b);
        int i = c0418b.f2120a;
        if (i == 1) {
            this.f2115d.mo28315g(c0418b.f2121b, c0418b.f2123d);
        } else if (i == 2) {
            this.f2115d.mo28316f(c0418b.f2121b, c0418b.f2123d);
        } else if (i == 4) {
            this.f2115d.mo28319c(c0418b.f2121b, c0418b.f2123d, c0418b.f2122c);
        } else if (i == 8) {
            this.f2115d.mo28321a(c0418b.f2121b, c0418b.f2123d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0418b);
        }
    }

    /* renamed from: t */
    public void m28325t() {
        this.f2118g.m28206b(this.f2113b);
        int size = this.f2113b.size();
        for (int i = 0; i < size; i++) {
            C0418b c0418b = this.f2113b.get(i);
            int i2 = c0418b.f2120a;
            if (i2 == 1) {
                m28342c(c0418b);
            } else if (i2 == 2) {
                m28339f(c0418b);
            } else if (i2 == 4) {
                m28338g(c0418b);
            } else if (i2 == 8) {
                m28341d(c0418b);
            }
            Runnable runnable = this.f2116e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2113b.clear();
    }

    /* renamed from: u */
    public void m28324u(List<C0418b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo28201a(list.get(i));
        }
        list.clear();
    }

    /* renamed from: v */
    public void m28323v() {
        m28324u(this.f2113b);
        m28324u(this.f2114c);
        this.f2119h = 0;
    }

    /* renamed from: w */
    public final int m28322w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f2114c.size() - 1; size >= 0; size--) {
            C0418b c0418b = this.f2114c.get(size);
            int i9 = c0418b.f2120a;
            if (i9 == 8) {
                int i10 = c0418b.f2121b;
                int i11 = c0418b.f2123d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c0418b.f2121b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c0418b.f2121b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c0418b.f2123d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c0418b.f2123d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c0418b.f2121b = i7;
                    i--;
                }
            } else {
                int i12 = c0418b.f2121b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c0418b.f2121b = i3;
                } else if (i9 == 1) {
                    i -= c0418b.f2123d;
                } else if (i9 == 2) {
                    i += c0418b.f2123d;
                }
            }
        }
        for (int size2 = this.f2114c.size() - 1; size2 >= 0; size2--) {
            C0418b c0418b2 = this.f2114c.get(size2);
            if (c0418b2.f2120a == 8) {
                int i13 = c0418b2.f2123d;
                if (i13 != c0418b2.f2121b && i13 >= 0) {
                }
                this.f2114c.remove(size2);
                mo28201a(c0418b2);
            } else {
                if (c0418b2.f2123d > 0) {
                }
                this.f2114c.remove(size2);
                mo28201a(c0418b2);
            }
        }
        return i;
    }
}
