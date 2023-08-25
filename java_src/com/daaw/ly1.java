package com.daaw;
/* loaded from: classes.dex */
public final class ly1 implements ky1 {
    public final b61 a;
    public final nx<jy1> b;
    public final mc1 c;
    public final mc1 d;

    /* loaded from: classes.dex */
    public class a extends nx<jy1> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, jy1 jy1Var) {
            String str = jy1Var.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            byte[] k = androidx.work.b.k(jy1Var.b);
            if (k == null) {
                ni1Var.F(2);
            } else {
                ni1Var.x(2, k);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends mc1 {
        public b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends mc1 {
        public c(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public ly1(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
        this.c = new b(b61Var);
        this.d = new c(b61Var);
    }

    @Override // com.daaw.ky1
    public void a(String str) {
        this.a.b();
        ni1 a2 = this.c.a();
        if (str == null) {
            a2.F(1);
        } else {
            a2.i(1, str);
        }
        this.a.c();
        try {
            a2.j();
            this.a.r();
        } finally {
            this.a.g();
            this.c.f(a2);
        }
    }

    @Override // com.daaw.ky1
    public void b(jy1 jy1Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(jy1Var);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.ky1
    public void c() {
        this.a.b();
        ni1 a2 = this.d.a();
        this.a.c();
        try {
            a2.j();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(a2);
        }
    }
}
