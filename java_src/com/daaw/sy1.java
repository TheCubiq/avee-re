package com.daaw;

import android.database.Cursor;
import androidx.work.C0511b;
import com.daaw.qy1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class sy1 implements ry1 {

    /* renamed from: a */
    public final b61 f26789a;

    /* renamed from: b */
    public final AbstractC2374nx<qy1> f26790b;

    /* renamed from: c */
    public final mc1 f26791c;

    /* renamed from: d */
    public final mc1 f26792d;

    /* renamed from: e */
    public final mc1 f26793e;

    /* renamed from: f */
    public final mc1 f26794f;

    /* renamed from: g */
    public final mc1 f26795g;

    /* renamed from: h */
    public final mc1 f26796h;

    /* renamed from: i */
    public final mc1 f26797i;

    /* renamed from: j */
    public final mc1 f26798j;

    /* renamed from: com.daaw.sy1$a */
    /* loaded from: classes.dex */
    public class C2990a extends AbstractC2374nx<qy1> {
        public C2990a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // com.daaw.AbstractC2374nx
        /* renamed from: i */
        public void mo3081g(ni1 ni1Var, qy1 qy1Var) {
            String str = qy1Var.f24624a;
            if (str == null) {
                ni1Var.mo16232F(1);
            } else {
                ni1Var.mo16231i(1, str);
            }
            ni1Var.mo16229r(2, xy1.m4401j(qy1Var.f24625b));
            String str2 = qy1Var.f24626c;
            if (str2 == null) {
                ni1Var.mo16232F(3);
            } else {
                ni1Var.mo16231i(3, str2);
            }
            String str3 = qy1Var.f24627d;
            if (str3 == null) {
                ni1Var.mo16232F(4);
            } else {
                ni1Var.mo16231i(4, str3);
            }
            byte[] m27962k = C0511b.m27962k(qy1Var.f24628e);
            if (m27962k == null) {
                ni1Var.mo16232F(5);
            } else {
                ni1Var.mo16228x(5, m27962k);
            }
            byte[] m27962k2 = C0511b.m27962k(qy1Var.f24629f);
            if (m27962k2 == null) {
                ni1Var.mo16232F(6);
            } else {
                ni1Var.mo16228x(6, m27962k2);
            }
            ni1Var.mo16229r(7, qy1Var.f24630g);
            ni1Var.mo16229r(8, qy1Var.f24631h);
            ni1Var.mo16229r(9, qy1Var.f24632i);
            ni1Var.mo16229r(10, qy1Var.f24634k);
            ni1Var.mo16229r(11, xy1.m4410a(qy1Var.f24635l));
            ni1Var.mo16229r(12, qy1Var.f24636m);
            ni1Var.mo16229r(13, qy1Var.f24637n);
            ni1Var.mo16229r(14, qy1Var.f24638o);
            ni1Var.mo16229r(15, qy1Var.f24639p);
            ni1Var.mo16229r(16, qy1Var.f24640q ? 1L : 0L);
            ni1Var.mo16229r(17, xy1.m4402i(qy1Var.f24641r));
            C2943sj c2943sj = qy1Var.f24633j;
            if (c2943sj != null) {
                ni1Var.mo16229r(18, xy1.m4403h(c2943sj.m10322b()));
                ni1Var.mo16229r(19, c2943sj.m10317g() ? 1L : 0L);
                ni1Var.mo16229r(20, c2943sj.m10316h() ? 1L : 0L);
                ni1Var.mo16229r(21, c2943sj.m10318f() ? 1L : 0L);
                ni1Var.mo16229r(22, c2943sj.m10315i() ? 1L : 0L);
                ni1Var.mo16229r(23, c2943sj.m10321c());
                ni1Var.mo16229r(24, c2943sj.m10320d());
                byte[] m4408c = xy1.m4408c(c2943sj.m10323a());
                if (m4408c != null) {
                    ni1Var.mo16228x(25, m4408c);
                    return;
                }
            } else {
                ni1Var.mo16232F(18);
                ni1Var.mo16232F(19);
                ni1Var.mo16232F(20);
                ni1Var.mo16232F(21);
                ni1Var.mo16232F(22);
                ni1Var.mo16232F(23);
                ni1Var.mo16232F(24);
            }
            ni1Var.mo16232F(25);
        }
    }

    /* renamed from: com.daaw.sy1$b */
    /* loaded from: classes.dex */
    public class C2991b extends mc1 {
        public C2991b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$c */
    /* loaded from: classes.dex */
    public class C2992c extends mc1 {
        public C2992c(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$d */
    /* loaded from: classes.dex */
    public class C2993d extends mc1 {
        public C2993d(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$e */
    /* loaded from: classes.dex */
    public class C2994e extends mc1 {
        public C2994e(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$f */
    /* loaded from: classes.dex */
    public class C2995f extends mc1 {
        public C2995f(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$g */
    /* loaded from: classes.dex */
    public class C2996g extends mc1 {
        public C2996g(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: com.daaw.sy1$h */
    /* loaded from: classes.dex */
    public class C2997h extends mc1 {
        public C2997h(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: com.daaw.sy1$i */
    /* loaded from: classes.dex */
    public class C2998i extends mc1 {
        public C2998i(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        /* renamed from: d */
        public String mo3082d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public sy1(b61 b61Var) {
        this.f26789a = b61Var;
        this.f26790b = new C2990a(b61Var);
        this.f26791c = new C2991b(b61Var);
        this.f26792d = new C2992c(b61Var);
        this.f26793e = new C2993d(b61Var);
        this.f26794f = new C2994e(b61Var);
        this.f26795g = new C2995f(b61Var);
        this.f26796h = new C2996g(b61Var);
        this.f26797i = new C2997h(b61Var);
        this.f26798j = new C2998i(b61Var);
    }

    @Override // com.daaw.ry1
    /* renamed from: a */
    public void mo9731a(String str) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26791c.m16094a();
        if (str == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16231i(1, str);
        }
        this.f26789a.m26481c();
        try {
            m16094a.mo15165j();
            this.f26789a.m26466r();
        } finally {
            this.f26789a.m26477g();
            this.f26791c.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: b */
    public int mo9730b(String str, long j) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26796h.m16094a();
        m16094a.mo16229r(1, j);
        if (str == null) {
            m16094a.mo16232F(2);
        } else {
            m16094a.mo16231i(2, str);
        }
        this.f26789a.m26481c();
        try {
            int mo15165j = m16094a.mo15165j();
            this.f26789a.m26466r();
            return mo15165j;
        } finally {
            this.f26789a.m26477g();
            this.f26796h.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: c */
    public List<qy1.C2801b> mo9729c(String str) {
        e61 m23701q = e61.m23701q("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "id");
            int m12327b2 = C2742qn.m12327b(m8950b, "state");
            ArrayList arrayList = new ArrayList(m8950b.getCount());
            while (m8950b.moveToNext()) {
                qy1.C2801b c2801b = new qy1.C2801b();
                c2801b.f24642a = m8950b.getString(m12327b);
                c2801b.f24643b = xy1.m4404g(m8950b.getInt(m12327b2));
                arrayList.add(c2801b);
            }
            return arrayList;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: d */
    public List<qy1> mo9728d(long j) {
        e61 e61Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        m23701q.mo16229r(1, j);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                int i = m12327b14;
                ArrayList arrayList = new ArrayList(m8950b.getCount());
                while (m8950b.moveToNext()) {
                    String string = m8950b.getString(m12327b9);
                    int i2 = m12327b9;
                    String string2 = m8950b.getString(m12327b11);
                    int i3 = m12327b11;
                    C2943sj c2943sj = new C2943sj();
                    int i4 = m12327b;
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    int i5 = m12327b2;
                    int i6 = m12327b3;
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var.f24627d = m8950b.getString(m12327b12);
                    qy1Var.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    int i7 = i;
                    qy1Var.f24629f = C0511b.m27966g(m8950b.getBlob(i7));
                    int i8 = m12327b15;
                    i = i7;
                    qy1Var.f24630g = m8950b.getLong(i8);
                    int i9 = m12327b12;
                    int i10 = m12327b16;
                    qy1Var.f24631h = m8950b.getLong(i10);
                    int i11 = m12327b4;
                    int i12 = m12327b17;
                    qy1Var.f24632i = m8950b.getLong(i12);
                    int i13 = m12327b18;
                    qy1Var.f24634k = m8950b.getInt(i13);
                    int i14 = m12327b19;
                    qy1Var.f24635l = xy1.m4407d(m8950b.getInt(i14));
                    m12327b17 = i12;
                    int i15 = m12327b20;
                    qy1Var.f24636m = m8950b.getLong(i15);
                    int i16 = m12327b21;
                    qy1Var.f24637n = m8950b.getLong(i16);
                    m12327b21 = i16;
                    int i17 = m12327b22;
                    qy1Var.f24638o = m8950b.getLong(i17);
                    int i18 = m12327b23;
                    qy1Var.f24639p = m8950b.getLong(i18);
                    int i19 = m12327b24;
                    qy1Var.f24640q = m8950b.getInt(i19) != 0;
                    int i20 = m12327b25;
                    qy1Var.f24641r = xy1.m4405f(m8950b.getInt(i20));
                    qy1Var.f24633j = c2943sj;
                    arrayList.add(qy1Var);
                    m12327b2 = i5;
                    m12327b25 = i20;
                    m12327b12 = i9;
                    m12327b15 = i8;
                    m12327b16 = i10;
                    m12327b18 = i13;
                    m12327b23 = i18;
                    m12327b9 = i2;
                    m12327b11 = i3;
                    m12327b = i4;
                    m12327b24 = i19;
                    m12327b22 = i17;
                    m12327b3 = i6;
                    m12327b20 = i15;
                    m12327b4 = i11;
                    m12327b19 = i14;
                }
                m8950b.close();
                e61Var.m23702D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: e */
    public List<qy1> mo9727e(int i) {
        e61 e61Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m23701q.mo16229r(1, i);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                int i2 = m12327b14;
                ArrayList arrayList = new ArrayList(m8950b.getCount());
                while (m8950b.moveToNext()) {
                    String string = m8950b.getString(m12327b9);
                    int i3 = m12327b9;
                    String string2 = m8950b.getString(m12327b11);
                    int i4 = m12327b11;
                    C2943sj c2943sj = new C2943sj();
                    int i5 = m12327b;
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    int i6 = m12327b2;
                    int i7 = m12327b3;
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var.f24627d = m8950b.getString(m12327b12);
                    qy1Var.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    int i8 = i2;
                    qy1Var.f24629f = C0511b.m27966g(m8950b.getBlob(i8));
                    i2 = i8;
                    int i9 = m12327b15;
                    qy1Var.f24630g = m8950b.getLong(i9);
                    int i10 = m12327b12;
                    int i11 = m12327b16;
                    qy1Var.f24631h = m8950b.getLong(i11);
                    int i12 = m12327b4;
                    int i13 = m12327b17;
                    qy1Var.f24632i = m8950b.getLong(i13);
                    int i14 = m12327b18;
                    qy1Var.f24634k = m8950b.getInt(i14);
                    int i15 = m12327b19;
                    qy1Var.f24635l = xy1.m4407d(m8950b.getInt(i15));
                    m12327b17 = i13;
                    int i16 = m12327b20;
                    qy1Var.f24636m = m8950b.getLong(i16);
                    int i17 = m12327b21;
                    qy1Var.f24637n = m8950b.getLong(i17);
                    m12327b21 = i17;
                    int i18 = m12327b22;
                    qy1Var.f24638o = m8950b.getLong(i18);
                    int i19 = m12327b23;
                    qy1Var.f24639p = m8950b.getLong(i19);
                    int i20 = m12327b24;
                    qy1Var.f24640q = m8950b.getInt(i20) != 0;
                    int i21 = m12327b25;
                    qy1Var.f24641r = xy1.m4405f(m8950b.getInt(i21));
                    qy1Var.f24633j = c2943sj;
                    arrayList.add(qy1Var);
                    m12327b25 = i21;
                    m12327b2 = i6;
                    m12327b12 = i10;
                    m12327b15 = i9;
                    m12327b16 = i11;
                    m12327b18 = i14;
                    m12327b23 = i19;
                    m12327b9 = i3;
                    m12327b11 = i4;
                    m12327b = i5;
                    m12327b24 = i20;
                    m12327b22 = i18;
                    m12327b3 = i7;
                    m12327b20 = i16;
                    m12327b4 = i12;
                    m12327b19 = i15;
                }
                m8950b.close();
                e61Var.m23702D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: f */
    public List<qy1> mo9726f() {
        e61 e61Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                int i = m12327b14;
                ArrayList arrayList = new ArrayList(m8950b.getCount());
                while (m8950b.moveToNext()) {
                    String string = m8950b.getString(m12327b9);
                    int i2 = m12327b9;
                    String string2 = m8950b.getString(m12327b11);
                    int i3 = m12327b11;
                    C2943sj c2943sj = new C2943sj();
                    int i4 = m12327b;
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    int i5 = m12327b2;
                    int i6 = m12327b3;
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var.f24627d = m8950b.getString(m12327b12);
                    qy1Var.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    int i7 = i;
                    qy1Var.f24629f = C0511b.m27966g(m8950b.getBlob(i7));
                    i = i7;
                    int i8 = m12327b15;
                    qy1Var.f24630g = m8950b.getLong(i8);
                    int i9 = m12327b13;
                    int i10 = m12327b16;
                    qy1Var.f24631h = m8950b.getLong(i10);
                    int i11 = m12327b4;
                    int i12 = m12327b17;
                    qy1Var.f24632i = m8950b.getLong(i12);
                    int i13 = m12327b18;
                    qy1Var.f24634k = m8950b.getInt(i13);
                    int i14 = m12327b19;
                    qy1Var.f24635l = xy1.m4407d(m8950b.getInt(i14));
                    m12327b17 = i12;
                    int i15 = m12327b20;
                    qy1Var.f24636m = m8950b.getLong(i15);
                    int i16 = m12327b21;
                    qy1Var.f24637n = m8950b.getLong(i16);
                    m12327b21 = i16;
                    int i17 = m12327b22;
                    qy1Var.f24638o = m8950b.getLong(i17);
                    int i18 = m12327b23;
                    qy1Var.f24639p = m8950b.getLong(i18);
                    int i19 = m12327b24;
                    qy1Var.f24640q = m8950b.getInt(i19) != 0;
                    int i20 = m12327b25;
                    qy1Var.f24641r = xy1.m4405f(m8950b.getInt(i20));
                    qy1Var.f24633j = c2943sj;
                    arrayList.add(qy1Var);
                    m12327b25 = i20;
                    m12327b2 = i5;
                    m12327b13 = i9;
                    m12327b15 = i8;
                    m12327b16 = i10;
                    m12327b18 = i13;
                    m12327b23 = i18;
                    m12327b9 = i2;
                    m12327b11 = i3;
                    m12327b = i4;
                    m12327b24 = i19;
                    m12327b22 = i17;
                    m12327b3 = i6;
                    m12327b20 = i15;
                    m12327b4 = i11;
                    m12327b19 = i14;
                }
                m8950b.close();
                e61Var.m23702D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: g */
    public void mo9725g(String str, C0511b c0511b) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26792d.m16094a();
        byte[] m27962k = C0511b.m27962k(c0511b);
        if (m27962k == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16228x(1, m27962k);
        }
        if (str == null) {
            m16094a.mo16232F(2);
        } else {
            m16094a.mo16231i(2, str);
        }
        this.f26789a.m26481c();
        try {
            m16094a.mo15165j();
            this.f26789a.m26466r();
        } finally {
            this.f26789a.m26477g();
            this.f26792d.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: h */
    public List<qy1> mo9724h() {
        e61 e61Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                int i = m12327b14;
                ArrayList arrayList = new ArrayList(m8950b.getCount());
                while (m8950b.moveToNext()) {
                    String string = m8950b.getString(m12327b9);
                    int i2 = m12327b9;
                    String string2 = m8950b.getString(m12327b11);
                    int i3 = m12327b11;
                    C2943sj c2943sj = new C2943sj();
                    int i4 = m12327b;
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    int i5 = m12327b2;
                    int i6 = m12327b3;
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var.f24627d = m8950b.getString(m12327b12);
                    qy1Var.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    int i7 = i;
                    qy1Var.f24629f = C0511b.m27966g(m8950b.getBlob(i7));
                    i = i7;
                    int i8 = m12327b15;
                    qy1Var.f24630g = m8950b.getLong(i8);
                    int i9 = m12327b13;
                    int i10 = m12327b16;
                    qy1Var.f24631h = m8950b.getLong(i10);
                    int i11 = m12327b4;
                    int i12 = m12327b17;
                    qy1Var.f24632i = m8950b.getLong(i12);
                    int i13 = m12327b18;
                    qy1Var.f24634k = m8950b.getInt(i13);
                    int i14 = m12327b19;
                    qy1Var.f24635l = xy1.m4407d(m8950b.getInt(i14));
                    m12327b17 = i12;
                    int i15 = m12327b20;
                    qy1Var.f24636m = m8950b.getLong(i15);
                    int i16 = m12327b21;
                    qy1Var.f24637n = m8950b.getLong(i16);
                    m12327b21 = i16;
                    int i17 = m12327b22;
                    qy1Var.f24638o = m8950b.getLong(i17);
                    int i18 = m12327b23;
                    qy1Var.f24639p = m8950b.getLong(i18);
                    int i19 = m12327b24;
                    qy1Var.f24640q = m8950b.getInt(i19) != 0;
                    int i20 = m12327b25;
                    qy1Var.f24641r = xy1.m4405f(m8950b.getInt(i20));
                    qy1Var.f24633j = c2943sj;
                    arrayList.add(qy1Var);
                    m12327b25 = i20;
                    m12327b2 = i5;
                    m12327b13 = i9;
                    m12327b15 = i8;
                    m12327b16 = i10;
                    m12327b18 = i13;
                    m12327b23 = i18;
                    m12327b9 = i2;
                    m12327b11 = i3;
                    m12327b = i4;
                    m12327b24 = i19;
                    m12327b22 = i17;
                    m12327b3 = i6;
                    m12327b20 = i15;
                    m12327b4 = i11;
                    m12327b19 = i14;
                }
                m8950b.close();
                e61Var.m23702D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: i */
    public boolean mo9723i() {
        boolean z = false;
        e61 m23701q = e61.m23701q("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            if (m8950b.moveToFirst()) {
                if (m8950b.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: j */
    public List<String> mo9722j(String str) {
        e61 m23701q = e61.m23701q("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
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

    @Override // com.daaw.ry1
    /* renamed from: k */
    public int mo9721k(yx1 yx1Var, String... strArr) {
        this.f26789a.m26482b();
        StringBuilder m25378b = ch1.m25378b();
        m25378b.append("UPDATE workspec SET state=");
        m25378b.append("?");
        m25378b.append(" WHERE id IN (");
        ch1.m25379a(m25378b, strArr.length);
        m25378b.append(")");
        ni1 m26480d = this.f26789a.m26480d(m25378b.toString());
        m26480d.mo16229r(1, xy1.m4401j(yx1Var));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                m26480d.mo16232F(i);
            } else {
                m26480d.mo16231i(i, str);
            }
            i++;
        }
        this.f26789a.m26481c();
        try {
            int mo15165j = m26480d.mo15165j();
            this.f26789a.m26466r();
            return mo15165j;
        } finally {
            this.f26789a.m26477g();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: l */
    public yx1 mo9720l(String str) {
        e61 m23701q = e61.m23701q("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            return m8950b.moveToFirst() ? xy1.m4404g(m8950b.getInt(0)) : null;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: m */
    public qy1 mo9719m(String str) {
        e61 e61Var;
        qy1 qy1Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                if (m8950b.moveToFirst()) {
                    String string = m8950b.getString(m12327b9);
                    String string2 = m8950b.getString(m12327b11);
                    C2943sj c2943sj = new C2943sj();
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var2 = new qy1(string, string2);
                    qy1Var2.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var2.f24627d = m8950b.getString(m12327b12);
                    qy1Var2.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    qy1Var2.f24629f = C0511b.m27966g(m8950b.getBlob(m12327b14));
                    qy1Var2.f24630g = m8950b.getLong(m12327b15);
                    qy1Var2.f24631h = m8950b.getLong(m12327b16);
                    qy1Var2.f24632i = m8950b.getLong(m12327b17);
                    qy1Var2.f24634k = m8950b.getInt(m12327b18);
                    qy1Var2.f24635l = xy1.m4407d(m8950b.getInt(m12327b19));
                    qy1Var2.f24636m = m8950b.getLong(m12327b20);
                    qy1Var2.f24637n = m8950b.getLong(m12327b21);
                    qy1Var2.f24638o = m8950b.getLong(m12327b22);
                    qy1Var2.f24639p = m8950b.getLong(m12327b23);
                    qy1Var2.f24640q = m8950b.getInt(m12327b24) != 0;
                    qy1Var2.f24641r = xy1.m4405f(m8950b.getInt(m12327b25));
                    qy1Var2.f24633j = c2943sj;
                    qy1Var = qy1Var2;
                } else {
                    qy1Var = null;
                }
                m8950b.close();
                e61Var.m23702D();
                return qy1Var;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: n */
    public int mo9718n(String str) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26795g.m16094a();
        if (str == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16231i(1, str);
        }
        this.f26789a.m26481c();
        try {
            int mo15165j = m16094a.mo15165j();
            this.f26789a.m26466r();
            return mo15165j;
        } finally {
            this.f26789a.m26477g();
            this.f26795g.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: o */
    public List<String> mo9717o(String str) {
        e61 m23701q = e61.m23701q("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
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

    @Override // com.daaw.ry1
    /* renamed from: p */
    public List<C0511b> mo9716p(String str) {
        e61 m23701q = e61.m23701q("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m23701q.mo16232F(1);
        } else {
            m23701q.mo16231i(1, str);
        }
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            ArrayList arrayList = new ArrayList(m8950b.getCount());
            while (m8950b.moveToNext()) {
                arrayList.add(C0511b.m27966g(m8950b.getBlob(0)));
            }
            return arrayList;
        } finally {
            m8950b.close();
            m23701q.m23702D();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: q */
    public void mo9715q(qy1 qy1Var) {
        this.f26789a.m26482b();
        this.f26789a.m26481c();
        try {
            this.f26790b.m14752h(qy1Var);
            this.f26789a.m26466r();
        } finally {
            this.f26789a.m26477g();
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: r */
    public int mo9714r(String str) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26794f.m16094a();
        if (str == null) {
            m16094a.mo16232F(1);
        } else {
            m16094a.mo16231i(1, str);
        }
        this.f26789a.m26481c();
        try {
            int mo15165j = m16094a.mo15165j();
            this.f26789a.m26466r();
            return mo15165j;
        } finally {
            this.f26789a.m26477g();
            this.f26794f.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: s */
    public void mo9713s(String str, long j) {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26793e.m16094a();
        m16094a.mo16229r(1, j);
        if (str == null) {
            m16094a.mo16232F(2);
        } else {
            m16094a.mo16231i(2, str);
        }
        this.f26789a.m26481c();
        try {
            m16094a.mo15165j();
            this.f26789a.m26466r();
        } finally {
            this.f26789a.m26477g();
            this.f26793e.m16090f(m16094a);
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: t */
    public List<qy1> mo9712t(int i) {
        e61 e61Var;
        e61 m23701q = e61.m23701q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        m23701q.mo16229r(1, i);
        this.f26789a.m26482b();
        Cursor m8950b = C3104to.m8950b(this.f26789a, m23701q, false, null);
        try {
            int m12327b = C2742qn.m12327b(m8950b, "required_network_type");
            int m12327b2 = C2742qn.m12327b(m8950b, "requires_charging");
            int m12327b3 = C2742qn.m12327b(m8950b, "requires_device_idle");
            int m12327b4 = C2742qn.m12327b(m8950b, "requires_battery_not_low");
            int m12327b5 = C2742qn.m12327b(m8950b, "requires_storage_not_low");
            int m12327b6 = C2742qn.m12327b(m8950b, "trigger_content_update_delay");
            int m12327b7 = C2742qn.m12327b(m8950b, "trigger_max_content_delay");
            int m12327b8 = C2742qn.m12327b(m8950b, "content_uri_triggers");
            int m12327b9 = C2742qn.m12327b(m8950b, "id");
            int m12327b10 = C2742qn.m12327b(m8950b, "state");
            int m12327b11 = C2742qn.m12327b(m8950b, "worker_class_name");
            int m12327b12 = C2742qn.m12327b(m8950b, "input_merger_class_name");
            int m12327b13 = C2742qn.m12327b(m8950b, "input");
            int m12327b14 = C2742qn.m12327b(m8950b, "output");
            e61Var = m23701q;
            try {
                int m12327b15 = C2742qn.m12327b(m8950b, "initial_delay");
                int m12327b16 = C2742qn.m12327b(m8950b, "interval_duration");
                int m12327b17 = C2742qn.m12327b(m8950b, "flex_duration");
                int m12327b18 = C2742qn.m12327b(m8950b, "run_attempt_count");
                int m12327b19 = C2742qn.m12327b(m8950b, "backoff_policy");
                int m12327b20 = C2742qn.m12327b(m8950b, "backoff_delay_duration");
                int m12327b21 = C2742qn.m12327b(m8950b, "period_start_time");
                int m12327b22 = C2742qn.m12327b(m8950b, "minimum_retention_duration");
                int m12327b23 = C2742qn.m12327b(m8950b, "schedule_requested_at");
                int m12327b24 = C2742qn.m12327b(m8950b, "run_in_foreground");
                int m12327b25 = C2742qn.m12327b(m8950b, "out_of_quota_policy");
                int i2 = m12327b14;
                ArrayList arrayList = new ArrayList(m8950b.getCount());
                while (m8950b.moveToNext()) {
                    String string = m8950b.getString(m12327b9);
                    int i3 = m12327b9;
                    String string2 = m8950b.getString(m12327b11);
                    int i4 = m12327b11;
                    C2943sj c2943sj = new C2943sj();
                    int i5 = m12327b;
                    c2943sj.m10313k(xy1.m4406e(m8950b.getInt(m12327b)));
                    c2943sj.m10311m(m8950b.getInt(m12327b2) != 0);
                    c2943sj.m10310n(m8950b.getInt(m12327b3) != 0);
                    c2943sj.m10312l(m8950b.getInt(m12327b4) != 0);
                    c2943sj.m10309o(m8950b.getInt(m12327b5) != 0);
                    int i6 = m12327b2;
                    int i7 = m12327b3;
                    c2943sj.m10308p(m8950b.getLong(m12327b6));
                    c2943sj.m10307q(m8950b.getLong(m12327b7));
                    c2943sj.m10314j(xy1.m4409b(m8950b.getBlob(m12327b8)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.f24625b = xy1.m4404g(m8950b.getInt(m12327b10));
                    qy1Var.f24627d = m8950b.getString(m12327b12);
                    qy1Var.f24628e = C0511b.m27966g(m8950b.getBlob(m12327b13));
                    int i8 = i2;
                    qy1Var.f24629f = C0511b.m27966g(m8950b.getBlob(i8));
                    i2 = i8;
                    int i9 = m12327b15;
                    qy1Var.f24630g = m8950b.getLong(i9);
                    int i10 = m12327b12;
                    int i11 = m12327b16;
                    qy1Var.f24631h = m8950b.getLong(i11);
                    int i12 = m12327b4;
                    int i13 = m12327b17;
                    qy1Var.f24632i = m8950b.getLong(i13);
                    int i14 = m12327b18;
                    qy1Var.f24634k = m8950b.getInt(i14);
                    int i15 = m12327b19;
                    qy1Var.f24635l = xy1.m4407d(m8950b.getInt(i15));
                    m12327b17 = i13;
                    int i16 = m12327b20;
                    qy1Var.f24636m = m8950b.getLong(i16);
                    int i17 = m12327b21;
                    qy1Var.f24637n = m8950b.getLong(i17);
                    m12327b21 = i17;
                    int i18 = m12327b22;
                    qy1Var.f24638o = m8950b.getLong(i18);
                    int i19 = m12327b23;
                    qy1Var.f24639p = m8950b.getLong(i19);
                    int i20 = m12327b24;
                    qy1Var.f24640q = m8950b.getInt(i20) != 0;
                    int i21 = m12327b25;
                    qy1Var.f24641r = xy1.m4405f(m8950b.getInt(i21));
                    qy1Var.f24633j = c2943sj;
                    arrayList.add(qy1Var);
                    m12327b25 = i21;
                    m12327b2 = i6;
                    m12327b12 = i10;
                    m12327b15 = i9;
                    m12327b16 = i11;
                    m12327b18 = i14;
                    m12327b23 = i19;
                    m12327b9 = i3;
                    m12327b11 = i4;
                    m12327b = i5;
                    m12327b24 = i20;
                    m12327b22 = i18;
                    m12327b3 = i7;
                    m12327b20 = i16;
                    m12327b4 = i12;
                    m12327b19 = i15;
                }
                m8950b.close();
                e61Var.m23702D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m8950b.close();
                e61Var.m23702D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = m23701q;
        }
    }

    @Override // com.daaw.ry1
    /* renamed from: u */
    public int mo9711u() {
        this.f26789a.m26482b();
        ni1 m16094a = this.f26797i.m16094a();
        this.f26789a.m26481c();
        try {
            int mo15165j = m16094a.mo15165j();
            this.f26789a.m26466r();
            return mo15165j;
        } finally {
            this.f26789a.m26477g();
            this.f26797i.m16090f(m16094a);
        }
    }
}
