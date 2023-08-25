package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class zy0 {

    /* renamed from: a */
    public final WorkDatabase f35641a;

    public zy0(WorkDatabase workDatabase) {
        this.f35641a = workDatabase;
    }

    /* renamed from: b */
    public static void m1792b(Context context, ji1 ji1Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            ji1Var.mo18499a();
            try {
                ji1Var.mo18493t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                ji1Var.mo18493t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                ji1Var.mo18494s();
            } finally {
                ji1Var.mo18503C();
            }
        }
    }

    /* renamed from: a */
    public boolean m1793a() {
        Long mo3083b = this.f35641a.mo27937x().mo3083b("reschedule_needed");
        return mo3083b != null && mo3083b.longValue() == 1;
    }

    /* renamed from: c */
    public void m1791c(boolean z) {
        this.f35641a.mo27937x().mo3084a(new wy0("reschedule_needed", z));
    }
}
