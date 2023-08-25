package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t71 {

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float f2);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        void d(float f, float f2);

        void e(float f, float f2);
    }

    /* loaded from: classes.dex */
    public static class b implements a {
        public List<la1> a = new ArrayList();
        public List<es1> b = new ArrayList();
        public boolean c = false;
        public float d = 0.0f;
        public float e = 0.0f;

        @Override // com.daaw.t71.a
        public void a(float f, float f2) {
            this.d += f;
            this.e += f2;
            this.c = true;
        }

        @Override // com.daaw.t71.a
        public void b(float f, float f2) {
            this.d = f;
            this.e = f2;
            this.c = true;
        }

        @Override // com.daaw.t71.a
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        @Override // com.daaw.t71.a
        public void close() {
            if (this.b.size() > 0) {
                this.a.add(new la1(this.b));
            }
            this.b.clear();
            this.c = false;
        }

        @Override // com.daaw.t71.a
        public void d(float f, float f2) {
            if (!this.c) {
                this.d = 0.0f;
                this.e = 0.0f;
                this.c = true;
            }
            List<es1> list = this.b;
            float f3 = this.d;
            float f4 = this.e;
            list.add(new es1(f3, f4, f3 + f, f4 + f2));
            this.d += f;
            this.e += f2;
        }

        @Override // com.daaw.t71.a
        public void e(float f, float f2) {
            if (!this.c) {
                this.d = 0.0f;
                this.e = 0.0f;
                this.c = true;
            }
            this.b.add(new es1(this.d, this.e, f, f2));
            this.d = f;
            this.e = f2;
        }

        public List<la1> f() {
            return this.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if ("lhvcsqta".indexOf(java.lang.Character.toLowerCase(r1)) >= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.t71.a a(java.lang.String r24, com.daaw.t71.a r25) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.t71.a(java.lang.String, com.daaw.t71$a):com.daaw.t71$a");
    }

    public static void b(a aVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
    }

    public static List<la1> c(String str) {
        b bVar = new b();
        a(str, bVar);
        return bVar.f();
    }
}
