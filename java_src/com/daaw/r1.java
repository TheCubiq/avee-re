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
/* loaded from: classes.dex */
public final class r1 {
    public static int g;
    public static boolean h;
    public final Context a;
    public final az0 b;
    public final List<Object> c;
    public final HashMap<Integer, RewardedAd> d;
    public final List<Integer> e;
    public static final a f = new a(null);
    public static int i = -1;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final void b(boolean z) {
            r1.h = z;
        }

        public final String c(int i, Context context) {
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
            ug0.e(string, "when (targetId) {\n      …{ context.getString(it) }");
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RewardedAdLoadCallback {
        public final /* synthetic */ int b;

        public b(int i) {
            r1.this = r1;
            this.b = i;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            ug0.f(rewardedAd, "ad");
            super.onAdLoaded(rewardedAd);
            r1.this.d.put(Integer.valueOf(this.b), rewardedAd);
            r1.f.b(false);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ug0.f(loadAdError, "error");
            super.onAdFailedToLoad(loadAdError);
            r1.this.v(loadAdError);
        }
    }

    public r1(Context context, az0 az0Var) {
        ug0.f(context, "context");
        ug0.f(az0Var, "preferences");
        this.a = context;
        this.b = az0Var;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        this.d = new HashMap<>();
        this.e = new ArrayList();
        q();
        MainActivity.h0.b(new qw1.a() { // from class: com.daaw.j1
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                r1.i(r1.this, (Activity) obj);
            }
        }, linkedList);
        MainActivity.n0.b(new qw1.a() { // from class: com.daaw.k1
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                r1.j(r1.this, (al) obj);
            }
        }, linkedList);
        oy0.e.b(new vw1.a() { // from class: com.daaw.m1
            @Override // com.daaw.vw1.a
            public final Object a() {
                Boolean k;
                k = r1.k(r1.this);
                return k;
            }
        }, linkedList);
        oy0.b.b(new ww1.a() { // from class: com.daaw.o1
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean l;
                l = r1.l(r1.this, (Integer) obj);
                return l;
            }
        }, linkedList);
        oy0.c.b(new ww1.a() { // from class: com.daaw.n1
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean m;
                m = r1.m(r1.this, (Integer) obj);
                return m;
            }
        }, linkedList);
        qv1.S.b(new qw1.a() { // from class: com.daaw.l1
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                r1.n(r1.this, (Boolean) obj);
            }
        }, linkedList);
    }

    public static final void i(r1 r1Var, Activity activity) {
        ug0.f(r1Var, "this$0");
        r1Var.q();
        Set<Integer> keySet = r1Var.d.keySet();
        ug0.e(keySet, "map.keys");
        for (Number number : keySet) {
            r1Var.t(number.intValue());
        }
    }

    public static final void j(r1 r1Var, al alVar) {
        ug0.f(r1Var, "this$0");
        ug0.f(alVar, "$noName_0");
        r1Var.d.clear();
    }

    public static final Boolean k(r1 r1Var) {
        ug0.f(r1Var, "this$0");
        Boolean a2 = nc0.g.a(Boolean.FALSE);
        ug0.e(a2, "isPremium(false)");
        return Boolean.valueOf(a2.booleanValue() && r1Var.b.d());
    }

    public static final Boolean l(r1 r1Var, final Integer num) {
        ug0.f(r1Var, "this$0");
        if (!r1Var.e.contains(num)) {
            int i2 = g;
            if (i2 <= 0) {
                ug0.e(num, "it");
                i = num.intValue();
                RewardedAd rewardedAd = r1Var.d.get(num);
                if (rewardedAd != null) {
                    rewardedAd.show(MainActivity.r0(), new p1(r1Var));
                } else if (h) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            r1.s(r1.this, num);
                        }
                    }, 1000L);
                } else {
                    r1Var.t(num.intValue());
                    r1Var.r(R.string.reward_ad_failed_load);
                }
                return Boolean.FALSE;
            }
            g = i2 - 1;
            List<Integer> list = r1Var.e;
            ug0.e(num, "it");
            list.add(num);
        }
        return Boolean.TRUE;
    }

    public static final Boolean m(r1 r1Var, Integer num) {
        ug0.f(r1Var, "this$0");
        return Boolean.valueOf(r1Var.e.contains(num));
    }

    public static final void n(r1 r1Var, Boolean bool) {
        ug0.f(r1Var, "this$0");
        if (bool.booleanValue()) {
            return;
        }
        for (Number number : r1Var.e) {
            int intValue = number.intValue();
            r1Var.d.put(Integer.valueOf(intValue), null);
            r1Var.t(intValue);
        }
        r1Var.e.clear();
    }

    public static final void s(r1 r1Var, Integer num) {
        ug0.f(r1Var, "this$0");
        RewardedAd rewardedAd = r1Var.d.get(num);
        if (rewardedAd != null) {
            rewardedAd.show(MainActivity.r0(), new p1(r1Var));
        } else {
            r1Var.r(R.string.reward_ad_still_loading);
        }
    }

    public final void q() {
        this.d.put(Integer.valueOf((int) R.id.chkHideAppLogo), null);
    }

    public final void r(int i2) {
        Context b2 = dx0.b();
        if (b2 == null) {
            return;
        }
        lc.b(b2, i2).f(true);
    }

    public final void t(int i2) {
        a aVar = f;
        h = true;
        Context context = this.a;
        RewardedAd.load(context, aVar.c(i2, context), a1.a.b(), new b(i2));
    }

    public final void u(RewardItem rewardItem) {
        int i2 = i;
        if (i2 <= 0) {
            g++;
            return;
        }
        this.e.add(Integer.valueOf(i2));
        oy0.d.a(Integer.valueOf(i), Boolean.FALSE);
    }

    public final void v(LoadAdError loadAdError) {
        ug0.f(loadAdError, "loadAdError");
        h = false;
        int code = loadAdError.getCode();
        String str = code != 0 ? code != 1 ? code != 2 ? code != 3 ? "Unknown error" : "No Fill" : "Network Error" : "Invalid Request" : "Internal Error";
        StringBuilder sb = new StringBuilder();
        sb.append("onRewardedVideoAdFailedToLoad ");
        sb.append(str);
        sb.append(' ');
        sb.append(loadAdError);
    }
}
