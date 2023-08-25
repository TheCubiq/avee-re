package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import com.daaw.gq0;
import com.daaw.ji1;
import com.daaw.te0;
import com.daaw.zy0;
/* loaded from: classes.dex */
public class a {
    public static gq0 a = new C0033a(1, 2);
    public static gq0 b = new b(3, 4);
    public static gq0 c = new c(4, 5);
    public static gq0 d = new d(6, 7);
    public static gq0 e = new e(7, 8);
    public static gq0 f = new f(8, 9);
    public static gq0 g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0033a extends gq0 {
        public C0033a(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            ji1Var.h("DROP TABLE IF EXISTS alarmInfo");
            ji1Var.h("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends gq0 {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            if (Build.VERSION.SDK_INT >= 23) {
                ji1Var.h("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends gq0 {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ji1Var.h("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public class d extends gq0 {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    public class e extends gq0 {
        public e(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    public class f extends gq0 {
        public f(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public class g extends gq0 {
        public g(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends gq0 {
        public final Context c;

        public h(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            if (this.b >= 10) {
                ji1Var.t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends gq0 {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // com.daaw.gq0
        public void a(ji1 ji1Var) {
            ji1Var.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            zy0.b(this.c, ji1Var);
            te0.a(this.c, ji1Var);
        }
    }
}
