package androidx.media;

import com.daaw.is1;
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(is1 is1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1794a = is1Var.m19454p(audioAttributesImplBase.f1794a, 1);
        audioAttributesImplBase.f1795b = is1Var.m19454p(audioAttributesImplBase.f1795b, 2);
        audioAttributesImplBase.f1796c = is1Var.m19454p(audioAttributesImplBase.f1796c, 3);
        audioAttributesImplBase.f1797d = is1Var.m19454p(audioAttributesImplBase.f1797d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, is1 is1Var) {
        is1Var.m19449x(false, false);
        is1Var.m19469F(audioAttributesImplBase.f1794a, 1);
        is1Var.m19469F(audioAttributesImplBase.f1795b, 2);
        is1Var.m19469F(audioAttributesImplBase.f1796c, 3);
        is1Var.m19469F(audioAttributesImplBase.f1797d, 4);
    }
}
