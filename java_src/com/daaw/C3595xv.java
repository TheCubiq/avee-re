package com.daaw;
/* renamed from: com.daaw.xv */
/* loaded from: classes.dex */
public class C3595xv {

    /* renamed from: a */
    public static final String[] f32970a = {"Root", "AppLogo", "Text", "Bars", "Particles", "Image", "AudioProvider", "BlurEffect", "RgbSplitEffect", "MotionBlurEffect", "MirrorEffect"};

    /* renamed from: b */
    public static final String[] f32971b = {"Composition", "Text", "Bars", "Particles", "Image", "AudioProvider", "BlurEffect", "RgbSplitEffect", "MotionBlurEffect", "MirrorEffect"};

    /* renamed from: a */
    public static AbstractC3118tv m4496a(String str, String str2, AbstractC3118tv abstractC3118tv) {
        if (m4495b(abstractC3118tv).equals(str)) {
            return abstractC3118tv;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2120941625:
                if (str.equals("AudioProvider")) {
                    c = 0;
                    break;
                }
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c = 1;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 2;
                    break;
                }
                break;
            case 2603341:
                if (str.equals("Text")) {
                    c = 3;
                    break;
                }
                break;
            case 69447262:
                if (str.equals("RgbSplitEffect")) {
                    c = 4;
                    break;
                }
                break;
            case 70760763:
                if (str.equals("Image")) {
                    c = 5;
                    break;
                }
                break;
            case 197757176:
                if (str.equals("BlurEffect")) {
                    c = 6;
                    break;
                }
                break;
            case 203653773:
                if (str.equals("Particles")) {
                    c = 7;
                    break;
                }
                break;
            case 870470476:
                if (str.equals("AppLogo")) {
                    c = '\b';
                    break;
                }
                break;
            case 1176394320:
                if (str.equals("MirrorEffect")) {
                    c = '\t';
                    break;
                }
                break;
            case 1382341057:
                if (str.equals("StatText")) {
                    c = '\n';
                    break;
                }
                break;
            case 1465180494:
                if (str.equals("MotionBlurEffect")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C1662i7();
            case 1:
                return new na1();
            case 2:
                return null;
            case 3:
                return new ok1();
            case 4:
                return new v51();
            case 5:
                return new ze0();
            case 6:
                return new C1933kc();
            case 7:
                return new yv0();
            case '\b':
                return new pl0();
            case '\t':
                return new iq0();
            case '\n':
                return null;
            case 11:
                return new pq0();
            default:
                lz1.m16363c("unknown typeName: " + str);
                return abstractC3118tv;
        }
    }

    /* renamed from: b */
    public static String m4495b(AbstractC3118tv abstractC3118tv) {
        if (abstractC3118tv == null) {
            return "None";
        }
        if (abstractC3118tv instanceof f61) {
            return "Root";
        }
        if (abstractC3118tv instanceof pl0) {
            return "AppLogo";
        }
        if (abstractC3118tv instanceof C1662i7) {
            return "AudioProvider";
        }
        if (abstractC3118tv instanceof ok1) {
            return "Text";
        }
        if (abstractC3118tv instanceof na1) {
            return "Bars";
        }
        if (abstractC3118tv instanceof yv0) {
            return "Particles";
        }
        if (abstractC3118tv instanceof ze0) {
            return "Image";
        }
        if (abstractC3118tv instanceof v51) {
            return "RgbSplitEffect";
        }
        if (abstractC3118tv instanceof pq0) {
            return "MotionBlurEffect";
        }
        if (abstractC3118tv instanceof iq0) {
            return "MirrorEffect";
        }
        lz1.m16363c("unknown instance type");
        return "unk";
    }
}
