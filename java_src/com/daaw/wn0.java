package com.daaw;

import com.daaw.avee.R;
/* loaded from: classes.dex */
public class wn0 {

    /* renamed from: a */
    public static final String[] f31382a = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "PeakBarIndex", "BeatTriggerAnim"};

    /* renamed from: b */
    public static final String[] f31383b = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeMore", "BeatCamShakeLess", "ConstantShakeMore", "ConstantShake"};

    /* renamed from: c */
    public static final String[] f31384c = {"Nothing", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "BeatTriggerAnim"};

    /* renamed from: d */
    public static final C3455a[] f31385d = {new C3455a("IsPlaying", "", ""), new C3455a("Constant", "X", "Y"), new C3455a("Nothing", "X", "Y"), new C3455a("Beat", "X Amount", "Y Amount"), new C3455a("TotalTime", "X Speed", "Y Speed"), new C3455a("TotalTimeBackward", "X Speed", "Y Speed"), new C3455a("TotalTimeWhenPlaying", "X Speed", "Y Speed"), new C3455a("TotalTimeAndBeat", "Speed", "Beat Amount", true), new C3455a("TrackPosition", "Amount", "Amount"), new C3455a("BeatRandomShake", "Amount", "Speed", true), new C3455a("BeatCamShakeMore", "Amount", "Speed", true), new C3455a("BeatCamShakeLess", "Amount", "Speed", true), new C3455a("BeatCamShakeRotMore", "Amount", "Speed", true), new C3455a("BeatCamShakeRotLess", "Amount", "Speed", true), new C3455a("ConstantShake", "Amount", "Speed", true), new C3455a("ConstantShake", "Amount", "Speed", true), new C3455a("ConstantShakeRotMore", "Amount", "Speed", true), new C3455a("ConstantShakeRotLess", "Amount", "Speed", true), new C3455a("PeakBarIndex", "Amount", "Smoothness", true), new C3455a("BeatTriggerAnim", "Threshold", "Speed", true)};

    /* renamed from: com.daaw.wn0$a */
    /* loaded from: classes.dex */
    public static class C3455a {

        /* renamed from: a */
        public final String f31386a;

        /* renamed from: b */
        public final String f31387b;

        /* renamed from: c */
        public final String f31388c;

        /* renamed from: d */
        public boolean f31389d;

        public C3455a(String str, String str2, String str3) {
            this.f31386a = str;
            this.f31387b = str2;
            this.f31388c = str3;
            this.f31389d = false;
        }

        public C3455a(String str, String str2, String str3, boolean z) {
            this.f31386a = str;
            this.f31387b = str2;
            this.f31388c = str3;
            this.f31389d = z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m5945a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1970646622:
                if (str.equals("ConstantShake")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1274453993:
                if (str.equals("ConstantShakeMore")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1137728652:
                if (str.equals("TrackPosition")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1037027930:
                if (str.equals("BeatCamShakeLess")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1036988574:
                if (str.equals("BeatCamShakeMore")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -831910124:
                if (str.equals("TotalTimeBackward")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -503167036:
                if (str.equals("Constant")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -269505853:
                if (str.equals("TotalTimeWhenPlaying")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2066390:
                if (str.equals("Beat")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 395745294:
                if (str.equals("ConstantShakeRotLess")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 395784650:
                if (str.equals("ConstantShakeRotMore")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 916906211:
                if (str.equals("BeatCamShakeRotLess")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 916945567:
                if (str.equals("BeatCamShakeRotMore")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 930625412:
                if (str.equals("IsPlaying")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1211574942:
                if (str.equals("PeakBarIndex")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1258639580:
                if (str.equals("TotalTimeAndBeat")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1426685969:
                if (str.equals("TotalTime")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1547631181:
                if (str.equals("BeatRandomShake")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1577119283:
                if (str.equals("BeatTriggerAnim")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return R.string.constant_cam_shake_less;
            case 1:
                return R.string.constant_cam_shake_more;
            case 2:
                return R.string.track_position;
            case 3:
                return R.string.beat_cam_shake_less;
            case 4:
                return R.string.beat_cam_shake_more;
            case 5:
                return R.string.total_time_backward;
            case 6:
                return R.string.constant;
            case 7:
                return R.string.total_time_when_playing;
            case '\b':
                return R.string.beat;
            case '\t':
                return R.string.constant_cam_shake_rot_less;
            case '\n':
                return R.string.constant_cam_shake_rot_more;
            case 11:
                return R.string.beat_cam_shake_rot_less;
            case '\f':
                return R.string.beat_cam_shake_rot_more;
            case '\r':
                return R.string.is_playing;
            case 14:
                return R.string.peak_bar_index;
            case 15:
                return R.string.total_time_and_beat;
            case 16:
                return R.string.total_time;
            case 17:
                return R.string.beat_random_shake;
            case 18:
                return R.string.beat_trigger_anim;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static String m5944b(String str) {
        C3455a m5941e = m5941e(str);
        if (m5941e != null) {
            return m5941e.f31387b;
        }
        return null;
    }

    /* renamed from: c */
    public static String m5943c(String str) {
        C3455a m5941e = m5941e(str);
        if (m5941e != null) {
            return m5941e.f31388c;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m5942d(String str) {
        C3455a m5941e = m5941e(str);
        if (m5941e != null) {
            return m5941e.f31389d;
        }
        return false;
    }

    /* renamed from: e */
    public static C3455a m5941e(String str) {
        int i = 0;
        while (true) {
            C3455a[] c3455aArr = f31385d;
            if (i >= c3455aArr.length) {
                return null;
            }
            if (c3455aArr[i].f31386a.equals(str)) {
                return c3455aArr[i];
            }
            i++;
        }
    }
}
