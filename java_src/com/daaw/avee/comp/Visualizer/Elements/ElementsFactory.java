package com.daaw.avee.comp.Visualizer.Elements;

import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
/* loaded from: classes.dex */
public class ElementsFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNames = {RootElement.typeName, LogoMark2.typeName, TextElement.typeName, "Bars", ParticlesElement.typeName, ImageElement.typeName, AudioDataProviderElement.typeName, "BlurEffect", RgbSplitEffectElement.typeName, MotionBlurEffectElement.typeName, MirrorEffectElement.typeName};
    public static final String[] typeNamesAddable = {Composition.typeName, TextElement.typeName, "Bars", ParticlesElement.typeName, ImageElement.typeName, AudioDataProviderElement.typeName, "BlurEffect", RgbSplitEffectElement.typeName, MotionBlurEffectElement.typeName, MirrorEffectElement.typeName};

    public static Element create(String str, String str2, Element element) {
        if (getTypeName(element).equals(str)) {
            return element;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2120941625:
                if (str.equals(AudioDataProviderElement.typeName)) {
                    c = 3;
                    break;
                }
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c = 5;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 0;
                    break;
                }
                break;
            case 2603341:
                if (str.equals(TextElement.typeName)) {
                    c = 4;
                    break;
                }
                break;
            case 69447262:
                if (str.equals(RgbSplitEffectElement.typeName)) {
                    c = '\t';
                    break;
                }
                break;
            case 70760763:
                if (str.equals(ImageElement.typeName)) {
                    c = 7;
                    break;
                }
                break;
            case 197757176:
                if (str.equals("BlurEffect")) {
                    c = '\b';
                    break;
                }
                break;
            case 203653773:
                if (str.equals(ParticlesElement.typeName)) {
                    c = 6;
                    break;
                }
                break;
            case 870470476:
                if (str.equals(LogoMark2.typeName)) {
                    c = 2;
                    break;
                }
                break;
            case 1176394320:
                if (str.equals(MirrorEffectElement.typeName)) {
                    c = 11;
                    break;
                }
                break;
            case 1382341057:
                if (str.equals(FpsTextElement.typeName)) {
                    c = 1;
                    break;
                }
                break;
            case 1465180494:
                if (str.equals(MotionBlurEffectElement.typeName)) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return null;
            case 2:
                return new LogoMark2();
            case 3:
                return new AudioDataProviderElement();
            case 4:
                return new TextElement();
            case 5:
                return new SegmentElement();
            case 6:
                return new ParticlesElement();
            case 7:
                return new ImageElement();
            case '\b':
                return new BlurStackEffectElement();
            case '\t':
                return new RgbSplitEffectElement();
            case '\n':
                return new MotionBlurEffectElement();
            case 11:
                return new MirrorEffectElement();
            default:
                tlog.w("unknown typeName: " + str);
                return element;
        }
    }

    public static String getTypeName(Element element) {
        if (element == null) {
            return "None";
        }
        if (element instanceof RootElement) {
            return RootElement.typeName;
        }
        if (element instanceof FpsTextElement) {
            return FpsTextElement.typeName;
        }
        if (element instanceof LogoMark2) {
            return LogoMark2.typeName;
        }
        if (element instanceof AudioDataProviderElement) {
            return AudioDataProviderElement.typeName;
        }
        if (element instanceof TextElement) {
            return TextElement.typeName;
        }
        if (element instanceof SegmentElement) {
            return "Bars";
        }
        if (element instanceof ParticlesElement) {
            return ParticlesElement.typeName;
        }
        if (element instanceof BlurEffectElement) {
            return "BlurEffect";
        }
        if (element instanceof ImageElement) {
            return ImageElement.typeName;
        }
        if (element instanceof RgbSplitEffectElement) {
            return RgbSplitEffectElement.typeName;
        }
        if (element instanceof MotionBlurEffectElement) {
            return MotionBlurEffectElement.typeName;
        }
        if (element instanceof MirrorEffectElement) {
            return MirrorEffectElement.typeName;
        }
        tlog.w("unknown instance type");
        return "unk";
    }
}
