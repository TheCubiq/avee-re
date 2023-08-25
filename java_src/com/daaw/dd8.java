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
    public static final String[] g = {"firebase_", "google_", "ga_"};
    public static final String[] h = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public Integer f;

    public dd8(dr6 dr6Var) {
        super(dr6Var);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean X(String str) {
        ry0.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean Y(Context context) {
        ActivityInfo receiverInfo;
        ry0.j(context);
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

    public static boolean Z(Context context, boolean z) {
        ry0.j(context);
        return i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean a0(String str) {
        return !h[0].equals(str);
    }

    public static final boolean d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    public static final boolean e0(String str) {
        ry0.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean h0(String str, String[] strArr) {
        ry0.j(strArr);
        for (String str2 : strArr) {
            if (pc8.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i0(Context context, String str) {
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

    public static long q0(byte[] bArr) {
        ry0.j(bArr);
        int length = bArr.length;
        int i = 0;
        ry0.m(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static MessageDigest t() {
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

    public static ArrayList v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.p);
            bundle.putString("origin", zzacVar.q);
            bundle.putLong("creation_timestamp", zzacVar.s);
            bundle.putString("name", zzacVar.r.q);
            ag7.b(bundle, ry0.j(zzacVar.r.h()));
            bundle.putBoolean("active", zzacVar.t);
            String str = zzacVar.u;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.v;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.p);
                zzau zzauVar = zzawVar.q;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.q());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.w);
            zzaw zzawVar2 = zzacVar.x;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.p);
                zzau zzauVar2 = zzawVar2.q;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.q());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.r.r);
            bundle.putLong("time_to_live", zzacVar.y);
            zzaw zzawVar3 = zzacVar.z;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.p);
                zzau zzauVar3 = zzawVar3.q;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.q());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void y(t38 t38Var, Bundle bundle, boolean z) {
        if (bundle != null && t38Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = t38Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = t38Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", t38Var.c);
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

    public final void A(sn5 sn5Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(sn5Var.d.keySet())) {
            if (X(str) && (i2 = i2 + 1) > i) {
                this.a.i().s().c("Event can't contain more than " + i + " params", this.a.D().d(sn5Var.a), this.a.D().b(sn5Var.d));
                d0(sn5Var.d, 5);
                sn5Var.d.remove(str);
            }
        }
    }

    public final void B(ad8 ad8Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        ad8Var.a(str, "_err", bundle);
    }

    public final void C(Bundle bundle, String str, Object obj) {
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
            this.a.i().x().c("Not putting event parameter. Invalid value type. name, type", this.a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void D(ox3 ox3Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void E(ox3 ox3Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void F(ox3 ox3Var, Bundle bundle) {
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void G(ox3 ox3Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning byte array to wrapper", e);
        }
    }

    public final void H(ox3 ox3Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning int value to wrapper", e);
        }
    }

    public final void I(ox3 ox3Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning long value to wrapper", e);
        }
    }

    public final void J(ox3 ox3Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.a.i().w().b("Error returning string value to wrapper", e);
        }
    }

    public final void K(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int O;
        if (bundle == null) {
            return;
        }
        this.a.z();
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m0 = !z ? m0(str5) : 0;
                if (m0 == 0) {
                    m0 = l0(str5);
                }
                i = m0;
            } else {
                i = 0;
            }
            if (i != 0) {
                x(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (U(bundle.get(str5))) {
                    this.a.i().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    O = 22;
                } else {
                    str4 = str5;
                    O = O(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (O != 0 && !"_ev".equals(str4)) {
                    x(bundle, O, str4, str4, bundle.get(str4));
                } else if (X(str4) && !h0(str4, gi7.d) && (i2 = i2 + 1) > 0) {
                    this.a.i().s().c("Item cannot contain custom parameters", this.a.D().d(str2), this.a.D().b(bundle));
                    d0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    public final boolean L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (e0(str)) {
                return true;
            }
            if (this.a.p()) {
                this.a.i().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", om5.z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.a.p()) {
                this.a.i().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (e0(str2)) {
            return true;
        } else {
            this.a.i().s().b("Invalid admob_app_id. Analytics disabled.", om5.z(str2));
            return false;
        }
    }

    public final boolean M(String str, int i, String str2) {
        if (str2 == null) {
            this.a.i().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            this.a.i().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.i().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        ry0.j(str2);
        String[] strArr3 = g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.a.i().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !h0(str2, strArr2)) {
            this.a.i().s().c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dd8.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean P(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.a.i().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.a.i().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.i().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.a.i().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.a.i().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean R(String str, String str2) {
        if (str2 == null) {
            this.a.i().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.i().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.a.i().s().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.a.i().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean S(String str) {
        f();
        if (ez1.a(this.a.d()).a(str) == 0) {
            return true;
        }
        this.a.i().p().b("Permission not granted", str);
        return false;
    }

    public final boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.a.z().u();
        this.a.a();
        return u.equals(str);
    }

    public final boolean U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean V(Context context, String str) {
        hk5 q;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = ez1.a(context).f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            q = this.a.i().q();
            str2 = "Package name not found";
            q.b(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            q = this.a.i().q();
            str2 = "Error obtaining certificate";
            q.b(str2, e);
            return true;
        }
    }

    public final boolean b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            ry0.j(str);
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

    public final byte[] c0(Parcelable parcelable) {
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

    public final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.a.z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.a.z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.a.z();
            return 100;
        } else {
            this.a.z();
            return 36;
        }
    }

    @Override // com.daaw.ud7
    public final void g() {
        f();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.a.i().w().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final Object g0(int i, Object obj, boolean z, boolean z2) {
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
                return q(obj.toString(), i, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle u0 = u0((Bundle) parcelable);
                        if (!u0.isEmpty()) {
                            arrayList.add(u0);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    @Override // com.daaw.ud7
    public final boolean h() {
        return true;
    }

    public final int j0(String str, Object obj) {
        int f0;
        String str2;
        if ("_ldl".equals(str)) {
            f0 = f0(str);
            str2 = "user property referrer";
        } else {
            f0 = f0(str);
            str2 = "user property";
        }
        return P(str2, str, f0, obj) ? 0 : 7;
    }

    public final int k0(String str) {
        if (Q("event", str)) {
            if (N("event", dh7.a, dh7.b, str)) {
                this.a.z();
                return !M("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int l0(String str) {
        if (Q("event param", str)) {
            if (N("event param", null, null, str)) {
                this.a.z();
                return !M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int m0(String str) {
        if (R("event param", str)) {
            if (N("event param", null, null, str)) {
                this.a.z();
                return !M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final Object n(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.a.z();
            return g0(256, obj, true, true);
        }
        if (W(str)) {
            this.a.z();
        } else {
            this.a.z();
            i = 100;
        }
        return g0(i, obj, false, true);
    }

    public final int n0(String str) {
        if (Q("user property", str)) {
            if (N("user property", jj7.a, null, str)) {
                this.a.z();
                return !M("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    public final Object o(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int f0 = f0(str);
        return equals ? g0(f0, obj, true, false) : g0(f0, obj, false, false);
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int o0() {
        if (this.f == null) {
            this.f = Integer.valueOf(x70.f().a(this.a.d()) / 1000);
        }
        return this.f.intValue();
    }

    public final String p() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int p0(int i) {
        return x70.f().h(this.a.d(), c80.a);
    }

    public final String q(String str, int i, boolean z) {
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

    public final long r0() {
        int i = (this.d.get() > 0L ? 1 : (this.d.get() == 0L ? 0 : -1));
        synchronized (this.d) {
            if (i != 0) {
                this.d.compareAndSet(-1L, 1L);
                return this.d.getAndIncrement();
            }
            long nextLong = new Random(System.nanoTime() ^ this.a.b().a()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            return nextLong + i2;
        }
    }

    public final URL s(long j, String str, String str2, long j2) {
        try {
            ry0.f(str2);
            ry0.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 74029L, Integer.valueOf(o0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.a.z().v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.a.i().q().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public final Bundle t0(Uri uri) {
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
                this.a.i().w().b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom u() {
        f();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object n = n(str, bundle.get(str));
                if (n == null) {
                    this.a.i().x().b("Param value can't be null", this.a.D().e(str));
                } else {
                    C(bundle2, str, n);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dd8.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final void w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.a.i().w().b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final zzaw w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) != 0) {
            this.a.i().q().b("Invalid conditional property event name", this.a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle v0 = v0(str, str2, bundle2, ig.b("_o"), true);
        if (z) {
            v0 = u0(v0);
        }
        ry0.j(v0);
        return new zzaw(str2, new zzau(v0), str3, j);
    }

    public final void x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (d0(bundle, i)) {
            this.a.z();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                ry0.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.a.N().C(bundle, str, bundle2.get(str));
            }
        }
    }
}
