package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.C2202mq;
import com.daaw.InterfaceC0623ag;
import com.daaw.b02;
import com.daaw.ry0;
import com.daaw.z71;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: A */
    public String f36559A;

    /* renamed from: B */
    public Set<Scope> f36560B = new HashSet();

    /* renamed from: p */
    public final int f36561p;

    /* renamed from: q */
    public String f36562q;

    /* renamed from: r */
    public String f36563r;

    /* renamed from: s */
    public String f36564s;

    /* renamed from: t */
    public String f36565t;

    /* renamed from: u */
    public Uri f36566u;

    /* renamed from: v */
    public String f36567v;

    /* renamed from: w */
    public long f36568w;

    /* renamed from: x */
    public String f36569x;

    /* renamed from: y */
    public List<Scope> f36570y;

    /* renamed from: z */
    public String f36571z;
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b02();

    /* renamed from: C */
    public static InterfaceC0623ag f36558C = C2202mq.m15857d();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f36561p = i;
        this.f36562q = str;
        this.f36563r = str2;
        this.f36564s = str3;
        this.f36565t = str4;
        this.f36566u = uri;
        this.f36567v = str5;
        this.f36568w = j;
        this.f36569x = str6;
        this.f36570y = list;
        this.f36571z = str7;
        this.f36559A = str8;
    }

    /* renamed from: A */
    public static GoogleSignInAccount m1221A(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), ry0.m10834f(str7), new ArrayList((Collection) ry0.m10830j(set)), str5, str6);
    }

    /* renamed from: B */
    public static GoogleSignInAccount m1220B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount m1221A = m1221A(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m1221A.f36567v = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return m1221A;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f36569x.equals(this.f36569x) && googleSignInAccount.m1211y().equals(m1211y());
        }
        return false;
    }

    /* renamed from: h */
    public Account m1219h() {
        String str = this.f36564s;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f36569x.hashCode() + 527) * 31) + m1211y().hashCode();
    }

    /* renamed from: q */
    public String m1218q() {
        return this.f36565t;
    }

    /* renamed from: s */
    public String m1217s() {
        return this.f36564s;
    }

    /* renamed from: t */
    public String m1216t() {
        return this.f36559A;
    }

    /* renamed from: u */
    public String m1215u() {
        return this.f36571z;
    }

    /* renamed from: v */
    public String m1214v() {
        return this.f36562q;
    }

    /* renamed from: w */
    public String m1213w() {
        return this.f36563r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36561p);
        z71.m2717q(parcel, 2, m1214v(), false);
        z71.m2717q(parcel, 3, m1213w(), false);
        z71.m2717q(parcel, 4, m1217s(), false);
        z71.m2717q(parcel, 5, m1218q(), false);
        z71.m2718p(parcel, 6, m1212x(), i, false);
        z71.m2717q(parcel, 7, m1210z(), false);
        z71.m2720n(parcel, 8, this.f36568w);
        z71.m2717q(parcel, 9, this.f36569x, false);
        z71.m2713u(parcel, 10, this.f36570y, false);
        z71.m2717q(parcel, 11, m1215u(), false);
        z71.m2717q(parcel, 12, m1216t(), false);
        z71.m2732b(parcel, m2733a);
    }

    /* renamed from: x */
    public Uri m1212x() {
        return this.f36566u;
    }

    /* renamed from: y */
    public Set<Scope> m1211y() {
        HashSet hashSet = new HashSet(this.f36570y);
        hashSet.addAll(this.f36560B);
        return hashSet;
    }

    /* renamed from: z */
    public String m1210z() {
        return this.f36567v;
    }
}
