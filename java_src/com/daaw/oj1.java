package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.daaw.oj1;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class oj1 {

    /* renamed from: a */
    public final Context f21578a;

    /* renamed from: b */
    public final WebView f21579b;

    /* renamed from: c */
    public final sl2 f21580c;

    /* renamed from: d */
    public final int f21581d;

    /* renamed from: e */
    public final pd5 f21582e;

    /* renamed from: f */
    public final boolean f21583f;

    /* renamed from: g */
    public final g77 f21584g = z04.f34309e;

    public oj1(WebView webView, sl2 sl2Var, pd5 pd5Var) {
        this.f21579b = webView;
        Context context = webView.getContext();
        this.f21578a = context;
        this.f21580c = sl2Var;
        this.f21582e = pd5Var;
        g93.m21879c(context);
        this.f21581d = ((Integer) zzba.zzc().m23658b(g93.f10894y8)).intValue();
        this.f21583f = ((Boolean) zzba.zzc().m23658b(g93.f10905z8)).booleanValue();
    }

    /* renamed from: b */
    public final /* synthetic */ void m14255b(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb = zzt.zzq().zzb(this.f21578a);
        bundle.putBoolean("accept_3p_cookie", zzb != null ? zzb.acceptThirdPartyCookies(this.f21579b) : false);
        Context context = this.f21578a;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long mo15860a = zzt.zzB().mo15860a();
            String zze = this.f21580c.m10202c().zze(this.f21578a, str, this.f21579b);
            if (this.f21583f) {
                zzf.zzc(this.f21582e, null, "csg", new Pair("clat", String.valueOf(zzt.zzB().mo15860a() - mo15860a)));
            }
            return zze;
        } catch (RuntimeException e) {
            k04.zzh("Exception getting click signals. ", e);
            zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            k04.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) z04.f34305a.mo20112M(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzar
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return oj1.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.f21581d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            k04.zzh("Exception getting click signals with timeout. ", e);
            zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final qo2 qo2Var = new qo2(this, uuid);
        if (((Boolean) zzba.zzc().m23658b(g93.f10379B8)).booleanValue()) {
            this.f21584g.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    oj1.this.m14255b(bundle, qo2Var);
                }
            });
        } else {
            Context context = this.f21578a;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), qo2Var);
        }
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long mo15860a = zzt.zzB().mo15860a();
            String zzh = this.f21580c.m10202c().zzh(this.f21578a, this.f21579b, null);
            if (this.f21583f) {
                zzf.zzc(this.f21582e, null, "vsg", new Pair("vlat", String.valueOf(zzt.zzB().mo15860a() - mo15860a)));
            }
            return zzh;
        } catch (RuntimeException e) {
            k04.zzh("Exception getting view signals. ", e);
            zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            k04.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) z04.f34305a.mo20112M(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return oj1.this.getViewSignals();
                }
            }).get(Math.min(i, this.f21581d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            k04.zzh("Exception getting view signals with timeout. ", e);
            zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.f21580c.m10201d(MotionEvent.obtain(0L, i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                k04.zzh("Failed to parse the touch string. ", e);
                zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e2) {
                e = e2;
                k04.zzh("Failed to parse the touch string. ", e);
                zzt.zzo().m11902u(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }
}
