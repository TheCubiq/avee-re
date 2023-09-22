package com.daaw.avee.comp.Visualizer.Elements;

import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;

import java.util.*;

// todo

public class ElementsFactory {
    private static final String typeNameNone = "None";
    private static final Map<String, Class<? extends Element>> elementTypes = new LinkedHashMap<>();

    static {
        elementTypes.put(typeNameNone, null);
        elementTypes.put("Root", RootElement.class);
        elementTypes.put("Composition", Composition.class);
        elementTypes.put("Text", TextElement.class);
        elementTypes.put("Bars", SegmentElement.class);
        elementTypes.put("Particles", ParticlesElement.class);
        elementTypes.put("Image", ImageElement.class);
        elementTypes.put("AudioProvider", AudioDataProviderElement.class);
        elementTypes.put("BlurEffect", BlurStackEffectElement.class);
        elementTypes.put("RgbSplitEffect", RgbSplitEffectElement.class);
        elementTypes.put("MotionBlurEffect", MotionBlurEffectElement.class);
        elementTypes.put("MirrorEffect", MirrorEffectElement.class);
        elementTypes.put("AppLogo", LogoMark2.class);
        elementTypes.put("StatText", FpsTextElement.class);
        elementTypes.put("DummyElement", DummyElement.class);
        elementTypes.put("ColorCorrection", ColorCorrectionElement.class);
    }

    public static Element create(String typeName, String str2, Element element) {
    

        Class<? extends Element> elementType = elementTypes.get(typeName);
        if (elementType == null) {
            tlog.d("Unknown typeName: " + typeName);
        }
        if (!elementType.isInstance(element)) {
            try {
                return (Element) elementType.getDeclaredConstructor().newInstance(new Object[0]);
            } catch (Exception e) {
                tlog.d("Failed to create element for typeName: " + typeName);
            }
        }
        return element;
    }

    public static String getTypeName(Element element) {
        if (element == null) {
            return typeNameNone;
        }
        for (Map.Entry<String, Class<? extends Element>> entry : elementTypes.entrySet()) {
            if (entry.getValue() != null && entry.getValue().isInstance(element)) {
                return entry.getKey();
            }
        }
        tlog.w("Unknown instance type");
        return "unk";
    }

    public static Set<String> getAddableTypeNames() {
        Set<String> addableTypeNames = new LinkedHashSet<>();
        for (String typeName : elementTypes.keySet()) {
            if (!typeName.equals(typeNameNone) && isTypeAddable(typeName)) {
                addableTypeNames.add(typeName);
            }
        }
        return addableTypeNames;
    }

    private static boolean isTypeAddable(String typeName) {
        String[] notAllowedTypes = {"Root"};
        for (String notAllowedType : notAllowedTypes) {
            if (typeName.equals(notAllowedType)) {
                return false;
            }
        }
        return true;
    }
}