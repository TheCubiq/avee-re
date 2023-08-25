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
    public final g43 a;
    @GuardedBy("this")
    public final u53 b;
    public final boolean c;

    public x33() {
        this.b = v53.N();
        this.c = false;
        this.a = new g43();
    }

    public x33(g43 g43Var) {
        this.b = v53.N();
        this.a = g43Var;
        this.c = ((Boolean) zzba.zzc().b(g93.s4)).booleanValue();
    }

    public static x33 a() {
        return new x33();
    }

    public final synchronized void b(w33 w33Var) {
        if (this.c) {
            try {
                w33Var.a(this.b);
            } catch (NullPointerException e) {
                zzt.zzo().u(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i) {
        if (this.c) {
            if (((Boolean) zzba.zzc().b(g93.t4)).booleanValue()) {
                e(i);
            } else {
                f(i);
            }
        }
    }

    public final synchronized String d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.b.C(), Long.valueOf(zzt.zzB().b()), Integer.valueOf(i - 1), Base64.encodeToString(((v53) this.b.n()).a(), 3));
    }

    public final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i).getBytes());
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

    public final synchronized void f(int i) {
        u53 u53Var = this.b;
        u53Var.v();
        List<String> b = g93.b();
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        u53Var.u(arrayList);
        f43 f43Var = new f43(this.a, ((v53) this.b.n()).a(), null);
        int i2 = i - 1;
        f43Var.a(i2);
        f43Var.c();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }
}
