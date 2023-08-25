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
    public final int a;
    public final int b;
    public final Context c;

    /* loaded from: classes.dex */
    public static class a implements b {
        public final DisplayMetrics a;

        public a(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.daaw.fp0.b
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.daaw.fp0.b
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();
    }

    public fp0(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new a(context.getResources().getDisplayMetrics()));
    }

    public fp0(Context context, ActivityManager activityManager, b bVar) {
        this.c = context;
        int b2 = b(activityManager);
        int b3 = bVar.b() * bVar.a() * 4;
        int i = b3 * 4;
        int i2 = b3 * 2;
        int i3 = i2 + i;
        if (i3 <= b2) {
            this.b = i2;
        } else {
            int round = Math.round(b2 / 6.0f);
            this.b = round * 2;
            i = round * 4;
        }
        this.a = i;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated memory cache size: ");
            sb.append(e(this.b));
            sb.append(" pool size: ");
            sb.append(e(this.a));
            sb.append(" memory class limited? ");
            sb.append(i3 > b2);
            sb.append(" max size: ");
            sb.append(e(b2));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(d(activityManager));
        }
    }

    public static int b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV * NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV * (d(activityManager) ? 0.33f : 0.4f));
    }

    @TargetApi(19)
    public static boolean d(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public final String e(int i) {
        return Formatter.formatFileSize(this.c, i);
    }
}
