package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.qw1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* renamed from: com.daaw.r1 */
/* loaded from: classes.dex */
public final class C2812r1 {

    /* renamed from: g */
    public static int f24715g;

    /* renamed from: h */
    public static boolean f24716h;

    /* renamed from: a */
    public final Context f24718a;

    /* renamed from: b */
    public final az0 f24719b;

    /* renamed from: c */
    public final List<Object> f24720c;

    /* renamed from: d */
    public final HashMap<Integer, RewardedAd> f24721d;

    /* renamed from: e */
    public final List<Integer> f24722e;

    /* renamed from: f */
    public static final C2813a f24714f = new C2813a(null);

    /* renamed from: i */
    public static int f24717i = -1;

    /* renamed from: com.daaw.r1$a */
    /* loaded from: classes.dex */
    public static final class C2813a {
        public C2813a() {
        }

        public /* synthetic */ C2813a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: b */
        public final void m11840b(boolean z) {
            C2812r1.f24716h = z;
        }

        /* renamed from: c */
        public final String m11839c(int i, Context context) {
            int i2;
            switch (i) {
                case R.id.btnEndTime /* 2131296390 */:
                    i2 = R.string.ads_reward_end_at;
                    break;
                case R.id.editAudioBitrate /* 2131296509 */:
                    i2 = R.string.ads_reward_audio_bitrate;
                    break;
                case R.id.editTxtBitrate /* 2131296512 */:
                    i2 = R.string.ads_reward_video_bitrate;
                    break;
                case R.id.editTxtFramerate /* 2131296515 */:
                    i2 = R.string.ads_reward_fps;
                    break;
                case R.id.editTxtHeight /* 2131296516 */:
                    i2 = R.string.ads_reward_height;
                    break;
                case R.id.editTxtWidth /* 2131296518 */:
                    i2 = R.string.ads_reward_width;
                    break;
                default:
                    i2 = R.string.ads_reward_logo;
                    break;
            }
            String string = context.getString(i2);
            ug0.m8269e(string, "when (targetId) {\n      …{ context.getString(it) }");
            return string;
        }
    }

    /* renamed from: com.daaw.r1$b */
    /* loaded from: classes.dex */
    public static final class C2814b extends RewardedAdLoadCallback {

        /* renamed from: b */
        public final /* synthetic */ int f24724b;

        public C2814b(int i) {
            C2812r1.this = r1;
            this.f24724b = i;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            ug0.m8268f(rewardedAd, "ad");
            super.onAdLoaded(rewardedAd);
            C2812r1.this.f24721d.put(Integer.valueOf(this.f24724b), rewardedAd);
            C2812r1.f24714f.m11840b(false);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ug0.m8268f(loadAdError, "error");
            super.onAdFailedToLoad(loadAdError);
            C2812r1.this.m11842v(loadAdError);
        }
    }

    public C2812r1(Context context, az0 az0Var) {
        ug0.m8268f(context, "context");
        ug0.m8268f(az0Var, "preferences");
        this.f24718a = context;
        this.f24719b = az0Var;
        LinkedList linkedList = new LinkedList();
        this.f24720c = linkedList;
        this.f24721d = new HashMap<>();
        this.f24722e = new ArrayList();
        m11847q();
        MainActivity.f3715h0.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.j1
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                C2812r1.m11855i(C2812r1.this, (Activity) obj);
            }
        }, linkedList);
        MainActivity.f3721n0.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.k1
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                C2812r1.m11854j(C2812r1.this, (C0645al) obj);
            }
        }, linkedList);
        oy0.f22101e.m6691b(new vw1.InterfaceC3381a() { // from class: com.daaw.m1
            @Override // com.daaw.vw1.InterfaceC3381a
            /* renamed from: a */
            public final Object mo3126a() {
                Boolean m11853k;
                m11853k = C2812r1.m11853k(C2812r1.this);
                return m11853k;
            }
        }, linkedList);
        oy0.f22098b.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.o1
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m11852l;
                m11852l = C2812r1.m11852l(C2812r1.this, (Integer) obj);
                return m11852l;
            }
        }, linkedList);
        oy0.f22099c.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.n1
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m11851m;
                m11851m = C2812r1.m11851m(C2812r1.this, (Integer) obj);
                return m11851m;
            }
        }, linkedList);
        qv1.f24439S.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.l1
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                C2812r1.m11850n(C2812r1.this, (Boolean) obj);
            }
        }, linkedList);
    }

    /* renamed from: i */
    public static final void m11855i(C2812r1 c2812r1, Activity activity) {
        ug0.m8268f(c2812r1, "this$0");
        c2812r1.m11847q();
        Set<Integer> keySet = c2812r1.f24721d.keySet();
        ug0.m8269e(keySet, "map.keys");
        for (Number number : keySet) {
            c2812r1.m11844t(number.intValue());
        }
    }

    /* renamed from: j */
    public static final void m11854j(C2812r1 c2812r1, C0645al c0645al) {
        ug0.m8268f(c2812r1, "this$0");
        ug0.m8268f(c0645al, "$noName_0");
        c2812r1.f24721d.clear();
    }

    /* renamed from: k */
    public static final Boolean m11853k(C2812r1 c2812r1) {
        ug0.m8268f(c2812r1, "this$0");
        Boolean m6692a = nc0.f19989g.m6692a(Boolean.FALSE);
        ug0.m8269e(m6692a, "isPremium(false)");
        return Boolean.valueOf(m6692a.booleanValue() && c2812r1.f24719b.m26590d());
    }

    /* renamed from: l */
    public static final Boolean m11852l(C2812r1 c2812r1, final Integer num) {
        ug0.m8268f(c2812r1, "this$0");
        if (!c2812r1.f24722e.contains(num)) {
            int i = f24715g;
            if (i <= 0) {
                ug0.m8269e(num, "it");
                f24717i = num.intValue();
                RewardedAd rewardedAd = c2812r1.f24721d.get(num);
                if (rewardedAd != null) {
                    rewardedAd.show(MainActivity.m26903r0(), new C2504p1(c2812r1));
                } else if (f24716h) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2812r1.m11845s(C2812r1.this, num);
                        }
                    }, 1000L);
                } else {
                    c2812r1.m11844t(num.intValue());
                    c2812r1.m11846r(R.string.reward_ad_failed_load);
                }
                return Boolean.FALSE;
            }
            f24715g = i - 1;
            List<Integer> list = c2812r1.f24722e;
            ug0.m8269e(num, "it");
            list.add(num);
        }
        return Boolean.TRUE;
    }

    /* renamed from: m */
    public static final Boolean m11851m(C2812r1 c2812r1, Integer num) {
        ug0.m8268f(c2812r1, "this$0");
        return Boolean.valueOf(c2812r1.f24722e.contains(num));
    }

    /* renamed from: n */
    public static final void m11850n(C2812r1 c2812r1, Boolean bool) {
        ug0.m8268f(c2812r1, "this$0");
        if (bool.booleanValue()) {
            return;
        }
        for (Number number : c2812r1.f24722e) {
            int intValue = number.intValue();
            c2812r1.f24721d.put(Integer.valueOf(intValue), null);
            c2812r1.m11844t(intValue);
        }
        c2812r1.f24722e.clear();
    }

    /* renamed from: s */
    public static final void m11845s(C2812r1 c2812r1, Integer num) {
        ug0.m8268f(c2812r1, "this$0");
        RewardedAd rewardedAd = c2812r1.f24721d.get(num);
        if (rewardedAd != null) {
            rewardedAd.show(MainActivity.m26903r0(), new C2504p1(c2812r1));
        } else {
            c2812r1.m11846r(R.string.reward_ad_still_loading);
        }
    }

    /* renamed from: q */
    public final void m11847q() {
        this.f24721d.put(Integer.valueOf((int) R.id.chkHideAppLogo), null);
    }

    /* renamed from: r */
    public final void m11846r(int i) {
        Context m23840b = dx0.m23840b();
        if (m23840b == null) {
            return;
        }
        C2026lc.m17057b(m23840b, i).m17053f(true);
    }

    /* renamed from: t */
    public final void m11844t(int i) {
        C2813a c2813a = f24714f;
        f24716h = true;
        Context context = this.f24718a;
        RewardedAd.load(context, c2813a.m11839c(i, context), C0563a1.f2690a.m27751b(), new C2814b(i));
    }

    /* renamed from: u */
    public final void m11843u(RewardItem rewardItem) {
        int i = f24717i;
        if (i <= 0) {
            f24715g++;
            return;
        }
        this.f24722e.add(Integer.valueOf(i));
        oy0.f22100d.m5753a(Integer.valueOf(f24717i), Boolean.FALSE);
    }

    /* renamed from: v */
    public final void m11842v(LoadAdError loadAdError) {
        ug0.m8268f(loadAdError, "loadAdError");
        f24716h = false;
        int code = loadAdError.getCode();
        String str = code != 0 ? code != 1 ? code != 2 ? code != 3 ? "Unknown error" : "No Fill" : "Network Error" : "Invalid Request" : "Internal Error";
        StringBuilder sb = new StringBuilder();
        sb.append("onRewardedVideoAdFailedToLoad ");
        sb.append(str);
        sb.append(' ');
        sb.append(loadAdError);
    }
}
