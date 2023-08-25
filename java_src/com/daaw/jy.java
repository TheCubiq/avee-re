package com.daaw;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class jy {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public jy() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public byte[] a(EventMessage eventMessage, long j) {
        s6.a(j >= 0);
        this.a.reset();
        try {
            b(this.b, eventMessage.p);
            String str = eventMessage.q;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            c(this.b, j);
            c(this.b, sq1.T(eventMessage.s, j, 1000000L));
            c(this.b, sq1.T(eventMessage.r, j, 1000L));
            c(this.b, eventMessage.t);
            this.b.write(eventMessage.u);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
