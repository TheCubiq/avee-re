package com.daaw;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class n88 {

    /* renamed from: a */
    public final lh8 f19715a;

    /* renamed from: e */
    public final k88 f19719e;

    /* renamed from: f */
    public final yr8 f19720f;

    /* renamed from: g */
    public final jn8 f19721g;

    /* renamed from: h */
    public final HashMap f19722h;

    /* renamed from: i */
    public final Set f19723i;

    /* renamed from: j */
    public boolean f19724j;

    /* renamed from: k */
    public qz6 f19725k;

    /* renamed from: l */
    public wt8 f19726l = new wt8(0);

    /* renamed from: c */
    public final IdentityHashMap f19717c = new IdentityHashMap();

    /* renamed from: d */
    public final Map f19718d = new HashMap();

    /* renamed from: b */
    public final List f19716b = new ArrayList();

    public n88(k88 k88Var, fb8 fb8Var, Handler handler, lh8 lh8Var) {
        this.f19715a = lh8Var;
        this.f19719e = k88Var;
        yr8 yr8Var = new yr8();
        this.f19720f = yr8Var;
        jn8 jn8Var = new jn8();
        this.f19721g = jn8Var;
        this.f19722h = new HashMap();
        this.f19723i = new HashSet();
        yr8Var.m3371b(handler, fb8Var);
        jn8Var.m18378b(handler, fb8Var);
    }

    /* renamed from: a */
    public final int m15412a() {
        return this.f19716b.size();
    }

    /* renamed from: b */
    public final l64 m15411b() {
        if (this.f19716b.isEmpty()) {
            return l64.f17090a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f19716b.size(); i2++) {
            h88 h88Var = (h88) this.f19716b.get(i2);
            h88Var.f12187d = i;
            i += h88Var.f12184a.m17448I().mo4509c();
        }
        return new c98(this.f19716b, this.f19726l, null);
    }

    /* renamed from: e */
    public final /* synthetic */ void m15408e(rr8 rr8Var, l64 l64Var) {
        this.f19719e.zzh();
    }

    /* renamed from: f */
    public final void m15407f(qz6 qz6Var) {
        uo4.m7872f(!this.f19724j);
        this.f19725k = qz6Var;
        for (int i = 0; i < this.f19716b.size(); i++) {
            h88 h88Var = (h88) this.f19716b.get(i);
            m15393t(h88Var);
            this.f19723i.add(h88Var);
        }
        this.f19724j = true;
    }

    /* renamed from: g */
    public final void m15406g() {
        for (e88 e88Var : this.f19722h.values()) {
            try {
                e88Var.f8257a.mo10997n(e88Var.f8258b);
            } catch (RuntimeException e) {
                s95.m10495c("MediaSourceList", "Failed to release child source.", e);
            }
            e88Var.f8257a.mo11004g(e88Var.f8259c);
            e88Var.f8257a.mo11002i(e88Var.f8259c);
        }
        this.f19722h.clear();
        this.f19723i.clear();
        this.f19724j = false;
    }

    /* renamed from: h */
    public final void m15405h(nr8 nr8Var) {
        h88 h88Var = (h88) this.f19717c.remove(nr8Var);
        Objects.requireNonNull(h88Var);
        h88Var.f12184a.mo10999l(nr8Var);
        h88Var.f12186c.remove(((br8) nr8Var).f5081p);
        if (!this.f19717c.isEmpty()) {
            m15395r();
        }
        m15394s(h88Var);
    }

    /* renamed from: i */
    public final boolean m15404i() {
        return this.f19724j;
    }

    /* renamed from: j */
    public final l64 m15403j(int i, List list, wt8 wt8Var) {
        int i2;
        if (!list.isEmpty()) {
            this.f19726l = wt8Var;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                h88 h88Var = (h88) list.get(i3 - i);
                if (i3 > 0) {
                    h88 h88Var2 = (h88) this.f19716b.get(i3 - 1);
                    i2 = h88Var2.f12187d + h88Var2.f12184a.m17448I().mo4509c();
                } else {
                    i2 = 0;
                }
                h88Var.m20943a(i2);
                m15397p(i3, h88Var.f12184a.m17448I().mo4509c());
                this.f19716b.add(i3, h88Var);
                this.f19718d.put(h88Var.f12185b, h88Var);
                if (this.f19724j) {
                    m15393t(h88Var);
                    if (this.f19717c.isEmpty()) {
                        this.f19723i.add(h88Var);
                    } else {
                        m15396q(h88Var);
                    }
                }
            }
        }
        return m15411b();
    }

    /* renamed from: k */
    public final l64 m15402k(int i, int i2, int i3, wt8 wt8Var) {
        uo4.m7874d(m15412a() >= 0);
        this.f19726l = null;
        return m15411b();
    }

    /* renamed from: l */
    public final l64 m15401l(int i, int i2, wt8 wt8Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= m15412a()) {
            z = true;
        }
        uo4.m7874d(z);
        this.f19726l = wt8Var;
        m15392u(i, i2);
        return m15411b();
    }

    /* renamed from: m */
    public final l64 m15400m(List list, wt8 wt8Var) {
        m15392u(0, this.f19716b.size());
        return m15403j(this.f19716b.size(), list, wt8Var);
    }

    /* renamed from: n */
    public final l64 m15399n(wt8 wt8Var) {
        int m15412a = m15412a();
        if (wt8Var.m5800c() != m15412a) {
            wt8Var = wt8Var.m5797f().m5796g(0, m15412a);
        }
        this.f19726l = wt8Var;
        return m15411b();
    }

    /* renamed from: o */
    public final nr8 m15398o(pr8 pr8Var, nw8 nw8Var, long j) {
        Object obj = pr8Var.f18805a;
        Object obj2 = ((Pair) obj).first;
        pr8 m13184c = pr8Var.m13184c(((Pair) obj).second);
        h88 h88Var = (h88) this.f19718d.get(obj2);
        Objects.requireNonNull(h88Var);
        this.f19723i.add(h88Var);
        e88 e88Var = (e88) this.f19722h.get(h88Var);
        if (e88Var != null) {
            e88Var.f8257a.mo11001j(e88Var.f8258b);
        }
        h88Var.f12186c.add(m13184c);
        br8 mo11000k = h88Var.f12184a.mo11000k(m13184c, nw8Var, j);
        this.f19717c.put(mo11000k, h88Var);
        m15395r();
        return mo11000k;
    }

    /* renamed from: p */
    public final void m15397p(int i, int i2) {
        while (i < this.f19716b.size()) {
            ((h88) this.f19716b.get(i)).f12187d += i2;
            i++;
        }
    }

    /* renamed from: q */
    public final void m15396q(h88 h88Var) {
        e88 e88Var = (e88) this.f19722h.get(h88Var);
        if (e88Var != null) {
            e88Var.f8257a.mo11008a(e88Var.f8258b);
        }
    }

    /* renamed from: r */
    public final void m15395r() {
        Iterator it = this.f19723i.iterator();
        while (it.hasNext()) {
            h88 h88Var = (h88) it.next();
            if (h88Var.f12186c.isEmpty()) {
                m15396q(h88Var);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    public final void m15394s(h88 h88Var) {
        if (h88Var.f12188e && h88Var.f12186c.isEmpty()) {
            e88 e88Var = (e88) this.f19722h.remove(h88Var);
            Objects.requireNonNull(e88Var);
            e88Var.f8257a.mo10997n(e88Var.f8258b);
            e88Var.f8257a.mo11004g(e88Var.f8259c);
            e88Var.f8257a.mo11002i(e88Var.f8259c);
            this.f19723i.remove(h88Var);
        }
    }

    /* renamed from: t */
    public final void m15393t(h88 h88Var) {
        kr8 kr8Var = h88Var.f12184a;
        qr8 qr8Var = new qr8() { // from class: com.daaw.y78
            @Override // com.daaw.qr8
            /* renamed from: a */
            public final void mo4028a(rr8 rr8Var, l64 l64Var) {
                n88.this.m15408e(rr8Var, l64Var);
            }
        };
        b88 b88Var = new b88(this, h88Var);
        this.f19722h.put(h88Var, new e88(kr8Var, qr8Var, b88Var));
        kr8Var.mo11005f(new Handler(it5.m19397e(), null), b88Var);
        kr8Var.mo11006d(new Handler(it5.m19397e(), null), b88Var);
        kr8Var.mo10998m(qr8Var, this.f19725k, this.f19715a);
    }

    /* renamed from: u */
    public final void m15392u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            h88 h88Var = (h88) this.f19716b.remove(i2);
            this.f19718d.remove(h88Var.f12185b);
            m15397p(i2, -h88Var.f12184a.m17448I().mo4509c());
            h88Var.f12188e = true;
            if (this.f19724j) {
                m15394s(h88Var);
            }
        }
    }
}
