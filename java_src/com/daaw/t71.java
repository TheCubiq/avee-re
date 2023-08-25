package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t71 {

    /* renamed from: com.daaw.t71$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3023a {
        /* renamed from: a */
        void mo9472a(float f, float f2);

        /* renamed from: b */
        void mo9471b(float f, float f2);

        /* renamed from: c */
        void mo9470c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        /* renamed from: d */
        void mo9469d(float f, float f2);

        /* renamed from: e */
        void mo9468e(float f, float f2);
    }

    /* renamed from: com.daaw.t71$b */
    /* loaded from: classes.dex */
    public static class C3024b implements InterfaceC3023a {

        /* renamed from: a */
        public List<la1> f27094a = new ArrayList();

        /* renamed from: b */
        public List<es1> f27095b = new ArrayList();

        /* renamed from: c */
        public boolean f27096c = false;

        /* renamed from: d */
        public float f27097d = 0.0f;

        /* renamed from: e */
        public float f27098e = 0.0f;

        @Override // com.daaw.t71.InterfaceC3023a
        /* renamed from: a */
        public void mo9472a(float f, float f2) {
            this.f27097d += f;
            this.f27098e += f2;
            this.f27096c = true;
        }

        @Override // com.daaw.t71.InterfaceC3023a
        /* renamed from: b */
        public void mo9471b(float f, float f2) {
            this.f27097d = f;
            this.f27098e = f2;
            this.f27096c = true;
        }

        @Override // com.daaw.t71.InterfaceC3023a
        /* renamed from: c */
        public void mo9470c(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        @Override // com.daaw.t71.InterfaceC3023a
        public void close() {
            if (this.f27095b.size() > 0) {
                this.f27094a.add(new la1(this.f27095b));
            }
            this.f27095b.clear();
            this.f27096c = false;
        }

        @Override // com.daaw.t71.InterfaceC3023a
        /* renamed from: d */
        public void mo9469d(float f, float f2) {
            if (!this.f27096c) {
                this.f27097d = 0.0f;
                this.f27098e = 0.0f;
                this.f27096c = true;
            }
            List<es1> list = this.f27095b;
            float f3 = this.f27097d;
            float f4 = this.f27098e;
            list.add(new es1(f3, f4, f3 + f, f4 + f2));
            this.f27097d += f;
            this.f27098e += f2;
        }

        @Override // com.daaw.t71.InterfaceC3023a
        /* renamed from: e */
        public void mo9468e(float f, float f2) {
            if (!this.f27096c) {
                this.f27097d = 0.0f;
                this.f27098e = 0.0f;
                this.f27096c = true;
            }
            this.f27095b.add(new es1(this.f27097d, this.f27098e, f, f2));
            this.f27097d = f;
            this.f27098e = f2;
        }

        /* renamed from: f */
        public List<la1> m9467f() {
            return this.f27094a;
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3023a m9475a(String str, InterfaceC3023a interfaceC3023a) {
        char c;
        float m7687d;
        float m7687d2;
        boolean z;
        int length = str.length();
        uv0 uv0Var = new uv0(str, 0);
        uv0Var.m7682i();
        char c2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (true) {
            int i = uv0Var.f29560d;
            if (i >= length) {
                return interfaceC3023a;
            }
            char charAt = str.charAt(i);
            if (charAt != '+' && charAt != '-') {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        uv0Var.m7690a();
                        c2 = charAt;
                        c = c2;
                        break;
                }
                switch (c2) {
                    case 'A':
                    case p21.f22304P0 /* 97 */:
                        float m7687d3 = uv0Var.m7687d();
                        float m7687d4 = uv0Var.m7687d();
                        float m7687d5 = uv0Var.m7687d();
                        int m7688c = uv0Var.m7688c();
                        int m7688c2 = uv0Var.m7688c();
                        float m7687d6 = uv0Var.m7687d();
                        float m7687d7 = uv0Var.m7687d();
                        if (c2 == 'a') {
                            m7687d6 += f;
                            m7687d7 += f2;
                        }
                        float f7 = m7687d6;
                        float f8 = m7687d7;
                        m9474b(interfaceC3023a, f, f2, f7, f8, m7687d3, m7687d4, m7687d5, m7688c, m7688c2);
                        f = f7;
                        f4 = f4;
                        f2 = f8;
                        f3 = f3;
                        z = false;
                        if (!z) {
                            f5 = f;
                            f6 = f2;
                        }
                        uv0Var.m7682i();
                        c2 = c;
                    case 'C':
                    case p21.f22316R0 /* 99 */:
                        float m7687d8 = uv0Var.m7687d();
                        float m7687d9 = uv0Var.m7687d();
                        float m7687d10 = uv0Var.m7687d();
                        float m7687d11 = uv0Var.m7687d();
                        float m7687d12 = uv0Var.m7687d();
                        float m7687d13 = uv0Var.m7687d();
                        if (c2 == 'c') {
                            m7687d8 += f;
                            m7687d10 += f;
                            m7687d12 += f;
                            m7687d9 += f2;
                            m7687d11 += f2;
                            m7687d13 += f2;
                        }
                        float f9 = m7687d10;
                        float f10 = m7687d11;
                        interfaceC3023a.mo9470c(m7687d8, m7687d9, f9, f10, m7687d12, m7687d13);
                        f = m7687d12;
                        f2 = m7687d13;
                        f6 = f10;
                        f5 = f9;
                        z = true;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                    case 'H':
                    case p21.f22346W0 /* 104 */:
                        float m7687d14 = uv0Var.m7687d();
                        if (c2 == 'h') {
                            interfaceC3023a.mo9469d(m7687d14, 0.0f);
                            f += m7687d14;
                        } else {
                            interfaceC3023a.mo9468e(m7687d14, f2);
                            f = m7687d14;
                        }
                        z = false;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                    case 'L':
                    case 'T':
                    case p21.f22364Z0 /* 108 */:
                    case x21.f31769C0 /* 116 */:
                        m7687d = uv0Var.m7687d();
                        m7687d2 = uv0Var.m7687d();
                        if (c2 == 'l') {
                            interfaceC3023a.mo9469d(m7687d, m7687d2);
                            f += m7687d;
                            f2 += m7687d2;
                            z = false;
                            if (!z) {
                            }
                            uv0Var.m7682i();
                            c2 = c;
                        } else {
                            interfaceC3023a.mo9468e(m7687d, m7687d2);
                            f = m7687d;
                            f2 = m7687d2;
                            z = false;
                            if (!z) {
                            }
                            uv0Var.m7682i();
                            c2 = c;
                        }
                        break;
                    case 'M':
                    case 'm':
                        m7687d = uv0Var.m7687d();
                        m7687d2 = uv0Var.m7687d();
                        if (c2 == 'm') {
                            f4 += m7687d;
                            f3 += m7687d2;
                            interfaceC3023a.mo9472a(m7687d, m7687d2);
                            f += m7687d;
                            f2 += m7687d2;
                            z = false;
                            if (!z) {
                            }
                            uv0Var.m7682i();
                            c2 = c;
                        } else {
                            interfaceC3023a.mo9471b(m7687d, m7687d2);
                            f = m7687d;
                            f4 = f;
                            f2 = m7687d2;
                            f3 = f2;
                            z = false;
                            if (!z) {
                            }
                            uv0Var.m7682i();
                            c2 = c;
                        }
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        float m7687d15 = uv0Var.m7687d();
                        float m7687d16 = uv0Var.m7687d();
                        float m7687d17 = uv0Var.m7687d();
                        float m7687d18 = uv0Var.m7687d();
                        if (Character.isLowerCase(c2)) {
                            m7687d15 += f;
                            m7687d17 += f;
                            m7687d16 += f2;
                            m7687d18 += f2;
                        }
                        float f11 = m7687d15;
                        float f12 = m7687d16;
                        float f13 = m7687d17;
                        float f14 = m7687d18;
                        interfaceC3023a.mo9470c((f * 2.0f) - f5, (f2 * 2.0f) - f6, f11, f12, f13, f14);
                        f5 = f11;
                        f6 = f12;
                        f = f13;
                        f2 = f14;
                        z = true;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                    case 'V':
                    case x21.f31779E0 /* 118 */:
                        float m7687d19 = uv0Var.m7687d();
                        if (c2 == 'v') {
                            interfaceC3023a.mo9469d(0.0f, m7687d19);
                            f2 += m7687d19;
                        } else {
                            interfaceC3023a.mo9468e(f, m7687d19);
                            f2 = m7687d19;
                        }
                        z = false;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                    case 'Z':
                    case x21.f31799I0 /* 122 */:
                        interfaceC3023a.close();
                        interfaceC3023a.mo9471b(f4, f3);
                        f2 = f3;
                        f6 = f2;
                        f = f4;
                        f5 = f;
                        z = true;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid path command: ");
                        sb.append(c2);
                        uv0Var.m7690a();
                        z = false;
                        if (!z) {
                        }
                        uv0Var.m7682i();
                        c2 = c;
                        break;
                }
            }
            if (c2 == 'm' || c2 == 'M') {
                c = c2;
                c2 = (char) (c2 - 1);
                switch (c2) {
                    case 'A':
                    case p21.f22304P0 /* 97 */:
                        break;
                    case 'C':
                    case p21.f22316R0 /* 99 */:
                        break;
                    case 'H':
                    case p21.f22346W0 /* 104 */:
                        break;
                    case 'L':
                    case 'T':
                    case p21.f22364Z0 /* 108 */:
                    case x21.f31769C0 /* 116 */:
                        break;
                    case 'M':
                    case 'm':
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        break;
                    case 'V':
                    case x21.f31779E0 /* 118 */:
                        break;
                    case 'Z':
                    case x21.f31799I0 /* 122 */:
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m9474b(InterfaceC3023a interfaceC3023a, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
    }

    /* renamed from: c */
    public static List<la1> m9473c(String str) {
        C3024b c3024b = new C3024b();
        m9475a(str, c3024b);
        return c3024b.m9467f();
    }
}
