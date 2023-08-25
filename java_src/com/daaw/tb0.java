package com.daaw;

import com.daaw.mp;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface tb0 extends mp {

    /* loaded from: classes.dex */
    public static abstract class a implements b {
        public final f a = new f();

        @Override // com.daaw.mp.a
        /* renamed from: b */
        public final tb0 a() {
            return c(this.a);
        }

        public abstract tb0 c(f fVar);
    }

    /* loaded from: classes.dex */
    public interface b extends mp.a {
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        public final int p;
        public final pp q;

        public c(IOException iOException, pp ppVar, int i) {
            super(iOException);
            this.q = ppVar;
            this.p = i;
        }

        public c(String str, pp ppVar, int i) {
            super(str);
            this.q = ppVar;
            this.p = i;
        }

        public c(String str, IOException iOException, pp ppVar, int i) {
            super(str, iOException);
            this.q = ppVar;
            this.p = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {
        public final String r;

        public d(String str, pp ppVar) {
            super("Invalid content type: " + str, ppVar, 1);
            this.r = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {
        public final int r;
        public final Map<String, List<String>> s;

        public e(int i, Map<String, List<String>> map, pp ppVar) {
            super("Response code: " + i, ppVar, 1);
            this.r = i;
            this.s = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final Map<String, String> a = new HashMap();
        public Map<String, String> b;

        public synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }
}
