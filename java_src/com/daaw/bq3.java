package com.daaw;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class bq3 extends hq3 {

    /* renamed from: u */
    public static final Set f5040u = C1701ig.m19843g("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c */
    public String f5041c;

    /* renamed from: d */
    public boolean f5042d;

    /* renamed from: e */
    public int f5043e;

    /* renamed from: f */
    public int f5044f;

    /* renamed from: g */
    public int f5045g;

    /* renamed from: h */
    public int f5046h;

    /* renamed from: i */
    public int f5047i;

    /* renamed from: j */
    public int f5048j;

    /* renamed from: k */
    public final Object f5049k;

    /* renamed from: l */
    public final a74 f5050l;

    /* renamed from: m */
    public final Activity f5051m;

    /* renamed from: n */
    public v84 f5052n;

    /* renamed from: o */
    public ImageView f5053o;

    /* renamed from: p */
    public LinearLayout f5054p;

    /* renamed from: q */
    public final iq3 f5055q;

    /* renamed from: r */
    public PopupWindow f5056r;

    /* renamed from: s */
    public RelativeLayout f5057s;

    /* renamed from: t */
    public ViewGroup f5058t;

    public bq3(a74 a74Var, iq3 iq3Var) {
        super(a74Var, "resize");
        this.f5041c = "top-right";
        this.f5042d = true;
        this.f5043e = 0;
        this.f5044f = 0;
        this.f5045g = -1;
        this.f5046h = 0;
        this.f5047i = 0;
        this.f5048j = -1;
        this.f5049k = new Object();
        this.f5050l = a74Var;
        this.f5051m = a74Var.zzk();
        this.f5055q = iq3Var;
    }

    /* renamed from: h */
    public final void m25923h(boolean z) {
        synchronized (this.f5049k) {
            PopupWindow popupWindow = this.f5056r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f5057s.removeView((View) this.f5050l);
                ViewGroup viewGroup = this.f5058t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f5053o);
                    this.f5058t.addView((View) this.f5050l);
                    this.f5050l.mo6440Q(this.f5052n);
                }
                if (z) {
                    m20484g("default");
                    iq3 iq3Var = this.f5055q;
                    if (iq3Var != null) {
                        iq3Var.zzb();
                    }
                }
                this.f5056r = null;
                this.f5057s = null;
                this.f5058t = null;
                this.f5054p = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0258 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e3 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:212:0x0007, inners: #0 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25922i(Map map) {
        String str;
        int[] iArr;
        char c;
        iq3 iq3Var;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.f5049k) {
            if (this.f5051m == null) {
                m20488c("Not an activity context. Cannot resize.");
            } else if (this.f5050l.mo6408o() == null) {
                m20488c("Webview is not yet available, size is not set.");
            } else if (this.f5050l.mo6408o().m7329i()) {
                m20488c("Is interstitial. Cannot resize an interstitial.");
            } else if (this.f5050l.mo6449L()) {
                m20488c("Cannot resize an expanded banner.");
            } else {
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    zzt.zzp();
                    this.f5048j = zzs.zzK((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    zzt.zzp();
                    this.f5045g = zzs.zzK((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    zzt.zzp();
                    this.f5046h = zzs.zzK((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    zzt.zzp();
                    this.f5047i = zzs.zzK((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.f5042d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str2 = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str2)) {
                    this.f5041c = str2;
                }
                if (this.f5048j < 0 || this.f5045g < 0) {
                    m20488c("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.f5051m.getWindow();
                if (window != null && window.getDecorView() != null) {
                    zzt.zzp();
                    int[] zzS = zzs.zzS(this.f5051m);
                    zzt.zzp();
                    int[] zzO = zzs.zzO(this.f5051m);
                    int i5 = zzS[0];
                    int i6 = zzS[1];
                    int i7 = this.f5048j;
                    if (i7 >= 50 && i7 <= i5) {
                        int i8 = this.f5045g;
                        if (i8 >= 50 && i8 <= i6) {
                            if (i8 == i6 && i7 == i5) {
                                str = "Cannot resize to a full-screen ad.";
                                k04.zzj(str);
                                iArr = null;
                                if (iArr != null) {
                                }
                            } else {
                                if (this.f5042d) {
                                    String str3 = this.f5041c;
                                    switch (str3.hashCode()) {
                                        case -1364013995:
                                            if (str3.equals("center")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1012429441:
                                            if (str3.equals("top-left")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -655373719:
                                            if (str3.equals("bottom-left")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1163912186:
                                            if (str3.equals("bottom-right")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1288627767:
                                            if (str3.equals("bottom-center")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1755462605:
                                            if (str3.equals("top-center")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    if (c2 == 0) {
                                        i = this.f5043e + this.f5046h;
                                        i2 = this.f5044f;
                                    } else if (c2 != 1) {
                                        if (c2 != 2) {
                                            if (c2 == 3) {
                                                i = this.f5043e + this.f5046h;
                                                i4 = this.f5044f;
                                            } else if (c2 == 4) {
                                                i = ((this.f5043e + this.f5046h) + (i7 >> 1)) - 25;
                                                i4 = this.f5044f;
                                            } else if (c2 != 5) {
                                                i = ((this.f5043e + this.f5046h) + i7) - 50;
                                                i2 = this.f5044f;
                                            } else {
                                                i = ((this.f5043e + this.f5046h) + i7) - 50;
                                                i4 = this.f5044f;
                                            }
                                            i3 = ((i4 + this.f5047i) + i8) - 50;
                                        } else {
                                            i = ((this.f5043e + this.f5046h) + (i7 >> 1)) - 25;
                                            i3 = ((this.f5044f + this.f5047i) + (i8 >> 1)) - 25;
                                        }
                                        if (i >= 0 && i + 50 <= i5 && i3 >= zzO[0] && i3 + 50 <= zzO[1]) {
                                            iArr = new int[]{this.f5043e + this.f5046h, this.f5044f + this.f5047i};
                                        }
                                        iArr = null;
                                    } else {
                                        i = ((this.f5043e + this.f5046h) + (i7 >> 1)) - 25;
                                        i2 = this.f5044f;
                                    }
                                    i3 = i2 + this.f5047i;
                                    if (i >= 0) {
                                        iArr = new int[]{this.f5043e + this.f5046h, this.f5044f + this.f5047i};
                                    }
                                    iArr = null;
                                } else {
                                    zzt.zzp();
                                    int[] zzS2 = zzs.zzS(this.f5051m);
                                    zzt.zzp();
                                    int[] zzO2 = zzs.zzO(this.f5051m);
                                    int i9 = zzS2[0];
                                    int i10 = this.f5043e + this.f5046h;
                                    int i11 = this.f5044f + this.f5047i;
                                    if (i10 < 0) {
                                        i10 = 0;
                                    } else {
                                        int i12 = this.f5048j;
                                        if (i10 + i12 > i9) {
                                            i10 = i9 - i12;
                                        }
                                    }
                                    int i13 = zzO2[0];
                                    if (i11 < i13) {
                                        i11 = i13;
                                    } else {
                                        int i14 = this.f5045g;
                                        int i15 = i11 + i14;
                                        int i16 = zzO2[1];
                                        if (i15 > i16) {
                                            i11 = i16 - i14;
                                        }
                                    }
                                    iArr = new int[]{i10, i11};
                                }
                                if (iArr != null) {
                                    m20488c("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                zzay.zzb();
                                int m24833D = d04.m24833D(this.f5051m, this.f5048j);
                                zzay.zzb();
                                int m24833D2 = d04.m24833D(this.f5051m, this.f5045g);
                                ViewParent parent = ((View) this.f5050l).getParent();
                                if (parent == null || !(parent instanceof ViewGroup)) {
                                    m20488c("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                ViewGroup viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) this.f5050l);
                                PopupWindow popupWindow = this.f5056r;
                                if (popupWindow == null) {
                                    this.f5058t = viewGroup;
                                    zzt.zzp();
                                    a74 a74Var = this.f5050l;
                                    ((View) a74Var).setDrawingCacheEnabled(true);
                                    Bitmap createBitmap = Bitmap.createBitmap(((View) a74Var).getDrawingCache());
                                    ((View) a74Var).setDrawingCacheEnabled(false);
                                    ImageView imageView = new ImageView(this.f5051m);
                                    this.f5053o = imageView;
                                    imageView.setImageBitmap(createBitmap);
                                    this.f5052n = this.f5050l.mo6408o();
                                    this.f5058t.addView(this.f5053o);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout = new RelativeLayout(this.f5051m);
                                this.f5057s = relativeLayout;
                                relativeLayout.setBackgroundColor(0);
                                this.f5057s.setLayoutParams(new ViewGroup.LayoutParams(m24833D, m24833D2));
                                zzt.zzp();
                                PopupWindow popupWindow2 = new PopupWindow((View) this.f5057s, m24833D, m24833D2, false);
                                this.f5056r = popupWindow2;
                                popupWindow2.setOutsideTouchable(false);
                                this.f5056r.setTouchable(true);
                                this.f5056r.setClippingEnabled(!this.f5042d);
                                this.f5057s.addView((View) this.f5050l, -1, -1);
                                this.f5054p = new LinearLayout(this.f5051m);
                                zzay.zzb();
                                int m24833D3 = d04.m24833D(this.f5051m, 50);
                                zzay.zzb();
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m24833D3, d04.m24833D(this.f5051m, 50));
                                String str4 = this.f5041c;
                                switch (str4.hashCode()) {
                                    case -1364013995:
                                        if (str4.equals("center")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1012429441:
                                        if (str4.equals("top-left")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -655373719:
                                        if (str4.equals("bottom-left")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1163912186:
                                        if (str4.equals("bottom-right")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1288627767:
                                        if (str4.equals("bottom-center")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1755462605:
                                        if (str4.equals("top-center")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                try {
                                    if (c != 0) {
                                        int i17 = 14;
                                        if (c == 1) {
                                            layoutParams.addRule(10);
                                        } else if (c == 2) {
                                            layoutParams.addRule(13);
                                            this.f5054p.setOnClickListener(new aq3(this));
                                            this.f5054p.setContentDescription("Close button");
                                            this.f5057s.addView(this.f5054p, layoutParams);
                                            PopupWindow popupWindow3 = this.f5056r;
                                            View decorView = window.getDecorView();
                                            zzay.zzb();
                                            int m24833D4 = d04.m24833D(this.f5051m, iArr[0]);
                                            zzay.zzb();
                                            popupWindow3.showAtLocation(decorView, 0, m24833D4, d04.m24833D(this.f5051m, iArr[1]));
                                            int i18 = iArr[0];
                                            int i19 = iArr[1];
                                            iq3Var = this.f5055q;
                                            if (iq3Var != null) {
                                                iq3Var.mo19490a(i18, i19, this.f5048j, this.f5045g);
                                            }
                                            this.f5050l.mo6440Q(v84.m7336b(m24833D, m24833D2));
                                            int i20 = iArr[0];
                                            int i21 = iArr[1];
                                            zzt.zzp();
                                            m20485f(i20, i21 - zzs.zzO(this.f5051m)[0], this.f5048j, this.f5045g);
                                            m20484g("resized");
                                            return;
                                        } else if (c == 3) {
                                            layoutParams.addRule(12);
                                        } else if (c != 4) {
                                            i17 = 11;
                                            if (c != 5) {
                                                layoutParams.addRule(10);
                                            } else {
                                                layoutParams.addRule(12);
                                            }
                                        } else {
                                            layoutParams.addRule(12);
                                        }
                                        layoutParams.addRule(i17);
                                        this.f5054p.setOnClickListener(new aq3(this));
                                        this.f5054p.setContentDescription("Close button");
                                        this.f5057s.addView(this.f5054p, layoutParams);
                                        PopupWindow popupWindow32 = this.f5056r;
                                        View decorView2 = window.getDecorView();
                                        zzay.zzb();
                                        int m24833D42 = d04.m24833D(this.f5051m, iArr[0]);
                                        zzay.zzb();
                                        popupWindow32.showAtLocation(decorView2, 0, m24833D42, d04.m24833D(this.f5051m, iArr[1]));
                                        int i182 = iArr[0];
                                        int i192 = iArr[1];
                                        iq3Var = this.f5055q;
                                        if (iq3Var != null) {
                                        }
                                        this.f5050l.mo6440Q(v84.m7336b(m24833D, m24833D2));
                                        int i202 = iArr[0];
                                        int i212 = iArr[1];
                                        zzt.zzp();
                                        m20485f(i202, i212 - zzs.zzO(this.f5051m)[0], this.f5048j, this.f5045g);
                                        m20484g("resized");
                                        return;
                                    }
                                    layoutParams.addRule(10);
                                    PopupWindow popupWindow322 = this.f5056r;
                                    View decorView22 = window.getDecorView();
                                    zzay.zzb();
                                    int m24833D422 = d04.m24833D(this.f5051m, iArr[0]);
                                    zzay.zzb();
                                    popupWindow322.showAtLocation(decorView22, 0, m24833D422, d04.m24833D(this.f5051m, iArr[1]));
                                    int i1822 = iArr[0];
                                    int i1922 = iArr[1];
                                    iq3Var = this.f5055q;
                                    if (iq3Var != null) {
                                    }
                                    this.f5050l.mo6440Q(v84.m7336b(m24833D, m24833D2));
                                    int i2022 = iArr[0];
                                    int i2122 = iArr[1];
                                    zzt.zzp();
                                    m20485f(i2022, i2122 - zzs.zzO(this.f5051m)[0], this.f5048j, this.f5045g);
                                    m20484g("resized");
                                    return;
                                } catch (RuntimeException e) {
                                    m20488c("Cannot show popup window: " + e.getMessage());
                                    this.f5057s.removeView((View) this.f5050l);
                                    ViewGroup viewGroup2 = this.f5058t;
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(this.f5053o);
                                        this.f5058t.addView((View) this.f5050l);
                                        this.f5050l.mo6440Q(this.f5052n);
                                    }
                                    return;
                                }
                                layoutParams.addRule(9);
                                this.f5054p.setOnClickListener(new aq3(this));
                                this.f5054p.setContentDescription("Close button");
                                this.f5057s.addView(this.f5054p, layoutParams);
                            }
                        }
                        str = "Height is too small or too large.";
                        k04.zzj(str);
                        iArr = null;
                        if (iArr != null) {
                        }
                    }
                    str = "Width is too small or too large.";
                    k04.zzj(str);
                    iArr = null;
                    if (iArr != null) {
                    }
                }
                m20488c("Activity context is not ready, cannot get window or decor view.");
            }
        }
    }

    /* renamed from: j */
    public final void m25921j(int i, int i2, boolean z) {
        synchronized (this.f5049k) {
            this.f5043e = i;
            this.f5044f = i2;
        }
    }

    /* renamed from: k */
    public final void m25920k(int i, int i2) {
        this.f5043e = i;
        this.f5044f = i2;
    }

    /* renamed from: l */
    public final boolean m25919l() {
        boolean z;
        synchronized (this.f5049k) {
            z = this.f5056r != null;
        }
        return z;
    }
}
