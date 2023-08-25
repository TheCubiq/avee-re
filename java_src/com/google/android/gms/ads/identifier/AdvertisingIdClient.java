package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.a80;
import com.daaw.c80;
import com.daaw.ey2;
import com.daaw.fj;
import com.daaw.jc;
import com.daaw.le5;
import com.daaw.ry0;
import com.daaw.x70;
import com.daaw.z76;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    @GuardedBy("this")
    public jc a;
    @GuardedBy("this")
    public z76 b;
    @GuardedBy("this")
    public boolean c;
    public final Object d;
    @GuardedBy("mAutoDisconnectTaskLock")
    public ey2 e;
    @GuardedBy("this")
    public final Context f;
    public final long g;

    /* loaded from: classes.dex */
    public static final class Info {
        public final String a;
        public final boolean b;

        @Deprecated
        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        ry0.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info c = advertisingIdClient.c(-1);
            advertisingIdClient.b(c, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return c;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.a(false);
            ry0.i("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.c) {
                    synchronized (advertisingIdClient.d) {
                        ey2 ey2Var = advertisingIdClient.e;
                        if (ey2Var == null || !ey2Var.s) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.a(false);
                        if (!advertisingIdClient.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                ry0.j(advertisingIdClient.a);
                ry0.j(advertisingIdClient.b);
                try {
                    zzd = advertisingIdClient.b.zzd();
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.d();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    public final void a(boolean z) {
        ry0.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                zza();
            }
            Context context = this.f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h = x70.f().h(context, c80.a);
                if (h != 0 && h != 2) {
                    throw new IOException("Google Play services not available");
                }
                jc jcVar = new jc();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!fj.b().a(context, intent, jcVar, 1)) {
                    throw new IOException("Connection failure");
                }
                this.a = jcVar;
                try {
                    this.b = le5.D(jcVar.a(10000L, TimeUnit.MILLISECONDS));
                    this.c = true;
                    if (z) {
                        d();
                    }
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted exception");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new a80(9);
            }
        }
    }

    public final boolean b(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (info != null) {
                hashMap.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new a(this, hashMap).start();
            return true;
        }
        return false;
    }

    public final Info c(int i) {
        Info info;
        ry0.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    ey2 ey2Var = this.e;
                    if (ey2Var == null || !ey2Var.s) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            ry0.j(this.a);
            ry0.j(this.b);
            try {
                info = new Info(this.b.zzc(), this.b.t(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        d();
        return info;
    }

    public final void d() {
        synchronized (this.d) {
            ey2 ey2Var = this.e;
            if (ey2Var != null) {
                ey2Var.r.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new ey2(this, j);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return c(-1);
    }

    public void start() {
        a(true);
    }

    public final void zza() {
        ry0.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    fj.b().c(this.f, this.a);
                }
            } catch (Throwable unused) {
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }
}
