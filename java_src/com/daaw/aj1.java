package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class aj1 implements zi1 {
    public final b61 a;
    public final nx<yi1> b;
    public final mc1 c;

    /* loaded from: classes.dex */
    public class a extends nx<yi1> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, yi1 yi1Var) {
            String str = yi1Var.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            ni1Var.r(2, yi1Var.b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends mc1 {
        public b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public aj1(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
        this.c = new b(b61Var);
    }

    @Override // com.daaw.zi1
    public List<String> a() {
        e61 q = e61.q("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.zi1
    public void b(yi1 yi1Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(yi1Var);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.zi1
    public yi1 c(String str) {
        e61 q = e61.q("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            return b2.moveToFirst() ? new yi1(b2.getString(qn.b(b2, "work_spec_id")), b2.getInt(qn.b(b2, "system_id"))) : null;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.zi1
    public void d(String str) {
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
}
