package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C0419b {

    /* renamed from: a */
    public final InterfaceC0421b f2124a;

    /* renamed from: b */
    public final C0420a f2125b = new C0420a();

    /* renamed from: c */
    public final List<View> f2126c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class C0420a {

        /* renamed from: a */
        public long f2127a = 0;

        /* renamed from: b */
        public C0420a f2128b;

        /* renamed from: a */
        public void m28292a(int i) {
            if (i < 64) {
                this.f2127a &= (1 << i) ^ (-1);
                return;
            }
            C0420a c0420a = this.f2128b;
            if (c0420a != null) {
                c0420a.m28292a(i - 64);
            }
        }

        /* renamed from: b */
        public int m28291b(int i) {
            C0420a c0420a = this.f2128b;
            return c0420a == null ? i >= 64 ? Long.bitCount(this.f2127a) : Long.bitCount(this.f2127a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2127a & ((1 << i) - 1)) : c0420a.m28291b(i - 64) + Long.bitCount(this.f2127a);
        }

        /* renamed from: c */
        public final void m28290c() {
            if (this.f2128b == null) {
                this.f2128b = new C0420a();
            }
        }

        /* renamed from: d */
        public boolean m28289d(int i) {
            if (i < 64) {
                return (this.f2127a & (1 << i)) != 0;
            }
            m28290c();
            return this.f2128b.m28289d(i - 64);
        }

        /* renamed from: e */
        public void m28288e(int i, boolean z) {
            if (i >= 64) {
                m28290c();
                this.f2128b.m28288e(i - 64, z);
                return;
            }
            long j = this.f2127a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2127a = ((j & (j2 ^ (-1))) << 1) | (j & j2);
            if (z) {
                m28285h(i);
            } else {
                m28292a(i);
            }
            if (z2 || this.f2128b != null) {
                m28290c();
                this.f2128b.m28288e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m28287f(int i) {
            if (i >= 64) {
                m28290c();
                return this.f2128b.m28287f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2127a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ (-1));
            this.f2127a = j3;
            long j4 = j - 1;
            this.f2127a = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
            C0420a c0420a = this.f2128b;
            if (c0420a != null) {
                if (c0420a.m28289d(0)) {
                    m28285h(63);
                }
                this.f2128b.m28287f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m28286g() {
            this.f2127a = 0L;
            C0420a c0420a = this.f2128b;
            if (c0420a != null) {
                c0420a.m28286g();
            }
        }

        /* renamed from: h */
        public void m28285h(int i) {
            if (i < 64) {
                this.f2127a |= 1 << i;
                return;
            }
            m28290c();
            this.f2128b.m28285h(i - 64);
        }

        public String toString() {
            if (this.f2128b == null) {
                return Long.toBinaryString(this.f2127a);
            }
            return this.f2128b.toString() + "xx" + Long.toBinaryString(this.f2127a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0421b {
        /* renamed from: a */
        View mo28284a(int i);

        /* renamed from: b */
        void mo28283b(View view);

        /* renamed from: c */
        int mo28282c();

        /* renamed from: d */
        void mo28281d();

        /* renamed from: e */
        int mo28280e(View view);

        /* renamed from: f */
        RecyclerView.AbstractC0376c0 mo28279f(View view);

        /* renamed from: g */
        void mo28278g(int i);

        /* renamed from: h */
        void mo28277h(View view);

        /* renamed from: i */
        void mo28276i(View view, int i);

        /* renamed from: j */
        void mo28275j(int i);

        /* renamed from: k */
        void mo28274k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public C0419b(InterfaceC0421b interfaceC0421b) {
        this.f2124a = interfaceC0421b;
    }

    /* renamed from: a */
    public void m28312a(View view, int i, boolean z) {
        int mo28282c = i < 0 ? this.f2124a.mo28282c() : m28305h(i);
        this.f2125b.m28288e(mo28282c, z);
        if (z) {
            m28301l(view);
        }
        this.f2124a.mo28276i(view, mo28282c);
    }

    /* renamed from: b */
    public void m28311b(View view, boolean z) {
        m28312a(view, -1, z);
    }

    /* renamed from: c */
    public void m28310c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int mo28282c = i < 0 ? this.f2124a.mo28282c() : m28305h(i);
        this.f2125b.m28288e(mo28282c, z);
        if (z) {
            m28301l(view);
        }
        this.f2124a.mo28274k(view, mo28282c, layoutParams);
    }

    /* renamed from: d */
    public void m28309d(int i) {
        int m28305h = m28305h(i);
        this.f2125b.m28287f(m28305h);
        this.f2124a.mo28278g(m28305h);
    }

    /* renamed from: e */
    public View m28308e(int i) {
        int size = this.f2126c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2126c.get(i2);
            RecyclerView.AbstractC0376c0 mo28279f = this.f2124a.mo28279f(view);
            if (mo28279f.m28731o() == i && !mo28279f.m28724v() && !mo28279f.m28722x()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m28307f(int i) {
        return this.f2124a.mo28284a(m28305h(i));
    }

    /* renamed from: g */
    public int m28306g() {
        return this.f2124a.mo28282c() - this.f2126c.size();
    }

    /* renamed from: h */
    public final int m28305h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo28282c = this.f2124a.mo28282c();
        int i2 = i;
        while (i2 < mo28282c) {
            int m28291b = i - (i2 - this.f2125b.m28291b(i2));
            if (m28291b == 0) {
                while (this.f2125b.m28289d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m28291b;
        }
        return -1;
    }

    /* renamed from: i */
    public View m28304i(int i) {
        return this.f2124a.mo28284a(i);
    }

    /* renamed from: j */
    public int m28303j() {
        return this.f2124a.mo28282c();
    }

    /* renamed from: k */
    public void m28302k(View view) {
        int mo28280e = this.f2124a.mo28280e(view);
        if (mo28280e >= 0) {
            this.f2125b.m28285h(mo28280e);
            m28301l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void m28301l(View view) {
        this.f2126c.add(view);
        this.f2124a.mo28283b(view);
    }

    /* renamed from: m */
    public int m28300m(View view) {
        int mo28280e = this.f2124a.mo28280e(view);
        if (mo28280e == -1 || this.f2125b.m28289d(mo28280e)) {
            return -1;
        }
        return mo28280e - this.f2125b.m28291b(mo28280e);
    }

    /* renamed from: n */
    public boolean m28299n(View view) {
        return this.f2126c.contains(view);
    }

    /* renamed from: o */
    public void m28298o() {
        this.f2125b.m28286g();
        for (int size = this.f2126c.size() - 1; size >= 0; size--) {
            this.f2124a.mo28277h(this.f2126c.get(size));
            this.f2126c.remove(size);
        }
        this.f2124a.mo28281d();
    }

    /* renamed from: p */
    public void m28297p(View view) {
        int mo28280e = this.f2124a.mo28280e(view);
        if (mo28280e < 0) {
            return;
        }
        if (this.f2125b.m28287f(mo28280e)) {
            m28293t(view);
        }
        this.f2124a.mo28275j(mo28280e);
    }

    /* renamed from: q */
    public void m28296q(int i) {
        int m28305h = m28305h(i);
        View mo28284a = this.f2124a.mo28284a(m28305h);
        if (mo28284a == null) {
            return;
        }
        if (this.f2125b.m28287f(m28305h)) {
            m28293t(mo28284a);
        }
        this.f2124a.mo28275j(m28305h);
    }

    /* renamed from: r */
    public boolean m28295r(View view) {
        int mo28280e = this.f2124a.mo28280e(view);
        if (mo28280e == -1) {
            m28293t(view);
            return true;
        } else if (this.f2125b.m28289d(mo28280e)) {
            this.f2125b.m28287f(mo28280e);
            m28293t(view);
            this.f2124a.mo28275j(mo28280e);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: s */
    public void m28294s(View view) {
        int mo28280e = this.f2124a.mo28280e(view);
        if (mo28280e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2125b.m28289d(mo28280e)) {
            this.f2125b.m28292a(mo28280e);
            m28293t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean m28293t(View view) {
        if (this.f2126c.remove(view)) {
            this.f2124a.mo28277h(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2125b.toString() + ", hidden list:" + this.f2126c.size();
    }
}
