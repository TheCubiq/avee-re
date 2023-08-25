package com.daaw;

import android.database.Cursor;
import com.daaw.qy1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class sy1 implements ry1 {
    public final b61 a;
    public final nx<qy1> b;
    public final mc1 c;
    public final mc1 d;
    public final mc1 e;
    public final mc1 f;
    public final mc1 g;
    public final mc1 h;
    public final mc1 i;
    public final mc1 j;

    /* loaded from: classes.dex */
    public class a extends nx<qy1> {
        public a(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // com.daaw.nx
        /* renamed from: i */
        public void g(ni1 ni1Var, qy1 qy1Var) {
            String str = qy1Var.a;
            if (str == null) {
                ni1Var.F(1);
            } else {
                ni1Var.i(1, str);
            }
            ni1Var.r(2, xy1.j(qy1Var.b));
            String str2 = qy1Var.c;
            if (str2 == null) {
                ni1Var.F(3);
            } else {
                ni1Var.i(3, str2);
            }
            String str3 = qy1Var.d;
            if (str3 == null) {
                ni1Var.F(4);
            } else {
                ni1Var.i(4, str3);
            }
            byte[] k = androidx.work.b.k(qy1Var.e);
            if (k == null) {
                ni1Var.F(5);
            } else {
                ni1Var.x(5, k);
            }
            byte[] k2 = androidx.work.b.k(qy1Var.f);
            if (k2 == null) {
                ni1Var.F(6);
            } else {
                ni1Var.x(6, k2);
            }
            ni1Var.r(7, qy1Var.g);
            ni1Var.r(8, qy1Var.h);
            ni1Var.r(9, qy1Var.i);
            ni1Var.r(10, qy1Var.k);
            ni1Var.r(11, xy1.a(qy1Var.l));
            ni1Var.r(12, qy1Var.m);
            ni1Var.r(13, qy1Var.n);
            ni1Var.r(14, qy1Var.o);
            ni1Var.r(15, qy1Var.p);
            ni1Var.r(16, qy1Var.q ? 1L : 0L);
            ni1Var.r(17, xy1.i(qy1Var.r));
            sj sjVar = qy1Var.j;
            if (sjVar != null) {
                ni1Var.r(18, xy1.h(sjVar.b()));
                ni1Var.r(19, sjVar.g() ? 1L : 0L);
                ni1Var.r(20, sjVar.h() ? 1L : 0L);
                ni1Var.r(21, sjVar.f() ? 1L : 0L);
                ni1Var.r(22, sjVar.i() ? 1L : 0L);
                ni1Var.r(23, sjVar.c());
                ni1Var.r(24, sjVar.d());
                byte[] c = xy1.c(sjVar.a());
                if (c != null) {
                    ni1Var.x(25, c);
                    return;
                }
            } else {
                ni1Var.F(18);
                ni1Var.F(19);
                ni1Var.F(20);
                ni1Var.F(21);
                ni1Var.F(22);
                ni1Var.F(23);
                ni1Var.F(24);
            }
            ni1Var.F(25);
        }
    }

    /* loaded from: classes.dex */
    public class b extends mc1 {
        public b(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends mc1 {
        public c(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class d extends mc1 {
        public d(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends mc1 {
        public e(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class f extends mc1 {
        public f(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class g extends mc1 {
        public g(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends mc1 {
        public h(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    public class i extends mc1 {
        public i(b61 b61Var) {
            super(b61Var);
        }

        @Override // com.daaw.mc1
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public sy1(b61 b61Var) {
        this.a = b61Var;
        this.b = new a(b61Var);
        this.c = new b(b61Var);
        this.d = new c(b61Var);
        this.e = new d(b61Var);
        this.f = new e(b61Var);
        this.g = new f(b61Var);
        this.h = new g(b61Var);
        this.i = new h(b61Var);
        this.j = new i(b61Var);
    }

    @Override // com.daaw.ry1
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

    @Override // com.daaw.ry1
    public int b(String str, long j) {
        this.a.b();
        ni1 a2 = this.h.a();
        a2.r(1, j);
        if (str == null) {
            a2.F(2);
        } else {
            a2.i(2, str);
        }
        this.a.c();
        try {
            int j2 = a2.j();
            this.a.r();
            return j2;
        } finally {
            this.a.g();
            this.h.f(a2);
        }
    }

    @Override // com.daaw.ry1
    public List<qy1.b> c(String str) {
        e61 q = e61.q("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "id");
            int b4 = qn.b(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                qy1.b bVar = new qy1.b();
                bVar.a = b2.getString(b3);
                bVar.b = xy1.g(b2.getInt(b4));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.ry1
    public List<qy1> d(long j) {
        e61 e61Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        q.r(1, j);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    sj sjVar = new sj();
                    int i5 = b3;
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.b = xy1.g(b2.getInt(b12));
                    qy1Var.d = b2.getString(b14);
                    qy1Var.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    qy1Var.f = androidx.work.b.g(b2.getBlob(i8));
                    int i9 = b17;
                    i2 = i8;
                    qy1Var.g = b2.getLong(i9);
                    int i10 = b14;
                    int i11 = b18;
                    qy1Var.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    qy1Var.i = b2.getLong(i13);
                    int i14 = b20;
                    qy1Var.k = b2.getInt(i14);
                    int i15 = b21;
                    qy1Var.l = xy1.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    qy1Var.m = b2.getLong(i16);
                    int i17 = b23;
                    qy1Var.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    qy1Var.o = b2.getLong(i18);
                    int i19 = b25;
                    qy1Var.p = b2.getLong(i19);
                    int i20 = b26;
                    qy1Var.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    qy1Var.r = xy1.f(b2.getInt(i21));
                    qy1Var.j = sjVar;
                    arrayList.add(qy1Var);
                    b4 = i6;
                    b27 = i21;
                    b14 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                e61Var.D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public List<qy1> e(int i2) {
        e61 e61Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        q.r(1, i2);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    sj sjVar = new sj();
                    int i6 = b3;
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.b = xy1.g(b2.getInt(b12));
                    qy1Var.d = b2.getString(b14);
                    qy1Var.e = androidx.work.b.g(b2.getBlob(b15));
                    int i9 = i3;
                    qy1Var.f = androidx.work.b.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    qy1Var.g = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    qy1Var.h = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    qy1Var.i = b2.getLong(i14);
                    int i15 = b20;
                    qy1Var.k = b2.getInt(i15);
                    int i16 = b21;
                    qy1Var.l = xy1.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    qy1Var.m = b2.getLong(i17);
                    int i18 = b23;
                    qy1Var.n = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    qy1Var.o = b2.getLong(i19);
                    int i20 = b25;
                    qy1Var.p = b2.getLong(i20);
                    int i21 = b26;
                    qy1Var.q = b2.getInt(i21) != 0;
                    int i22 = b27;
                    qy1Var.r = xy1.f(b2.getInt(i22));
                    qy1Var.j = sjVar;
                    arrayList.add(qy1Var);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                e61Var.D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public List<qy1> f() {
        e61 e61Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    sj sjVar = new sj();
                    int i5 = b3;
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.b = xy1.g(b2.getInt(b12));
                    qy1Var.d = b2.getString(b14);
                    qy1Var.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    qy1Var.f = androidx.work.b.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    qy1Var.g = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    qy1Var.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    qy1Var.i = b2.getLong(i13);
                    int i14 = b20;
                    qy1Var.k = b2.getInt(i14);
                    int i15 = b21;
                    qy1Var.l = xy1.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    qy1Var.m = b2.getLong(i16);
                    int i17 = b23;
                    qy1Var.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    qy1Var.o = b2.getLong(i18);
                    int i19 = b25;
                    qy1Var.p = b2.getLong(i19);
                    int i20 = b26;
                    qy1Var.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    qy1Var.r = xy1.f(b2.getInt(i21));
                    qy1Var.j = sjVar;
                    arrayList.add(qy1Var);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                e61Var.D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public void g(String str, androidx.work.b bVar) {
        this.a.b();
        ni1 a2 = this.d.a();
        byte[] k = androidx.work.b.k(bVar);
        if (k == null) {
            a2.F(1);
        } else {
            a2.x(1, k);
        }
        if (str == null) {
            a2.F(2);
        } else {
            a2.i(2, str);
        }
        this.a.c();
        try {
            a2.j();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(a2);
        }
    }

    @Override // com.daaw.ry1
    public List<qy1> h() {
        e61 e61Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    sj sjVar = new sj();
                    int i5 = b3;
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.b = xy1.g(b2.getInt(b12));
                    qy1Var.d = b2.getString(b14);
                    qy1Var.e = androidx.work.b.g(b2.getBlob(b15));
                    int i8 = i2;
                    qy1Var.f = androidx.work.b.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    qy1Var.g = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    qy1Var.h = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    qy1Var.i = b2.getLong(i13);
                    int i14 = b20;
                    qy1Var.k = b2.getInt(i14);
                    int i15 = b21;
                    qy1Var.l = xy1.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    qy1Var.m = b2.getLong(i16);
                    int i17 = b23;
                    qy1Var.n = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    qy1Var.o = b2.getLong(i18);
                    int i19 = b25;
                    qy1Var.p = b2.getLong(i19);
                    int i20 = b26;
                    qy1Var.q = b2.getInt(i20) != 0;
                    int i21 = b27;
                    qy1Var.r = xy1.f(b2.getInt(i21));
                    qy1Var.j = sjVar;
                    arrayList.add(qy1Var);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                e61Var.D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public boolean i() {
        boolean z = false;
        e61 q = e61.q("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.ry1
    public List<String> j(String str) {
        e61 q = e61.q("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
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

    @Override // com.daaw.ry1
    public int k(yx1 yx1Var, String... strArr) {
        this.a.b();
        StringBuilder b2 = ch1.b();
        b2.append("UPDATE workspec SET state=");
        b2.append("?");
        b2.append(" WHERE id IN (");
        ch1.a(b2, strArr.length);
        b2.append(")");
        ni1 d2 = this.a.d(b2.toString());
        d2.r(1, xy1.j(yx1Var));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                d2.F(i2);
            } else {
                d2.i(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int j = d2.j();
            this.a.r();
            return j;
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.ry1
    public yx1 l(String str) {
        e61 q = e61.q("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            return b2.moveToFirst() ? xy1.g(b2.getInt(0)) : null;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.ry1
    public qy1 m(String str) {
        e61 e61Var;
        qy1 qy1Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                if (b2.moveToFirst()) {
                    String string = b2.getString(b11);
                    String string2 = b2.getString(b13);
                    sj sjVar = new sj();
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var2 = new qy1(string, string2);
                    qy1Var2.b = xy1.g(b2.getInt(b12));
                    qy1Var2.d = b2.getString(b14);
                    qy1Var2.e = androidx.work.b.g(b2.getBlob(b15));
                    qy1Var2.f = androidx.work.b.g(b2.getBlob(b16));
                    qy1Var2.g = b2.getLong(b17);
                    qy1Var2.h = b2.getLong(b18);
                    qy1Var2.i = b2.getLong(b19);
                    qy1Var2.k = b2.getInt(b20);
                    qy1Var2.l = xy1.d(b2.getInt(b21));
                    qy1Var2.m = b2.getLong(b22);
                    qy1Var2.n = b2.getLong(b23);
                    qy1Var2.o = b2.getLong(b24);
                    qy1Var2.p = b2.getLong(b25);
                    qy1Var2.q = b2.getInt(b26) != 0;
                    qy1Var2.r = xy1.f(b2.getInt(b27));
                    qy1Var2.j = sjVar;
                    qy1Var = qy1Var2;
                } else {
                    qy1Var = null;
                }
                b2.close();
                e61Var.D();
                return qy1Var;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public int n(String str) {
        this.a.b();
        ni1 a2 = this.g.a();
        if (str == null) {
            a2.F(1);
        } else {
            a2.i(1, str);
        }
        this.a.c();
        try {
            int j = a2.j();
            this.a.r();
            return j;
        } finally {
            this.a.g();
            this.g.f(a2);
        }
    }

    @Override // com.daaw.ry1
    public List<String> o(String str) {
        e61 q = e61.q("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
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

    @Override // com.daaw.ry1
    public List<androidx.work.b> p(String str) {
        e61 q = e61.q("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            q.F(1);
        } else {
            q.i(1, str);
        }
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.b.g(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            q.D();
        }
    }

    @Override // com.daaw.ry1
    public void q(qy1 qy1Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(qy1Var);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.ry1
    public int r(String str) {
        this.a.b();
        ni1 a2 = this.f.a();
        if (str == null) {
            a2.F(1);
        } else {
            a2.i(1, str);
        }
        this.a.c();
        try {
            int j = a2.j();
            this.a.r();
            return j;
        } finally {
            this.a.g();
            this.f.f(a2);
        }
    }

    @Override // com.daaw.ry1
    public void s(String str, long j) {
        this.a.b();
        ni1 a2 = this.e.a();
        a2.r(1, j);
        if (str == null) {
            a2.F(2);
        } else {
            a2.i(2, str);
        }
        this.a.c();
        try {
            a2.j();
            this.a.r();
        } finally {
            this.a.g();
            this.e.f(a2);
        }
    }

    @Override // com.daaw.ry1
    public List<qy1> t(int i2) {
        e61 e61Var;
        e61 q = e61.q("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        q.r(1, i2);
        this.a.b();
        Cursor b2 = to.b(this.a, q, false, null);
        try {
            int b3 = qn.b(b2, "required_network_type");
            int b4 = qn.b(b2, "requires_charging");
            int b5 = qn.b(b2, "requires_device_idle");
            int b6 = qn.b(b2, "requires_battery_not_low");
            int b7 = qn.b(b2, "requires_storage_not_low");
            int b8 = qn.b(b2, "trigger_content_update_delay");
            int b9 = qn.b(b2, "trigger_max_content_delay");
            int b10 = qn.b(b2, "content_uri_triggers");
            int b11 = qn.b(b2, "id");
            int b12 = qn.b(b2, "state");
            int b13 = qn.b(b2, "worker_class_name");
            int b14 = qn.b(b2, "input_merger_class_name");
            int b15 = qn.b(b2, "input");
            int b16 = qn.b(b2, "output");
            e61Var = q;
            try {
                int b17 = qn.b(b2, "initial_delay");
                int b18 = qn.b(b2, "interval_duration");
                int b19 = qn.b(b2, "flex_duration");
                int b20 = qn.b(b2, "run_attempt_count");
                int b21 = qn.b(b2, "backoff_policy");
                int b22 = qn.b(b2, "backoff_delay_duration");
                int b23 = qn.b(b2, "period_start_time");
                int b24 = qn.b(b2, "minimum_retention_duration");
                int b25 = qn.b(b2, "schedule_requested_at");
                int b26 = qn.b(b2, "run_in_foreground");
                int b27 = qn.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    sj sjVar = new sj();
                    int i6 = b3;
                    sjVar.k(xy1.e(b2.getInt(b3)));
                    sjVar.m(b2.getInt(b4) != 0);
                    sjVar.n(b2.getInt(b5) != 0);
                    sjVar.l(b2.getInt(b6) != 0);
                    sjVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    sjVar.p(b2.getLong(b8));
                    sjVar.q(b2.getLong(b9));
                    sjVar.j(xy1.b(b2.getBlob(b10)));
                    qy1 qy1Var = new qy1(string, string2);
                    qy1Var.b = xy1.g(b2.getInt(b12));
                    qy1Var.d = b2.getString(b14);
                    qy1Var.e = androidx.work.b.g(b2.getBlob(b15));
                    int i9 = i3;
                    qy1Var.f = androidx.work.b.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    qy1Var.g = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    qy1Var.h = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    qy1Var.i = b2.getLong(i14);
                    int i15 = b20;
                    qy1Var.k = b2.getInt(i15);
                    int i16 = b21;
                    qy1Var.l = xy1.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    qy1Var.m = b2.getLong(i17);
                    int i18 = b23;
                    qy1Var.n = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    qy1Var.o = b2.getLong(i19);
                    int i20 = b25;
                    qy1Var.p = b2.getLong(i20);
                    int i21 = b26;
                    qy1Var.q = b2.getInt(i21) != 0;
                    int i22 = b27;
                    qy1Var.r = xy1.f(b2.getInt(i22));
                    qy1Var.j = sjVar;
                    arrayList.add(qy1Var);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                e61Var.D();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                e61Var.D();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e61Var = q;
        }
    }

    @Override // com.daaw.ry1
    public int u() {
        this.a.b();
        ni1 a2 = this.i.a();
        this.a.c();
        try {
            int j = a2.j();
            this.a.r();
            return j;
        } finally {
            this.a.g();
            this.i.f(a2);
        }
    }
}
