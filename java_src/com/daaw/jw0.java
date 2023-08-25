package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class jw0 {
    public File a;
    public final s10 b;

    /* loaded from: classes2.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public jw0(s10 s10Var) {
        this.b = s10Var;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    File filesDir = this.b.j().getFilesDir();
                    this.a = new File(filesDir, "PersistedInstallation." + this.b.n() + ".json");
                }
            }
        }
        return this.a;
    }

    public kw0 b(kw0 kw0Var) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", kw0Var.d());
            jSONObject.put("Status", kw0Var.g().ordinal());
            jSONObject.put("AuthToken", kw0Var.b());
            jSONObject.put("RefreshToken", kw0Var.f());
            jSONObject.put("TokenCreationEpochInSecs", kw0Var.h());
            jSONObject.put("ExpiresInSecs", kw0Var.c());
            jSONObject.put("FisError", kw0Var.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(a())) {
            return kw0Var;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public kw0 d() {
        JSONObject c = c();
        String optString = c.optString("Fid", null);
        int optInt = c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", null);
        String optString3 = c.optString("RefreshToken", null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c.optLong("ExpiresInSecs", 0L);
        return kw0.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c.optString("FisError", null)).a();
    }
}
