package com.daaw;

import com.daaw.gx0;
import java.util.List;
/* loaded from: classes.dex */
public class gv0 implements pe1 {
    public static final wk[] a = {new wk(new String[]{".pls"}, new String[]{"audio/x-scpls"}, new gx0[]{new gx0(gx0.a.WINAMP, true, null), new gx0(gx0.a.VLC_MEDIA_PLAYER, false, null), new gx0(gx0.a.MEDIA_PLAYER_CLASSIC, true, null), new gx0(gx0.a.FOOBAR2000, false, null), new gx0(gx0.a.MPLAYER, true, null), new gx0(gx0.a.QUICKTIME, true, null), new gx0(gx0.a.ITUNES, true, null), new gx0(gx0.a.REALPLAYER, false, null)}, "Winamp PLSv2 Playlist")};

    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    @Override // com.daaw.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.oe1 a(java.io.InputStream r11, java.lang.String r12, com.daaw.bl0 r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gv0.a(java.io.InputStream, java.lang.String, com.daaw.bl0):com.daaw.oe1");
    }

    @Override // com.daaw.pe1
    public wk[] b() {
        return (wk[]) a.clone();
    }

    @Override // com.daaw.pe1
    public oe1 c(ix0 ix0Var) {
        fv0 fv0Var = new fv0();
        fv0Var.d(this);
        d(fv0Var.c(), ix0Var.a());
        return fv0Var;
    }

    public final void d(List<a51> list, n nVar) {
        if (!(nVar instanceof fb1)) {
            if (nVar instanceof yn0) {
                yn0 yn0Var = (yn0) nVar;
                if (yn0Var.b() != null) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a timed media");
                }
                if (yn0Var.a() < 0) {
                    throw new IllegalArgumentException("A PLS playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) nVar;
        if (fb1Var.a() < 0) {
            throw new IllegalArgumentException("A PLS playlist cannot handle a sequence repeated indefinitely");
        }
        n[] b = fb1Var.b();
        for (int i = 0; i < fb1Var.a(); i++) {
            for (n nVar2 : b) {
                d(list, nVar2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "pls";
    }
}
