package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public final class dd8 extends ud7 {

    /* renamed from: g */
    public static final String[] f6963g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f6964h = {"_err"};

    /* renamed from: c */
    public SecureRandom f6965c;

    /* renamed from: d */
    public final AtomicLong f6966d;

    /* renamed from: e */
    public int f6967e;

    /* renamed from: f */
    public Integer f6968f;

    public dd8(dr6 dr6Var) {
        super(dr6Var);
        this.f6968f = null;
        this.f6966d = new AtomicLong(0L);
    }

    /* renamed from: W */
    public static boolean m24492W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: X */
    public static boolean m24491X(String str) {
        ry0.m10834f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: Y */
    public static boolean m24490Y(Context context) {
        ActivityInfo receiverInfo;
        ry0.m10830j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: Z */
    public static boolean m24489Z(Context context, boolean z) {
        ry0.m10830j(context);
        return m24480i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m24488a0(String str) {
        return !f6964h[0].equals(str);
    }

    /* renamed from: d0 */
    public static final boolean m24485d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public static final boolean m24484e0(String str) {
        ry0.m10830j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h0 */
    public static boolean m24481h0(String str, String[] strArr) {
        ry0.m10830j(strArr);
        for (String str2 : strArr) {
            if (pc8.m13446a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public static boolean m24480i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: q0 */
    public static long m24468q0(byte[] bArr) {
        ry0.m10830j(bArr);
        int length = bArr.length;
        int i = 0;
        ry0.m10827m(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: t */
    public static MessageDigest m24464t() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m24460v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.f37056p);
            bundle.putString("origin", zzacVar.f37057q);
            bundle.putLong("creation_timestamp", zzacVar.f37059s);
            bundle.putString("name", zzacVar.f37058r.f37073q);
            ag7.m27482b(bundle, ry0.m10830j(zzacVar.f37058r.m1073h()));
            bundle.putBoolean("active", zzacVar.f37060t);
            String str = zzacVar.f37061u;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f37062v;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f37068p);
                zzau zzauVar = zzawVar.f37069q;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.m1078q());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f37063w);
            zzaw zzawVar2 = zzacVar.f37064x;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f37068p);
                zzau zzauVar2 = zzawVar2.f37069q;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.m1078q());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.f37058r.f37074r);
            bundle.putLong("time_to_live", zzacVar.f37065y);
            zzaw zzawVar3 = zzacVar.f37066z;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f37068p);
                zzau zzauVar3 = zzawVar3.f37069q;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.m1078q());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: y */
    public static void m24455y(t38 t38Var, Bundle bundle, boolean z) {
        if (bundle != null && t38Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = t38Var.f26979a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = t38Var.f26980b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", t38Var.f26981c);
                return;
            }
            z = false;
        }
        if (bundle != null && t38Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void m24514A(sn5 sn5Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(sn5Var.f26433d.keySet())) {
            if (m24491X(str) && (i2 = i2 + 1) > i) {
                this.f25143a.mo3895i().m14159s().m20651c("Event can't contain more than " + i + " params", this.f25143a.m24055D().m5133d(sn5Var.f26430a), this.f25143a.m24055D().m5135b(sn5Var.f26433d));
                m24485d0(sn5Var.f26433d, 5);
                sn5Var.f26433d.remove(str);
            }
        }
    }

    /* renamed from: B */
    public final void m24513B(ad8 ad8Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m24485d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        ad8Var.mo17832a(str, "_err", bundle);
    }

    /* renamed from: C */
    public final void m24512C(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f25143a.mo3895i().m14154x().m20651c("Not putting event parameter. Invalid value type. name, type", this.f25143a.m24055D().m5132e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: D */
    public final void m24511D(ox3 ox3Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void m24510E(ox3 ox3Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void m24509F(ox3 ox3Var, Bundle bundle) {
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void m24508G(ox3 ox3Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void m24507H(ox3 ox3Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void m24506I(ox3 ox3Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void m24505J(ox3 ox3Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void m24504K(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int m24500O;
        if (bundle == null) {
            return;
        }
        this.f25143a.m24020z();
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m24476m0 = !z ? m24476m0(str5) : 0;
                if (m24476m0 == 0) {
                    m24476m0 = m24477l0(str5);
                }
                i = m24476m0;
            } else {
                i = 0;
            }
            if (i != 0) {
                m24456x(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (m24494U(bundle.get(str5))) {
                    this.f25143a.mo3895i().m14154x().m20650d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    m24500O = 22;
                } else {
                    str4 = str5;
                    m24500O = m24500O(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (m24500O != 0 && !"_ev".equals(str4)) {
                    m24456x(bundle, m24500O, str4, str4, bundle.get(str4));
                } else if (m24491X(str4) && !m24481h0(str4, gi7.f11336d) && (i2 = i2 + 1) > 0) {
                    this.f25143a.mo3895i().m14159s().m20651c("Item cannot contain custom parameters", this.f25143a.m24055D().m5133d(str2), this.f25143a.m24055D().m5135b(bundle));
                    m24485d0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    /* renamed from: L */
    public final boolean m24503L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m24484e0(str)) {
                return true;
            }
            if (this.f25143a.m24029p()) {
                this.f25143a.mo3895i().m14159s().m20652b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", om5.m14152z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f25143a.m24029p()) {
                this.f25143a.mo3895i().m14159s().m20653a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m24484e0(str2)) {
            return true;
        } else {
            this.f25143a.mo3895i().m14159s().m20652b("Invalid admob_app_id. Analytics disabled.", om5.m14152z(str2));
            return false;
        }
    }

    /* renamed from: M */
    public final boolean m24502M(String str, int i, String str2) {
        if (str2 == null) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            this.f25143a.mo3895i().m14159s().m20650d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: N */
    public final boolean m24501N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be null. Type", str);
            return false;
        }
        ry0.m10830j(str2);
        String[] strArr3 = f6963g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f25143a.mo3895i().m14159s().m20651c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m24481h0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !m24481h0(str2, strArr2)) {
            this.f25143a.mo3895i().m14159s().m20651c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m24500O(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        hk5 m14154x;
        String str4;
        String str5;
        Parcelable[] parcelableArr;
        int size;
        mo6991f();
        if (m24494U(obj)) {
            if (!z2) {
                return 21;
            }
            if (!m24481h0(str3, gi7.f11335c)) {
                return 20;
            }
            x78 m24047L = this.f25143a.m24047L();
            m24047L.mo6991f();
            m24047L.m25515g();
            if (m24047L.m5482B() && m24047L.f25143a.m24045N().m24472o0() < 200900) {
                return 25;
            }
            this.f25143a.m24020z();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                this.f25143a.mo3895i().m14154x().m20650d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.f25143a.m24020z();
                if (z3) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    if (parcelableArr2.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr2, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
                if (!m24492W(str2) || m24492W(str3)) {
                    this.f25143a.m24020z();
                    i2 = 256;
                } else {
                    this.f25143a.m24020z();
                    i2 = 100;
                }
                if (m24499P("param", str3, i2, obj)) {
                    if (z2) {
                        if (obj instanceof Bundle) {
                            m24504K(str, str2, str3, (Bundle) obj, list, z);
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (!(parcelable instanceof Bundle)) {
                                    m14154x = this.f25143a.mo3895i().m14154x();
                                    str4 = parcelable.getClass();
                                    str5 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                                    m14154x.m20651c(str5, str4, str3);
                                    return 4;
                                }
                                m24504K(str, str2, str3, (Bundle) parcelable, list, z);
                            }
                        } else if (!(obj instanceof ArrayList)) {
                            return 4;
                        } else {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                Object obj2 = arrayList2.get(i3);
                                if (!(obj2 instanceof Bundle)) {
                                    m14154x = this.f25143a.mo3895i().m14154x();
                                    str4 = obj2 != null ? obj2.getClass() : "null";
                                    str5 = "All ArrayList elements must be of type Bundle. Value type, name";
                                    m14154x.m20651c(str5, str4, str3);
                                    return 4;
                                }
                                m24504K(str, str2, str3, (Bundle) obj2, list, z);
                            }
                        }
                        return i;
                    }
                    return 4;
                }
                return i;
            }
        }
        i = 0;
        if (m24492W(str2)) {
        }
        this.f25143a.m24020z();
        i2 = 256;
        if (m24499P("param", str3, i2, obj)) {
        }
    }

    /* renamed from: P */
    public final boolean m24499P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f25143a.mo3895i().m14154x().m20650d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean m24498Q(String str, String str2) {
        if (str2 == null) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.f25143a.mo3895i().m14159s().m20651c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f25143a.mo3895i().m14159s().m20651c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* renamed from: R */
    public final boolean m24497R(String str, String str2) {
        if (str2 == null) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f25143a.mo3895i().m14159s().m20652b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f25143a.mo3895i().m14159s().m20651c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f25143a.mo3895i().m14159s().m20651c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* renamed from: S */
    public final boolean m24496S(String str) {
        mo6991f();
        if (ez1.m22979a(this.f25143a.mo3905d()).m19346a(str) == 0) {
            return true;
        }
        this.f25143a.mo3895i().m14161p().m20652b("Permission not granted", str);
        return false;
    }

    /* renamed from: T */
    public final boolean m24495T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m12657u = this.f25143a.m24020z().m12657u();
        this.f25143a.mo3911a();
        return m12657u.equals(str);
    }

    /* renamed from: U */
    public final boolean m24494U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: V */
    public final boolean m24493V(Context context, String str) {
        hk5 m14160q;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m19341f = ez1.m22979a(context).m19341f(str, 64);
            if (m19341f == null || (signatureArr = m19341f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            m14160q = this.f25143a.mo3895i().m14160q();
            str2 = "Package name not found";
            m14160q.m20652b(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            m14160q = this.f25143a.mo3895i().m14160q();
            str2 = "Error obtaining certificate";
            m14160q.m20652b(str2, e);
            return true;
        }
    }

    /* renamed from: b0 */
    public final boolean m24487b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            ry0.m10830j(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* renamed from: c0 */
    public final byte[] m24486c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: f0 */
    public final int m24483f0(String str) {
        if ("_ldl".equals(str)) {
            this.f25143a.m24020z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f25143a.m24020z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f25143a.m24020z();
            return 100;
        } else {
            this.f25143a.m24020z();
            return 36;
        }
    }

    @Override // com.daaw.ud7
    /* renamed from: g */
    public final void mo8311g() {
        mo6991f();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f25143a.mo3895i().m14155w().m20653a("Utils falling back to Random for random id");
            }
        }
        this.f6966d.set(nextLong);
    }

    /* renamed from: g0 */
    public final Object m24482g0(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m24469q(obj.toString(), i, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle m24461u0 = m24461u0((Bundle) parcelable);
                        if (!m24461u0.isEmpty()) {
                            arrayList.add(m24461u0);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    @Override // com.daaw.ud7
    /* renamed from: h */
    public final boolean mo6990h() {
        return true;
    }

    /* renamed from: j0 */
    public final int m24479j0(String str, Object obj) {
        int m24483f0;
        String str2;
        if ("_ldl".equals(str)) {
            m24483f0 = m24483f0(str);
            str2 = "user property referrer";
        } else {
            m24483f0 = m24483f0(str);
            str2 = "user property";
        }
        return m24499P(str2, str, m24483f0, obj) ? 0 : 7;
    }

    /* renamed from: k0 */
    public final int m24478k0(String str) {
        if (m24498Q("event", str)) {
            if (m24501N("event", dh7.f7091a, dh7.f7092b, str)) {
                this.f25143a.m24020z();
                return !m24502M("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    /* renamed from: l0 */
    public final int m24477l0(String str) {
        if (m24498Q("event param", str)) {
            if (m24501N("event param", null, null, str)) {
                this.f25143a.m24020z();
                return !m24502M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* renamed from: m0 */
    public final int m24476m0(String str) {
        if (m24497R("event param", str)) {
            if (m24501N("event param", null, null, str)) {
                this.f25143a.m24020z();
                return !m24502M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* renamed from: n */
    public final Object m24475n(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f25143a.m24020z();
            return m24482g0(256, obj, true, true);
        }
        if (m24492W(str)) {
            this.f25143a.m24020z();
        } else {
            this.f25143a.m24020z();
            i = 100;
        }
        return m24482g0(i, obj, false, true);
    }

    /* renamed from: n0 */
    public final int m24474n0(String str) {
        if (m24498Q("user property", str)) {
            if (m24501N("user property", jj7.f15137a, null, str)) {
                this.f25143a.m24020z();
                return !m24502M("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    /* renamed from: o */
    public final Object m24473o(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int m24483f0 = m24483f0(str);
        return equals ? m24482g0(m24483f0, obj, true, false) : m24482g0(m24483f0, obj, false, false);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int m24472o0() {
        if (this.f6968f == null) {
            this.f6968f = Integer.valueOf(x70.m5492f().m5497a(this.f25143a.mo3905d()) / 1000);
        }
        return this.f6968f.intValue();
    }

    /* renamed from: p */
    public final String m24471p() {
        byte[] bArr = new byte[16];
        m24462u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: p0 */
    public final int m24470p0(int i) {
        return x70.m5492f().mo5490h(this.f25143a.mo3905d(), c80.f5613a);
    }

    /* renamed from: q */
    public final String m24469q(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            return null;
        }
        return str;
    }

    /* renamed from: r0 */
    public final long m24467r0() {
        int i = (this.f6966d.get() > 0L ? 1 : (this.f6966d.get() == 0L ? 0 : -1));
        synchronized (this.f6966d) {
            if (i != 0) {
                this.f6966d.compareAndSet(-1L, 1L);
                return this.f6966d.getAndIncrement();
            }
            long nextLong = new Random(System.nanoTime() ^ this.f25143a.mo3909b().mo15860a()).nextLong();
            int i2 = this.f6967e + 1;
            this.f6967e = i2;
            return nextLong + i2;
        }
    }

    /* renamed from: s */
    public final URL m24466s(long j, String str, String str2, long j2) {
        try {
            ry0.m10834f(str2);
            ry0.m10834f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 74029L, Integer.valueOf(m24472o0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.f25143a.m24020z().m12656v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f25143a.mo3895i().m14160q().m20652b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: s0 */
    public final long m24465s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: t0 */
    public final Bundle m24463t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f25143a.mo3895i().m14155w().m20652b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: u */
    public final SecureRandom m24462u() {
        mo6991f();
        if (this.f6965c == null) {
            this.f6965c = new SecureRandom();
        }
        return this.f6965c;
    }

    /* renamed from: u0 */
    public final Bundle m24461u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m24475n = m24475n(str, bundle.get(str));
                if (m24475n == null) {
                    this.f25143a.mo3895i().m14154x().m20652b("Param value can't be null", this.f25143a.m24055D().m5132e(str));
                } else {
                    m24512C(bundle2, str, m24475n);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[SYNTHETIC] */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m24459v0(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str3;
        boolean m24481h0 = m24481h0(str2, dh7.f7094d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int m12665l = this.f25143a.m24020z().m12665l();
            int i3 = 0;
            for (String str4 : new TreeSet(bundle.keySet())) {
                if (list == null || !list.contains(str4)) {
                    int m24476m0 = !z ? m24476m0(str4) : 0;
                    if (m24476m0 == 0) {
                        m24476m0 = m24477l0(str4);
                    }
                    i = m24476m0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    m24456x(bundle2, i, str4, str4, i == 3 ? str4 : null);
                    bundle2.remove(str4);
                    i2 = m12665l;
                } else {
                    i2 = m12665l;
                    int m24500O = m24500O(str, str2, str4, bundle.get(str4), bundle2, list, z, m24481h0);
                    if (m24500O == 17) {
                        m24456x(bundle2, 17, str4, str4, Boolean.FALSE);
                    } else if (m24500O != 0) {
                        str3 = str4;
                        if (!"_ev".equals(str3)) {
                            m24456x(bundle2, m24500O, m24500O == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                        if (m24491X(str3)) {
                            int i4 = i3 + 1;
                            if (i4 > i2) {
                                this.f25143a.mo3895i().m14159s().m20651c("Event can't contain more than " + i2 + " params", this.f25143a.m24055D().m5133d(str2), this.f25143a.m24055D().m5135b(bundle));
                                m24485d0(bundle2, 5);
                                bundle2.remove(str3);
                            }
                            i3 = i4;
                        }
                    }
                    str3 = str4;
                    if (m24491X(str3)) {
                    }
                }
                m12665l = i2;
            }
            return bundle2;
        }
        return null;
    }

    /* renamed from: w */
    public final void m24458w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f25143a.mo3895i().m14155w().m20652b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: w0 */
    public final zzaw m24457w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m24478k0(str2) != 0) {
            this.f25143a.mo3895i().m14160q().m20652b("Invalid conditional property event name", this.f25143a.m24055D().m5131f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle m24459v0 = m24459v0(str, str2, bundle2, C1701ig.m19848b("_o"), true);
        if (z) {
            m24459v0 = m24461u0(m24459v0);
        }
        ry0.m10830j(m24459v0);
        return new zzaw(str2, new zzau(m24459v0), str3, j);
    }

    /* renamed from: x */
    public final void m24456x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m24485d0(bundle, i)) {
            this.f25143a.m24020z();
            bundle.putString("_ev", m24469q(str, 40, true));
            if (obj != null) {
                ry0.m10830j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: z */
    public final void m24454z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f25143a.m24045N().m24512C(bundle, str, bundle2.get(str));
            }
        }
    }
}
