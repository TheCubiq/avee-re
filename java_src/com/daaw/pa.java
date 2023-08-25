package com.daaw;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class pa<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public boolean A;
    public volatile zzj B;
    public AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public ot8 g;
    public final Context h;
    public final Looper i;
    public final u70 j;
    public final x70 k;
    public final Handler l;
    public final Object m;
    public final Object n;
    @GuardedBy("mServiceBrokerLock")
    public ud0 o;
    public c p;
    @GuardedBy("mLock")
    public IInterface q;
    public final ArrayList r;
    @GuardedBy("mLock")
    public je5 s;
    @GuardedBy("mLock")
    public int t;
    public final a u;
    public final b v;
    public final int w;
    public final String x;
    public volatile String y;
    public ConnectionResult z;
    public static final Feature[] D = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* loaded from: classes.dex */
    public interface a {
        void D(int i);

        void M(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void I(ConnectionResult connectionResult);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
        }

        @Override // com.daaw.pa.c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.u()) {
                pa paVar = pa.this;
                paVar.getRemoteService(null, paVar.j());
            } else if (pa.this.v != null) {
                pa.this.v.I(connectionResult);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pa(android.content.Context r10, android.os.Looper r11, int r12, com.daaw.pa.a r13, com.daaw.pa.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.daaw.u70 r3 = com.daaw.u70.b(r10)
            com.daaw.x70 r4 = com.daaw.x70.f()
            com.daaw.ry0.j(r13)
            com.daaw.ry0.j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pa.<init>(android.content.Context, android.os.Looper, int, com.daaw.pa$a, com.daaw.pa$b, java.lang.String):void");
    }

    public pa(Context context, Looper looper, u70 u70Var, x70 x70Var, int i, a aVar, b bVar, String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        ry0.k(context, "Context must not be null");
        this.h = context;
        ry0.k(looper, "Looper must not be null");
        this.i = looper;
        ry0.k(u70Var, "Supervisor must not be null");
        this.j = u70Var;
        ry0.k(x70Var, "API availability must not be null");
        this.k = x70Var;
        this.l = new ly2(this, looper);
        this.w = i;
        this.u = aVar;
        this.v = bVar;
        this.x = str;
    }

    public static /* bridge */ /* synthetic */ void C(pa paVar, zzj zzjVar) {
        paVar.B = zzjVar;
        if (paVar.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.s;
            g61.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.v());
        }
    }

    public static /* bridge */ /* synthetic */ void D(pa paVar, int i) {
        int i2;
        int i3;
        synchronized (paVar.m) {
            i2 = paVar.t;
        }
        if (i2 == 3) {
            paVar.A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = paVar.l;
        handler.sendMessage(handler.obtainMessage(i3, paVar.C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean G(pa paVar, int i, int i2, IInterface iInterface) {
        synchronized (paVar.m) {
            if (paVar.t != i) {
                return false;
            }
            paVar.I(i2, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean H(com.daaw.pa r2) {
        /*
            boolean r0 = r2.A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.k()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pa.H(com.daaw.pa):boolean");
    }

    public final void E(int i, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new s07(this, i, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i, IInterface iInterface) {
        ot8 ot8Var;
        ry0.a((i == 4) == (iInterface != 0));
        synchronized (this.m) {
            this.t = i;
            this.q = iInterface;
            if (i == 1) {
                je5 je5Var = this.s;
                if (je5Var != null) {
                    u70 u70Var = this.j;
                    String c2 = this.g.c();
                    ry0.j(c2);
                    u70Var.e(c2, this.g.b(), this.g.a(), je5Var, x(), this.g.d());
                    this.s = null;
                }
            } else if (i == 2 || i == 3) {
                je5 je5Var2 = this.s;
                if (je5Var2 != null && (ot8Var = this.g) != null) {
                    String c3 = ot8Var.c();
                    String b2 = ot8Var.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c3);
                    sb.append(" on ");
                    sb.append(b2);
                    u70 u70Var2 = this.j;
                    String c4 = this.g.c();
                    ry0.j(c4);
                    u70Var2.e(c4, this.g.b(), this.g.a(), je5Var2, x(), this.g.d());
                    this.C.incrementAndGet();
                }
                je5 je5Var3 = new je5(this, this.C.get());
                this.s = je5Var3;
                ot8 ot8Var2 = (this.t != 3 || i() == null) ? new ot8(m(), l(), false, u70.a(), n()) : new ot8(getContext().getPackageName(), i(), true, u70.a(), false);
                this.g = ot8Var2;
                if (ot8Var2.d() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.c())));
                }
                u70 u70Var3 = this.j;
                String c5 = this.g.c();
                ry0.j(c5);
                if (!u70Var3.f(new rh8(c5, this.g.b(), this.g.a(), this.g.d()), je5Var3, x(), g())) {
                    String c6 = this.g.c();
                    String b3 = this.g.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to connect to service: ");
                    sb2.append(c6);
                    sb2.append(" on ");
                    sb2.append(b3);
                    E(16, null, this.C.get());
                }
            } else if (i == 4) {
                ry0.j(iInterface);
                o(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int h = this.k.h(this.h, getMinApkVersion());
        if (h == 0) {
            connect(new d());
            return;
        }
        I(1, null);
        s(new d(), h, null);
    }

    public void connect(c cVar) {
        ry0.k(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        I(2, null);
    }

    public final void d() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int i = 0; i < size; i++) {
                ((es3) this.r.get(i)).d();
            }
            this.r.clear();
        }
        synchronized (this.n) {
            this.o = null;
        }
        I(1, null);
    }

    public void disconnect(String str) {
        this.f = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        ud0 ud0Var;
        synchronized (this.m) {
            i = this.t;
            iInterface = this.q;
        }
        synchronized (this.n) {
            ud0Var = this.o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) k()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (ud0Var == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(ud0Var.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.c;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            printWriter.append((CharSequence) (i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.b;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) eh.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.e;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    public abstract T e(IBinder iBinder);

    public boolean f() {
        return false;
    }

    public Executor g() {
        return null;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return D;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.q;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.h;
    }

    public String getEndpointPackageName() {
        ot8 ot8Var;
        if (!isConnected() || (ot8Var = this.g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return ot8Var.b();
    }

    public int getGCoreServiceId() {
        return this.w;
    }

    public String getLastDisconnectMessage() {
        return this.f;
    }

    public final Looper getLooper() {
        return this.i;
    }

    public int getMinApkVersion() {
        return x70.a;
    }

    public void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        Bundle h = h();
        int i = this.w;
        String str = this.y;
        int i2 = x70.a;
        Scope[] scopeArr = GetServiceRequest.D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.s = this.h.getPackageName();
        getServiceRequest.v = h;
        if (set != null) {
            getServiceRequest.u = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.w = account;
            if (bVar != null) {
                getServiceRequest.t = bVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.w = getAccount();
        }
        getServiceRequest.x = D;
        getServiceRequest.y = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.B = true;
        }
        try {
            try {
                synchronized (this.n) {
                    ud0 ud0Var = this.o;
                    if (ud0Var != null) {
                        ud0Var.Q2(new dl4(this, this.C.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                r(8, null, null, this.C.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public final T getService() {
        T t;
        synchronized (this.m) {
            if (this.t == 5) {
                throw new DeadObjectException();
            }
            d();
            t = (T) this.q;
            ry0.k(t, "Client is connected but service is null");
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.n) {
            ud0 ud0Var = this.o;
            if (ud0Var == null) {
                return null;
            }
            return ud0Var.asBinder();
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.s;
    }

    public Bundle h() {
        return new Bundle();
    }

    public boolean hasConnectionInfo() {
        return this.B != null;
    }

    public String i() {
        return null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public Set<Scope> j() {
        return Collections.emptySet();
    }

    public abstract String k();

    public abstract String l();

    public String m() {
        return "com.google.android.gms";
    }

    public boolean n() {
        return getMinApkVersion() >= 211700000;
    }

    public void o(T t) {
        this.c = System.currentTimeMillis();
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public void p(ConnectionResult connectionResult) {
        this.d = connectionResult.h();
        this.e = System.currentTimeMillis();
    }

    public boolean providesSignIn() {
        return false;
    }

    public void q(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void r(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new x76(this, i, iBinder, bundle)));
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void s(c cVar, int i, PendingIntent pendingIntent) {
        ry0.k(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i, pendingIntent));
    }

    public void setAttributionTag(String str) {
        this.y = str;
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String x() {
        String str = this.x;
        return str == null ? this.h.getClass().getName() : str;
    }
}
