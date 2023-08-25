package com.daaw;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class fp0 {

    /* renamed from: a */
    public final int f9750a;

    /* renamed from: b */
    public final int f9751b;

    /* renamed from: c */
    public final Context f9752c;

    /* renamed from: com.daaw.fp0$a */
    /* loaded from: classes.dex */
    public static class C1319a implements InterfaceC1320b {

        /* renamed from: a */
        public final DisplayMetrics f9753a;

        public C1319a(DisplayMetrics displayMetrics) {
            this.f9753a = displayMetrics;
        }

        @Override // com.daaw.fp0.InterfaceC1320b
        /* renamed from: a */
        public int mo22427a() {
            return this.f9753a.heightPixels;
        }

        @Override // com.daaw.fp0.InterfaceC1320b
        /* renamed from: b */
        public int mo22426b() {
            return this.f9753a.widthPixels;
        }
    }

    /* renamed from: com.daaw.fp0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1320b {
        /* renamed from: a */
        int mo22427a();

        /* renamed from: b */
        int mo22426b();
    }

    public fp0(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new C1319a(context.getResources().getDisplayMetrics()));
    }

    public fp0(Context context, ActivityManager activityManager, InterfaceC1320b interfaceC1320b) {
        this.f9752c = context;
        int m22431b = m22431b(activityManager);
        int mo22426b = interfaceC1320b.mo22426b() * interfaceC1320b.mo22427a() * 4;
        int i = mo22426b * 4;
        int i2 = mo22426b * 2;
        int i3 = i2 + i;
        if (i3 <= m22431b) {
            this.f9751b = i2;
        } else {
            int round = Math.round(m22431b / 6.0f);
            this.f9751b = round * 2;
            i = round * 4;
        }
        this.f9750a = i;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated memory cache size: ");
            sb.append(m22428e(this.f9751b));
            sb.append(" pool size: ");
            sb.append(m22428e(this.f9750a));
            sb.append(" memory class limited? ");
            sb.append(i3 > m22431b);
            sb.append(" max size: ");
            sb.append(m22428e(m22431b));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(m22429d(activityManager));
        }
    }

    /* renamed from: b */
    public static int m22431b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV * NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV * (m22429d(activityManager) ? 0.33f : 0.4f));
    }

    @TargetApi(19)
    /* renamed from: d */
    public static boolean m22429d(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m22432a() {
        return this.f9750a;
    }

    /* renamed from: c */
    public int m22430c() {
        return this.f9751b;
    }

    /* renamed from: e */
    public final String m22428e(int i) {
        return Formatter.formatFileSize(this.f9752c, i);
    }
}
