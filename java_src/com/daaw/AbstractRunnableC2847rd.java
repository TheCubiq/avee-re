package com.daaw;

import androidx.work.impl.WorkDatabase;
import com.daaw.qu0;
import java.util.LinkedList;
import java.util.UUID;
/* renamed from: com.daaw.rd */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2847rd implements Runnable {

    /* renamed from: p */
    public final ru0 f25144p = new ru0();

    /* renamed from: com.daaw.rd$a */
    /* loaded from: classes.dex */
    public class C2848a extends AbstractRunnableC2847rd {

        /* renamed from: q */
        public final /* synthetic */ ey1 f25145q;

        /* renamed from: r */
        public final /* synthetic */ UUID f25146r;

        public C2848a(ey1 ey1Var, UUID uuid) {
            this.f25145q = ey1Var;
            this.f25146r = uuid;
        }

        @Override // com.daaw.AbstractRunnableC2847rd
        /* renamed from: h */
        public void mo11410h() {
            WorkDatabase m23000o = this.f25145q.m23000o();
            m23000o.m26481c();
            try {
                m11417a(this.f25145q, this.f25146r.toString());
                m23000o.m26466r();
                m23000o.m26477g();
                m11411g(this.f25145q);
            } catch (Throwable th) {
                m23000o.m26477g();
                throw th;
            }
        }
    }

    /* renamed from: com.daaw.rd$b */
    /* loaded from: classes.dex */
    public class C2849b extends AbstractRunnableC2847rd {

        /* renamed from: q */
        public final /* synthetic */ ey1 f25147q;

        /* renamed from: r */
        public final /* synthetic */ String f25148r;

        public C2849b(ey1 ey1Var, String str) {
            this.f25147q = ey1Var;
            this.f25148r = str;
        }

        @Override // com.daaw.AbstractRunnableC2847rd
        /* renamed from: h */
        public void mo11410h() {
            WorkDatabase m23000o = this.f25147q.m23000o();
            m23000o.m26481c();
            try {
                for (String str : m23000o.mo27951B().mo9717o(this.f25148r)) {
                    m11417a(this.f25147q, str);
                }
                m23000o.m26466r();
                m23000o.m26477g();
                m11411g(this.f25147q);
            } catch (Throwable th) {
                m23000o.m26477g();
                throw th;
            }
        }
    }

    /* renamed from: com.daaw.rd$c */
    /* loaded from: classes.dex */
    public class C2850c extends AbstractRunnableC2847rd {

        /* renamed from: q */
        public final /* synthetic */ ey1 f25149q;

        /* renamed from: r */
        public final /* synthetic */ String f25150r;

        /* renamed from: s */
        public final /* synthetic */ boolean f25151s;

        public C2850c(ey1 ey1Var, String str, boolean z) {
            this.f25149q = ey1Var;
            this.f25150r = str;
            this.f25151s = z;
        }

        @Override // com.daaw.AbstractRunnableC2847rd
        /* renamed from: h */
        public void mo11410h() {
            WorkDatabase m23000o = this.f25149q.m23000o();
            m23000o.m26481c();
            try {
                for (String str : m23000o.mo27951B().mo9722j(this.f25150r)) {
                    m11417a(this.f25149q, str);
                }
                m23000o.m26466r();
                m23000o.m26477g();
                if (this.f25151s) {
                    m11411g(this.f25149q);
                }
            } catch (Throwable th) {
                m23000o.m26477g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC2847rd m11416b(UUID uuid, ey1 ey1Var) {
        return new C2848a(ey1Var, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC2847rd m11415c(String str, ey1 ey1Var, boolean z) {
        return new C2850c(ey1Var, str, z);
    }

    /* renamed from: d */
    public static AbstractRunnableC2847rd m11414d(String str, ey1 ey1Var) {
        return new C2849b(ey1Var, str);
    }

    /* renamed from: a */
    public void m11417a(ey1 ey1Var, String str) {
        m11412f(ey1Var.m23000o(), str);
        ey1Var.m23002m().m18150l(str);
        for (r81 r81Var : ey1Var.m23001n()) {
            r81Var.mo9088d(str);
        }
    }

    /* renamed from: e */
    public qu0 m11413e() {
        return this.f25144p;
    }

    /* renamed from: f */
    public final void m11412f(WorkDatabase workDatabase, String str) {
        ry1 mo27951B = workDatabase.mo27951B();
        InterfaceC0885bt mo27938t = workDatabase.mo27938t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            yx1 mo9720l = mo27951B.mo9720l(str2);
            if (mo9720l != yx1.SUCCEEDED && mo9720l != yx1.FAILED) {
                mo27951B.mo9721k(yx1.CANCELLED, str2);
            }
            linkedList.addAll(mo27938t.mo24984a(str2));
        }
    }

    /* renamed from: g */
    public void m11411g(ey1 ey1Var) {
        v81.m7346b(ey1Var.m23006i(), ey1Var.m23000o(), ey1Var.m23001n());
    }

    /* renamed from: h */
    public abstract void mo11410h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo11410h();
            this.f25144p.m10938a(qu0.f24327a);
        } catch (Throwable th) {
            this.f25144p.m10938a(new qu0.AbstractC2755b.C2756a(th));
        }
    }
}
