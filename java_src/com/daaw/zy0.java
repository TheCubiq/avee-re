package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class zy0 {
    public final WorkDatabase a;

    public zy0(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void b(Context context, ji1 ji1Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            ji1Var.a();
            try {
                ji1Var.t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                ji1Var.t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                ji1Var.s();
            } finally {
                ji1Var.C();
            }
        }
    }

    public boolean a() {
        Long b = this.a.x().b("reschedule_needed");
        return b != null && b.longValue() == 1;
    }

    public void c(boolean z) {
        this.a.x().a(new wy0("reschedule_needed", z));
    }
}
