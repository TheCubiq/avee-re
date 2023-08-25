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
    public static final String[] c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    public ve0(s10 s10Var) {
        this.a = s10Var.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(s10Var);
    }

    public static String b(s10 s10Var) {
        String d = s10Var.m().d();
        if (d != null) {
            return d;
        }
        String c2 = s10Var.m().c();
        if (c2.startsWith("1:") || c2.startsWith("2:")) {
            String[] split = c2.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c2;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid key stored ");
            sb.append(e);
            return null;
        }
    }

    public String f() {
        synchronized (this.a) {
            String g = g();
            if (g != null) {
                return g;
            }
            return h();
        }
    }

    public final String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.a) {
            String string = this.a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e = e(string);
            if (e == null) {
                return null;
            }
            return c(e);
        }
    }

    public String i() {
        synchronized (this.a) {
            for (String str : c) {
                String string = this.a.getString(a(this.b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
