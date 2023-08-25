package com.daaw;

import android.view.Surface;
import com.daaw.InterfaceC1671ia;
import com.daaw.InterfaceC3494x2;
import com.daaw.bp0;
import com.daaw.bx0;
import com.daaw.cp0;
import com.daaw.nl1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.InterfaceC3927b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
/* renamed from: com.daaw.o2 */
/* loaded from: classes.dex */
public class C2392o2 implements bx0.InterfaceC0893a, xp0, InterfaceC2251n7, rs1, cp0, InterfaceC1671ia.InterfaceC1672a, InterfaceC3927b {

    /* renamed from: q */
    public final InterfaceC3836zf f20927q;
    @MonotonicNonNull

    /* renamed from: t */
    public bx0 f20930t;

    /* renamed from: p */
    public final CopyOnWriteArraySet<InterfaceC3494x2> f20926p = new CopyOnWriteArraySet<>();

    /* renamed from: s */
    public final C2394b f20929s = new C2394b();

    /* renamed from: r */
    public final nl1.C2315c f20928r = new nl1.C2315c();

    /* renamed from: com.daaw.o2$a */
    /* loaded from: classes.dex */
    public static class C2393a {
        /* renamed from: a */
        public C2392o2 m14620a(bx0 bx0Var, InterfaceC3836zf interfaceC3836zf) {
            return new C2392o2(bx0Var, interfaceC3836zf);
        }
    }

    /* renamed from: com.daaw.o2$b */
    /* loaded from: classes.dex */
    public static final class C2394b {

        /* renamed from: c */
        public C2395c f20933c;

        /* renamed from: d */
        public C2395c f20934d;

        /* renamed from: f */
        public boolean f20936f;

        /* renamed from: a */
        public final ArrayList<C2395c> f20931a = new ArrayList<>();

        /* renamed from: b */
        public final nl1.C2314b f20932b = new nl1.C2314b();

        /* renamed from: e */
        public nl1 f20935e = nl1.f20215a;

        /* renamed from: b */
        public C2395c m14618b() {
            return this.f20933c;
        }

        /* renamed from: c */
        public C2395c m14617c() {
            if (this.f20931a.isEmpty()) {
                return null;
            }
            ArrayList<C2395c> arrayList = this.f20931a;
            return arrayList.get(arrayList.size() - 1);
        }

        /* renamed from: d */
        public C2395c m14616d() {
            if (this.f20931a.isEmpty() || this.f20935e.m15073o() || this.f20936f) {
                return null;
            }
            return this.f20931a.get(0);
        }

        /* renamed from: e */
        public C2395c m14615e() {
            return this.f20934d;
        }

        /* renamed from: f */
        public boolean m14614f() {
            return this.f20936f;
        }

        /* renamed from: g */
        public void m14613g(int i, bp0.C0880a c0880a) {
            this.f20931a.add(new C2395c(i, c0880a));
            if (this.f20931a.size() != 1 || this.f20935e.m15073o()) {
                return;
            }
            m14605o();
        }

        /* renamed from: h */
        public void m14612h(int i, bp0.C0880a c0880a) {
            C2395c c2395c = new C2395c(i, c0880a);
            this.f20931a.remove(c2395c);
            if (c2395c.equals(this.f20934d)) {
                this.f20934d = this.f20931a.isEmpty() ? null : this.f20931a.get(0);
            }
        }

        /* renamed from: i */
        public void m14611i(int i) {
            m14605o();
        }

        /* renamed from: j */
        public void m14610j(int i, bp0.C0880a c0880a) {
            this.f20934d = new C2395c(i, c0880a);
        }

        /* renamed from: k */
        public void m14609k() {
            this.f20936f = false;
            m14605o();
        }

        /* renamed from: l */
        public void m14608l() {
            this.f20936f = true;
        }

        /* renamed from: m */
        public void m14607m(nl1 nl1Var) {
            for (int i = 0; i < this.f20931a.size(); i++) {
                ArrayList<C2395c> arrayList = this.f20931a;
                arrayList.set(i, m14604p(arrayList.get(i), nl1Var));
            }
            C2395c c2395c = this.f20934d;
            if (c2395c != null) {
                this.f20934d = m14604p(c2395c, nl1Var);
            }
            this.f20935e = nl1Var;
            m14605o();
        }

        /* renamed from: n */
        public bp0.C0880a m14606n(int i) {
            nl1 nl1Var = this.f20935e;
            if (nl1Var != null) {
                int mo14377h = nl1Var.mo14377h();
                bp0.C0880a c0880a = null;
                for (int i2 = 0; i2 < this.f20931a.size(); i2++) {
                    C2395c c2395c = this.f20931a.get(i2);
                    int i3 = c2395c.f20938b.f5022a;
                    if (i3 < mo14377h && this.f20935e.m15078f(i3, this.f20932b).f20218c == i) {
                        if (c0880a != null) {
                            return null;
                        }
                        c0880a = c2395c.f20938b;
                    }
                }
                return c0880a;
            }
            return null;
        }

        /* renamed from: o */
        public final void m14605o() {
            if (this.f20931a.isEmpty()) {
                return;
            }
            this.f20933c = this.f20931a.get(0);
        }

        /* renamed from: p */
        public final C2395c m14604p(C2395c c2395c, nl1 nl1Var) {
            int mo14379b;
            return (nl1Var.m15073o() || this.f20935e.m15073o() || (mo14379b = nl1Var.mo14379b(this.f20935e.mo14378g(c2395c.f20938b.f5022a, this.f20932b, true).f20217b)) == -1) ? c2395c : new C2395c(nl1Var.m15078f(mo14379b, this.f20932b).f20218c, c2395c.f20938b.m25955a(mo14379b));
        }
    }

    /* renamed from: com.daaw.o2$c */
    /* loaded from: classes.dex */
    public static final class C2395c {

        /* renamed from: a */
        public final int f20937a;

        /* renamed from: b */
        public final bp0.C0880a f20938b;

        public C2395c(int i, bp0.C0880a c0880a) {
            this.f20937a = i;
            this.f20938b = c0880a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2395c.class != obj.getClass()) {
                return false;
            }
            C2395c c2395c = (C2395c) obj;
            return this.f20937a == c2395c.f20937a && this.f20938b.equals(c2395c.f20938b);
        }

        public int hashCode() {
            return (this.f20937a * 31) + this.f20938b.hashCode();
        }
    }

    public C2392o2(bx0 bx0Var, InterfaceC3836zf interfaceC3836zf) {
        this.f20930t = bx0Var;
        this.f20927q = (InterfaceC3836zf) C2914s6.m10686e(interfaceC3836zf);
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: A */
    public final void mo13834A(C2802qz c2802qz) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5617y(m14635L, c2802qz);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: B */
    public final void mo14645B(int i, long j, long j2) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5624r(m14634M, i, j, j2);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: C */
    public final void mo14644C(int i, bp0.C0880a c0880a, cp0.C0987c c0987c) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5640b(m14639H, c0987c);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: D */
    public final void mo14643D(C1321fq c1321fq) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5623s(m14635L, 1, c1321fq);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: E */
    public final void mo14642E(int i, bp0.C0880a c0880a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5644A(m14639H, c0986b, c0987c);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: F */
    public final void mo14641F(int i, bp0.C0880a c0880a, cp0.C0986b c0986b, cp0.C0987c c0987c, IOException iOException, boolean z) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5625q(m14639H, c0986b, c0987c, iOException, z);
        }
    }

    /* renamed from: G */
    public void m14640G(InterfaceC3494x2 interfaceC3494x2) {
        this.f20926p.add(interfaceC3494x2);
    }

    /* renamed from: H */
    public InterfaceC3494x2.C3495a m14639H(int i, bp0.C0880a c0880a) {
        long m15055a;
        long j;
        C2914s6.m10686e(this.f20930t);
        long mo2363b = this.f20927q.mo2363b();
        nl1 mo8681n = this.f20930t.mo8681n();
        long j2 = 0;
        if (i != this.f20930t.mo8688g()) {
            if (i < mo8681n.mo14375n() && (c0880a == null || !c0880a.m25954b())) {
                m15055a = mo8681n.m15075k(i, this.f20928r).m15055a();
                j = m15055a;
            }
            j = j2;
        } else if (c0880a == null || !c0880a.m25954b()) {
            m15055a = this.f20930t.mo8686i();
            j = m15055a;
        } else {
            if (this.f20930t.mo8682m() == c0880a.f5023b && this.f20930t.mo8690e() == c0880a.f5024c) {
                j2 = this.f20930t.mo8680o();
            }
            j = j2;
        }
        return new InterfaceC3494x2.C3495a(mo2363b, mo8681n, i, c0880a, j, this.f20930t.mo8680o(), this.f20930t.mo8685j() - this.f20930t.mo8686i());
    }

    /* renamed from: I */
    public final InterfaceC3494x2.C3495a m14638I(C2395c c2395c) {
        if (c2395c == null) {
            int mo8688g = ((bx0) C2914s6.m10686e(this.f20930t)).mo8688g();
            return m14639H(mo8688g, this.f20929s.m14606n(mo8688g));
        }
        return m14639H(c2395c.f20937a, c2395c.f20938b);
    }

    /* renamed from: J */
    public final InterfaceC3494x2.C3495a m14637J() {
        return m14638I(this.f20929s.m14618b());
    }

    /* renamed from: K */
    public final InterfaceC3494x2.C3495a m14636K() {
        return m14638I(this.f20929s.m14617c());
    }

    /* renamed from: L */
    public final InterfaceC3494x2.C3495a m14635L() {
        return m14638I(this.f20929s.m14616d());
    }

    /* renamed from: M */
    public final InterfaceC3494x2.C3495a m14634M() {
        return m14638I(this.f20929s.m14615e());
    }

    /* renamed from: N */
    public final void m14633N() {
        if (this.f20929s.m14614f()) {
            return;
        }
        InterfaceC3494x2.C3495a m14635L = m14635L();
        this.f20929s.m14608l();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5636f(m14635L);
        }
    }

    /* renamed from: O */
    public final void m14632O() {
        for (C2395c c2395c : new ArrayList(this.f20929s.f20931a)) {
            mo14630h(c2395c.f20937a, c2395c.f20938b);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: a */
    public final void mo14631a(int i) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5637e(m14634M, i);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: b */
    public final void mo10992b(int i, int i2, int i3, float f) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5618x(m14634M, i, i2, i3, f);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: c */
    public final void mo13821c(zw0 zw0Var) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5622t(m14635L, zw0Var);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: d */
    public final void mo13820d(boolean z) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5632j(m14635L, z);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: e */
    public final void mo13819e(int i) {
        this.f20929s.m14611i(i);
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5634h(m14635L, i);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: f */
    public final void mo10991f(String str, long j, long j2) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5620v(m14634M, 2, str, j2);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: g */
    public final void mo13818g() {
        if (this.f20929s.m14614f()) {
            this.f20929s.m14609k();
            InterfaceC3494x2.C3495a m14635L = m14635L();
            Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
            while (it.hasNext()) {
                it.next().mo5616z(m14635L);
            }
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: h */
    public final void mo14630h(int i, bp0.C0880a c0880a) {
        this.f20929s.m14612h(i, c0880a);
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5643B(m14639H);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: i */
    public final void mo10990i(Surface surface) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5629m(m14634M, surface);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: j */
    public final void mo14629j(C1321fq c1321fq) {
        InterfaceC3494x2.C3495a m14637J = m14637J();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5633i(m14637J, 1, c1321fq);
        }
    }

    @Override // com.daaw.InterfaceC1671ia.InterfaceC1672a
    /* renamed from: k */
    public final void mo14628k(int i, long j, long j2) {
        InterfaceC3494x2.C3495a m14636K = m14636K();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5619w(m14636K, i, j, j2);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: l */
    public final void mo14627l(int i, bp0.C0880a c0880a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5638d(m14639H, c0986b, c0987c);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: m */
    public final void mo13813m(TrackGroupArray trackGroupArray, um1 um1Var) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5628n(m14635L, trackGroupArray, um1Var);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: n */
    public final void mo14626n(String str, long j, long j2) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5620v(m14634M, 1, str, j2);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: o */
    public final void mo14625o(int i, bp0.C0880a c0880a, cp0.C0987c c0987c) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5641a(m14639H, c0987c);
        }
    }

    @Override // com.daaw.xp0
    /* renamed from: p */
    public final void mo4856p(Metadata metadata) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5630l(m14635L, metadata);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: q */
    public final void mo10989q(int i, long j) {
        InterfaceC3494x2.C3495a m14637J = m14637J();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5639c(m14637J, i, j);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: r */
    public final void mo14624r(int i, bp0.C0880a c0880a) {
        this.f20929s.m14613g(i, c0880a);
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5626p(m14639H);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: s */
    public final void mo13808s(boolean z, int i) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5635g(m14635L, z, i);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: t */
    public final void mo14623t(int i, bp0.C0880a c0880a) {
        this.f20929s.m14610j(i, c0880a);
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5621u(m14639H);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: u */
    public final void mo10988u(C1321fq c1321fq) {
        InterfaceC3494x2.C3495a m14637J = m14637J();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5633i(m14637J, 2, c1321fq);
        }
    }

    @Override // com.daaw.bx0.InterfaceC0893a
    /* renamed from: v */
    public final void mo13805v(nl1 nl1Var, Object obj, int i) {
        this.f20929s.m14607m(nl1Var);
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5642C(m14635L, i);
        }
    }

    @Override // com.daaw.cp0
    /* renamed from: w */
    public final void mo14622w(int i, bp0.C0880a c0880a, cp0.C0986b c0986b, cp0.C0987c c0987c) {
        InterfaceC3494x2.C3495a m14639H = m14639H(i, c0880a);
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5627o(m14639H, c0986b, c0987c);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: x */
    public final void mo10987x(Format format) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5631k(m14634M, 2, format);
        }
    }

    @Override // com.daaw.rs1
    /* renamed from: y */
    public final void mo10986y(C1321fq c1321fq) {
        InterfaceC3494x2.C3495a m14635L = m14635L();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5623s(m14635L, 2, c1321fq);
        }
    }

    @Override // com.daaw.InterfaceC2251n7
    /* renamed from: z */
    public final void mo14621z(Format format) {
        InterfaceC3494x2.C3495a m14634M = m14634M();
        Iterator<InterfaceC3494x2> it = this.f20926p.iterator();
        while (it.hasNext()) {
            it.next().mo5631k(m14634M, 1, format);
        }
    }
}
