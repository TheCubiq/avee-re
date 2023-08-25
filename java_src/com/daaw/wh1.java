package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public interface wh1 {

    /* renamed from: a */
    public static final wh1 f31244a = new C3440a();

    /* renamed from: com.daaw.wh1$a */
    /* loaded from: classes.dex */
    public static class C3440a implements wh1 {
        @Override // com.daaw.wh1
        /* renamed from: a */
        public boolean mo6067a(Format format) {
            String str = format.f35721u;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // com.daaw.wh1
        /* renamed from: b */
        public uh1 mo6066b(Format format) {
            String str = format.f35721u;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C1473gv(format.f35723w);
                case 1:
                    return new nw0();
                case 2:
                    return new wq0();
                case 3:
                    return new dx1();
                case 4:
                    return new qo1(format.f35723w);
                case 5:
                    return new cf1(format.f35723w);
                case 6:
                case 7:
                    return new C1821je(format.f35721u, format.f35714O);
                case '\b':
                    return new C2030le(format.f35714O);
                case '\t':
                    return new qh1();
                case '\n':
                    return new fo1();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    /* renamed from: a */
    boolean mo6067a(Format format);

    /* renamed from: b */
    uh1 mo6066b(Format format);
}
