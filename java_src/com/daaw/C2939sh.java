package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.daaw.sh */
/* loaded from: classes.dex */
public final class C2939sh {

    /* renamed from: a */
    public final Shader f26245a;

    /* renamed from: b */
    public final ColorStateList f26246b;

    /* renamed from: c */
    public int f26247c;

    public C2939sh(Shader shader, ColorStateList colorStateList, int i) {
        this.f26245a = shader;
        this.f26246b = colorStateList;
        this.f26247c = i;
    }

    /* renamed from: a */
    public static C2939sh m10355a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m10352d(e80.m23669b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m10353c(C3706yg.m3771b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static C2939sh m10354b(int i) {
        return new C2939sh(null, null, i);
    }

    /* renamed from: c */
    public static C2939sh m10353c(ColorStateList colorStateList) {
        return new C2939sh(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C2939sh m10352d(Shader shader) {
        return new C2939sh(shader, null, 0);
    }

    /* renamed from: g */
    public static C2939sh m10349g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m10355a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public int m10351e() {
        return this.f26247c;
    }

    /* renamed from: f */
    public Shader m10350f() {
        return this.f26245a;
    }

    /* renamed from: h */
    public boolean m10348h() {
        return this.f26245a != null;
    }

    /* renamed from: i */
    public boolean m10347i() {
        ColorStateList colorStateList;
        return this.f26245a == null && (colorStateList = this.f26246b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m10346j(int[] iArr) {
        if (m10347i()) {
            ColorStateList colorStateList = this.f26246b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f26247c) {
                this.f26247c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m10345k(int i) {
        this.f26247c = i;
    }

    /* renamed from: l */
    public boolean m10344l() {
        return m10348h() || this.f26247c != 0;
    }
}
