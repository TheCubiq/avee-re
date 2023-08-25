package com.daaw;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class x33 {

    /* renamed from: a */
    public final g43 f32053a;
    @GuardedBy("this")

    /* renamed from: b */
    public final u53 f32054b;

    /* renamed from: c */
    public final boolean f32055c;

    public x33() {
        this.f32054b = v53.m7417N();
        this.f32055c = false;
        this.f32053a = new g43();
    }

    public x33(g43 g43Var) {
        this.f32054b = v53.m7417N();
        this.f32053a = g43Var;
        this.f32055c = ((Boolean) zzba.zzc().m23658b(g93.f10824s4)).booleanValue();
    }

    /* renamed from: a */
    public static x33 m5591a() {
        return new x33();
    }

    /* renamed from: b */
    public final synchronized void m5590b(w33 w33Var) {
        if (this.f32055c) {
            try {
                w33Var.mo2497a(this.f32054b);
            } catch (NullPointerException e) {
                zzt.zzo().m11902u(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m5589c(int i) {
        if (this.f32055c) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10835t4)).booleanValue()) {
                m5587e(i);
            } else {
                m5586f(i);
            }
        }
    }

    /* renamed from: d */
    public final synchronized String m5588d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f32054b.m8576C(), Long.valueOf(zzt.zzB().mo15859b()), Integer.valueOf(i - 1), Base64.encodeToString(((v53) this.f32054b.m22315n()).mo4516a(), 3));
    }

    /* renamed from: e */
    public final synchronized void m5587e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m5588d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    /* renamed from: f */
    public final synchronized void m5586f(int i) {
        u53 u53Var = this.f32054b;
        u53Var.m8572v();
        List<String> m21880b = g93.m21880b();
        ArrayList arrayList = new ArrayList();
        for (String str : m21880b) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        u53Var.m8573u(arrayList);
        f43 f43Var = new f43(this.f32053a, ((v53) this.f32054b.m22315n()).mo4516a(), null);
        int i2 = i - 1;
        f43Var.m22929a(i2);
        f43Var.m22927c();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }
}
