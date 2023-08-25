package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class aj1 implements zi1 {

    /* renamed from: a */
    public final b61 f3222a;

    /* renamed from: b */
    public final AbstractC2374nx<yi1> f3223b;

    /* renamed from: c */
    public final mc1 f3224c;

    /* renamed from: com.daaw.aj1$a */
    /* loaded from: classes.dex */
    public class C0631a extends AbstractC2374nx<yi1> {
        public C0631a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, yi1 yi1Var) {
            String str = yi1Var.f33687a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            ni1Var.mo16229r(2, yi1Var.f33688b);
        }
    }

    /* renamed from: com.daaw.aj1$b */
    /* loaded from: classes.dex */
    public class C0632b extends mc1 {
        public C0632b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public aj1(b61 b61Var) {
        this.f3222a = b61Var;
        this.f3223b = new C0631a(b61Var);
        this.f3224c = new C0632b(b61Var);
    }

    @Override // com.daaw.zi1
    /* renamed from: a */
    public List<String> mo2279a() {
        e61 m23701q = e61.m23701q("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f3222a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f3222a, m23701q, false, null);
        try {
            ArrayList arrayList = new ArrayList(m8950b.getCount());
            while (m8950b.moveToNext()) {
                arrayList.add(m8950b.getString(0));
            }
            return arrayList;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.zi1
    /* renamed from: b */
    public void mo2278b(yi1 yi1Var) {
        this.f3222a.m26482b();
        this.f3222a.m26481c();
        try {
            this.f3223b.m14752h(yi1Var);
            this.f3222a.m26466r();
        } finally {
            this.f3222a.m26477g();
        }
    }

    @Override // com.daaw.zi1
    /* renamed from: c */
    public yi1 mo2277c(String str) {
        e61 m23701q = e61.m23701q("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f3222a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f3222a, m23701q, false, null);
        try {
            return m8950b.moveToFirst() ? new yi1(m8950b.getString(C2742qn.m12327b(m8950b, "work_spec_id")), m8950b.getInt(C2742qn.m12327b(m8950b, "system_id"))) : null;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.zi1
    /* renamed from: d */
    public void mo2276d(String str) {
        this.f3222a.m26482b();
        ni1 m16094a = this.f3224c.m16094a();
        if (str == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16231i(1, str);
        }
        this.f3222a.m26481c();
        try {
            m16094a.mo15165j();
            this.f3222a.m26466r();
        } finally {
            this.f3222a.m26477g();
            this.f3224c.m16090f(m16094a);
        }
    }
}
