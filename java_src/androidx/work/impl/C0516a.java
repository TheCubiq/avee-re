package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import com.daaw.gq0;
import com.daaw.ji1;
import com.daaw.te0;
import com.daaw.zy0;
/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public class C0516a {

    /* renamed from: a */
    public static gq0 f2479a = new C0517a(1, 2);

    /* renamed from: b */
    public static gq0 f2480b = new C0518b(3, 4);

    /* renamed from: c */
    public static gq0 f2481c = new C0519c(4, 5);

    /* renamed from: d */
    public static gq0 f2482d = new C0520d(6, 7);

    /* renamed from: e */
    public static gq0 f2483e = new C0521e(7, 8);

    /* renamed from: f */
    public static gq0 f2484f = new C0522f(8, 9);

    /* renamed from: g */
    public static gq0 f2485g = new C0523g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: classes.dex */
    public class C0517a extends gq0 {
        public C0517a(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.mo18496h("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            ji1Var.mo18496h("DROP TABLE IF EXISTS alarmInfo");
            ji1Var.mo18496h("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    /* loaded from: classes.dex */
    public class C0518b extends gq0 {
        public C0518b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            if (Build.VERSION.SDK_INT >= 23) {
                ji1Var.mo18496h("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    /* loaded from: classes.dex */
    public class C0519c extends gq0 {
        public C0519c(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ji1Var.mo18496h("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    /* loaded from: classes.dex */
    public class C0520d extends gq0 {
        public C0520d(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    /* loaded from: classes.dex */
    public class C0521e extends gq0 {
        public C0521e(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    /* loaded from: classes.dex */
    public class C0522f extends gq0 {
        public C0522f(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    /* loaded from: classes.dex */
    public class C0523g extends gq0 {
        public C0523g(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    /* loaded from: classes.dex */
    public static class C0524h extends gq0 {

        /* renamed from: c */
        public final Context f2486c;

        public C0524h(Context context, int i, int i2) {
            super(i, i2);
            this.f2486c = context;
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            if (this.f11569b >= 10) {
                ji1Var.mo18493t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f2486c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    /* loaded from: classes.dex */
    public static class C0525i extends gq0 {

        /* renamed from: c */
        public final Context f2487c;

        public C0525i(Context context) {
            super(9, 10);
            this.f2487c = context;
        }

        @Override // com.daaw.gq0
        /* renamed from: a */
        public void mo21346a(ji1 ji1Var) {
            ji1Var.mo18496h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            zy0.m1792b(this.f2487c, ji1Var);
            te0.m9237a(this.f2487c, ji1Var);
        }
    }
}
