package com.daaw;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.daaw.j01;
import com.daaw.xb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
/* loaded from: classes.dex */
public class rb extends qb {
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile gk8 d;
    public Context e;
    public volatile oe5 f;
    public volatile il2 g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ExecutorService v;

    public rb(Context context, boolean z, g01 g01Var, String str, String str2, is3 is3Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        this.b = str;
        i(context, g01Var, z, null);
    }

    public rb(String str, boolean z, Context context, c33 c33Var) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        this.b = r();
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new gk8(applicationContext, null);
        this.t = z;
    }

    public rb(String str, boolean z, Context context, g01 g01Var, is3 is3Var) {
        this(context, z, g01Var, r(), null, null);
    }

    public static /* bridge */ /* synthetic */ n63 A(rb rbVar, String str) {
        yx2.k("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle f = yx2.f(rbVar.m, rbVar.t, rbVar.b);
        String str2 = null;
        do {
            try {
                Bundle K2 = rbVar.m ? rbVar.f.K2(9, rbVar.e.getPackageName(), str, str2, f) : rbVar.f.W0(3, rbVar.e.getPackageName(), str, str2);
                xb a = s73.a(K2, "BillingClient", "getPurchase()");
                if (a != uz2.l) {
                    return new n63(a, null);
                }
                ArrayList<String> stringArrayList = K2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = K2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = K2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    yx2.k("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.d())) {
                            yx2.l("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        yx2.m("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new n63(uz2.j, null);
                    }
                }
                str2 = K2.getString("INAPP_CONTINUATION_TOKEN");
                yx2.k("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e2) {
                yx2.m("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new n63(uz2.m, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new n63(uz2.l, arrayList);
    }

    @SuppressLint({"PrivateApi"})
    public static String r() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.0.0";
        }
    }

    public final /* synthetic */ Object C(c0 c0Var, d0 d0Var) {
        xb xbVar;
        try {
            Bundle Y2 = this.f.Y2(9, this.e.getPackageName(), c0Var.a(), yx2.c(c0Var, this.b));
            int b = yx2.b(Y2, "BillingClient");
            String h = yx2.h(Y2, "BillingClient");
            xb.a c = xb.c();
            c.c(b);
            c.b(h);
            xbVar = c.a();
        } catch (Exception e) {
            yx2.m("BillingClient", "Error acknowledge purchase!", e);
            xbVar = uz2.m;
        }
        d0Var.a(xbVar);
        return null;
    }

    public final /* synthetic */ Object D(j01 j01Var, lz0 lz0Var) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        String c = j01Var.c();
        rt8 b = j01Var.b();
        int size = b.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            str = "Item is unavailable for purchase.";
            if (i2 >= size) {
                str = "";
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(b.subList(i2, i3 > size ? size : i3));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(((j01.b) arrayList2.get(i4)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                Bundle b0 = this.f.b0(17, this.e.getPackageName(), c, bundle, yx2.e(this.b, arrayList2, null));
                if (b0 == null) {
                    str2 = "queryProductDetailsAsync got empty product details response.";
                    break;
                } else if (b0.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = b0.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        str2 = "queryProductDetailsAsync got null response list";
                        break;
                    }
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        try {
                            kz0 kz0Var = new kz0(stringArrayList.get(i5));
                            yx2.k("BillingClient", "Got product details: ".concat(kz0Var.toString()));
                            arrayList.add(kz0Var);
                        } catch (JSONException e) {
                            yx2.m("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            str = "Error trying to decode SkuDetails.";
                            i = 6;
                            xb.a c2 = xb.c();
                            c2.c(i);
                            c2.b(str);
                            lz0Var.a(c2.a(), arrayList);
                            return null;
                        }
                    }
                    i2 = i3;
                } else {
                    i = yx2.b(b0, "BillingClient");
                    str = yx2.h(b0, "BillingClient");
                    if (i != 0) {
                        yx2.l("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                    } else {
                        yx2.l("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                    }
                }
            } catch (Exception e2) {
                yx2.m("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                str = "An internal error occurred.";
            }
        }
        yx2.l("BillingClient", str2);
        i = 4;
        xb.a c22 = xb.c();
        c22.c(i);
        c22.b(str);
        lz0Var.a(c22.a(), arrayList);
        return null;
    }

    @Override // com.daaw.qb
    public final void a(final c0 c0Var, final d0 d0Var) {
        xb q;
        if (!c()) {
            q = uz2.m;
        } else if (TextUtils.isEmpty(c0Var.a())) {
            yx2.l("BillingClient", "Please provide a valid purchase token.");
            q = uz2.i;
        } else if (!this.m) {
            q = uz2.b;
        } else if (s(new Callable() { // from class: com.daaw.ry8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rb.this.C(c0Var, d0Var);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.zz8
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.a(uz2.n);
            }
        }, o()) != null) {
            return;
        } else {
            q = q();
        }
        d0Var.a(q);
    }

    @Override // com.daaw.qb
    public final void b() {
        try {
            this.d.d();
            if (this.g != null) {
                this.g.c();
            }
            if (this.g != null && this.f != null) {
                yx2.k("BillingClient", "Unbinding from service.");
                this.e.unbindService(this.g);
                this.g = null;
            }
            this.f = null;
            ExecutorService executorService = this.v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.v = null;
            }
        } catch (Exception e) {
            yx2.m("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.a = 3;
        }
    }

    @Override // com.daaw.qb
    public final boolean c() {
        return (this.a != 2 || this.f == null || this.g == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x034c A[Catch: Exception -> 0x038c, CancellationException -> 0x0394, TimeoutException -> 0x0396, TryCatch #4 {CancellationException -> 0x0394, TimeoutException -> 0x0396, Exception -> 0x038c, blocks: (B:292:0x033a, B:294:0x034c, B:296:0x0372), top: B:310:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0372 A[Catch: Exception -> 0x038c, CancellationException -> 0x0394, TimeoutException -> 0x0396, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0394, TimeoutException -> 0x0396, Exception -> 0x038c, blocks: (B:292:0x033a, B:294:0x034c, B:296:0x0372), top: B:310:0x033a }] */
    @Override // com.daaw.qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.xb d(android.app.Activity r32, final com.daaw.tb r33) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rb.d(android.app.Activity, com.daaw.tb):com.daaw.xb");
    }

    @Override // com.daaw.qb
    public void f(final j01 j01Var, final lz0 lz0Var) {
        xb q;
        ArrayList arrayList;
        if (!c()) {
            q = uz2.m;
            arrayList = new ArrayList();
        } else if (!this.s) {
            yx2.l("BillingClient", "Querying product details is not supported.");
            q = uz2.v;
            arrayList = new ArrayList();
        } else if (s(new Callable() { // from class: com.daaw.hr8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rb.this.D(j01Var, lz0Var);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.ns8
            @Override // java.lang.Runnable
            public final void run() {
                lz0.this.a(uz2.n, new ArrayList());
            }
        }, o()) != null) {
            return;
        } else {
            q = q();
            arrayList = new ArrayList();
        }
        lz0Var.a(q, arrayList);
    }

    @Override // com.daaw.qb
    public void g(k01 k01Var, f01 f01Var) {
        t(k01Var.b(), f01Var);
    }

    @Override // com.daaw.qb
    public final void h(sb sbVar) {
        ServiceInfo serviceInfo;
        String str;
        if (c()) {
            yx2.k("BillingClient", "Service connection is valid. No need to re-initialize.");
            sbVar.a(uz2.l);
        } else if (this.a == 1) {
            yx2.l("BillingClient", "Client is already in the process of connecting to billing service.");
            sbVar.a(uz2.d);
        } else if (this.a == 3) {
            yx2.l("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            sbVar.a(uz2.m);
        } else {
            this.a = 1;
            this.d.e();
            yx2.k("BillingClient", "Starting in-app billing setup.");
            this.g = new il2(this, sbVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.e.bindService(intent2, this.g, 1)) {
                        yx2.k("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                yx2.l("BillingClient", str);
            }
            this.a = 0;
            yx2.k("BillingClient", "Billing service unavailable on device.");
            sbVar.a(uz2.c);
        }
    }

    public final void i(Context context, g01 g01Var, boolean z, is3 is3Var) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new gk8(applicationContext, g01Var, is3Var);
        this.t = z;
        this.u = is3Var != null;
    }

    public final /* synthetic */ void n(xb xbVar) {
        if (this.d.c() != null) {
            this.d.c().b(xbVar, null);
            return;
        }
        this.d.b();
        yx2.l("BillingClient", "No valid listener is set in BroadcastManager");
    }

    public final Handler o() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    public final xb p(final xb xbVar) {
        if (Thread.interrupted()) {
            return xbVar;
        }
        this.c.post(new Runnable() { // from class: com.daaw.ra2
            @Override // java.lang.Runnable
            public final void run() {
                rb.this.n(xbVar);
            }
        });
        return xbVar;
    }

    public final xb q() {
        return (this.a == 0 || this.a == 3) ? uz2.m : uz2.j;
    }

    public final Future s(Callable callable, long j, final Runnable runnable, Handler handler) {
        double d = j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.v == null) {
            this.v = Executors.newFixedThreadPool(yx2.a, new qg2(this));
        }
        try {
            final Future submit = this.v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.daaw.k92
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    yx2.l("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return submit;
        } catch (Exception e) {
            yx2.m("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final void t(String str, final f01 f01Var) {
        xb q;
        if (!c()) {
            q = uz2.m;
        } else if (TextUtils.isEmpty(str)) {
            yx2.l("BillingClient", "Please provide a valid product type.");
            q = uz2.g;
        } else if (s(new dd2(this, str, f01Var), 30000L, new Runnable() { // from class: com.daaw.g72
            @Override // java.lang.Runnable
            public final void run() {
                f01.this.c(uz2.n, rt8.r());
            }
        }, o()) != null) {
            return;
        } else {
            q = q();
        }
        f01Var.c(q, rt8.r());
    }

    public final /* synthetic */ Bundle w(int i, String str, String str2, tb tbVar, Bundle bundle) {
        return this.f.O1(i, this.e.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle x(String str, String str2) {
        return this.f.a1(3, this.e.getPackageName(), str, str2, null);
    }
}
