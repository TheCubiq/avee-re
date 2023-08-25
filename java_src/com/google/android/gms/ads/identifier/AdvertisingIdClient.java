package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.C1291fj;
import com.daaw.ServiceConnectionC1819jc;
import com.daaw.a80;
import com.daaw.c80;
import com.daaw.ey2;
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

    /* renamed from: a */
    public ServiceConnectionC1819jc f36075a;
    @GuardedBy("this")

    /* renamed from: b */
    public z76 f36076b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f36077c;

    /* renamed from: d */
    public final Object f36078d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    public ey2 f36079e;
    @GuardedBy("this")

    /* renamed from: f */
    public final Context f36080f;

    /* renamed from: g */
    public final long f36081g;

    /* loaded from: classes.dex */
    public static final class Info {

        /* renamed from: a */
        public final String f36082a;

        /* renamed from: b */
        public final boolean f36083b;

        @Deprecated
        public Info(String str, boolean z) {
            this.f36082a = str;
            this.f36083b = z;
        }

        public String getId() {
            return this.f36082a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f36083b;
        }

        public String toString() {
            String str = this.f36082a;
            boolean z = this.f36083b;
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
        this.f36078d = new Object();
        ry0.m10830j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f36080f = context;
        this.f36077c = false;
        this.f36081g = j;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.m1441a(false);
            Info m1439c = advertisingIdClient.m1439c(-1);
            advertisingIdClient.m1440b(m1439c, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m1439c;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.m1441a(false);
            ry0.m10831i("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f36077c) {
                    synchronized (advertisingIdClient.f36078d) {
                        ey2 ey2Var = advertisingIdClient.f36079e;
                        if (ey2Var == null || !ey2Var.f8951s) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.m1441a(false);
                        if (!advertisingIdClient.f36077c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                ry0.m10830j(advertisingIdClient.f36075a);
                ry0.m10830j(advertisingIdClient.f36076b);
                try {
                    zzd = advertisingIdClient.f36076b.zzd();
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.m1438d();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* renamed from: a */
    public final void m1441a(boolean z) {
        ry0.m10831i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f36077c) {
                zza();
            }
            Context context = this.f36080f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo5490h = x70.m5492f().mo5490h(context, c80.f5613a);
                if (mo5490h != 0 && mo5490h != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC1819jc serviceConnectionC1819jc = new ServiceConnectionC1819jc();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!C1291fj.m22614b().m22615a(context, intent, serviceConnectionC1819jc, 1)) {
                    throw new IOException("Connection failure");
                }
                this.f36075a = serviceConnectionC1819jc;
                try {
                    this.f36076b = le5.m16984D(serviceConnectionC1819jc.m18607a(10000L, TimeUnit.MILLISECONDS));
                    this.f36077c = true;
                    if (z) {
                        m1438d();
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

    /* renamed from: b */
    public final boolean m1440b(Info info, boolean z, float f, long j, String str, Throwable th) {
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
            new C3984a(this, hashMap).start();
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final Info m1439c(int i) {
        Info info;
        ry0.m10831i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f36077c) {
                synchronized (this.f36078d) {
                    ey2 ey2Var = this.f36079e;
                    if (ey2Var == null || !ey2Var.f8951s) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m1441a(false);
                    if (!this.f36077c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            ry0.m10830j(this.f36075a);
            ry0.m10830j(this.f36076b);
            try {
                info = new Info(this.f36076b.zzc(), this.f36076b.mo2680t(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        m1438d();
        return info;
    }

    /* renamed from: d */
    public final void m1438d() {
        synchronized (this.f36078d) {
            ey2 ey2Var = this.f36079e;
            if (ey2Var != null) {
                ey2Var.f8950r.countDown();
                try {
                    this.f36079e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f36081g;
            if (j > 0) {
                this.f36079e = new ey2(this, j);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return m1439c(-1);
    }

    public void start() {
        m1441a(true);
    }

    public final void zza() {
        ry0.m10831i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f36080f == null || this.f36075a == null) {
                return;
            }
            try {
                if (this.f36077c) {
                    C1291fj.m22614b().m22613c(this.f36080f, this.f36075a);
                }
            } catch (Throwable unused) {
            }
            this.f36077c = false;
            this.f36076b = null;
            this.f36075a = null;
        }
    }
}
