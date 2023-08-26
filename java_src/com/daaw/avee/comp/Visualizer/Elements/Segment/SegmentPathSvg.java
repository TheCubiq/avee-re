package com.daaw.avee.comp.Visualizer.Elements.Segment;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import com.daaw.avee.comp.Visualizer.Graphic.CharSet;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Path.SVGApproximate;
import com.daaw.avee.comp.Visualizer.Path.SegmentContour;
import com.larvalabs.svgandroid.SVGParser;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class SegmentPathSvg implements ISegmentPath {
    boolean svgApproximate;
    String[] svgPaths;
    float totalPathLength;
    float radius = 1.0f;
    private MeasuredVar measureText = new MeasuredVar(MeasureDefs.textArtistOrTitle, 1.0f, 1.0f);
    RectF pathBounds = new RectF();
    Vec2f vec = new Vec2f(0.0f, 0.0f);
    CharSet charSet = CharSet.createAscii48to90();
    CharPathEntry[] charPaths = new CharPathEntry[0];
    int currentCharIndex = 0;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPreferredPointCount(RectF rectF) {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class CharPathEntry {
        public float length;
        public Vec2f[] points;
        public Vec2f[] tans;
        public List<Integer> indexContourGaps = new ArrayList();
        public List<Integer> indexContourLastIndex = new ArrayList();
        public Vec2f min = new Vec2f(10000.0f, 10000.0f);
        public Vec2f max = new Vec2f(-10000.0f, -10000.0f);

        public CharPathEntry(int i) {
            this.points = new Vec2f[i];
            this.tans = new Vec2f[i];
        }

        public void finishInit() {
            this.indexContourLastIndex = new ArrayList(this.indexContourGaps.size());
            for (int i = 0; i < this.indexContourGaps.size(); i++) {
                this.indexContourLastIndex.add(Integer.valueOf(getLastIndexOfContourGap(this.indexContourGaps.get(i).intValue())));
            }
            Vec2f[] vec2fArr = this.tans;
            if (vec2fArr.length > 0) {
                if (Float.isNaN(vec2fArr[0].x) || this.tans[0].length() < 1.0E-5f) {
                    int lastIndexOfContour = getLastIndexOfContour(0);
                    Vec2f[] vec2fArr2 = this.tans;
                    vec2fArr2[0].x = vec2fArr2[lastIndexOfContour].x;
                    Vec2f[] vec2fArr3 = this.tans;
                    vec2fArr3[0].y = vec2fArr3[lastIndexOfContour].y;
                }
            }
        }

        public float getLength() {
            return this.length;
        }

        boolean isGapToPreviousPoint(int i) {
            return this.indexContourGaps.contains(Integer.valueOf(i));
        }

        int getLastIndexOfContourGap(int i) {
            int length;
            int i2 = 0;
            while (true) {
                if (i2 < this.indexContourGaps.size() - 1) {
                    if (this.indexContourGaps.get(i2).intValue() == i) {
                        length = this.indexContourGaps.get(i2 + 1).intValue();
                        break;
                    }
                    i2++;
                } else {
                    length = this.points.length;
                    break;
                }
            }
            return length - 1;
        }

        int getLastIndexOfContour(int i) {
            for (int i2 = 0; i2 < this.indexContourGaps.size(); i2++) {
                if (this.indexContourGaps.get(i2).intValue() == i) {
                    return this.indexContourLastIndex.get(i2).intValue();
                }
            }
            Vec2f[] vec2fArr = this.points;
            return ((i + vec2fArr.length) - 1) % vec2fArr.length;
        }
    }

    public SegmentPathSvg(String[] strArr, boolean z) {
        this.svgPaths = strArr;
        this.svgApproximate = z;
    }

    private void createPaths(CharSet charSet, String[] strArr, int i) {
        if (this.svgApproximate) {
            createPaths_approximate(charSet, strArr, i);
        } else {
            createPaths_pathMeasure(charSet, strArr, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.PathMeasure] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    private void createPaths_pathMeasure(CharSet charSet, String[] strArr, int i) {
        if (charSet.count() != strArr.length) {
            tlog.w("charSet count don't match");
        }
        this.charPaths = new CharPathEntry[Math.min(charSet.count(), strArr.length)];
        ?? pathMeasure = new PathMeasure();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        ?? r7 = 0;
        int i2 = 0;
        while (i2 < this.charPaths.length) {
            float f = 0.0f;
            this.totalPathLength = 0.0f;
            arrayList.clear();
            Path parsePath = SVGParser.parsePath(strArr[i2]);
            pathMeasure.setPath(parsePath, r7);
            do {
                float length = pathMeasure.getLength();
                arrayList.add(Float.valueOf(length));
                this.totalPathLength += length;
            } while (pathMeasure.nextContour());
            CharPathEntry charPathEntry = new CharPathEntry(i);
            pathMeasure.setPath(parsePath, r7);
            float f2 = this.totalPathLength / i;
            charPathEntry.indexContourGaps.add(Integer.valueOf((int) r7));
            int i3 = 0;
            while (true) {
                if (i3 < i) {
                    float f3 = i3 * f2;
                    float length2 = pathMeasure.getLength() + f;
                    if (f3 > length2) {
                        if (!pathMeasure.nextContour()) {
                            tlog.w("could get all points on path");
                            break;
                        } else {
                            charPathEntry.indexContourGaps.add(Integer.valueOf(i3));
                            f = length2;
                        }
                    } else {
                        pathMeasure.getPosTan(f3 - f, fArr, fArr2);
                        charPathEntry.length = this.totalPathLength;
                        charPathEntry.points[i3] = new Vec2f(fArr[r7 == true ? 1 : 0], fArr[1]);
                        charPathEntry.tans[i3] = new Vec2f(fArr2[0], fArr2[1]);
                        charPathEntry.tans[i3].normalize();
                        if (charPathEntry.min.x > charPathEntry.points[i3].x) {
                            charPathEntry.min.x = charPathEntry.points[i3].x;
                        }
                        if (charPathEntry.min.y > charPathEntry.points[i3].y) {
                            charPathEntry.min.y = charPathEntry.points[i3].y;
                        }
                        if (charPathEntry.max.x < charPathEntry.points[i3].x) {
                            charPathEntry.max.x = charPathEntry.points[i3].x;
                        }
                        if (charPathEntry.max.y < charPathEntry.points[i3].y) {
                            charPathEntry.max.y = charPathEntry.points[i3].y;
                        }
                        i3++;
                        r7 = 0;
                    }
                }
            }
            charPathEntry.finishInit();
            this.charPaths[i2] = charPathEntry;
            i2++;
            r7 = 0;
        }
    }

    private void createPaths_approximate(CharSet charSet, String[] strArr, int i) {
        String[] strArr2 = strArr;
        if (charSet.count() != strArr2.length) {
            tlog.w("charSet count don't match");
        }
        this.charPaths = new CharPathEntry[Math.min(charSet.count(), strArr2.length)];
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.charPaths.length) {
            float f = 0.0f;
            this.totalPathLength = 0.0f;
            arrayList.clear();
            List<SegmentContour> parsePathApproximate = SVGApproximate.parsePathApproximate(strArr2[i3]);
            if (parsePathApproximate.size() <= 0) {
                CharPathEntry charPathEntry = new CharPathEntry(i2);
                charPathEntry.finishInit();
                this.charPaths[i3] = charPathEntry;
            } else {
                int i4 = 0;
                while (true) {
                    float length = parsePathApproximate.get(i4).getLength();
                    arrayList.add(Float.valueOf(length));
                    this.totalPathLength += length;
                    i4++;
                    if (i4 >= parsePathApproximate.size()) {
                        break;
                    }
                }
                CharPathEntry charPathEntry2 = new CharPathEntry(i);
                float f2 = this.totalPathLength / i;
                charPathEntry2.indexContourGaps.add(Integer.valueOf(i2));
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= i) {
                        break;
                    }
                    float f3 = i5 * f2;
                    float length2 = f + parsePathApproximate.get(i6).getLength();
                    if (f3 > length2) {
                        i6++;
                        if (i6 >= parsePathApproximate.size()) {
                            tlog.w("could get all points on path");
                            break;
                        } else {
                            charPathEntry2.indexContourGaps.add(Integer.valueOf(i5));
                            f = length2;
                        }
                    } else {
                        parsePathApproximate.get(i6).getPosTan(f3 - f, fArr, fArr2);
                        charPathEntry2.length = this.totalPathLength;
                        charPathEntry2.points[i5] = new Vec2f(fArr[i2], fArr[1]);
                        charPathEntry2.tans[i5] = new Vec2f(fArr2[0], fArr2[1]);
                        charPathEntry2.tans[i5].normalize();
                        if (charPathEntry2.min.x > charPathEntry2.points[i5].x) {
                            charPathEntry2.min.x = charPathEntry2.points[i5].x;
                        }
                        if (charPathEntry2.min.y > charPathEntry2.points[i5].y) {
                            charPathEntry2.min.y = charPathEntry2.points[i5].y;
                        }
                        if (charPathEntry2.max.x < charPathEntry2.points[i5].x) {
                            charPathEntry2.max.x = charPathEntry2.points[i5].x;
                        }
                        if (charPathEntry2.max.y < charPathEntry2.points[i5].y) {
                            charPathEntry2.max.y = charPathEntry2.points[i5].y;
                        }
                        i5++;
                        i2 = 0;
                    }
                }
                charPathEntry2.finishInit();
                this.charPaths[i3] = charPathEntry2;
            }
            i3++;
            strArr2 = strArr;
            i2 = 0;
        }
    }

    public SegmentPathSvg setRadius(float f) {
        this.radius = f;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public void process(IRenderState iRenderState) {
        String measureText = this.measureText.measureText(iRenderState.getRes().getMeter());
        this.currentCharIndex = this.charSet.getIndexByChar((measureText == null || measureText.length() < 1) ? 'X' : measureText.charAt(0));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public int getPointOnPath(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        CharPathEntry charPathEntry;
        float height;
        CharPathEntry[] charPathEntryArr = this.charPaths;
        if (charPathEntryArr.length == 0 || charPathEntryArr[0].points.length != i2) {
            createPaths(this.charSet, this.svgPaths, i2);
        }
        int i3 = this.currentCharIndex;
        CharPathEntry[] charPathEntryArr2 = this.charPaths;
        if (i3 < charPathEntryArr2.length) {
            charPathEntry = charPathEntryArr2[i3];
        } else {
            charPathEntry = charPathEntryArr2[0];
        }
        if (charPathEntry == null || charPathEntry.points.length == 0) {
            pointF2.x = 1.0f;
            pointF2.y = 0.0f;
            pointF.x = rectF.centerX();
            pointF.y = rectF.centerY();
            return -1;
        }
        Vec2f vec2f = charPathEntry.points[i];
        Vec2f vec2f2 = charPathEntry.tans[i];
        this.pathBounds.left = charPathEntry.min.x;
        this.pathBounds.top = charPathEntry.min.y;
        this.pathBounds.right = charPathEntry.max.x;
        this.pathBounds.bottom = charPathEntry.max.y;
        this.vec.x = vec2f2.y;
        this.vec.y = -vec2f2.x;
        if (this.pathBounds.width() > this.pathBounds.height()) {
            pointF.x = (vec2f.x - this.pathBounds.centerX()) / this.pathBounds.width();
            pointF.y = (vec2f.y - this.pathBounds.centerY()) / this.pathBounds.width();
        } else {
            pointF.x = (vec2f.x - this.pathBounds.centerX()) / this.pathBounds.height();
            pointF.y = (vec2f.y - this.pathBounds.centerY()) / this.pathBounds.height();
        }
        if (rectF.width() < rectF.height()) {
            height = rectF.width();
        } else {
            height = rectF.height();
        }
        float f2 = height * 0.5f * this.radius;
        pointF.x = rectF.centerX() + (pointF.x * f2);
        pointF.y = rectF.centerY() + (pointF.y * f2);
        pointF2.x = -this.vec.x;
        pointF2.y = -this.vec.y;
        return charPathEntry.getLastIndexOfContour(i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentPath
    public float getPathLength(RectF rectF, int i) {
        float height;
        float height2;
        CharPathEntry[] charPathEntryArr = this.charPaths;
        if (charPathEntryArr.length == 0 || charPathEntryArr[0].points.length != i) {
            createPaths(this.charSet, this.svgPaths, i);
        }
        int i2 = this.currentCharIndex;
        CharPathEntry[] charPathEntryArr2 = this.charPaths;
        CharPathEntry charPathEntry = i2 < charPathEntryArr2.length ? charPathEntryArr2[i2] : null;
        if (charPathEntry == null) {
            return 1.0f;
        }
        this.pathBounds.left = charPathEntry.min.x;
        this.pathBounds.top = charPathEntry.min.y;
        this.pathBounds.right = charPathEntry.max.x;
        this.pathBounds.bottom = charPathEntry.max.y;
        if (rectF.width() < rectF.height()) {
            height = rectF.width();
        } else {
            height = rectF.height();
        }
        if (this.pathBounds.width() > this.pathBounds.height()) {
            height2 = this.pathBounds.width();
        } else {
            height2 = this.pathBounds.height();
        }
        return (charPathEntry.getLength() / height2) * height * 0.5f * this.radius;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.radius = customPropertiesList.getPropertyFloat("radius", this.radius);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyFloatAsRange("radius", this.radius, "misc", 0.1f, 3.0f);
    }
}
