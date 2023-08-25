package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class xa0 {

    /* renamed from: a */
    public final SharedPreferences f32268a;

    public xa0(Context context, String str) {
        this.f32268a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m5345a() {
        long j = this.f32268a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f32268a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f32268a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f32268a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: b */
    public synchronized void m5344b() {
        SharedPreferences.Editor edit = this.f32268a.edit();
        for (Map.Entry<String, ?> entry : this.f32268a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<ya0> m5343c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f32268a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(ya0.m3962a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        m5340f(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m5342d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public synchronized void m5341e(long j, String str) {
        String m5342d = m5342d(j);
        if (this.f32268a.getString("last-used-date", "").equals(m5342d)) {
            return;
        }
        long j2 = this.f32268a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m5345a();
            j2 = this.f32268a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f32268a.getStringSet(str, new HashSet()));
        hashSet.add(m5342d);
        this.f32268a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m5342d).commit();
    }

    /* renamed from: f */
    public synchronized void m5340f(long j) {
        this.f32268a.edit().putLong("fire-global", j).commit();
    }
}
