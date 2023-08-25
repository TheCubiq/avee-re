package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;
/* loaded from: classes.dex */
public class po1 {

    /* renamed from: d */
    public static po1 f23096d;

    /* renamed from: a */
    public final Context f23097a;

    /* renamed from: b */
    public final LocationManager f23098b;

    /* renamed from: c */
    public final C2569a f23099c = new C2569a();

    /* renamed from: com.daaw.po1$a */
    /* loaded from: classes.dex */
    public static class C2569a {

        /* renamed from: a */
        public boolean f23100a;

        /* renamed from: b */
        public long f23101b;

        /* renamed from: c */
        public long f23102c;

        /* renamed from: d */
        public long f23103d;

        /* renamed from: e */
        public long f23104e;

        /* renamed from: f */
        public long f23105f;
    }

    public po1(Context context, LocationManager locationManager) {
        this.f23097a = context;
        this.f23098b = locationManager;
    }

    /* renamed from: a */
    public static po1 m13258a(Context context) {
        if (f23096d == null) {
            Context applicationContext = context.getApplicationContext();
            f23096d = new po1(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f23096d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location m13257b() {
        Location m13256c = hw0.m20364b(this.f23097a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m13256c("network") : null;
        Location m13256c2 = hw0.m20364b(this.f23097a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m13256c("gps") : null;
        return (m13256c2 == null || m13256c == null) ? m13256c2 != null ? m13256c2 : m13256c : m13256c2.getTime() > m13256c.getTime() ? m13256c2 : m13256c;
    }

    /* renamed from: c */
    public final Location m13256c(String str) {
        try {
            if (this.f23098b.isProviderEnabled(str)) {
                return this.f23098b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean m13255d() {
        C2569a c2569a = this.f23099c;
        if (m13254e()) {
            return c2569a.f23100a;
        }
        Location m13257b = m13257b();
        if (m13257b != null) {
            m13253f(m13257b);
            return c2569a.f23100a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: e */
    public final boolean m13254e() {
        return this.f23099c.f23105f > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void m13253f(Location location) {
        long j;
        C2569a c2569a = this.f23099c;
        long currentTimeMillis = System.currentTimeMillis();
        oo1 m14117b = oo1.m14117b();
        m14117b.m14118a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m14117b.f21778a;
        m14117b.m14118a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m14117b.f21780c == 1;
        long j3 = m14117b.f21779b;
        long j4 = m14117b.f21778a;
        boolean z2 = z;
        m14117b.m14118a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m14117b.f21779b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        c2569a.f23100a = z2;
        c2569a.f23101b = j2;
        c2569a.f23102c = j3;
        c2569a.f23103d = j4;
        c2569a.f23104e = j5;
        c2569a.f23105f = j;
    }
}
