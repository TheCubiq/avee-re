package com.daaw;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class eh2 implements fh2 {
    public static final Logger b = Logger.getLogger(eh2.class.getName());
    public final ThreadLocal a = new dh2(this);

    @Override // com.daaw.fh2
    public final ih2 a(iz7 iz7Var, jh2 jh2Var) {
        int N;
        long zzc;
        long zzb = iz7Var.zzb();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            N = iz7Var.N((ByteBuffer) this.a.get());
            if (N == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long e = hh2.e((ByteBuffer) this.a.get());
                byte[] bArr = null;
                if (e < 8 && e > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (e == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        iz7Var.N((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        zzc = hh2.f((ByteBuffer) this.a.get()) - 16;
                    } else {
                        zzc = e == 0 ? iz7Var.zzc() - iz7Var.zzb() : e - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        iz7Var.N((ByteBuffer) this.a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.a.get()).position() - 16; position < ((ByteBuffer) this.a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j = zzc;
                    ih2 b2 = b(str, bArr, jh2Var instanceof ih2 ? ((ih2) jh2Var).zza() : "");
                    b2.n(jh2Var);
                    ((ByteBuffer) this.a.get()).rewind();
                    b2.d(iz7Var, (ByteBuffer) this.a.get(), j, this);
                    return b2;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (N >= 0);
        iz7Var.b(zzb);
        throw new EOFException();
    }

    public abstract ih2 b(String str, byte[] bArr, String str2);
}
