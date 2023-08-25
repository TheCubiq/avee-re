package com.daaw;

import com.daaw.avee.R;
/* loaded from: classes.dex */
public class wn0 {
    public static final String[] a = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "PeakBarIndex", "BeatTriggerAnim"};
    public static final String[] b = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeMore", "BeatCamShakeLess", "ConstantShakeMore", "ConstantShake"};
    public static final String[] c = {"Nothing", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "BeatTriggerAnim"};
    public static final a[] d = {new a("IsPlaying", "", ""), new a("Constant", "X", "Y"), new a("Nothing", "X", "Y"), new a("Beat", "X Amount", "Y Amount"), new a("TotalTime", "X Speed", "Y Speed"), new a("TotalTimeBackward", "X Speed", "Y Speed"), new a("TotalTimeWhenPlaying", "X Speed", "Y Speed"), new a("TotalTimeAndBeat", "Speed", "Beat Amount", true), new a("TrackPosition", "Amount", "Amount"), new a("BeatRandomShake", "Amount", "Speed", true), new a("BeatCamShakeMore", "Amount", "Speed", true), new a("BeatCamShakeLess", "Amount", "Speed", true), new a("BeatCamShakeRotMore", "Amount", "Speed", true), new a("BeatCamShakeRotLess", "Amount", "Speed", true), new a("ConstantShake", "Amount", "Speed", true), new a("ConstantShake", "Amount", "Speed", true), new a("ConstantShakeRotMore", "Amount", "Speed", true), new a("ConstantShakeRotLess", "Amount", "Speed", true), new a("PeakBarIndex", "Amount", "Smoothness", true), new a("BeatTriggerAnim", "Threshold", "Speed", true)};

    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public boolean d;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = false;
        }

        public a(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c2;
        str.hashCode();
        switch (str.hashCode()) {
            case -1970646622:
                if (str.equals("ConstantShake")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1274453993:
                if (str.equals("ConstantShakeMore")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1137728652:
                if (str.equals("TrackPosition")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1037027930:
                if (str.equals("BeatCamShakeLess")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1036988574:
                if (str.equals("BeatCamShakeMore")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -831910124:
                if (str.equals("TotalTimeBackward")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -503167036:
                if (str.equals("Constant")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -269505853:
                if (str.equals("TotalTimeWhenPlaying")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 2066390:
                if (str.equals("Beat")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 395745294:
                if (str.equals("ConstantShakeRotLess")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 395784650:
                if (str.equals("ConstantShakeRotMore")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 916906211:
                if (str.equals("BeatCamShakeRotLess")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 916945567:
                if (str.equals("BeatCamShakeRotMore")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 930625412:
                if (str.equals("IsPlaying")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 1211574942:
                if (str.equals("PeakBarIndex")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 1258639580:
                if (str.equals("TotalTimeAndBeat")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 1426685969:
                if (str.equals("TotalTime")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 1547631181:
                if (str.equals("BeatRandomShake")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 1577119283:
                if (str.equals("BeatTriggerAnim")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
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

    public static String b(String str) {
        a e = e(str);
        if (e != null) {
            return e.b;
        }
        return null;
    }

    public static String c(String str) {
        a e = e(str);
        if (e != null) {
            return e.c;
        }
        return null;
    }

    public static boolean d(String str) {
        a e = e(str);
        if (e != null) {
            return e.d;
        }
        return false;
    }

    public static a e(String str) {
        int i = 0;
        while (true) {
            a[] aVarArr = d;
            if (i >= aVarArr.length) {
                return null;
            }
            if (aVarArr[i].a.equals(str)) {
                return aVarArr[i];
            }
            i++;
        }
    }
}
