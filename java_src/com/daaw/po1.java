package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;
/* loaded from: classes.dex */
public class po1 {
    public static po1 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
    }

    public po1(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static po1 a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new po1(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location c = hw0.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c2 = hw0.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c2 == null || c == null) ? c2 != null ? c2 : c : c2.getTime() > c.getTime() ? c2 : c;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            f(b);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        oo1 b = oo1.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.a;
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.c == 1;
        long j3 = b.b;
        long j4 = b.a;
        boolean z2 = z;
        b.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b.b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.a = z2;
        aVar.b = j2;
        aVar.c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }
}
