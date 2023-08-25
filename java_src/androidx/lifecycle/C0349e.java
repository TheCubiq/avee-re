package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0344c;
import com.daaw.C2825r5;
import com.daaw.m00;
import com.daaw.rj0;
import com.daaw.sj0;
import com.daaw.v71;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public class C0349e extends AbstractC0344c {

    /* renamed from: b */
    public m00<rj0, C0350a> f1759b;

    /* renamed from: c */
    public AbstractC0344c.EnumC0347c f1760c;

    /* renamed from: d */
    public final WeakReference<sj0> f1761d;

    /* renamed from: e */
    public int f1762e;

    /* renamed from: f */
    public boolean f1763f;

    /* renamed from: g */
    public boolean f1764g;

    /* renamed from: h */
    public ArrayList<AbstractC0344c.EnumC0347c> f1765h;

    /* renamed from: i */
    public final boolean f1766i;

    /* renamed from: androidx.lifecycle.e$a */
    /* loaded from: classes.dex */
    public static class C0350a {

        /* renamed from: a */
        public AbstractC0344c.EnumC0347c f1767a;

        /* renamed from: b */
        public InterfaceC0348d f1768b;

        public C0350a(rj0 rj0Var, AbstractC0344c.EnumC0347c enumC0347c) {
            this.f1768b = C0351f.m29026f(rj0Var);
            this.f1767a = enumC0347c;
        }

        /* renamed from: a */
        public void m29032a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
            AbstractC0344c.EnumC0347c m29051b = enumC0346b.m29051b();
            this.f1767a = C0349e.m29038k(this.f1767a, m29051b);
            this.f1768b.mo18735a(sj0Var, enumC0346b);
            this.f1767a = m29051b;
        }
    }

    public C0349e(sj0 sj0Var) {
        this(sj0Var, true);
    }

    public C0349e(sj0 sj0Var, boolean z) {
        this.f1759b = new m00<>();
        this.f1762e = 0;
        this.f1763f = false;
        this.f1764g = false;
        this.f1765h = new ArrayList<>();
        this.f1761d = new WeakReference<>(sj0Var);
        this.f1760c = AbstractC0344c.EnumC0347c.INITIALIZED;
        this.f1766i = z;
    }

    /* renamed from: k */
    public static AbstractC0344c.EnumC0347c m29038k(AbstractC0344c.EnumC0347c enumC0347c, AbstractC0344c.EnumC0347c enumC0347c2) {
        return (enumC0347c2 == null || enumC0347c2.compareTo(enumC0347c) >= 0) ? enumC0347c : enumC0347c2;
    }

    @Override // androidx.lifecycle.AbstractC0344c
    /* renamed from: a */
    public void mo29048a(rj0 rj0Var) {
        sj0 sj0Var;
        m29043f("addObserver");
        AbstractC0344c.EnumC0347c enumC0347c = this.f1760c;
        AbstractC0344c.EnumC0347c enumC0347c2 = AbstractC0344c.EnumC0347c.DESTROYED;
        if (enumC0347c != enumC0347c2) {
            enumC0347c2 = AbstractC0344c.EnumC0347c.INITIALIZED;
        }
        C0350a c0350a = new C0350a(rj0Var, enumC0347c2);
        if (this.f1759b.mo7370k(rj0Var, c0350a) == null && (sj0Var = this.f1761d.get()) != null) {
            boolean z = this.f1762e != 0 || this.f1763f;
            AbstractC0344c.EnumC0347c m29044e = m29044e(rj0Var);
            this.f1762e++;
            while (c0350a.f1767a.compareTo(m29044e) < 0 && this.f1759b.contains(rj0Var)) {
                m29035n(c0350a.f1767a);
                AbstractC0344c.EnumC0346b m29050c = AbstractC0344c.EnumC0346b.m29050c(c0350a.f1767a);
                if (m29050c == null) {
                    throw new IllegalStateException("no event up from " + c0350a.f1767a);
                }
                c0350a.m29032a(sj0Var, m29050c);
                m29036m();
                m29044e = m29044e(rj0Var);
            }
            if (!z) {
                m29033p();
            }
            this.f1762e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0344c
    /* renamed from: b */
    public AbstractC0344c.EnumC0347c mo29047b() {
        return this.f1760c;
    }

    @Override // androidx.lifecycle.AbstractC0344c
    /* renamed from: c */
    public void mo29046c(rj0 rj0Var) {
        m29043f("removeObserver");
        this.f1759b.mo7369m(rj0Var);
    }

    /* renamed from: d */
    public final void m29045d(sj0 sj0Var) {
        Iterator<Map.Entry<rj0, C0350a>> descendingIterator = this.f1759b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f1764g) {
            Map.Entry<rj0, C0350a> next = descendingIterator.next();
            C0350a value = next.getValue();
            while (value.f1767a.compareTo(this.f1760c) > 0 && !this.f1764g && this.f1759b.contains(next.getKey())) {
                AbstractC0344c.EnumC0346b m29052a = AbstractC0344c.EnumC0346b.m29052a(value.f1767a);
                if (m29052a == null) {
                    throw new IllegalStateException("no event down from " + value.f1767a);
                }
                m29035n(m29052a.m29051b());
                value.m29032a(sj0Var, m29052a);
                m29036m();
            }
        }
    }

    /* renamed from: e */
    public final AbstractC0344c.EnumC0347c m29044e(rj0 rj0Var) {
        Map.Entry<rj0, C0350a> m16339n = this.f1759b.m16339n(rj0Var);
        AbstractC0344c.EnumC0347c enumC0347c = null;
        AbstractC0344c.EnumC0347c enumC0347c2 = m16339n != null ? m16339n.getValue().f1767a : null;
        if (!this.f1765h.isEmpty()) {
            ArrayList<AbstractC0344c.EnumC0347c> arrayList = this.f1765h;
            enumC0347c = arrayList.get(arrayList.size() - 1);
        }
        return m29038k(m29038k(this.f1760c, enumC0347c2), enumC0347c);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    public final void m29043f(String str) {
        if (!this.f1766i || C2825r5.m11733e().mo1976b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* renamed from: g */
    public final void m29042g(sj0 sj0Var) {
        v71<rj0, C0350a>.C3311d m7373f = this.f1759b.m7373f();
        while (m7373f.hasNext() && !this.f1764g) {
            Map.Entry next = m7373f.next();
            C0350a c0350a = (C0350a) next.getValue();
            while (c0350a.f1767a.compareTo(this.f1760c) < 0 && !this.f1764g && this.f1759b.contains((rj0) next.getKey())) {
                m29035n(c0350a.f1767a);
                AbstractC0344c.EnumC0346b m29050c = AbstractC0344c.EnumC0346b.m29050c(c0350a.f1767a);
                if (m29050c == null) {
                    throw new IllegalStateException("no event up from " + c0350a.f1767a);
                }
                c0350a.m29032a(sj0Var, m29050c);
                m29036m();
            }
        }
    }

    /* renamed from: h */
    public void m29041h(AbstractC0344c.EnumC0346b enumC0346b) {
        m29043f("handleLifecycleEvent");
        m29037l(enumC0346b.m29051b());
    }

    /* renamed from: i */
    public final boolean m29040i() {
        if (this.f1759b.size() == 0) {
            return true;
        }
        AbstractC0344c.EnumC0347c enumC0347c = this.f1759b.m7375d().getValue().f1767a;
        AbstractC0344c.EnumC0347c enumC0347c2 = this.f1759b.m7372h().getValue().f1767a;
        return enumC0347c == enumC0347c2 && this.f1760c == enumC0347c2;
    }

    @Deprecated
    /* renamed from: j */
    public void m29039j(AbstractC0344c.EnumC0347c enumC0347c) {
        m29043f("markState");
        m29034o(enumC0347c);
    }

    /* renamed from: l */
    public final void m29037l(AbstractC0344c.EnumC0347c enumC0347c) {
        AbstractC0344c.EnumC0347c enumC0347c2 = this.f1760c;
        if (enumC0347c2 == enumC0347c) {
            return;
        }
        if (enumC0347c2 == AbstractC0344c.EnumC0347c.INITIALIZED && enumC0347c == AbstractC0344c.EnumC0347c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f1760c);
        }
        this.f1760c = enumC0347c;
        if (this.f1763f || this.f1762e != 0) {
            this.f1764g = true;
            return;
        }
        this.f1763f = true;
        m29033p();
        this.f1763f = false;
        if (this.f1760c == AbstractC0344c.EnumC0347c.DESTROYED) {
            this.f1759b = new m00<>();
        }
    }

    /* renamed from: m */
    public final void m29036m() {
        ArrayList<AbstractC0344c.EnumC0347c> arrayList = this.f1765h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    public final void m29035n(AbstractC0344c.EnumC0347c enumC0347c) {
        this.f1765h.add(enumC0347c);
    }

    /* renamed from: o */
    public void m29034o(AbstractC0344c.EnumC0347c enumC0347c) {
        m29043f("setCurrentState");
        m29037l(enumC0347c);
    }

    /* renamed from: p */
    public final void m29033p() {
        sj0 sj0Var = this.f1761d.get();
        if (sj0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean m29040i = m29040i();
            this.f1764g = false;
            if (m29040i) {
                return;
            }
            if (this.f1760c.compareTo(this.f1759b.m7375d().getValue().f1767a) < 0) {
                m29045d(sj0Var);
            }
            Map.Entry<rj0, C0350a> m7372h = this.f1759b.m7372h();
            if (!this.f1764g && m7372h != null && this.f1760c.compareTo(m7372h.getValue().f1767a) > 0) {
                m29042g(sj0Var);
            }
        }
    }
}
