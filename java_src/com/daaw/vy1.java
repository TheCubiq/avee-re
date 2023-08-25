package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class vy1 implements uy1 {
    public final b61 a;
    public final nx<ty1> b;

    /* loaded from: classes.dex */
    public class a extends nx<ty1> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, ty1 ty1Var) {
            String str = ty1Var.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            String str2 = ty1Var.b;
            if (str2 == null) {
                ni1Var.F(2);
            } else {
                ni1Var.i(2, str2);
            }
        }
    }

    public vy1(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
    }

    @Override // com.daaw.uy1
    public List<String> a(String str) {
        e61 q = e61.q("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b = to.b(this.a, q, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            q.D();
        }
    }

    @Override // com.daaw.uy1
    public void b(ty1 ty1Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(ty1Var);
            this.a.r();
        } finally {
            this.a.g();
        }
    }
}
