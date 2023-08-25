package com.daaw;

import com.google.android.gms.internal.ads.zzacg;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class q62 {

    /* renamed from: a */
    public final ByteArrayOutputStream f23686a;

    /* renamed from: b */
    public final DataOutputStream f23687b;

    public q62() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f23686a = byteArrayOutputStream;
        this.f23687b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m12743b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] m12744a(zzacg zzacgVar) {
        this.f23686a.reset();
        try {
            m12743b(this.f23687b, zzacgVar.f36702p);
            String str = zzacgVar.f36703q;
            if (str == null) {
                str = "";
            }
            m12743b(this.f23687b, str);
            this.f23687b.writeLong(zzacgVar.f36704r);
            this.f23687b.writeLong(zzacgVar.f36705s);
            this.f23687b.write(zzacgVar.f36706t);
            this.f23687b.flush();
            return this.f23686a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
