package com.daaw;

import com.google.android.gms.internal.ads.zzacg;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class q62 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public q62() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(zzacg zzacgVar) {
        this.a.reset();
        try {
            b(this.b, zzacgVar.p);
            String str = zzacgVar.q;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            this.b.writeLong(zzacgVar.r);
            this.b.writeLong(zzacgVar.s);
            this.b.write(zzacgVar.t);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
