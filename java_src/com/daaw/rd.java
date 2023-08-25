package com.daaw;

import androidx.work.impl.WorkDatabase;
import com.daaw.qu0;
import java.util.LinkedList;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class rd implements Runnable {
    public final ru0 p = new ru0();

    /* loaded from: classes.dex */
    public class a extends rd {
        public final /* synthetic */ ey1 q;
        public final /* synthetic */ UUID r;

        public a(ey1 ey1Var, UUID uuid) {
            this.q = ey1Var;
            this.r = uuid;
        }

        @Override // com.daaw.rd
        public void h() {
            WorkDatabase o = this.q.o();
            o.c();
            try {
                a(this.q, this.r.toString());
                o.r();
                o.g();
                g(this.q);
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends rd {
        public final /* synthetic */ ey1 q;
        public final /* synthetic */ String r;

        public b(ey1 ey1Var, String str) {
            this.q = ey1Var;
            this.r = str;
        }

        @Override // com.daaw.rd
        public void h() {
            WorkDatabase o = this.q.o();
            o.c();
            try {
                for (String str : o.B().o(this.r)) {
                    a(this.q, str);
                }
                o.r();
                o.g();
                g(this.q);
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends rd {
        public final /* synthetic */ ey1 q;
        public final /* synthetic */ String r;
        public final /* synthetic */ boolean s;

        public c(ey1 ey1Var, String str, boolean z) {
            this.q = ey1Var;
            this.r = str;
            this.s = z;
        }

        @Override // com.daaw.rd
        public void h() {
            WorkDatabase o = this.q.o();
            o.c();
            try {
                for (String str : o.B().j(this.r)) {
                    a(this.q, str);
                }
                o.r();
                o.g();
                if (this.s) {
                    g(this.q);
                }
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
    }

    public static rd b(UUID uuid, ey1 ey1Var) {
        return new a(ey1Var, uuid);
    }

    public static rd c(String str, ey1 ey1Var, boolean z) {
        return new c(ey1Var, str, z);
    }

    public static rd d(String str, ey1 ey1Var) {
        return new b(ey1Var, str);
    }

    public void a(ey1 ey1Var, String str) {
        f(ey1Var.o(), str);
        ey1Var.m().l(str);
        for (r81 r81Var : ey1Var.n()) {
            r81Var.d(str);
        }
    }

    public qu0 e() {
        return this.p;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        ry1 B = workDatabase.B();
        bt t = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            yx1 l = B.l(str2);
            if (l != yx1.SUCCEEDED && l != yx1.FAILED) {
                B.k(yx1.CANCELLED, str2);
            }
            linkedList.addAll(t.a(str2));
        }
    }

    public void g(ey1 ey1Var) {
        v81.b(ey1Var.i(), ey1Var.o(), ey1Var.n());
    }

    public abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.p.a(qu0.a);
        } catch (Throwable th) {
            this.p.a(new qu0.b.a(th));
        }
    }
}
