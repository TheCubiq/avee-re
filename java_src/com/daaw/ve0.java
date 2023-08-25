package com.daaw;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ve0 {

    /* renamed from: c */
    public static final String[] f30168c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f30169a;

    /* renamed from: b */
    public final String f30170b;

    public ve0(s10 s10Var) {
        this.f30169a = s10Var.m10786j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f30170b = m7223b(s10Var);
    }

    /* renamed from: b */
    public static String m7223b(s10 s10Var) {
        String m21085d = s10Var.m10783m().m21085d();
        if (m21085d != null) {
            return m21085d;
        }
        String m21086c = s10Var.m10783m().m21086c();
        if (m21086c.startsWith("1:") || m21086c.startsWith("2:")) {
            String[] split = m21086c.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return m21086c;
    }

    /* renamed from: c */
    public static String m7222c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String m7224a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m7221d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m7220e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid key stored ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: f */
    public String m7219f() {
        synchronized (this.f30169a) {
            String m7218g = m7218g();
            if (m7218g != null) {
                return m7218g;
            }
            return m7217h();
        }
    }

    /* renamed from: g */
    public final String m7218g() {
        String string;
        synchronized (this.f30169a) {
            string = this.f30169a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    public final String m7217h() {
        synchronized (this.f30169a) {
            String string = this.f30169a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m7220e = m7220e(string);
            if (m7220e == null) {
                return null;
            }
            return m7222c(m7220e);
        }
    }

    /* renamed from: i */
    public String m7216i() {
        synchronized (this.f30169a) {
            for (String str : f30168c) {
                String string = this.f30169a.getString(m7224a(this.f30170b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m7221d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
