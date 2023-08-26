package com.daaw.avee.comp.Visualizer.Path;

import android.util.Log;
import com.daaw.avee.Common.Vec4f;
import com.larvalabs.svgandroid.ParserHelper;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class SVGApproximate {
    static final String TAG = "SVGApproximate";

    /* loaded from: classes.dex */
    public interface IPath {
        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void rLineTo(float f, float f2);

        void rMoveTo(float f, float f2);
    }

    private static void drawArc(IPath iPath, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
    }

    /* loaded from: classes.dex */
    public static class PathCreator implements IPath {
        List<SegmentContour> segments = new ArrayList();
        List<Vec4f> currentSegment = new ArrayList();
        boolean posset = false;
        float cx = 0.0f;
        float cy = 0.0f;

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        public List<SegmentContour> getSegments() {
            return this.segments;
        }

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void rMoveTo(float f, float f2) {
            this.cx += f;
            this.cy += f2;
            this.posset = true;
        }

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void moveTo(float f, float f2) {
            this.cx = f;
            this.cy = f2;
            this.posset = true;
        }

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void close() {
            if (this.currentSegment.size() > 0) {
                this.segments.add(new SegmentContour(this.currentSegment));
            }
            this.currentSegment.clear();
            this.posset = false;
        }

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void rLineTo(float f, float f2) {
            if (!this.posset) {
                this.cx = 0.0f;
                this.cy = 0.0f;
                this.posset = true;
            }
            List<Vec4f> list = this.currentSegment;
            float f3 = this.cx;
            float f4 = this.cy;
            list.add(new Vec4f(f3, f4, f3 + f, f4 + f2));
            this.cx += f;
            this.cy += f2;
        }

        @Override // com.daaw.avee.comp.Visualizer.Path.SVGApproximate.IPath
        public void lineTo(float f, float f2) {
            if (!this.posset) {
                this.cx = 0.0f;
                this.cy = 0.0f;
                this.posset = true;
            }
            this.currentSegment.add(new Vec4f(this.cx, this.cy, f, f2));
            this.cx = f;
            this.cy = f2;
        }
    }

    public static List<SegmentContour> parsePathApproximate(String str) {
        PathCreator pathCreator = new PathCreator();
        doPath(str, pathCreator);
        return pathCreator.getSegments();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if ("lhvcsqta".indexOf(java.lang.Character.toLowerCase(r1)) >= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static IPath doPath(String str, IPath iPath) {
        char c;
        float nextFloat;
        float nextFloat2;
        boolean z;
        int length = str.length();
        ParserHelper parserHelper = new ParserHelper(str, 0);
        parserHelper.skipWhitespace();
        char c2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
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
                            nextFloat6 += f;
                            nextFloat7 += f2;
                        }
                        float f7 = nextFloat6;
                        float f8 = nextFloat7;
                        drawArc(iPath, f, f2, f7, f8, nextFloat3, nextFloat4, nextFloat5, nextFlag, nextFlag2);
                        f = f7;
                        f4 = f4;
                        f2 = f8;
                        f3 = f3;
                        z = false;
                        if (!z) {
                            f5 = f;
                            f6 = f2;
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                    case 'C':
                    case 'c':
                        float nextFloat8 = parserHelper.nextFloat();
                        float nextFloat9 = parserHelper.nextFloat();
                        float nextFloat10 = parserHelper.nextFloat();
                        float nextFloat11 = parserHelper.nextFloat();
                        float nextFloat12 = parserHelper.nextFloat();
                        float nextFloat13 = parserHelper.nextFloat();
                        if (c2 == 'c') {
                            nextFloat8 += f;
                            nextFloat10 += f;
                            nextFloat12 += f;
                            nextFloat9 += f2;
                            nextFloat11 += f2;
                            nextFloat13 += f2;
                        }
                        float f9 = nextFloat10;
                        float f10 = nextFloat11;
                        iPath.cubicTo(nextFloat8, nextFloat9, f9, f10, nextFloat12, nextFloat13);
                        f = nextFloat12;
                        f2 = nextFloat13;
                        f6 = f10;
                        f5 = f9;
                        z = true;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                    case 'H':
                    case 'h':
                        float nextFloat14 = parserHelper.nextFloat();
                        if (c2 == 'h') {
                            iPath.rLineTo(nextFloat14, 0.0f);
                            f += nextFloat14;
                        } else {
                            iPath.lineTo(nextFloat14, f2);
                            f = nextFloat14;
                        }
                        z = false;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                    case 'L':
                    case 'T':
                    case 'l':
                    case 't':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c2 == 'l') {
                            iPath.rLineTo(nextFloat, nextFloat2);
                            f += nextFloat;
                            f2 += nextFloat2;
                            z = false;
                            if (!z) {
                            }
                            parserHelper.skipWhitespace();
                            c2 = c;
                        } else {
                            iPath.lineTo(nextFloat, nextFloat2);
                            f = nextFloat;
                            f2 = nextFloat2;
                            z = false;
                            if (!z) {
                            }
                            parserHelper.skipWhitespace();
                            c2 = c;
                        }
                        break;
                    case 'M':
                    case 'm':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c2 == 'm') {
                            f4 += nextFloat;
                            f3 += nextFloat2;
                            iPath.rMoveTo(nextFloat, nextFloat2);
                            f += nextFloat;
                            f2 += nextFloat2;
                            z = false;
                            if (!z) {
                            }
                            parserHelper.skipWhitespace();
                            c2 = c;
                        } else {
                            iPath.moveTo(nextFloat, nextFloat2);
                            f = nextFloat;
                            f4 = f;
                            f2 = nextFloat2;
                            f3 = f2;
                            z = false;
                            if (!z) {
                            }
                            parserHelper.skipWhitespace();
                            c2 = c;
                        }
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        float nextFloat15 = parserHelper.nextFloat();
                        float nextFloat16 = parserHelper.nextFloat();
                        float nextFloat17 = parserHelper.nextFloat();
                        float nextFloat18 = parserHelper.nextFloat();
                        if (Character.isLowerCase(c2)) {
                            nextFloat15 += f;
                            nextFloat17 += f;
                            nextFloat16 += f2;
                            nextFloat18 += f2;
                        }
                        float f11 = nextFloat15;
                        float f12 = nextFloat16;
                        float f13 = nextFloat17;
                        float f14 = nextFloat18;
                        iPath.cubicTo((f * 2.0f) - f5, (f2 * 2.0f) - f6, f11, f12, f13, f14);
                        f5 = f11;
                        f6 = f12;
                        f = f13;
                        f2 = f14;
                        z = true;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                    case 'V':
                    case 'v':
                        float nextFloat19 = parserHelper.nextFloat();
                        if (c2 == 'v') {
                            iPath.rLineTo(0.0f, nextFloat19);
                            f2 += nextFloat19;
                        } else {
                            iPath.lineTo(f, nextFloat19);
                            f2 = nextFloat19;
                        }
                        z = false;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                    case 'Z':
                    case 'z':
                        iPath.close();
                        iPath.moveTo(f4, f3);
                        f2 = f3;
                        f6 = f2;
                        f = f4;
                        f5 = f;
                        z = true;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                    default:
                        Log.w(TAG, "Invalid path command: " + c2);
                        parserHelper.advance();
                        z = false;
                        if (!z) {
                        }
                        parserHelper.skipWhitespace();
                        c2 = c;
                        break;
                }
            }
            if (c2 == 'm' || c2 == 'M') {
                c = c2;
                c2 = (char) (c2 - 1);
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
            }
        }
        return iPath;
    }
}
