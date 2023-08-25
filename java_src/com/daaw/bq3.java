package com.daaw;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;
/* loaded from: classes.dex */
public final class bq3 extends hq3 {
    public static final Set u = ig.g("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final a74 l;
    public final Activity m;
    public v84 n;
    public ImageView o;
    public LinearLayout p;
    public final iq3 q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    public bq3(a74 a74Var, iq3 iq3Var) {
        super(a74Var, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = a74Var;
        this.m = a74Var.zzk();
        this.q = iq3Var;
    }

    public final void h(boolean z) {
        synchronized (this.k) {
            PopupWindow popupWindow = this.r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.s.removeView((View) this.l);
                ViewGroup viewGroup = this.t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.o);
                    this.t.addView((View) this.l);
                    this.l.Q(this.n);
                }
                if (z) {
                    g("default");
                    iq3 iq3Var = this.q;
                    if (iq3Var != null) {
                        iq3Var.zzb();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0258 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e3 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.bq3.i(java.util.Map):void");
    }

    public final void j(int i, int i2, boolean z) {
        synchronized (this.k) {
            this.e = i;
            this.f = i2;
        }
    }

    public final void k(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
