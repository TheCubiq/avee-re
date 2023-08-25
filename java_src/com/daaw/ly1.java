package com.daaw;

import androidx.work.C0511b;
/* loaded from: classes.dex */
public final class ly1 implements ky1 {

    /* renamed from: a */
    public final b61 f17901a;

    /* renamed from: b */
    public final AbstractC2374nx<jy1> f17902b;

    /* renamed from: c */
    public final mc1 f17903c;

    /* renamed from: d */
    public final mc1 f17904d;

    /* renamed from: com.daaw.ly1$a */
    /* loaded from: classes.dex */
    public class C2135a extends AbstractC2374nx<jy1> {
        public C2135a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, jy1 jy1Var) {
            String str = jy1Var.f15508a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            byte[] m27962k = C0511b.m27962k(jy1Var.f15509b);
            if (m27962k == null) {
                ni1Var.mo16232F(2);
            } else {
                ni1Var.mo16228x(2, m27962k);
            }
        }
    }

    /* renamed from: com.daaw.ly1$b */
    /* loaded from: classes.dex */
    public class C2136b extends mc1 {
        public C2136b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: com.daaw.ly1$c */
    /* loaded from: classes.dex */
    public class C2137c extends mc1 {
        public C2137c(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public ly1(b61 b61Var) {
        this.f17901a = b61Var;
        this.f17902b = new C2135a(b61Var);
        this.f17903c = new C2136b(b61Var);
        this.f17904d = new C2137c(b61Var);
    }

    @Override // com.daaw.ky1
    /* renamed from: a */
    public void mo16378a(String str) {
        this.f17901a.m26482b();
        ni1 m16094a = this.f17903c.m16094a();
        if (str == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16231i(1, str);
        }
        this.f17901a.m26481c();
        try {
            m16094a.mo15165j();
            this.f17901a.m26466r();
        } finally {
            this.f17901a.m26477g();
            this.f17903c.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ky1
    /* renamed from: b */
    public void mo16377b(jy1 jy1Var) {
        this.f17901a.m26482b();
        this.f17901a.m26481c();
        try {
            this.f17902b.m14752h(jy1Var);
            this.f17901a.m26466r();
        } finally {
            this.f17901a.m26477g();
        }
    }

    @Override // com.daaw.ky1
    /* renamed from: c */
    public void mo16376c() {
        this.f17901a.m26482b();
        ni1 m16094a = this.f17904d.m16094a();
        this.f17901a.m26481c();
        try {
            m16094a.mo15165j();
            this.f17901a.m26466r();
        } finally {
            this.f17901a.m26477g();
            this.f17904d.m16090f(m16094a);
        }
    }
}
