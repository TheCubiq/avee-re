package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public interface sp0 {

    /* renamed from: a */
    public static final sp0 f26479a = new C2964a();

    /* renamed from: com.daaw.sp0$a */
    /* loaded from: classes.dex */
    public static class C2964a implements sp0 {
        @Override // com.daaw.sp0
        /* renamed from: a */
        public boolean mo10095a(Format format) {
            String str = format.f35721u;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        @Override // com.daaw.sp0
        /* renamed from: b */
        public rp0 mo10094b(Format format) {
            String str = format.f35721u;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new qe0();
                case 1:
                    return new C1770iy();
                case 2:
                    return new re1();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    /* renamed from: a */
    boolean mo10095a(Format format);

    /* renamed from: b */
    rp0 mo10094b(Format format);
}
