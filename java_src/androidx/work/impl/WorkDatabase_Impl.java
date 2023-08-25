package androidx.work.impl;

import androidx.room.c;
import com.daaw.aj1;
import com.daaw.b61;
import com.daaw.bt;
import com.daaw.ct;
import com.daaw.d61;
import com.daaw.hy1;
import com.daaw.iy1;
import com.daaw.ji1;
import com.daaw.ki1;
import com.daaw.ky1;
import com.daaw.lj1;
import com.daaw.ly1;
import com.daaw.ry1;
import com.daaw.sp;
import com.daaw.sy1;
import com.daaw.to;
import com.daaw.uy1;
import com.daaw.vy1;
import com.daaw.xy0;
import com.daaw.yy0;
import com.daaw.zi1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile ry1 m;
    public volatile bt n;
    public volatile uy1 o;
    public volatile zi1 p;
    public volatile hy1 q;
    public volatile ky1 r;
    public volatile xy0 s;

    /* loaded from: classes.dex */
    public class a extends d61.a {
        public a(int i) {
            super(i);
        }

        @Override // com.daaw.d61.a
        public void a(ji1 ji1Var) {
            ji1Var.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ji1Var.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            ji1Var.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ji1Var.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // com.daaw.d61.a
        public void b(ji1 ji1Var) {
            ji1Var.h("DROP TABLE IF EXISTS `Dependency`");
            ji1Var.h("DROP TABLE IF EXISTS `WorkSpec`");
            ji1Var.h("DROP TABLE IF EXISTS `WorkTag`");
            ji1Var.h("DROP TABLE IF EXISTS `SystemIdInfo`");
            ji1Var.h("DROP TABLE IF EXISTS `WorkName`");
            ji1Var.h("DROP TABLE IF EXISTS `WorkProgress`");
            ji1Var.h("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((b61.b) WorkDatabase_Impl.this.h.get(i)).b(ji1Var);
                }
            }
        }

        @Override // com.daaw.d61.a
        public void c(ji1 ji1Var) {
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((b61.b) WorkDatabase_Impl.this.h.get(i)).a(ji1Var);
                }
            }
        }

        @Override // com.daaw.d61.a
        public void d(ji1 ji1Var) {
            WorkDatabase_Impl.this.a = ji1Var;
            ji1Var.h("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(ji1Var);
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((b61.b) WorkDatabase_Impl.this.h.get(i)).c(ji1Var);
                }
            }
        }

        @Override // com.daaw.d61.a
        public void e(ji1 ji1Var) {
        }

        @Override // com.daaw.d61.a
        public void f(ji1 ji1Var) {
            to.a(ji1Var);
        }

        @Override // com.daaw.d61.a
        public d61.b g(ji1 ji1Var) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new lj1.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new lj1.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new lj1.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new lj1.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            lj1 lj1Var = new lj1("Dependency", hashMap, hashSet, hashSet2);
            lj1 a = lj1.a(ji1Var, "Dependency");
            if (!lj1Var.equals(a)) {
                return new d61.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + lj1Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new lj1.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new lj1.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new lj1.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new lj1.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new lj1.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new lj1.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new lj1.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new lj1.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new lj1.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new lj1.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new lj1.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new lj1.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new lj1.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new lj1.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new lj1.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new lj1.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new lj1.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new lj1.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new lj1.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new lj1.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new lj1.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new lj1.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new lj1.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new lj1.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new lj1.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new lj1.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new lj1.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            lj1 lj1Var2 = new lj1("WorkSpec", hashMap2, hashSet3, hashSet4);
            lj1 a2 = lj1.a(ji1Var, "WorkSpec");
            if (!lj1Var2.equals(a2)) {
                return new d61.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + lj1Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new lj1.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new lj1.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new lj1.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            lj1 lj1Var3 = new lj1("WorkTag", hashMap3, hashSet5, hashSet6);
            lj1 a3 = lj1.a(ji1Var, "WorkTag");
            if (!lj1Var3.equals(a3)) {
                return new d61.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + lj1Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new lj1.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new lj1.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            lj1 lj1Var4 = new lj1("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            lj1 a4 = lj1.a(ji1Var, "SystemIdInfo");
            if (!lj1Var4.equals(a4)) {
                return new d61.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + lj1Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new lj1.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new lj1.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new lj1.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            lj1 lj1Var5 = new lj1("WorkName", hashMap5, hashSet8, hashSet9);
            lj1 a5 = lj1.a(ji1Var, "WorkName");
            if (!lj1Var5.equals(a5)) {
                return new d61.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + lj1Var5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new lj1.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new lj1.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new lj1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            lj1 lj1Var6 = new lj1("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            lj1 a6 = lj1.a(ji1Var, "WorkProgress");
            if (!lj1Var6.equals(a6)) {
                return new d61.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + lj1Var6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new lj1.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new lj1.a("long_value", "INTEGER", false, 0, null, 1));
            lj1 lj1Var7 = new lj1("Preference", hashMap7, new HashSet(0), new HashSet(0));
            lj1 a7 = lj1.a(ji1Var, "Preference");
            if (lj1Var7.equals(a7)) {
                return new d61.b(true, null);
            }
            return new d61.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + lj1Var7 + "\n Found:\n" + a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public ky1 A() {
        ky1 ky1Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new ly1(this);
            }
            ky1Var = this.r;
        }
        return ky1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ry1 B() {
        ry1 ry1Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new sy1(this);
            }
            ry1Var = this.m;
        }
        return ry1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public uy1 C() {
        uy1 uy1Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new vy1(this);
            }
            uy1Var = this.o;
        }
        return uy1Var;
    }

    @Override // com.daaw.b61
    public c e() {
        return new c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.daaw.b61
    public ki1 f(sp spVar) {
        return spVar.a.a(ki1.b.a(spVar.b).c(spVar.c).b(new d61(spVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public bt t() {
        bt btVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new ct(this);
            }
            btVar = this.n;
        }
        return btVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public xy0 x() {
        xy0 xy0Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new yy0(this);
            }
            xy0Var = this.s;
        }
        return xy0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public zi1 y() {
        zi1 zi1Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new aj1(this);
            }
            zi1Var = this.p;
        }
        return zi1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public hy1 z() {
        hy1 hy1Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new iy1(this);
            }
            hy1Var = this.q;
        }
        return hy1Var;
    }
}
