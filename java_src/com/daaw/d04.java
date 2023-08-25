package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.conscrypt.EvpMdRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d04 {

    /* renamed from: b */
    public static final Handler f6340b = new gv6(Looper.getMainLooper());

    /* renamed from: c */
    public static final String f6341c = AdView.class.getName();

    /* renamed from: d */
    public static final String f6342d = InterstitialAd.class.getName();

    /* renamed from: e */
    public static final String f6343e = AdManagerAdView.class.getName();

    /* renamed from: f */
    public static final String f6344f = AdManagerInterstitialAd.class.getName();

    /* renamed from: g */
    public static final String f6345g = SearchAdView.class.getName();

    /* renamed from: h */
    public static final String f6346h = AdLoader.class.getName();

    /* renamed from: a */
    public float f6347a = -1.0f;

    /* renamed from: A */
    public static final boolean m24836A() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: B */
    public static final int m24835B(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    /* renamed from: C */
    public static final void m24834C(Context context, String str, String str2, Bundle bundle, boolean z, c04 c04Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = x70.m5492f().m5497a(context) + ".224400000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        c04Var.zza(appendQueryParameter.toString());
    }

    /* renamed from: D */
    public static final int m24833D(Context context, int i) {
        return m24810v(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: E */
    public static final String m24832E(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return m24831a(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || m24808x()) ? "emulator" : "emulator", EvpMdRef.MD5.JCA_NAME);
    }

    /* renamed from: a */
    public static String m24831a(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final void m24827e(ViewGroup viewGroup, zzq zzqVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int m24833D = m24833D(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - m24833D, zzqVar.zzc - m24833D, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    /* renamed from: f */
    public static int m24826f(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round((i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: h */
    public static AdSize m24824h(Context context, int i, int i2, int i3) {
        float f;
        float f2;
        int i4;
        int m24826f = m24826f(context, i3);
        if (m24826f == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(m24826f * 0.15f));
        if (i <= 655) {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i4, min), 50));
        }
        f = i / 728.0f;
        f2 = 90.0f;
        i4 = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(i4, min), 50));
    }

    /* renamed from: i */
    public static String m24823i() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: j */
    public static String m24822j(String str) {
        return m24831a(str, EvpMdRef.MD5.JCA_NAME);
    }

    /* renamed from: k */
    public static String m24821k(String str) {
        return m24831a(str, EvpMdRef.SHA256.JCA_NAME);
    }

    /* renamed from: l */
    public static Throwable m24820l(Throwable th) {
        if (((Boolean) nb3.f19786f.m16137e()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m24811u(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: u */
    public static boolean m24811u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) nb3.f19784d.m16137e());
    }

    /* renamed from: v */
    public static final int m24810v(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* renamed from: w */
    public static final String m24809w(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int i2;
        String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f6341c.equalsIgnoreCase(className) || f6342d.equalsIgnoreCase(className) || f6343e.equalsIgnoreCase(className) || f6344f.equalsIgnoreCase(className) || f6345g.equalsIgnoreCase(className) || f6346h.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i3 = i4;
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: x */
    public static final boolean m24808x() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: y */
    public static final boolean m24807y(Context context, int i) {
        return x70.m5492f().mo5490h(context, i) == 0;
    }

    /* renamed from: z */
    public static final boolean m24806z(Context context) {
        int mo5490h = x70.m5492f().mo5490h(context, c80.f5613a);
        return mo5490h == 0 || mo5490h == 2;
    }

    /* renamed from: b */
    public final JSONArray m24830b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            m24829c(jSONArray, obj);
        }
        return jSONArray;
    }

    /* renamed from: c */
    public final void m24829c(JSONArray jSONArray, Object obj) {
        Object m24819m;
        if (obj instanceof Bundle) {
            m24819m = m24818n((Bundle) obj);
        } else if (obj instanceof Map) {
            m24819m = m24817o((Map) obj);
        } else if (obj instanceof Collection) {
            m24819m = m24830b((Collection) obj);
        } else if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        } else {
            m24819m = m24819m((Object[]) obj);
        }
        jSONArray.put(m24819m);
    }

    /* renamed from: d */
    public final void m24828d(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Object m24819m;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) zzba.zzc().m23658b(g93.f10808r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            m24819m = m24818n((Bundle) obj);
        } else if (obj instanceof Map) {
            m24819m = m24817o((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    m24819m = m24819m(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    m24819m = m24819m(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    m24819m = m24819m(lArr);
                } else if (!(obj instanceof boolean[])) {
                    jSONObject.put(str, obj);
                    return;
                } else {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    m24819m = m24819m(boolArr);
                }
            }
            m24819m = m24830b(asList);
        }
        jSONObject.put(str, m24819m);
    }

    /* renamed from: g */
    public final int m24825g(Context context, int i) {
        if (this.f6347a < 0.0f) {
            synchronized (this) {
                if (this.f6347a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f6347a = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.f6347a);
    }

    /* renamed from: m */
    public final JSONArray m24819m(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m24829c(jSONArray, obj);
        }
        return jSONArray;
    }

    /* renamed from: n */
    public final JSONObject m24818n(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m24828d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: o */
    public final JSONObject m24817o(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m24828d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* renamed from: p */
    public final JSONObject m24816p(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m24818n(bundle);
            } catch (JSONException e) {
                k04.zzh("Error converting Bundle to JSON", e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final void m24815q(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    m24815q((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    /* renamed from: r */
    public final void m24814r(ViewGroup viewGroup, zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            k04.zzj(str2);
        }
        m24827e(viewGroup, zzqVar, str, -65536, -16777216);
    }

    /* renamed from: s */
    public final void m24813s(ViewGroup viewGroup, zzq zzqVar, String str) {
        m24827e(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    /* renamed from: t */
    public final void m24812t(Context context, String str, String str2, Bundle bundle, boolean z) {
        m24834C(context, str, "gmob-apps", bundle, true, new c04() { // from class: com.daaw.a04
            @Override // com.daaw.c04
            public final boolean zza(String str3) {
                new b04(d04.this, str3).start();
                return true;
            }
        });
    }
}
