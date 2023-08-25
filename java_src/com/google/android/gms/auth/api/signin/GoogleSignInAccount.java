package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.ag;
import com.daaw.b02;
import com.daaw.mq;
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
    public String A;
    public Set<Scope> B = new HashSet();
    public final int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Uri u;
    public String v;
    public long w;
    public String x;
    public List<Scope> y;
    public String z;
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b02();
    public static ag C = mq.d();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.p = i;
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = str4;
        this.u = uri;
        this.v = str5;
        this.w = j;
        this.x = str6;
        this.y = list;
        this.z = str7;
        this.A = str8;
    }

    public static GoogleSignInAccount A(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), ry0.f(str7), new ArrayList((Collection) ry0.j(set)), str5, str6);
    }

    public static GoogleSignInAccount B(String str) {
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
        GoogleSignInAccount A = A(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        A.v = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return A;
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
            return googleSignInAccount.x.equals(this.x) && googleSignInAccount.y().equals(y());
        }
        return false;
    }

    public Account h() {
        String str = this.s;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.x.hashCode() + 527) * 31) + y().hashCode();
    }

    public String q() {
        return this.t;
    }

    public String s() {
        return this.s;
    }

    public String t() {
        return this.A;
    }

    public String u() {
        return this.z;
    }

    public String v() {
        return this.q;
    }

    public String w() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.q(parcel, 2, v(), false);
        z71.q(parcel, 3, w(), false);
        z71.q(parcel, 4, s(), false);
        z71.q(parcel, 5, q(), false);
        z71.p(parcel, 6, x(), i, false);
        z71.q(parcel, 7, z(), false);
        z71.n(parcel, 8, this.w);
        z71.q(parcel, 9, this.x, false);
        z71.u(parcel, 10, this.y, false);
        z71.q(parcel, 11, u(), false);
        z71.q(parcel, 12, t(), false);
        z71.b(parcel, a);
    }

    public Uri x() {
        return this.u;
    }

    public Set<Scope> y() {
        HashSet hashSet = new HashSet(this.y);
        hashSet.addAll(this.B);
        return hashSet;
    }

    public String z() {
        return this.v;
    }
}
