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
import com.google.android.gms.common.internal.InterfaceC3989b;
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
/* renamed from: com.daaw.pa */
/* loaded from: classes.dex */
public abstract class AbstractC2527pa<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* renamed from: A */
    public boolean f22733A;

    /* renamed from: B */
    public volatile zzj f22734B;

    /* renamed from: C */
    public AtomicInteger f22735C;

    /* renamed from: a */
    public int f22736a;

    /* renamed from: b */
    public long f22737b;

    /* renamed from: c */
    public long f22738c;

    /* renamed from: d */
    public int f22739d;

    /* renamed from: e */
    public long f22740e;

    /* renamed from: f */
    public volatile String f22741f;

    /* renamed from: g */
    public ot8 f22742g;

    /* renamed from: h */
    public final Context f22743h;

    /* renamed from: i */
    public final Looper f22744i;

    /* renamed from: j */
    public final u70 f22745j;

    /* renamed from: k */
    public final x70 f22746k;

    /* renamed from: l */
    public final Handler f22747l;

    /* renamed from: m */
    public final Object f22748m;

    /* renamed from: n */
    public final Object f22749n;
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: o */
    public ud0 f22750o;

    /* renamed from: p */
    public InterfaceC2530c f22751p;
    @GuardedBy("mLock")

    /* renamed from: q */
    public IInterface f22752q;

    /* renamed from: r */
    public final ArrayList f22753r;
    @GuardedBy("mLock")

    /* renamed from: s */
    public je5 f22754s;
    @GuardedBy("mLock")

    /* renamed from: t */
    public int f22755t;

    /* renamed from: u */
    public final InterfaceC2528a f22756u;

    /* renamed from: v */
    public final InterfaceC2529b f22757v;

    /* renamed from: w */
    public final int f22758w;

    /* renamed from: x */
    public final String f22759x;

    /* renamed from: y */
    public volatile String f22760y;

    /* renamed from: z */
    public ConnectionResult f22761z;

    /* renamed from: D */
    public static final Feature[] f22732D = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.daaw.pa$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2528a {
        /* renamed from: D */
        void mo5044D(int i);

        /* renamed from: M */
        void mo2196M(Bundle bundle);
    }

    /* renamed from: com.daaw.pa$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2529b {
        /* renamed from: I */
        void mo2982I(ConnectionResult connectionResult);
    }

    /* renamed from: com.daaw.pa$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2530c {
        /* renamed from: a */
        void mo13540a(ConnectionResult connectionResult);
    }

    /* renamed from: com.daaw.pa$d */
    /* loaded from: classes.dex */
    public class C2531d implements InterfaceC2530c {
        public C2531d() {
        }

        @Override // com.daaw.AbstractC2527pa.InterfaceC2530c
        /* renamed from: a */
        public final void mo13540a(ConnectionResult connectionResult) {
            if (connectionResult.m1205u()) {
                AbstractC2527pa abstractC2527pa = AbstractC2527pa.this;
                abstractC2527pa.getRemoteService(null, abstractC2527pa.mo9476j());
            } else if (AbstractC2527pa.this.f22757v != null) {
                AbstractC2527pa.this.f22757v.mo2982I(connectionResult);
            }
        }
    }

    /* renamed from: com.daaw.pa$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2532e {
        /* renamed from: a */
        void mo13539a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2527pa(Context context, Looper looper, int i, InterfaceC2528a interfaceC2528a, InterfaceC2529b interfaceC2529b, String str) {
        this(context, looper, r3, r4, i, interfaceC2528a, interfaceC2529b, str);
        u70 m8461b = u70.m8461b(context);
        x70 m5492f = x70.m5492f();
        ry0.m10830j(interfaceC2528a);
        ry0.m10830j(interfaceC2529b);
    }

    public AbstractC2527pa(Context context, Looper looper, u70 u70Var, x70 x70Var, int i, InterfaceC2528a interfaceC2528a, InterfaceC2529b interfaceC2529b, String str) {
        this.f22741f = null;
        this.f22748m = new Object();
        this.f22749n = new Object();
        this.f22753r = new ArrayList();
        this.f22755t = 1;
        this.f22761z = null;
        this.f22733A = false;
        this.f22734B = null;
        this.f22735C = new AtomicInteger(0);
        ry0.m10829k(context, "Context must not be null");
        this.f22743h = context;
        ry0.m10829k(looper, "Looper must not be null");
        this.f22744i = looper;
        ry0.m10829k(u70Var, "Supervisor must not be null");
        this.f22745j = u70Var;
        ry0.m10829k(x70Var, "API availability must not be null");
        this.f22746k = x70Var;
        this.f22747l = new ly2(this, looper);
        this.f22758w = i;
        this.f22756u = interfaceC2528a;
        this.f22757v = interfaceC2529b;
        this.f22759x = str;
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m13564C(AbstractC2527pa abstractC2527pa, zzj zzjVar) {
        abstractC2527pa.f22734B = zzjVar;
        if (abstractC2527pa.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f36664s;
            g61.m21902b().m21901c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m1167v());
        }
    }

    /* renamed from: D */
    public static /* bridge */ /* synthetic */ void m13563D(AbstractC2527pa abstractC2527pa, int i) {
        int i2;
        int i3;
        synchronized (abstractC2527pa.f22748m) {
            i2 = abstractC2527pa.f22755t;
        }
        if (i2 == 3) {
            abstractC2527pa.f22733A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC2527pa.f22747l;
        handler.sendMessage(handler.obtainMessage(i3, abstractC2527pa.f22735C.get(), 16));
    }

    /* renamed from: G */
    public static /* bridge */ /* synthetic */ boolean m13560G(AbstractC2527pa abstractC2527pa, int i, int i2, IInterface iInterface) {
        synchronized (abstractC2527pa.f22748m) {
            if (abstractC2527pa.f22755t != i) {
                return false;
            }
            abstractC2527pa.m13558I(i2, iInterface);
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
    /* renamed from: H */
    public static /* bridge */ /* synthetic */ boolean m13559H(com.daaw.AbstractC2527pa r2) {
        /*
            boolean r0 = r2.f22733A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo6175k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m13555i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo6175k()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2527pa.m13559H(com.daaw.pa):boolean");
    }

    /* renamed from: E */
    public final void m13562E(int i, Bundle bundle, int i2) {
        Handler handler = this.f22747l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new s07(this, i, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final void m13558I(int i, IInterface iInterface) {
        ot8 ot8Var;
        ry0.m10839a((i == 4) == (iInterface != 0));
        synchronized (this.f22748m) {
            this.f22755t = i;
            this.f22752q = iInterface;
            if (i == 1) {
                je5 je5Var = this.f22754s;
                if (je5Var != null) {
                    u70 u70Var = this.f22745j;
                    String m13973c = this.f22742g.m13973c();
                    ry0.m10830j(m13973c);
                    u70Var.m8459e(m13973c, this.f22742g.m13974b(), this.f22742g.m13975a(), je5Var, m13543x(), this.f22742g.m13972d());
                    this.f22754s = null;
                }
            } else if (i == 2 || i == 3) {
                je5 je5Var2 = this.f22754s;
                if (je5Var2 != null && (ot8Var = this.f22742g) != null) {
                    String m13973c2 = ot8Var.m13973c();
                    String m13974b = ot8Var.m13974b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(m13973c2);
                    sb.append(" on ");
                    sb.append(m13974b);
                    u70 u70Var2 = this.f22745j;
                    String m13973c3 = this.f22742g.m13973c();
                    ry0.m10830j(m13973c3);
                    u70Var2.m8459e(m13973c3, this.f22742g.m13974b(), this.f22742g.m13975a(), je5Var2, m13543x(), this.f22742g.m13972d());
                    this.f22735C.incrementAndGet();
                }
                je5 je5Var3 = new je5(this, this.f22735C.get());
                this.f22754s = je5Var3;
                ot8 ot8Var2 = (this.f22755t != 3 || m13555i() == null) ? new ot8(m13554m(), mo6174l(), false, u70.m8462a(), mo13553n()) : new ot8(getContext().getPackageName(), m13555i(), true, u70.m8462a(), false);
                this.f22742g = ot8Var2;
                if (ot8Var2.m13972d() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f22742g.m13973c())));
                }
                u70 u70Var3 = this.f22745j;
                String m13973c4 = this.f22742g.m13973c();
                ry0.m10830j(m13973c4);
                if (!u70Var3.mo6940f(new rh8(m13973c4, this.f22742g.m13974b(), this.f22742g.m13975a(), this.f22742g.m13972d()), je5Var3, m13543x(), mo9477g())) {
                    String m13973c5 = this.f22742g.m13973c();
                    String m13974b2 = this.f22742g.m13974b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unable to connect to service: ");
                    sb2.append(m13973c5);
                    sb2.append(" on ");
                    sb2.append(m13974b2);
                    m13562E(16, null, this.f22735C.get());
                }
            } else if (i == 4) {
                ry0.m10830j(iInterface);
                m13552o(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int mo5490h = this.f22746k.mo5490h(this.f22743h, getMinApkVersion());
        if (mo5490h == 0) {
            connect(new C2531d());
            return;
        }
        m13558I(1, null);
        m13548s(new C2531d(), mo5490h, null);
    }

    public void connect(InterfaceC2530c interfaceC2530c) {
        ry0.m10829k(interfaceC2530c, "Connection progress callbacks cannot be null.");
        this.f22751p = interfaceC2530c;
        m13558I(2, null);
    }

    /* renamed from: d */
    public final void m13557d() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void disconnect() {
        this.f22735C.incrementAndGet();
        synchronized (this.f22753r) {
            int size = this.f22753r.size();
            for (int i = 0; i < size; i++) {
                ((es3) this.f22753r.get(i)).m23233d();
            }
            this.f22753r.clear();
        }
        synchronized (this.f22749n) {
            this.f22750o = null;
        }
        m13558I(1, null);
    }

    public void disconnect(String str) {
        this.f22741f = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        ud0 ud0Var;
        synchronized (this.f22748m) {
            i = this.f22755t;
            iInterface = this.f22752q;
        }
        synchronized (this.f22749n) {
            ud0Var = this.f22750o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo6175k()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (ud0Var == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(ud0Var.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f22738c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f22738c;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f22737b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f22736a;
            printWriter.append((CharSequence) (i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f22737b;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f22740e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C1184eh.m23471a(this.f22739d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f22740e;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* renamed from: e */
    public abstract T mo6177e(IBinder iBinder);

    /* renamed from: f */
    public boolean m13556f() {
        return false;
    }

    /* renamed from: g */
    public Executor mo9477g() {
        return null;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return f22732D;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.f22734B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f36662q;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.f22743h;
    }

    public String getEndpointPackageName() {
        ot8 ot8Var;
        if (!isConnected() || (ot8Var = this.f22742g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return ot8Var.m13974b();
    }

    public int getGCoreServiceId() {
        return this.f22758w;
    }

    public String getLastDisconnectMessage() {
        return this.f22741f;
    }

    public final Looper getLooper() {
        return this.f22744i;
    }

    public int getMinApkVersion() {
        return x70.f32161a;
    }

    public void getRemoteService(InterfaceC3989b interfaceC3989b, Set<Scope> set) {
        Bundle mo6176h = mo6176h();
        int i = this.f22758w;
        String str = this.f22760y;
        int i2 = x70.f32161a;
        Scope[] scopeArr = GetServiceRequest.f36620D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f36621E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f36628s = this.f22743h.getPackageName();
        getServiceRequest.f36631v = mo6176h;
        if (set != null) {
            getServiceRequest.f36630u = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f36632w = account;
            if (interfaceC3989b != null) {
                getServiceRequest.f36629t = interfaceC3989b.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f36632w = getAccount();
        }
        getServiceRequest.f36633x = f22732D;
        getServiceRequest.f36634y = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f36623B = true;
        }
        try {
            try {
                synchronized (this.f22749n) {
                    ud0 ud0Var = this.f22750o;
                    if (ud0Var != null) {
                        ud0Var.mo8318Q2(new dl4(this, this.f22735C.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                m13549r(8, null, null, this.f22735C.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final T getService() {
        T t;
        synchronized (this.f22748m) {
            if (this.f22755t == 5) {
                throw new DeadObjectException();
            }
            m13557d();
            t = (T) this.f22752q;
            ry0.m10829k(t, "Client is connected but service is null");
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.f22749n) {
            ud0 ud0Var = this.f22750o;
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
        zzj zzjVar = this.f22734B;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f36664s;
    }

    /* renamed from: h */
    public Bundle mo6176h() {
        return new Bundle();
    }

    public boolean hasConnectionInfo() {
        return this.f22734B != null;
    }

    /* renamed from: i */
    public String m13555i() {
        return null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f22748m) {
            z = this.f22755t == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f22748m) {
            int i = this.f22755t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public Set<Scope> mo9476j() {
        return Collections.emptySet();
    }

    /* renamed from: k */
    public abstract String mo6175k();

    /* renamed from: l */
    public abstract String mo6174l();

    /* renamed from: m */
    public String m13554m() {
        return "com.google.android.gms";
    }

    /* renamed from: n */
    public boolean mo13553n() {
        return getMinApkVersion() >= 211700000;
    }

    /* renamed from: o */
    public void m13552o(T t) {
        this.f22738c = System.currentTimeMillis();
    }

    public void onUserSignOut(InterfaceC2532e interfaceC2532e) {
        interfaceC2532e.mo13539a();
    }

    /* renamed from: p */
    public void m13551p(ConnectionResult connectionResult) {
        this.f22739d = connectionResult.m1209h();
        this.f22740e = System.currentTimeMillis();
    }

    public boolean providesSignIn() {
        return false;
    }

    /* renamed from: q */
    public void m13550q(int i) {
        this.f22736a = i;
        this.f22737b = System.currentTimeMillis();
    }

    /* renamed from: r */
    public void m13549r(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f22747l;
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

    /* renamed from: s */
    public void m13548s(InterfaceC2530c interfaceC2530c, int i, PendingIntent pendingIntent) {
        ry0.m10829k(interfaceC2530c, "Connection progress callbacks cannot be null.");
        this.f22751p = interfaceC2530c;
        Handler handler = this.f22747l;
        handler.sendMessage(handler.obtainMessage(3, this.f22735C.get(), i, pendingIntent));
    }

    public void setAttributionTag(String str) {
        this.f22760y = str;
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.f22747l;
        handler.sendMessage(handler.obtainMessage(6, this.f22735C.get(), i));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* renamed from: x */
    public final String m13543x() {
        String str = this.f22759x;
        return str == null ? this.f22743h.getClass().getName() : str;
    }
}
