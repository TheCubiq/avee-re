package com.daaw;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* renamed from: com.daaw.jy */
/* loaded from: classes.dex */
public final class C1888jy {

    /* renamed from: a */
    public final ByteArrayOutputStream f15503a;

    /* renamed from: b */
    public final DataOutputStream f15504b;

    public C1888jy() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f15503a = byteArrayOutputStream;
        this.f15504b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m18172b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    public static void m18171c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    public byte[] m18173a(EventMessage eventMessage, long j) {
        C2914s6.m10690a(j >= 0);
        this.f15503a.reset();
        try {
            m18172b(this.f15504b, eventMessage.f35772p);
            String str = eventMessage.f35773q;
            if (str == null) {
                str = "";
            }
            m18172b(this.f15504b, str);
            m18171c(this.f15504b, j);
            m18171c(this.f15504b, sq1.m10025T(eventMessage.f35775s, j, 1000000L));
            m18171c(this.f15504b, sq1.m10025T(eventMessage.f35774r, j, 1000L));
            m18171c(this.f15504b, eventMessage.f35776t);
            this.f15504b.write(eventMessage.f35777u);
            this.f15504b.flush();
            return this.f15503a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
