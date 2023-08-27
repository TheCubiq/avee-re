package com.daaw.avee.Common;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
/* loaded from: classes.dex */
public class SecR {
    private static final char[] symbols = new char[36];

    static {
        for (int i = 0; i < 10; i++) {
            symbols[i] = (char) (i + 48);
        }
        for (int i2 = 10; i2 < 36; i2++) {
            symbols[i2] = (char) ((i2 + 97) - 10);
        }
    }

    /* loaded from: classes.dex */
    public static class RandomString {
        private final char[] buf;
        private final Random random = new Random();

        public RandomString(int i) {
            if (i < 1) {
                throw new IllegalArgumentException("length < 1: " + i);
            }
            this.buf = new char[i];
        }

        public String nextString() {
            int i = 0;
            while (true) {
                char[] cArr = this.buf;
                if (i < cArr.length) {
                    cArr[i] = SecR.symbols[this.random.nextInt(SecR.symbols.length)];
                    i++;
                } else {
                    return new String(this.buf);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class SessionIdentifierGenerator {
        private SecureRandom random = new SecureRandom();

        public SessionIdentifierGenerator() {
        }

        public String nextSessionId() {
            return new BigInteger((int) TsExtractor.TS_STREAM_TYPE_HDMV_DTS, this.random).toString(32);
        }
    }
}
