package com.daaw;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class eh2 implements fh2 {

    /* renamed from: b */
    public static final Logger f8478b = Logger.getLogger(eh2.class.getName());

    /* renamed from: a */
    public final ThreadLocal f8479a = new dh2(this);

    @Override // com.daaw.fh2
    /* renamed from: a */
    public final ih2 mo22637a(iz7 iz7Var, jh2 jh2Var) {
        int mo12775N;
        long zzc;
        long zzb = iz7Var.zzb();
        ((ByteBuffer) this.f8479a.get()).rewind().limit(8);
        do {
            mo12775N = iz7Var.mo12775N((ByteBuffer) this.f8479a.get());
            if (mo12775N == 8) {
                ((ByteBuffer) this.f8479a.get()).rewind();
                long m20793e = hh2.m20793e((ByteBuffer) this.f8479a.get());
                byte[] bArr = null;
                if (m20793e < 8 && m20793e > 1) {
                    Logger logger = f8478b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(m20793e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f8479a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (m20793e == 1) {
                        ((ByteBuffer) this.f8479a.get()).limit(16);
                        iz7Var.mo12775N((ByteBuffer) this.f8479a.get());
                        ((ByteBuffer) this.f8479a.get()).position(8);
                        zzc = hh2.m20792f((ByteBuffer) this.f8479a.get()) - 16;
                    } else {
                        zzc = m20793e == 0 ? iz7Var.zzc() - iz7Var.zzb() : m20793e - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f8479a.get()).limit(((ByteBuffer) this.f8479a.get()).limit() + 16);
                        iz7Var.mo12775N((ByteBuffer) this.f8479a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.f8479a.get()).position() - 16; position < ((ByteBuffer) this.f8479a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.f8479a.get()).position() - 16)] = ((ByteBuffer) this.f8479a.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j = zzc;
                    ih2 mo9527b = mo9527b(str, bArr, jh2Var instanceof ih2 ? ((ih2) jh2Var).zza() : "");
                    mo9527b.mo19822n(jh2Var);
                    ((ByteBuffer) this.f8479a.get()).rewind();
                    mo9527b.mo19823d(iz7Var, (ByteBuffer) this.f8479a.get(), j, this);
                    return mo9527b;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (mo12775N >= 0);
        iz7Var.mo12773b(zzb);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract ih2 mo9527b(String str, byte[] bArr, String str2);
}
