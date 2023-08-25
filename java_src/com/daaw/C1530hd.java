package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* renamed from: com.daaw.hd */
/* loaded from: classes2.dex */
public class C1530hd {

    /* renamed from: a */
    public final File f12422a;

    public C1530hd(h10 h10Var) {
        this.f12422a = h10Var.m21107e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    public final File m20841a() {
        return this.f12422a;
    }

    /* renamed from: b */
    public JSONObject m20840b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        ml0.m15976f().m15980b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m20841a = m20841a();
                if (m20841a.exists()) {
                    fileInputStream = new FileInputStream(m20841a);
                    try {
                        jSONObject = new JSONObject(C1279fh.m22667A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        ml0.m15976f().m15977e("Failed to fetch cached settings", e);
                        C1279fh.m22662e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    ml0.m15976f().m15973i("Settings file does not exist.");
                    jSONObject = null;
                }
                C1279fh.m22662e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C1279fh.m22662e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C1279fh.m22662e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m20839c(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        ml0.m15976f().m15973i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(m20841a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C1279fh.m22662e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                ml0.m15976f().m15977e("Failed to cache settings", e);
                C1279fh.m22662e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                C1279fh.m22662e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
