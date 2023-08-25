package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.daaw.C3030tb;
import com.daaw.C3518xb;
import com.daaw.j01;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
/* renamed from: com.daaw.rb */
/* loaded from: classes.dex */
public class C2842rb extends AbstractC2701qb {

    /* renamed from: a */
    public volatile int f25011a;

    /* renamed from: b */
    public final String f25012b;

    /* renamed from: c */
    public final Handler f25013c;

    /* renamed from: d */
    public volatile gk8 f25014d;

    /* renamed from: e */
    public Context f25015e;

    /* renamed from: f */
    public volatile oe5 f25016f;

    /* renamed from: g */
    public volatile il2 f25017g;

    /* renamed from: h */
    public boolean f25018h;

    /* renamed from: i */
    public boolean f25019i;

    /* renamed from: j */
    public int f25020j;

    /* renamed from: k */
    public boolean f25021k;

    /* renamed from: l */
    public boolean f25022l;

    /* renamed from: m */
    public boolean f25023m;

    /* renamed from: n */
    public boolean f25024n;

    /* renamed from: o */
    public boolean f25025o;

    /* renamed from: p */
    public boolean f25026p;

    /* renamed from: q */
    public boolean f25027q;

    /* renamed from: r */
    public boolean f25028r;

    /* renamed from: s */
    public boolean f25029s;

    /* renamed from: t */
    public boolean f25030t;

    /* renamed from: u */
    public boolean f25031u;

    /* renamed from: v */
    public ExecutorService f25032v;

    public C2842rb(Context context, boolean z, g01 g01Var, String str, String str2, is3 is3Var) {
        this.f25011a = 0;
        this.f25013c = new Handler(Looper.getMainLooper());
        this.f25020j = 0;
        this.f25012b = str;
        m11522i(context, g01Var, z, null);
    }

    public C2842rb(String str, boolean z, Context context, c33 c33Var) {
        this.f25011a = 0;
        this.f25013c = new Handler(Looper.getMainLooper());
        this.f25020j = 0;
        this.f25012b = m11513r();
        Context applicationContext = context.getApplicationContext();
        this.f25015e = applicationContext;
        this.f25014d = new gk8(applicationContext, null);
        this.f25030t = z;
    }

    public C2842rb(String str, boolean z, Context context, g01 g01Var, is3 is3Var) {
        this(context, z, g01Var, m11513r(), null, null);
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ n63 m11544A(C2842rb c2842rb, String str) {
        yx2.m3095k("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle m3100f = yx2.m3100f(c2842rb.f25023m, c2842rb.f25030t, c2842rb.f25012b);
        String str2 = null;
        do {
            try {
                Bundle mo7779K2 = c2842rb.f25023m ? c2842rb.f25016f.mo7779K2(9, c2842rb.f25015e.getPackageName(), str, str2, m3100f) : c2842rb.f25016f.mo7777W0(3, c2842rb.f25015e.getPackageName(), str, str2);
                C3518xb m10596a = s73.m10596a(mo7779K2, "BillingClient", "getPurchase()");
                if (m10596a != uz2.f29678l) {
                    return new n63(m10596a, null);
                }
                ArrayList<String> stringArrayList = mo7779K2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo7779K2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo7779K2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    yx2.m3095k("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.m27863d())) {
                            yx2.m3094l("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        yx2.m3093m("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new n63(uz2.f29676j, null);
                    }
                }
                str2 = mo7779K2.getString("INAPP_CONTINUATION_TOKEN");
                yx2.m3095k("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e2) {
                yx2.m3093m("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new n63(uz2.f29679m, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new n63(uz2.f29678l, arrayList);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: r */
    public static String m11513r() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.0.0";
        }
    }

    /* renamed from: C */
    public final /* synthetic */ Object m11542C(C0902c0 c0902c0, InterfaceC1032d0 interfaceC1032d0) {
        C3518xb c3518xb;
        try {
            Bundle mo7776Y2 = this.f25016f.mo7776Y2(9, this.f25015e.getPackageName(), c0902c0.m25709a(), yx2.m3103c(c0902c0, this.f25012b));
            int m3104b = yx2.m3104b(mo7776Y2, "BillingClient");
            String m3098h = yx2.m3098h(mo7776Y2, "BillingClient");
            C3518xb.C3519a m5323c = C3518xb.m5323c();
            m5323c.m5318c(m3104b);
            m5323c.m5319b(m3098h);
            c3518xb = m5323c.m5320a();
        } catch (Exception e) {
            yx2.m3093m("BillingClient", "Error acknowledge purchase!", e);
            c3518xb = uz2.f29679m;
        }
        interfaceC1032d0.mo6253a(c3518xb);
        return null;
    }

    /* renamed from: D */
    public final /* synthetic */ Object m11541D(j01 j01Var, lz0 lz0Var) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        String m19211c = j01Var.m19211c();
        rt8 m19212b = j01Var.m19212b();
        int size = m19212b.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            str = "Item is unavailable for purchase.";
            if (i2 >= size) {
                str = "";
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(m19212b.subList(i2, i3 > size ? size : i3));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(((j01.C1777b) arrayList2.get(i4)).m19206b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f25012b);
            try {
                Bundle mo7774b0 = this.f25016f.mo7774b0(17, this.f25015e.getPackageName(), m19211c, bundle, yx2.m3101e(this.f25012b, arrayList2, null));
                if (mo7774b0 == null) {
                    str2 = "queryProductDetailsAsync got empty product details response.";
                    break;
                } else if (mo7774b0.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = mo7774b0.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        str2 = "queryProductDetailsAsync got null response list";
                        break;
                    }
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        try {
                            kz0 kz0Var = new kz0(stringArrayList.get(i5));
                            yx2.m3095k("BillingClient", "Got product details: ".concat(kz0Var.toString()));
                            arrayList.add(kz0Var);
                        } catch (JSONException e) {
                            yx2.m3093m("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            str = "Error trying to decode SkuDetails.";
                            i = 6;
                            C3518xb.C3519a m5323c = C3518xb.m5323c();
                            m5323c.m5318c(i);
                            m5323c.m5319b(str);
                            lz0Var.mo2556a(m5323c.m5320a(), arrayList);
                            return null;
                        }
                    }
                    i2 = i3;
                } else {
                    i = yx2.m3104b(mo7774b0, "BillingClient");
                    str = yx2.m3098h(mo7774b0, "BillingClient");
                    if (i != 0) {
                        yx2.m3094l("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                    } else {
                        yx2.m3094l("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                    }
                }
            } catch (Exception e2) {
                yx2.m3093m("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                str = "An internal error occurred.";
            }
        }
        yx2.m3094l("BillingClient", str2);
        i = 4;
        C3518xb.C3519a m5323c2 = C3518xb.m5323c();
        m5323c2.m5318c(i);
        m5323c2.m5319b(str);
        lz0Var.mo2556a(m5323c2.m5320a(), arrayList);
        return null;
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: a */
    public final void mo11529a(final C0902c0 c0902c0, final InterfaceC1032d0 interfaceC1032d0) {
        C3518xb m11514q;
        if (!mo11527c()) {
            m11514q = uz2.f29679m;
        } else if (TextUtils.isEmpty(c0902c0.m25709a())) {
            yx2.m3094l("BillingClient", "Please provide a valid purchase token.");
            m11514q = uz2.f29675i;
        } else if (!this.f25023m) {
            m11514q = uz2.f29668b;
        } else if (m11512s(new Callable() { // from class: com.daaw.ry8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2842rb.this.m11542C(c0902c0, interfaceC1032d0);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.zz8
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1032d0.this.mo6253a(uz2.f29680n);
            }
        }, m11516o()) != null) {
            return;
        } else {
            m11514q = m11514q();
        }
        interfaceC1032d0.mo6253a(m11514q);
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: b */
    public final void mo11528b() {
        try {
            this.f25014d.m21501d();
            if (this.f25017g != null) {
                this.f25017g.m19663c();
            }
            if (this.f25017g != null && this.f25016f != null) {
                yx2.m3095k("BillingClient", "Unbinding from service.");
                this.f25015e.unbindService(this.f25017g);
                this.f25017g = null;
            }
            this.f25016f = null;
            ExecutorService executorService = this.f25032v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f25032v = null;
            }
        } catch (Exception e) {
            yx2.m3093m("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.f25011a = 3;
        }
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: c */
    public final boolean mo11527c() {
        return (this.f25011a != 2 || this.f25016f == null || this.f25017g == null) ? false : true;
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
    @Override // com.daaw.AbstractC2701qb
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3518xb mo11526d(Activity activity, final C3030tb c3030tb) {
        final String m17311b;
        final String m17310c;
        String str;
        String str2;
        Callable callable;
        long j;
        Runnable runnable;
        Handler handler;
        C2842rb c2842rb;
        C3518xb c3518xb;
        int m3104b;
        String str3;
        SkuDetails skuDetails;
        C3030tb.C3032b c3032b;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        String m17308e;
        Intent intent;
        String str8;
        String str9;
        if (mo11527c()) {
            ArrayList<SkuDetails> m9410f = c3030tb.m9410f();
            List m9409g = c3030tb.m9409g();
            SkuDetails skuDetails2 = (SkuDetails) wz8.m5677a(m9410f, null);
            C3030tb.C3032b c3032b2 = (C3030tb.C3032b) wz8.m5677a(m9409g, null);
            if (skuDetails2 != null) {
                m17311b = skuDetails2.m27858a();
                m17310c = skuDetails2.m27857b();
            } else {
                m17311b = c3032b2.m9395b().m17311b();
                m17310c = c3032b2.m9395b().m17310c();
            }
            String str10 = "BillingClient";
            if (m17310c.equals("subs") && !this.f25018h) {
                yx2.m3094l("BillingClient", "Current client doesn't support subscriptions.");
                c3518xb = uz2.f29681o;
            } else if (c3030tb.m9400p() && !this.f25021k) {
                yx2.m3094l("BillingClient", "Current client doesn't support extra params for buy intent.");
                c3518xb = uz2.f29674h;
            } else if (m9410f.size() > 1 && !this.f25028r) {
                yx2.m3094l("BillingClient", "Current client doesn't support multi-item purchases.");
                c3518xb = uz2.f29686t;
            } else if (m9409g.isEmpty() || this.f25029s) {
                if (this.f25021k) {
                    final Bundle m3102d = yx2.m3102d(c3030tb, this.f25023m, this.f25030t, this.f25031u, this.f25012b);
                    str = "BUY_INTENT";
                    if (m9410f.isEmpty()) {
                        str3 = "proxyPackageVersion";
                        skuDetails = skuDetails2;
                        c3032b = c3032b2;
                        str4 = m17311b;
                        str5 = m17310c;
                        str6 = "BillingClient";
                        ArrayList<String> arrayList = new ArrayList<>(m9409g.size() - 1);
                        ArrayList<String> arrayList2 = new ArrayList<>(m9409g.size() - 1);
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        for (int i = 0; i < m9409g.size(); i++) {
                            C3030tb.C3032b c3032b3 = (C3030tb.C3032b) m9409g.get(i);
                            kz0 m9395b = c3032b3.m9395b();
                            if (!m9395b.m17307f().isEmpty()) {
                                arrayList3.add(m9395b.m17307f());
                            }
                            arrayList4.add(c3032b3.m9394c());
                            if (i > 0) {
                                arrayList.add(((C3030tb.C3032b) m9409g.get(i)).m9395b().m17311b());
                                arrayList2.add(((C3030tb.C3032b) m9409g.get(i)).m9395b().m17310c());
                            }
                        }
                        m3102d.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                        if (!arrayList3.isEmpty()) {
                            m3102d.putStringArrayList("skuDetailsTokens", arrayList3);
                        }
                        if (!arrayList.isEmpty()) {
                            m3102d.putStringArrayList("additionalSkus", arrayList);
                            m3102d.putStringArrayList("additionalSkuTypes", arrayList2);
                        }
                    } else {
                        ArrayList<String> arrayList5 = new ArrayList<>();
                        ArrayList<String> arrayList6 = new ArrayList<>();
                        str5 = m17310c;
                        ArrayList<String> arrayList7 = new ArrayList<>();
                        str4 = m17311b;
                        ArrayList<Integer> arrayList8 = new ArrayList<>();
                        str3 = "proxyPackageVersion";
                        ArrayList<String> arrayList9 = new ArrayList<>();
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        for (SkuDetails skuDetails3 : m9410f) {
                            if (skuDetails3.m27851h().isEmpty()) {
                                str9 = str10;
                            } else {
                                str9 = str10;
                                arrayList5.add(skuDetails3.m27851h());
                            }
                            String m27854e = skuDetails3.m27854e();
                            C3030tb.C3032b c3032b4 = c3032b2;
                            String m27855d = skuDetails3.m27855d();
                            int m27856c = skuDetails3.m27856c();
                            SkuDetails skuDetails4 = skuDetails2;
                            String m27852g = skuDetails3.m27852g();
                            arrayList6.add(m27854e);
                            z2 |= !TextUtils.isEmpty(m27854e);
                            arrayList7.add(m27855d);
                            z3 |= !TextUtils.isEmpty(m27855d);
                            arrayList8.add(Integer.valueOf(m27856c));
                            z4 |= m27856c != 0;
                            z5 |= !TextUtils.isEmpty(m27852g);
                            arrayList9.add(m27852g);
                            str10 = str9;
                            c3032b2 = c3032b4;
                            skuDetails2 = skuDetails4;
                        }
                        skuDetails = skuDetails2;
                        c3032b = c3032b2;
                        str6 = str10;
                        if (!arrayList5.isEmpty()) {
                            m3102d.putStringArrayList("skuDetailsTokens", arrayList5);
                        }
                        if (z2) {
                            m3102d.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList6);
                        }
                        if (z3) {
                            m3102d.putStringArrayList("SKU_OFFER_ID_LIST", arrayList7);
                        }
                        if (z4) {
                            m3102d.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList8);
                        }
                        if (z5) {
                            m3102d.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                        }
                        if (m9410f.size() > 1) {
                            ArrayList<String> arrayList10 = new ArrayList<>(m9410f.size() - 1);
                            ArrayList<String> arrayList11 = new ArrayList<>(m9410f.size() - 1);
                            for (int i2 = 1; i2 < m9410f.size(); i2++) {
                                arrayList10.add(((SkuDetails) m9410f.get(i2)).m27858a());
                                arrayList11.add(((SkuDetails) m9410f.get(i2)).m27857b());
                            }
                            m3102d.putStringArrayList("additionalSkus", arrayList10);
                            m3102d.putStringArrayList("additionalSkuTypes", arrayList11);
                        }
                    }
                    if (!m3102d.containsKey("SKU_OFFER_ID_TOKEN_LIST") || this.f25026p) {
                        if (skuDetails != null && !TextUtils.isEmpty(skuDetails.m27853f())) {
                            m17308e = skuDetails.m27853f();
                        } else if (c3032b == null || TextUtils.isEmpty(c3032b.m9395b().m17308e())) {
                            str7 = null;
                            z = false;
                            if (!TextUtils.isEmpty(str7)) {
                                m3102d.putString("accountName", str7);
                            }
                            intent = activity.getIntent();
                            if (intent != null) {
                                str2 = str6;
                                yx2.m3094l(str2, "Activity's intent is null.");
                            } else {
                                str2 = str6;
                                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                    m3102d.putString("proxyPackage", stringExtra);
                                    try {
                                        str8 = str3;
                                        try {
                                            m3102d.putString(str8, this.f25015e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                        } catch (PackageManager.NameNotFoundException unused) {
                                            m3102d.putString(str8, "package not found");
                                            if (this.f25029s) {
                                            }
                                            final String str11 = str4;
                                            final String str12 = str5;
                                            Callable callable2 = new Callable() { // from class: com.daaw.c52
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    return C2842rb.this.m11508w(r2, str11, str12, c3030tb, m3102d);
                                                }
                                            };
                                            j = 5000;
                                            runnable = null;
                                            handler = this.f25013c;
                                            c2842rb = this;
                                            callable = callable2;
                                            Bundle bundle = (Bundle) c2842rb.m11512s(callable, j, runnable, handler).get(5000L, TimeUnit.MILLISECONDS);
                                            m3104b = yx2.m3104b(bundle, str2);
                                            String m3098h = yx2.m3098h(bundle, str2);
                                            if (m3104b != 0) {
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        str8 = str3;
                                    }
                                }
                            }
                            final int i3 = (this.f25029s || m9409g.isEmpty()) ? (this.f25027q || !z) ? this.f25023m ? 9 : 6 : 15 : 17;
                            final String str112 = str4;
                            final String str122 = str5;
                            Callable callable22 = new Callable() { // from class: com.daaw.c52
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return C2842rb.this.m11508w(i3, str112, str122, c3030tb, m3102d);
                                }
                            };
                            j = 5000;
                            runnable = null;
                            handler = this.f25013c;
                            c2842rb = this;
                            callable = callable22;
                        } else {
                            m17308e = c3032b.m9395b().m17308e();
                        }
                        m3102d.putString("skuPackageName", m17308e);
                        str7 = null;
                        z = true;
                        if (!TextUtils.isEmpty(str7)) {
                        }
                        intent = activity.getIntent();
                        if (intent != null) {
                        }
                        if (this.f25029s) {
                        }
                        final String str1122 = str4;
                        final String str1222 = str5;
                        Callable callable222 = new Callable() { // from class: com.daaw.c52
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return C2842rb.this.m11508w(i3, str1122, str1222, c3030tb, m3102d);
                            }
                        };
                        j = 5000;
                        runnable = null;
                        handler = this.f25013c;
                        c2842rb = this;
                        callable = callable222;
                    } else {
                        c3518xb = uz2.f29687u;
                    }
                } else {
                    str = "BUY_INTENT";
                    str2 = "BillingClient";
                    callable = new Callable() { // from class: com.daaw.j62
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return C2842rb.this.m11507x(m17311b, m17310c);
                        }
                    };
                    j = 5000;
                    runnable = null;
                    handler = this.f25013c;
                    c2842rb = this;
                }
                try {
                    Bundle bundle2 = (Bundle) c2842rb.m11512s(callable, j, runnable, handler).get(5000L, TimeUnit.MILLISECONDS);
                    m3104b = yx2.m3104b(bundle2, str2);
                    String m3098h2 = yx2.m3098h(bundle2, str2);
                    if (m3104b != 0) {
                        Intent intent2 = new Intent(activity, ProxyBillingActivity.class);
                        String str13 = str;
                        intent2.putExtra(str13, (PendingIntent) bundle2.getParcelable(str13));
                        activity.startActivity(intent2);
                        return uz2.f29678l;
                    }
                    yx2.m3094l(str2, "Unable to buy item, Error response code: " + m3104b);
                    C3518xb.C3519a m5323c = C3518xb.m5323c();
                    m5323c.m5318c(m3104b);
                    m5323c.m5319b(m3098h2);
                    C3518xb m5320a = m5323c.m5320a();
                    m11515p(m5320a);
                    return m5320a;
                } catch (CancellationException e) {
                    e = e;
                    yx2.m3093m(str2, "Time out while launching billing flow. Try to reconnect", e);
                    c3518xb = uz2.f29680n;
                    m11515p(c3518xb);
                    return c3518xb;
                } catch (TimeoutException e2) {
                    e = e2;
                    yx2.m3093m(str2, "Time out while launching billing flow. Try to reconnect", e);
                    c3518xb = uz2.f29680n;
                    m11515p(c3518xb);
                    return c3518xb;
                } catch (Exception e3) {
                    yx2.m3093m(str2, "Exception while launching billing flow. Try to reconnect", e3);
                }
            } else {
                yx2.m3094l("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                c3518xb = uz2.f29688v;
            }
            m11515p(c3518xb);
            return c3518xb;
        }
        c3518xb = uz2.f29679m;
        m11515p(c3518xb);
        return c3518xb;
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: f */
    public void mo11525f(final j01 j01Var, final lz0 lz0Var) {
        C3518xb m11514q;
        ArrayList arrayList;
        if (!mo11527c()) {
            m11514q = uz2.f29679m;
            arrayList = new ArrayList();
        } else if (!this.f25029s) {
            yx2.m3094l("BillingClient", "Querying product details is not supported.");
            m11514q = uz2.f29688v;
            arrayList = new ArrayList();
        } else if (m11512s(new Callable() { // from class: com.daaw.hr8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2842rb.this.m11541D(j01Var, lz0Var);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.daaw.ns8
            @Override // java.lang.Runnable
            public final void run() {
                lz0.this.mo2556a(uz2.f29680n, new ArrayList());
            }
        }, m11516o()) != null) {
            return;
        } else {
            m11514q = m11514q();
            arrayList = new ArrayList();
        }
        lz0Var.mo2556a(m11514q, arrayList);
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: g */
    public void mo11524g(k01 k01Var, f01 f01Var) {
        m11511t(k01Var.m18104b(), f01Var);
    }

    @Override // com.daaw.AbstractC2701qb
    /* renamed from: h */
    public final void mo11523h(InterfaceC2929sb interfaceC2929sb) {
        ServiceInfo serviceInfo;
        String str;
        if (mo11527c()) {
            yx2.m3095k("BillingClient", "Service connection is valid. No need to re-initialize.");
            interfaceC2929sb.mo6232a(uz2.f29678l);
        } else if (this.f25011a == 1) {
            yx2.m3094l("BillingClient", "Client is already in the process of connecting to billing service.");
            interfaceC2929sb.mo6232a(uz2.f29670d);
        } else if (this.f25011a == 3) {
            yx2.m3094l("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            interfaceC2929sb.mo6232a(uz2.f29679m);
        } else {
            this.f25011a = 1;
            this.f25014d.m21500e();
            yx2.m3095k("BillingClient", "Starting in-app billing setup.");
            this.f25017g = new il2(this, interfaceC2929sb, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f25015e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f25012b);
                    if (this.f25015e.bindService(intent2, this.f25017g, 1)) {
                        yx2.m3095k("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                yx2.m3094l("BillingClient", str);
            }
            this.f25011a = 0;
            yx2.m3095k("BillingClient", "Billing service unavailable on device.");
            interfaceC2929sb.mo6232a(uz2.f29669c);
        }
    }

    /* renamed from: i */
    public final void m11522i(Context context, g01 g01Var, boolean z, is3 is3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f25015e = applicationContext;
        this.f25014d = new gk8(applicationContext, g01Var, is3Var);
        this.f25030t = z;
        this.f25031u = is3Var != null;
    }

    /* renamed from: n */
    public final /* synthetic */ void m11517n(C3518xb c3518xb) {
        if (this.f25014d.m21502c() != null) {
            this.f25014d.m21502c().mo6252b(c3518xb, null);
            return;
        }
        this.f25014d.m21503b();
        yx2.m3094l("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* renamed from: o */
    public final Handler m11516o() {
        return Looper.myLooper() == null ? this.f25013c : new Handler(Looper.myLooper());
    }

    /* renamed from: p */
    public final C3518xb m11515p(final C3518xb c3518xb) {
        if (Thread.interrupted()) {
            return c3518xb;
        }
        this.f25013c.post(new Runnable() { // from class: com.daaw.ra2
            @Override // java.lang.Runnable
            public final void run() {
                C2842rb.this.m11517n(c3518xb);
            }
        });
        return c3518xb;
    }

    /* renamed from: q */
    public final C3518xb m11514q() {
        return (this.f25011a == 0 || this.f25011a == 3) ? uz2.f29679m : uz2.f29676j;
    }

    /* renamed from: s */
    public final Future m11512s(Callable callable, long j, final Runnable runnable, Handler handler) {
        double d = j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.f25032v == null) {
            this.f25032v = Executors.newFixedThreadPool(yx2.f34243a, new qg2(this));
        }
        try {
            final Future submit = this.f25032v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.daaw.k92
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    yx2.m3094l("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return submit;
        } catch (Exception e) {
            yx2.m3093m("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* renamed from: t */
    public final void m11511t(String str, final f01 f01Var) {
        C3518xb m11514q;
        if (!mo11527c()) {
            m11514q = uz2.f29679m;
        } else if (TextUtils.isEmpty(str)) {
            yx2.m3094l("BillingClient", "Please provide a valid product type.");
            m11514q = uz2.f29673g;
        } else if (m11512s(new dd2(this, str, f01Var), 30000L, new Runnable() { // from class: com.daaw.g72
            @Override // java.lang.Runnable
            public final void run() {
                f01.this.mo6251c(uz2.f29680n, rt8.m10942r());
            }
        }, m11516o()) != null) {
            return;
        } else {
            m11514q = m11514q();
        }
        f01Var.mo6251c(m11514q, rt8.m10942r());
    }

    /* renamed from: w */
    public final /* synthetic */ Bundle m11508w(int i, String str, String str2, C3030tb c3030tb, Bundle bundle) {
        return this.f25016f.mo7778O1(i, this.f25015e.getPackageName(), str, str2, null, bundle);
    }

    /* renamed from: x */
    public final /* synthetic */ Bundle m11507x(String str, String str2) {
        return this.f25016f.mo7775a1(3, this.f25015e.getPackageName(), str, str2, null);
    }
}
