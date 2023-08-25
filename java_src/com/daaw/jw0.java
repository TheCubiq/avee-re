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

    /* renamed from: a */
    public File f15472a;

    /* renamed from: b */
    public final s10 f15473b;

    /* renamed from: com.daaw.jw0$a */
    /* loaded from: classes2.dex */
    public enum EnumC1884a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public jw0(s10 s10Var) {
        this.f15473b = s10Var;
    }

    /* renamed from: a */
    public final File m18209a() {
        if (this.f15472a == null) {
            synchronized (this) {
                if (this.f15472a == null) {
                    File filesDir = this.f15473b.m10786j().getFilesDir();
                    this.f15472a = new File(filesDir, "PersistedInstallation." + this.f15473b.m10782n() + ".json");
                }
            }
        }
        return this.f15472a;
    }

    /* renamed from: b */
    public kw0 m18208b(kw0 kw0Var) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", kw0Var.mo16161d());
            jSONObject.put("Status", kw0Var.mo16158g().ordinal());
            jSONObject.put("AuthToken", kw0Var.mo16163b());
            jSONObject.put("RefreshToken", kw0Var.mo16159f());
            jSONObject.put("TokenCreationEpochInSecs", kw0Var.mo16157h());
            jSONObject.put("ExpiresInSecs", kw0Var.mo16162c());
            jSONObject.put("FisError", kw0Var.mo16160e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f15473b.m10786j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m18209a())) {
            return kw0Var;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public final JSONObject m18207c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m18209a());
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

    /* renamed from: d */
    public kw0 m18206d() {
        JSONObject m18207c = m18207c();
        String optString = m18207c.optString("Fid", null);
        int optInt = m18207c.optInt("Status", EnumC1884a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m18207c.optString("AuthToken", null);
        String optString3 = m18207c.optString("RefreshToken", null);
        long optLong = m18207c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m18207c.optLong("ExpiresInSecs", 0L);
        return kw0.m17394a().mo16152d(optString).mo16149g(EnumC1884a.values()[optInt]).mo16154b(optString2).mo16150f(optString3).mo16148h(optLong).mo16153c(optLong2).mo16151e(m18207c.optString("FisError", null)).mo16155a();
    }
}
