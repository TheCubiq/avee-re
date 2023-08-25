package com.daaw;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class vy1 implements uy1 {

    /* renamed from: a */
    public final b61 f30704a;

    /* renamed from: b */
    public final AbstractC2374nx<ty1> f30705b;

    /* renamed from: com.daaw.vy1$a */
    /* loaded from: classes.dex */
    public class C3386a extends AbstractC2374nx<ty1> {
        public C3386a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, ty1 ty1Var) {
            String str = ty1Var.f28247a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            String str2 = ty1Var.f28248b;
            if (str2 == null) {
                ni1Var.mo16232F(2);
            } else {
                ni1Var.mo16231i(2, str2);
            }
        }
    }

    public vy1(b61 b61Var) {
        this.f30704a = b61Var;
        this.f30705b = new C3386a(b61Var);
    }

    @Override // com.daaw.uy1
    /* renamed from: a */
    public List<String> mo6670a(String str) {
        e61 m23701q = e61.m23701q("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f30704a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f30704a, m23701q, false, null);
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

    @Override // com.daaw.uy1
    /* renamed from: b */
    public void mo6669b(ty1 ty1Var) {
        this.f30704a.m26482b();
        this.f30704a.m26481c();
        try {
            this.f30705b.m14752h(ty1Var);
            this.f30704a.m26466r();
        } finally {
            this.f30704a.m26477g();
        }
    }
}
