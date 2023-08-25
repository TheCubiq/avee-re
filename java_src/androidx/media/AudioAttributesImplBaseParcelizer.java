package androidx.media;

import com.daaw.is1;
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(is1 is1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = is1Var.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = is1Var.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = is1Var.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = is1Var.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, is1 is1Var) {
        is1Var.x(false, false);
        is1Var.F(audioAttributesImplBase.a, 1);
        is1Var.F(audioAttributesImplBase.b, 2);
        is1Var.F(audioAttributesImplBase.c, 3);
        is1Var.F(audioAttributesImplBase.d, 4);
    }
}
