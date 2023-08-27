package com.larvalabs.svgandroid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes2.dex */
public class SVGParser {
    private static boolean DISALLOW_DOCTYPE_DECL = true;
    static final String TAG = "SVGAndroid";
    private static final Pattern TRANSFORM_SEP = Pattern.compile("[\\s,]*");
    private static final RectF arcRectf = new RectF();
    private static final Matrix arcMatrix = new Matrix();
    private static final Matrix arcMatrix2 = new Matrix();

    public static Path parsePath(String str) {
        return doPath(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SVG parse(InputSource inputSource, SVGHandler sVGHandler) throws SVGParseException {
        try {
            Picture picture = new Picture();
            sVGHandler.setPicture(picture);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.setFeature("http://xml.org/sax/features/validation", false);
            if (DISALLOW_DOCTYPE_DECL) {
                try {
                    xMLReader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (SAXNotRecognizedException unused) {
                    DISALLOW_DOCTYPE_DECL = false;
                }
            }
            xMLReader.parse(inputSource);
            SVG svg = new SVG(picture, sVGHandler.bounds);
            if (!Float.isInfinite(sVGHandler.limits.top)) {
                svg.setLimits(sVGHandler.limits);
            }
            return svg;
        } catch (Exception e) {
            Log.e(TAG, "Failed to parse SVG.", e);
            throw new SVGParseException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r7 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (!z) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                        String substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                            if (charAt == '-') {
                                i = i2;
                            } else {
                                i = i2 + 1;
                                z = true;
                            }
                        } else {
                            i++;
                        }
                        z2 = false;
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new NumberParse(arrayList, i2);
                    case '-':
                        break;
                    case 'e':
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
            } else {
                z = false;
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
            i = str.length();
        }
        return new NumberParse(arrayList, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Matrix parseTransform(String str) {
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            parseTransformItem(str, matrix);
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                break;
            }
            str = TRANSFORM_SEP.matcher(str.substring(i)).replaceFirst("");
        }
        return matrix;
    }

    private static Matrix parseTransformItem(String str, Matrix matrix) {
        float f;
        if (str.startsWith("matrix(")) {
            NumberParse parseNumbers = parseNumbers(str.substring(7));
            if (parseNumbers.numbers.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{((Float) parseNumbers.numbers.get(0)).floatValue(), ((Float) parseNumbers.numbers.get(2)).floatValue(), ((Float) parseNumbers.numbers.get(4)).floatValue(), ((Float) parseNumbers.numbers.get(1)).floatValue(), ((Float) parseNumbers.numbers.get(3)).floatValue(), ((Float) parseNumbers.numbers.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            }
        } else if (str.startsWith("translate(")) {
            NumberParse parseNumbers2 = parseNumbers(str.substring(10));
            if (parseNumbers2.numbers.size() > 0) {
                matrix.preTranslate(((Float) parseNumbers2.numbers.get(0)).floatValue(), parseNumbers2.numbers.size() > 1 ? ((Float) parseNumbers2.numbers.get(1)).floatValue() : 0.0f);
            }
        } else if (str.startsWith("scale(")) {
            NumberParse parseNumbers3 = parseNumbers(str.substring(6));
            if (parseNumbers3.numbers.size() > 0) {
                float floatValue = ((Float) parseNumbers3.numbers.get(0)).floatValue();
                matrix.preScale(floatValue, parseNumbers3.numbers.size() > 1 ? ((Float) parseNumbers3.numbers.get(1)).floatValue() : floatValue);
            }
        } else if (str.startsWith("skewX(")) {
            NumberParse parseNumbers4 = parseNumbers(str.substring(6));
            if (parseNumbers4.numbers.size() > 0) {
                matrix.preSkew((float) Math.tan(((Float) parseNumbers4.numbers.get(0)).floatValue()), 0.0f);
            }
        } else if (str.startsWith("skewY(")) {
            NumberParse parseNumbers5 = parseNumbers(str.substring(6));
            if (parseNumbers5.numbers.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(((Float) parseNumbers5.numbers.get(0)).floatValue()));
            }
        } else if (str.startsWith("rotate(")) {
            NumberParse parseNumbers6 = parseNumbers(str.substring(7));
            if (parseNumbers6.numbers.size() > 0) {
                float floatValue2 = ((Float) parseNumbers6.numbers.get(0)).floatValue();
                if (parseNumbers6.numbers.size() > 2) {
                    r4 = ((Float) parseNumbers6.numbers.get(1)).floatValue();
                    f = ((Float) parseNumbers6.numbers.get(2)).floatValue();
                } else {
                    f = 0.0f;
                }
                matrix.preTranslate(-r4, -f);
                matrix.preRotate(floatValue2);
                matrix.preTranslate(r4, f);
            }
        } else {
            Log.w(TAG, "Invalid transform (" + str + ")");
        }
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if ("lhvcsqta".indexOf(java.lang.Character.toLowerCase(r4)) >= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path doPath(String str) {
        char c;
        boolean z;
        float nextFloat;
        float nextFloat2;
        int length = str.length();
        ParserHelper parserHelper = new ParserHelper(str, 0);
        parserHelper.skipWhitespace();
        Path path = new Path();
        float f = 0.0f;
        char c2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parserHelper.pos < length) {
            char charAt = str.charAt(parserHelper.pos);
            if (charAt != '+' && charAt != '-') {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        parserHelper.advance();
                        c2 = charAt;
                        c = c2;
                        break;
                }
                z = true;
                switch (c2) {
                    case 'A':
                    case 'a':
                        float nextFloat3 = parserHelper.nextFloat();
                        float nextFloat4 = parserHelper.nextFloat();
                        float nextFloat5 = parserHelper.nextFloat();
                        int nextFlag = parserHelper.nextFlag();
                        int nextFlag2 = parserHelper.nextFlag();
                        float nextFloat6 = parserHelper.nextFloat();
                        float nextFloat7 = parserHelper.nextFloat();
                        if (c2 == 'a') {
                            nextFloat6 += f2;
                            nextFloat7 += f3;
                        }
                        float f8 = nextFloat6;
                        float f9 = nextFloat7;
                        drawArc(path, f2, f3, f8, f9, nextFloat3, nextFloat4, nextFloat5, nextFlag, nextFlag2);
                        f5 = f5;
                        f2 = f8;
                        f3 = f9;
                        f4 = f4;
                        z = false;
                        break;
                    case 'C':
                    case 'c':
                        float nextFloat8 = parserHelper.nextFloat();
                        float nextFloat9 = parserHelper.nextFloat();
                        float nextFloat10 = parserHelper.nextFloat();
                        float nextFloat11 = parserHelper.nextFloat();
                        float nextFloat12 = parserHelper.nextFloat();
                        float nextFloat13 = parserHelper.nextFloat();
                        if (c2 == 'c') {
                            nextFloat8 += f2;
                            nextFloat10 += f2;
                            nextFloat12 += f2;
                            nextFloat9 += f3;
                            nextFloat11 += f3;
                            nextFloat13 += f3;
                        }
                        float f10 = nextFloat10;
                        float f11 = nextFloat11;
                        path.cubicTo(nextFloat8, nextFloat9, f10, f11, nextFloat12, nextFloat13);
                        f2 = nextFloat12;
                        f3 = nextFloat13;
                        f7 = f11;
                        f6 = f10;
                        break;
                    case 'H':
                    case 'h':
                        float nextFloat14 = parserHelper.nextFloat();
                        if (c2 == 'h') {
                            path.rLineTo(nextFloat14, f);
                            f2 += nextFloat14;
                        } else {
                            path.lineTo(nextFloat14, f3);
                            f2 = nextFloat14;
                        }
                        z = false;
                        break;
                    case 'L':
                    case 'T':
                    case 'l':
                    case 't':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c2 == 'l') {
                            path.rLineTo(nextFloat, nextFloat2);
                            f2 += nextFloat;
                            f3 += nextFloat2;
                            z = false;
                            break;
                        } else {
                            path.lineTo(nextFloat, nextFloat2);
                            f2 = nextFloat;
                            f3 = nextFloat2;
                            z = false;
                        }
                    case 'M':
                    case 'm':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c2 == 'm') {
                            f5 += nextFloat;
                            f4 += nextFloat2;
                            path.rMoveTo(nextFloat, nextFloat2);
                            f2 += nextFloat;
                            f3 += nextFloat2;
                            z = false;
                            break;
                        } else {
                            path.moveTo(nextFloat, nextFloat2);
                            f2 = nextFloat;
                            f5 = f2;
                            f3 = nextFloat2;
                            f4 = f3;
                            z = false;
                        }
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        float nextFloat15 = parserHelper.nextFloat();
                        float nextFloat16 = parserHelper.nextFloat();
                        float nextFloat17 = parserHelper.nextFloat();
                        float nextFloat18 = parserHelper.nextFloat();
                        if (Character.isLowerCase(c2)) {
                            nextFloat15 += f2;
                            nextFloat17 += f2;
                            nextFloat16 += f3;
                            nextFloat18 += f3;
                        }
                        float f12 = nextFloat15;
                        float f13 = nextFloat16;
                        float f14 = nextFloat17;
                        float f15 = nextFloat18;
                        path.cubicTo((f2 * 2.0f) - f6, (f3 * 2.0f) - f7, f12, f13, f14, f15);
                        f6 = f12;
                        f7 = f13;
                        f2 = f14;
                        f3 = f15;
                        break;
                    case 'V':
                    case 'v':
                        float nextFloat19 = parserHelper.nextFloat();
                        if (c2 == 'v') {
                            path.rLineTo(f, nextFloat19);
                            f3 += nextFloat19;
                        } else {
                            path.lineTo(f2, nextFloat19);
                            f3 = nextFloat19;
                        }
                        z = false;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f5, f4);
                        f3 = f4;
                        f7 = f3;
                        f2 = f5;
                        f6 = f2;
                        break;
                    default:
                        Log.w(TAG, "Invalid path command: " + c2);
                        parserHelper.advance();
                        z = false;
                        break;
                }
                if (z) {
                    f6 = f2;
                    f7 = f3;
                }
                parserHelper.skipWhitespace();
                c2 = c;
                f = 0.0f;
            }
            if (c2 == 'm' || c2 == 'M') {
                c = c2;
                c2 = (char) (c2 - 1);
                z = true;
                switch (c2) {
                    case 'A':
                    case 'a':
                        break;
                    case 'C':
                    case 'c':
                        break;
                    case 'H':
                    case 'h':
                        break;
                    case 'L':
                    case 'T':
                    case 'l':
                    case 't':
                        break;
                    case 'M':
                    case 'm':
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        break;
                    case 'V':
                    case 'v':
                        break;
                    case 'Z':
                    case 'z':
                        break;
                }
                if (z) {
                }
                parserHelper.skipWhitespace();
                c2 = c;
                f = 0.0f;
            }
        }
        return path;
    }

    private static float angle(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2(f, f2) - Math.atan2(f3, f4))) % 360.0f;
    }

    private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
        } else if (f3 == f && f4 == f2) {
        } else {
            float abs = Math.abs(f5);
            float abs2 = Math.abs(f6);
            double d = (3.1415927f * f7) / 180.0f;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f8 = (f - f3) / 2.0f;
            float f9 = (f2 - f4) / 2.0f;
            float f10 = (cos * f8) + (sin * f9);
            float f11 = ((-sin) * f8) + (f9 * cos);
            float f12 = f10 * f10;
            float f13 = f11 * f11;
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = ((f12 / f14) + (f13 / f15)) * 1.001f;
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt(f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f17 = f14 * f15;
            float f18 = f14 * f13;
            float f19 = f15 * f12;
            float sqrt2 = ((float) Math.sqrt(((f17 - f18) - f19) / (f18 + f19))) * (i == i2 ? -1 : 1);
            float f20 = ((sqrt2 * abs) * f11) / abs2;
            float f21 = (((-sqrt2) * abs2) * f10) / abs;
            float f22 = ((cos * f20) - (sin * f21)) + ((f + f3) / 2.0f);
            float f23 = (sin * f20) + (cos * f21) + ((f2 + f4) / 2.0f);
            float f24 = (f10 - f20) / abs;
            float f25 = (f11 - f21) / abs2;
            float angle = angle(1.0f, 0.0f, f24, f25);
            float angle2 = angle(f24, f25, ((-f10) - f20) / abs, ((-f11) - f21) / abs2);
            if (i2 == 0 && angle2 > 0.0f) {
                angle2 -= 360.0f;
            } else if (i2 != 0 && angle2 < 0.0f) {
                angle2 += 360.0f;
            }
            if (f7 % 360.0f == 0.0f) {
                arcRectf.set(f22 - abs, f23 - abs2, f22 + abs, f23 + abs2);
                path.arcTo(arcRectf, angle, angle2);
                return;
            }
            arcRectf.set(-abs, -abs2, abs, abs2);
            arcMatrix.reset();
            arcMatrix.postRotate(f7);
            arcMatrix.postTranslate(f22, f23);
            arcMatrix.invert(arcMatrix2);
            path.transform(arcMatrix2);
            path.arcTo(arcRectf, angle, angle2);
            path.transform(arcMatrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NumberParse getNumberParseAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return parseNumbers(attributes.getValue(i));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Float getFloatAttr(String str, Attributes attributes) {
        return getFloatAttr(str, attributes, (Float) null);
    }

    private static Float getFloatAttr(String str, Attributes attributes, Float f) {
        return parseFloatValue(getStringAttr(str, attributes), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getFloatAttr(String str, Attributes attributes, float f) {
        return parseFloatValue(getStringAttr(str, attributes), Float.valueOf(f)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Float parseFloatValue(String str, Float f) {
        if (str == null) {
            return f;
        }
        if (str.endsWith("px")) {
            str = str.substring(0, str.length() - 2);
        } else if (str.endsWith("%")) {
            return Float.valueOf(Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f);
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i) {
            this.numbers = arrayList;
            this.nextCmd = i;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i) {
            return this.numbers.get(i).floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Gradient {
        public boolean boundingBox;
        ArrayList<Integer> colors;
        String id;
        boolean isLinear;
        Matrix matrix;
        ArrayList<Float> positions;
        float radius;
        public Shader shader;
        public Shader.TileMode tilemode;
        float x;
        float x1;
        float x2;
        String xlink;
        float y;
        float y1;
        float y2;

        private Gradient() {
            this.positions = new ArrayList<>();
            this.colors = new ArrayList<>();
            this.matrix = null;
            this.shader = null;
            this.boundingBox = false;
        }

        public void inherit(Gradient gradient) {
            this.xlink = gradient.id;
            this.positions = gradient.positions;
            this.colors = gradient.colors;
            if (this.matrix == null) {
                this.matrix = gradient.matrix;
            } else if (gradient.matrix != null) {
                Matrix matrix = new Matrix(gradient.matrix);
                matrix.preConcat(this.matrix);
                this.matrix = matrix;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class StyleSet {
        HashMap<String, String> styleMap;

        private StyleSet(String str) {
            this.styleMap = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.styleMap.put(split[0], split[1]);
                }
            }
        }

        public String getStyle(String str) {
            return this.styleMap.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Properties {
        Attributes atts;
        StyleSet styles;

        private int hex3Tohex6(int i) {
            int i2 = i & 3840;
            int i3 = (i2 << 12) | (i2 << 8);
            int i4 = i & PsExtractor.VIDEO_STREAM_MASK;
            int i5 = i & 15;
            return i5 | i3 | (i4 << 4) | (i4 << 8) | (i5 << 4);
        }

        private Properties(Attributes attributes) {
            this.styles = null;
            this.atts = attributes;
            String stringAttr = SVGParser.getStringAttr(TtmlNode.TAG_STYLE, attributes);
            if (stringAttr != null) {
                this.styles = new StyleSet(stringAttr);
            }
        }

        public String getAttr(String str) {
            StyleSet styleSet = this.styles;
            String style = styleSet != null ? styleSet.getStyle(str) : null;
            return style == null ? SVGParser.getStringAttr(str, this.atts) : style;
        }

        public String getString(String str) {
            return getAttr(str);
        }

        private Integer rgb(int i, int i2, int i3) {
            return Integer.valueOf(((i & 255) << 16) | ((i2 & 255) << 8) | (i3 & 255));
        }

        private int parseNum(String str) throws NumberFormatException {
            if (str.endsWith("%")) {
                return Math.round((Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f) * 255.0f);
            }
            return Integer.parseInt(str);
        }

        public Integer getColor(String str) {
            if (str == null) {
                return null;
            }
            if (str.startsWith("#")) {
                try {
                    return Integer.valueOf(Color.parseColor(str));
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            } else if (str.startsWith("rgb(") && str.endsWith(")")) {
                String[] split = str.substring(4, str.length() - 1).split(",");
                try {
                    return rgb(parseNum(split[0]), parseNum(split[1]), parseNum(split[2]));
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused2) {
                    return null;
                }
            } else {
                return SVGColors.mapColour(str);
            }
        }

        public float getFloat(String str, float f) {
            String attr = getAttr(str);
            if (attr == null) {
                return f;
            }
            try {
                return Float.parseFloat(attr);
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        public Float getFloat(String str, Float f) {
            String attr = getAttr(str);
            if (attr == null) {
                return f;
            }
            try {
                return Float.valueOf(Float.parseFloat(attr));
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        public Float getFloat(String str) {
            return getFloat(str, (Float) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class LayerAttributes {
        public final float opacity;

        public LayerAttributes(float f) {
            this.opacity = f;
        }
    }

    /* loaded from: classes2.dex */
    static class SVGHandler extends DefaultHandler {
        private Canvas canvas;
        Integer canvasRestoreCount;
        boolean drawCharacters;
        Paint fillPaint;
        Matrix font_matrix;
        private Float limitsAdjustmentX;
        private Float limitsAdjustmentY;
        int newLineCount;
        private Picture picture;
        Paint strokePaint;
        Paint textPaint;
        Float textSize;
        Float textX;
        Float textY;
        final LinkedList<LayerAttributes> layerAttributeStack = new LinkedList<>();
        boolean strokeSet = false;
        final LinkedList<Paint> strokePaintStack = new LinkedList<>();
        final LinkedList<Boolean> strokeSetStack = new LinkedList<>();
        boolean fillSet = false;
        final LinkedList<Paint> fillPaintStack = new LinkedList<>();
        final LinkedList<Boolean> fillSetStack = new LinkedList<>();
        final RectF rect = new RectF();
        RectF bounds = null;
        final RectF limits = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        Integer searchColor = null;
        Integer replaceColor = null;
        Float opacityMultiplier = null;
        boolean whiteMode = false;
        final LinkedList<Boolean> transformStack = new LinkedList<>();
        final LinkedList<Matrix> matrixStack = new LinkedList<>();
        final HashMap<String, Gradient> gradientMap = new HashMap<>();
        Gradient gradient = null;
        private final Matrix gradMatrix = new Matrix();
        private boolean hidden = false;
        private int hiddenLevel = 0;
        private boolean boundsMode = false;
        private final RectF tmpLimitRect = new RectF();
        private String SVG_FILL = null;

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
        }

        public SVGHandler() {
            Paint paint = new Paint();
            this.strokePaint = paint;
            paint.setAntiAlias(true);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.fillPaint = paint2;
            paint2.setAntiAlias(true);
            this.fillPaint.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.textPaint = paint3;
            paint3.setAntiAlias(true);
            this.matrixStack.addFirst(new Matrix());
            this.layerAttributeStack.addFirst(new LayerAttributes(1.0f));
        }

        void setPicture(Picture picture) {
            this.picture = picture;
        }

        public void setColorSwap(Integer num, Integer num2, boolean z) {
            this.searchColor = num;
            this.replaceColor = num2;
            if (num2 != null && z) {
                this.opacityMultiplier = Float.valueOf(((num2.intValue() >> 24) & 255) / 255.0f);
            } else {
                this.opacityMultiplier = null;
            }
        }

        public void setWhiteMode(boolean z) {
            this.whiteMode = z;
        }

        private boolean doFill(Properties properties, RectF rectF) {
            String str;
            if ("none".equals(properties.getString("display"))) {
                return false;
            }
            if (this.whiteMode) {
                this.fillPaint.setShader(null);
                this.fillPaint.setColor(-1);
                return true;
            }
            String string = properties.getString("fill");
            if (string == null && (str = this.SVG_FILL) != null) {
                string = str;
            }
            if (string != null) {
                if (string.startsWith("url(#")) {
                    String substring = string.substring(5, string.length() - 1);
                    Gradient gradient = this.gradientMap.get(substring);
                    Shader shader = gradient != null ? gradient.shader : null;
                    if (shader != null) {
                        this.fillPaint.setShader(shader);
                        this.gradMatrix.set(gradient.matrix);
                        if (gradient.boundingBox && rectF != null) {
                            this.gradMatrix.preTranslate(rectF.left, rectF.top);
                            this.gradMatrix.preScale(rectF.width(), rectF.height());
                        }
                        shader.setLocalMatrix(this.gradMatrix);
                        return true;
                    }
                    Log.w(SVGParser.TAG, "Didn't find shader, using black: " + substring);
                    this.fillPaint.setShader(null);
                    doColor(properties, Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK), true, this.fillPaint);
                    return true;
                } else if (string.equalsIgnoreCase("none")) {
                    this.fillPaint.setShader(null);
                    this.fillPaint.setColor(0);
                    return true;
                } else {
                    this.fillPaint.setShader(null);
                    Integer color = properties.getColor(string);
                    if (color != null) {
                        doColor(properties, color, true, this.fillPaint);
                        return true;
                    }
                    Log.w(SVGParser.TAG, "Unrecognized fill color, using black: " + string);
                    doColor(properties, Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK), true, this.fillPaint);
                    return true;
                }
            } else if (this.fillSet) {
                return this.fillPaint.getColor() != 0;
            } else {
                this.fillPaint.setShader(null);
                this.fillPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
                return true;
            }
        }

        private boolean doStroke(Properties properties) {
            if (this.whiteMode || "none".equals(properties.getString("display"))) {
                return false;
            }
            Float f = properties.getFloat("stroke-width");
            if (f != null) {
                this.strokePaint.setStrokeWidth(f.floatValue());
            }
            String string = properties.getString("stroke-linecap");
            if ("round".equals(string)) {
                this.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(string)) {
                this.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(string)) {
                this.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            }
            String string2 = properties.getString("stroke-linejoin");
            if ("miter".equals(string2)) {
                this.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(string2)) {
                this.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(string2)) {
                this.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
            pathStyleHelper(properties.getString("stroke-dasharray"), properties.getString("stroke-dashoffset"));
            String attr = properties.getAttr("stroke");
            if (attr != null) {
                if (attr.equalsIgnoreCase("none")) {
                    this.strokePaint.setColor(0);
                    return false;
                }
                Integer color = properties.getColor(attr);
                if (color != null) {
                    doColor(properties, color, false, this.strokePaint);
                    return true;
                }
                Log.w(SVGParser.TAG, "Unrecognized stroke color, using none: " + attr);
                this.strokePaint.setColor(0);
                return false;
            } else if (this.strokeSet) {
                return this.strokePaint.getColor() != 0;
            } else {
                this.strokePaint.setColor(0);
                return false;
            }
        }

        private Gradient doGradient(boolean z, Attributes attributes) {
            Shader.TileMode tileMode;
            Gradient gradient = new Gradient();
            gradient.id = SVGParser.getStringAttr(TtmlNode.ATTR_ID, attributes);
            gradient.isLinear = z;
            if (z) {
                gradient.x1 = SVGParser.getFloatAttr("x1", attributes, 0.0f);
                gradient.x2 = SVGParser.getFloatAttr("x2", attributes, 1.0f);
                gradient.y1 = SVGParser.getFloatAttr("y1", attributes, 0.0f);
                gradient.y2 = SVGParser.getFloatAttr("y2", attributes, 0.0f);
            } else {
                gradient.x = SVGParser.getFloatAttr("cx", attributes, 0.0f);
                gradient.y = SVGParser.getFloatAttr("cy", attributes, 0.0f);
                gradient.radius = SVGParser.getFloatAttr("r", attributes, 0.0f);
            }
            String stringAttr = SVGParser.getStringAttr("gradientTransform", attributes);
            if (stringAttr != null) {
                gradient.matrix = SVGParser.parseTransform(stringAttr);
            }
            String stringAttr2 = SVGParser.getStringAttr("spreadMethod", attributes);
            if (stringAttr2 == null) {
                stringAttr2 = "pad";
            }
            if (stringAttr2.equals("reflect")) {
                tileMode = Shader.TileMode.MIRROR;
            } else {
                tileMode = stringAttr2.equals("repeat") ? Shader.TileMode.REPEAT : Shader.TileMode.CLAMP;
            }
            gradient.tilemode = tileMode;
            String stringAttr3 = SVGParser.getStringAttr("gradientUnits", attributes);
            if (stringAttr3 == null) {
                stringAttr3 = "objectBoundingBox";
            }
            gradient.boundingBox = !stringAttr3.equals("userSpaceOnUse");
            String stringAttr4 = SVGParser.getStringAttr("href", attributes);
            if (stringAttr4 != null) {
                if (stringAttr4.startsWith("#")) {
                    stringAttr4 = stringAttr4.substring(1);
                }
                gradient.xlink = stringAttr4;
            }
            return gradient;
        }

        private void finishGradients() {
            Gradient gradient;
            for (Gradient gradient2 : this.gradientMap.values()) {
                if (gradient2.xlink != null && (gradient = this.gradientMap.get(gradient2.xlink)) != null) {
                    gradient2.inherit(gradient);
                }
                int size = gradient2.colors.size();
                int[] iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = gradient2.colors.get(i).intValue();
                }
                int size2 = gradient2.positions.size();
                float[] fArr = new float[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    fArr[i2] = gradient2.positions.get(i2).floatValue();
                }
                if (size == 0) {
                    Log.d("BAD", "BAD gradient, id=" + gradient2.id);
                }
                if (gradient2.isLinear) {
                    gradient2.shader = new LinearGradient(gradient2.x1, gradient2.y1, gradient2.x2, gradient2.y2, iArr, fArr, gradient2.tilemode);
                } else {
                    gradient2.shader = new RadialGradient(gradient2.x, gradient2.y, gradient2.radius, iArr, fArr, gradient2.tilemode);
                }
            }
        }

        private void doColor(Properties properties, Integer num, boolean z, Paint paint) {
            int intValue = (num.intValue() & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK;
            Integer num2 = this.searchColor;
            if (num2 != null && num2.intValue() == intValue) {
                intValue = this.replaceColor.intValue();
            }
            paint.setShader(null);
            paint.setColor(intValue);
            Float f = properties.getFloat("opacity");
            if (f == null) {
                f = properties.getFloat(z ? "fill-opacity" : "stroke-opacity");
            }
            float floatValue = (f != null ? f.floatValue() : 1.0f) * currentLayerAttributes().opacity;
            Float f2 = this.opacityMultiplier;
            if (f2 != null) {
                floatValue *= f2.floatValue();
            }
            paint.setAlpha((int) (floatValue * 255.0f));
        }

        private void pathStyleHelper(String str, String str2) {
            if (str == null) {
                return;
            }
            if (str.equals("none")) {
                this.strokePaint.setPathEffect(null);
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ,");
            int countTokens = stringTokenizer.countTokens();
            if ((countTokens & 1) == 1) {
                countTokens *= 2;
            }
            float[] fArr = new float[countTokens];
            float f = 1.0f;
            int i = 0;
            float f2 = 0.0f;
            int i2 = 0;
            float f3 = 0.0f;
            while (stringTokenizer.hasMoreTokens()) {
                f = toFloat(stringTokenizer.nextToken(), f);
                fArr[i2] = f;
                f3 += f;
                i2++;
            }
            while (i2 < countTokens) {
                float f4 = fArr[i];
                fArr[i2] = f4;
                f3 += f4;
                i2++;
                i++;
            }
            if (str2 != null) {
                try {
                    f2 = Float.parseFloat(str2) % f3;
                } catch (NumberFormatException unused) {
                }
            }
            this.strokePaint.setPathEffect(new DashPathEffect(fArr, f2));
        }

        private static float toFloat(String str, float f) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                return f;
            }
        }

        private void doLimits2(float f, float f2) {
            if (f < this.limits.left) {
                this.limits.left = f;
            }
            if (f > this.limits.right) {
                this.limits.right = f;
            }
            if (f2 < this.limits.top) {
                this.limits.top = f2;
            }
            if (f2 > this.limits.bottom) {
                this.limits.bottom = f2;
            }
        }

        private void doLimits(RectF rectF, Paint paint) {
            this.matrixStack.getLast().mapRect(this.tmpLimitRect, rectF);
            float strokeWidth = paint == null ? 0.0f : paint.getStrokeWidth() / 2.0f;
            doLimits2(this.tmpLimitRect.left - strokeWidth, this.tmpLimitRect.top - strokeWidth);
            doLimits2(this.tmpLimitRect.right + strokeWidth, this.tmpLimitRect.bottom + strokeWidth);
        }

        private void doLimits(RectF rectF) {
            doLimits(rectF, null);
        }

        private void pushTransform(Attributes attributes) {
            String stringAttr = SVGParser.getStringAttr("transform", attributes);
            boolean z = stringAttr != null;
            this.transformStack.addLast(Boolean.valueOf(z));
            if (z) {
                Matrix parseTransform = SVGParser.parseTransform(stringAttr);
                this.canvas.save();
                this.canvas.concat(parseTransform);
                parseTransform.postConcat(this.matrixStack.getLast());
                this.matrixStack.addLast(parseTransform);
            }
        }

        private void popTransform() {
            if (this.transformStack.removeLast().booleanValue()) {
                this.canvas.restore();
                this.matrixStack.removeLast();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            Float floatAttr;
            Float f;
            this.strokePaint.setAlpha(255);
            this.fillPaint.setAlpha(255);
            this.textPaint.setAlpha(255);
            this.drawCharacters = false;
            boolean z = this.boundsMode;
            Float valueOf = Float.valueOf(0.0f);
            if (z) {
                if (str2.equals("rect")) {
                    Float floatAttr2 = SVGParser.getFloatAttr("x", attributes);
                    if (floatAttr2 == null) {
                        floatAttr2 = valueOf;
                    }
                    Float floatAttr3 = SVGParser.getFloatAttr("y", attributes);
                    if (floatAttr3 != null) {
                        valueOf = floatAttr3;
                    }
                    this.bounds = new RectF(floatAttr2.floatValue(), valueOf.floatValue(), floatAttr2.floatValue() + SVGParser.getFloatAttr("width", attributes).floatValue(), valueOf.floatValue() + SVGParser.getFloatAttr("height", attributes).floatValue());
                }
            } else if (str2.equals("svg")) {
                this.canvas = null;
                this.SVG_FILL = SVGParser.getStringAttr("fill", attributes);
                String stringAttr = SVGParser.getStringAttr("viewBox", attributes);
                if (stringAttr != null) {
                    String[] split = stringAttr.replace(',', ' ').split("\\s+");
                    if (split.length == 4) {
                        Float parseFloatValue = SVGParser.parseFloatValue(split[0], null);
                        Float parseFloatValue2 = SVGParser.parseFloatValue(split[1], null);
                        Float parseFloatValue3 = SVGParser.parseFloatValue(split[2], null);
                        Float parseFloatValue4 = SVGParser.parseFloatValue(split[3], null);
                        if (parseFloatValue != null && parseFloatValue3 != null && parseFloatValue2 != null && parseFloatValue4 != null) {
                            Float valueOf2 = Float.valueOf(parseFloatValue3.floatValue() + parseFloatValue.floatValue());
                            Float valueOf3 = Float.valueOf(parseFloatValue4.floatValue() + parseFloatValue2.floatValue());
                            float ceil = (float) Math.ceil(valueOf2.floatValue() - parseFloatValue.floatValue());
                            float ceil2 = (float) Math.ceil(valueOf3.floatValue() - parseFloatValue2.floatValue());
                            Canvas beginRecording = this.picture.beginRecording((int) ceil, (int) ceil2);
                            this.canvas = beginRecording;
                            this.canvasRestoreCount = Integer.valueOf(beginRecording.save());
                            this.canvas.clipRect(0.0f, 0.0f, ceil, ceil2);
                            this.limitsAdjustmentX = Float.valueOf(-parseFloatValue.floatValue());
                            this.limitsAdjustmentY = Float.valueOf(-parseFloatValue2.floatValue());
                            this.canvas.translate(this.limitsAdjustmentX.floatValue(), this.limitsAdjustmentY.floatValue());
                        }
                    }
                }
                if (this.canvas == null) {
                    this.canvas = this.picture.beginRecording((int) Math.ceil(SVGParser.getFloatAttr("width", attributes).floatValue()), (int) Math.ceil(SVGParser.getFloatAttr("height", attributes).floatValue()));
                    this.canvasRestoreCount = null;
                }
            } else if (!str2.equals("defs")) {
                if (str2.equals("linearGradient")) {
                    this.gradient = doGradient(true, attributes);
                } else if (str2.equals("radialGradient")) {
                    this.gradient = doGradient(false, attributes);
                } else if (str2.equals("stop")) {
                    if (this.gradient != null) {
                        Properties properties = new Properties(attributes);
                        Integer color = properties.getColor(properties.getAttr("stop-color"));
                        this.gradient.colors.add(Integer.valueOf(color != null ? (Math.round((properties.getFloat("stop-opacity", 1.0f) * currentLayerAttributes().opacity) * 255.0f) << 24) | color.intValue() : 0));
                        this.gradient.positions.add(Float.valueOf(properties.getFloat("offset", 0.0f)));
                    }
                } else if (str2.equals("g")) {
                    Properties properties2 = new Properties(attributes);
                    if ("bounds".equalsIgnoreCase(SVGParser.getStringAttr(TtmlNode.ATTR_ID, attributes))) {
                        this.boundsMode = true;
                    }
                    if (this.hidden) {
                        this.hiddenLevel++;
                    }
                    if (("none".equals(SVGParser.getStringAttr("display", attributes)) || "none".equals(properties2.getString("display"))) && !this.hidden) {
                        this.hidden = true;
                        this.hiddenLevel = 1;
                    }
                    this.layerAttributeStack.addLast(new LayerAttributes(currentLayerAttributes().opacity * properties2.getFloat("opacity", 1.0f)));
                    pushTransform(attributes);
                    this.fillPaintStack.addLast(new Paint(this.fillPaint));
                    this.strokePaintStack.addLast(new Paint(this.strokePaint));
                    this.fillSetStack.addLast(Boolean.valueOf(this.fillSet));
                    this.strokeSetStack.addLast(Boolean.valueOf(this.strokeSet));
                    doFill(properties2, null);
                    doStroke(properties2);
                    this.fillSet |= properties2.getString("fill") != null;
                    this.strokeSet = (this.strokeSet ? 1 : 0) | (properties2.getString("stroke") != null ? 1 : 0);
                } else if (!this.hidden && str2.equals("rect")) {
                    Float floatAttr4 = SVGParser.getFloatAttr("x", attributes);
                    if (floatAttr4 == null) {
                        floatAttr4 = valueOf;
                    }
                    Float floatAttr5 = SVGParser.getFloatAttr("y", attributes);
                    if (floatAttr5 != null) {
                        valueOf = floatAttr5;
                    }
                    Float floatAttr6 = SVGParser.getFloatAttr("width", attributes);
                    Float floatAttr7 = SVGParser.getFloatAttr("height", attributes);
                    Float valueOf4 = Float.valueOf(SVGParser.getFloatAttr("rx", attributes, 0.0f));
                    Float valueOf5 = Float.valueOf(SVGParser.getFloatAttr("ry", attributes, 0.0f));
                    pushTransform(attributes);
                    Properties properties3 = new Properties(attributes);
                    this.rect.set(floatAttr4.floatValue(), valueOf.floatValue(), floatAttr4.floatValue() + floatAttr6.floatValue(), valueOf.floatValue() + floatAttr7.floatValue());
                    if (doFill(properties3, this.rect)) {
                        this.rect.set(floatAttr4.floatValue(), valueOf.floatValue(), floatAttr4.floatValue() + floatAttr6.floatValue(), valueOf.floatValue() + floatAttr7.floatValue());
                        if (valueOf4.floatValue() <= 0.0f && valueOf5.floatValue() <= 0.0f) {
                            this.canvas.drawRect(this.rect, this.fillPaint);
                        } else {
                            this.canvas.drawRoundRect(this.rect, valueOf4.floatValue(), valueOf5.floatValue(), this.fillPaint);
                        }
                        doLimits(this.rect);
                    }
                    if (doStroke(properties3)) {
                        this.rect.set(floatAttr4.floatValue(), valueOf.floatValue(), floatAttr4.floatValue() + floatAttr6.floatValue(), valueOf.floatValue() + floatAttr7.floatValue());
                        if (valueOf4.floatValue() <= 0.0f && valueOf5.floatValue() <= 0.0f) {
                            this.canvas.drawRect(this.rect, this.strokePaint);
                        } else {
                            this.canvas.drawRoundRect(this.rect, valueOf4.floatValue(), valueOf5.floatValue(), this.strokePaint);
                        }
                        doLimits(this.rect, this.strokePaint);
                    }
                    popTransform();
                } else if (!this.hidden && str2.equals("line")) {
                    Float floatAttr8 = SVGParser.getFloatAttr("x1", attributes);
                    Float floatAttr9 = SVGParser.getFloatAttr("x2", attributes);
                    Float floatAttr10 = SVGParser.getFloatAttr("y1", attributes);
                    Float floatAttr11 = SVGParser.getFloatAttr("y2", attributes);
                    if (doStroke(new Properties(attributes))) {
                        pushTransform(attributes);
                        this.rect.set(floatAttr8.floatValue(), floatAttr10.floatValue(), floatAttr9.floatValue(), floatAttr11.floatValue());
                        this.canvas.drawLine(floatAttr8.floatValue(), floatAttr10.floatValue(), floatAttr9.floatValue(), floatAttr11.floatValue(), this.strokePaint);
                        doLimits(this.rect, this.strokePaint);
                        popTransform();
                    }
                } else if (!this.hidden && str2.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    Float floatAttr12 = SVGParser.getFloatAttr("x", attributes);
                    Float floatAttr13 = SVGParser.getFloatAttr("y", attributes);
                    Float floatAttr14 = SVGParser.getFloatAttr("font-size", attributes);
                    Matrix parseTransform = SVGParser.parseTransform(SVGParser.getStringAttr("transform", attributes));
                    this.drawCharacters = true;
                    if (floatAttr14 != null) {
                        this.textSize = floatAttr14;
                        pushTransform(attributes);
                        if (floatAttr12 != null && floatAttr13 != null) {
                            this.textX = floatAttr12;
                            this.textY = floatAttr13;
                        } else if (parseTransform != null) {
                            this.font_matrix = parseTransform;
                        }
                        Properties properties4 = new Properties(attributes);
                        Integer color2 = properties4.getColor("fill");
                        if (color2 != null) {
                            doColor(properties4, color2, true, this.textPaint);
                        } else {
                            this.textPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
                        }
                        this.newLineCount = 0;
                        this.textPaint.setTextSize(this.textSize.floatValue());
                        this.canvas.save();
                        popTransform();
                    }
                } else if (!this.hidden && (str2.equals("circle") || str2.equals("ellipse"))) {
                    Float floatAttr15 = SVGParser.getFloatAttr("cx", attributes);
                    Float floatAttr16 = SVGParser.getFloatAttr("cy", attributes);
                    if (str2.equals("ellipse")) {
                        floatAttr = SVGParser.getFloatAttr("rx", attributes);
                        f = SVGParser.getFloatAttr("ry", attributes);
                    } else {
                        floatAttr = SVGParser.getFloatAttr("r", attributes);
                        f = floatAttr;
                    }
                    if (floatAttr15 == null || floatAttr16 == null || floatAttr == null || f == null) {
                        return;
                    }
                    pushTransform(attributes);
                    Properties properties5 = new Properties(attributes);
                    this.rect.set(floatAttr15.floatValue() - floatAttr.floatValue(), floatAttr16.floatValue() - f.floatValue(), floatAttr15.floatValue() + floatAttr.floatValue(), floatAttr16.floatValue() + f.floatValue());
                    if (doFill(properties5, this.rect)) {
                        this.canvas.drawOval(this.rect, this.fillPaint);
                        doLimits(this.rect);
                    }
                    if (doStroke(properties5)) {
                        this.canvas.drawOval(this.rect, this.strokePaint);
                        doLimits(this.rect, this.strokePaint);
                    }
                    popTransform();
                } else if (!this.hidden && (str2.equals("polygon") || str2.equals("polyline"))) {
                    NumberParse numberParseAttr = SVGParser.getNumberParseAttr("points", attributes);
                    if (numberParseAttr != null) {
                        Path path = new Path();
                        ArrayList arrayList = numberParseAttr.numbers;
                        if (arrayList.size() > 1) {
                            pushTransform(attributes);
                            Properties properties6 = new Properties(attributes);
                            path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                            for (int i = 2; i < arrayList.size(); i += 2) {
                                path.lineTo(((Float) arrayList.get(i)).floatValue(), ((Float) arrayList.get(i + 1)).floatValue());
                            }
                            if (str2.equals("polygon")) {
                                path.close();
                            }
                            path.computeBounds(this.rect, false);
                            if (doFill(properties6, this.rect)) {
                                this.canvas.drawPath(path, this.fillPaint);
                                doLimits(this.rect);
                            }
                            if (doStroke(properties6)) {
                                this.canvas.drawPath(path, this.strokePaint);
                                doLimits(this.rect, this.strokePaint);
                            }
                            popTransform();
                        }
                    }
                } else if (!this.hidden && str2.equals("path")) {
                    Path doPath = SVGParser.doPath(SVGParser.getStringAttr("d", attributes));
                    pushTransform(attributes);
                    Properties properties7 = new Properties(attributes);
                    doPath.computeBounds(this.rect, false);
                    if (doFill(properties7, this.rect)) {
                        this.canvas.drawPath(doPath, this.fillPaint);
                        doLimits(this.rect);
                    }
                    if (doStroke(properties7)) {
                        this.canvas.drawPath(doPath, this.strokePaint);
                        doLimits(this.rect, this.strokePaint);
                    }
                    popTransform();
                } else if (!this.hidden) {
                    Log.w(SVGParser.TAG, "UNRECOGNIZED SVG COMMAND: " + str2);
                }
            }
        }

        public LayerAttributes currentLayerAttributes() {
            return this.layerAttributeStack.getLast();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            if (this.drawCharacters) {
                if (i2 == 1 && cArr[0] == '\n') {
                    this.canvas.restore();
                    this.canvas.save();
                    int i3 = this.newLineCount + 1;
                    this.newLineCount = i3;
                    this.canvas.translate(0.0f, i3 * this.textSize.floatValue());
                    return;
                }
                String str = new String(cArr, i, i2);
                Float f = this.textX;
                if (f != null && this.textY != null) {
                    this.canvas.drawText(str, f.floatValue(), this.textY.floatValue(), this.textPaint);
                } else {
                    this.canvas.setMatrix(this.font_matrix);
                    this.canvas.drawText(str, 0.0f, 0.0f, this.textPaint);
                }
                this.canvas.translate(Float.valueOf(this.textPaint.measureText(str)).floatValue(), 0.0f);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (str2.equals("svg")) {
                Integer num = this.canvasRestoreCount;
                if (num != null) {
                    this.canvas.restoreToCount(num.intValue());
                }
                if (this.limitsAdjustmentX != null) {
                    this.limits.left += this.limitsAdjustmentX.floatValue();
                    this.limits.right += this.limitsAdjustmentX.floatValue();
                }
                if (this.limitsAdjustmentY != null) {
                    this.limits.top += this.limitsAdjustmentY.floatValue();
                    this.limits.bottom += this.limitsAdjustmentY.floatValue();
                }
                this.picture.endRecording();
            } else if (str2.equals("linearGradient") || str2.equals("radialGradient")) {
                if (this.gradient.id != null) {
                    this.gradientMap.put(this.gradient.id, this.gradient);
                }
            } else if (str2.equals("defs")) {
                finishGradients();
            } else if (str2.equals("g")) {
                if (this.boundsMode) {
                    this.boundsMode = false;
                }
                if (this.hidden) {
                    int i = this.hiddenLevel - 1;
                    this.hiddenLevel = i;
                    if (i == 0) {
                        this.hidden = false;
                    }
                }
                popTransform();
                this.fillPaint = this.fillPaintStack.removeLast();
                this.fillSet = this.fillSetStack.removeLast().booleanValue();
                this.strokePaint = this.strokePaintStack.removeLast();
                this.strokeSet = this.strokeSetStack.removeLast().booleanValue();
                if (this.layerAttributeStack.isEmpty()) {
                    return;
                }
                this.layerAttributeStack.removeLast();
            } else if (str2.equals(MimeTypes.BASE_TYPE_TEXT) && this.drawCharacters) {
                this.drawCharacters = false;
                this.canvas.restore();
            }
        }
    }
}
