package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.mpatric.mp3agic.AbstractID3v2Tag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, AbstractID3v2Tag.PICTURETYPE_DURING_PERFORMANCE};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    private static int getColor(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public DvbParser(int i, int i2) {
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.defaultPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.defaultPaint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.fillRegionPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.fillRegionPaint.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(i, i2);
    }

    public void reset() {
        this.subtitleService.reset();
    }

    public List<Cue> decode(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<RegionObject> sparseArray;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        if (this.subtitleService.pageComposition == null) {
            return Collections.emptyList();
        }
        DisplayDefinition displayDefinition = this.subtitleService.displayDefinition != null ? this.subtitleService.displayDefinition : this.defaultDisplayDefinition;
        if (this.bitmap == null || displayDefinition.width + 1 != this.bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = createBitmap;
            this.canvas.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = this.subtitleService.pageComposition.regions;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            PageRegion valueAt = sparseArray2.valueAt(i4);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i6 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            float f = i5;
            float f2 = i6;
            this.canvas.clipRect(f, f2, Math.min(regionComposition.width + i5, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i6, displayDefinition.verticalPositionMaximum), Region.Op.REPLACE);
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                RegionObject valueAt2 = sparseArray3.valueAt(i7);
                ObjectData objectData = this.subtitleService.objects.get(keyAt);
                ObjectData objectData2 = objectData == null ? this.subtitleService.ancillaryObjects.get(keyAt) : objectData;
                if (objectData2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(objectData2, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i5, i6 + valueAt2.verticalPosition, objectData2.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                if (regionComposition.depth == 3) {
                    i2 = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (regionComposition.depth == 2) {
                    i2 = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i2 = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i2);
                this.canvas.drawRect(f, f2, regionComposition.width + i5, regionComposition.height + i6, this.fillRegionPaint);
            }
            arrayList.add(new Cue(Bitmap.createBitmap(this.bitmap, i5, i6, regionComposition.width, regionComposition.height), f / displayDefinition.width, 0, f2 / displayDefinition.height, 0, regionComposition.width / displayDefinition.width, regionComposition.height / displayDefinition.height));
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition parsePageComposition = parsePageComposition(parsableBitArray, readBits3);
                    if (parsePageComposition.state != 0) {
                        subtitleService.pageComposition = parsePageComposition;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    } else if (pageComposition != null && pageComposition.version != parsePageComposition.version) {
                        subtitleService.pageComposition = parsePageComposition;
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition parseRegionComposition = parseRegionComposition(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0) {
                        parseRegionComposition.mergeFrom(subtitleService.regions.get(parseRegionComposition.id));
                    }
                    subtitleService.regions.put(parseRegionComposition.id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition.id, parseClutDefinition);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.ancillaryCluts.put(parseClutDefinition2.id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ObjectData parseObjectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData.id, parseObjectData);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(parseObjectData2.id, parseObjectData2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        int i4;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i2 = parsableBitArray.readBits(16);
            i = readBits4;
            i4 = readBits5;
            i3 = readBits3;
        } else {
            i = readBits;
            i2 = readBits2;
            i3 = 0;
            i4 = 0;
        }
        return new DisplayDefinition(readBits, readBits2, i3, i, i4, i2);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i2 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i) {
        int readBits;
        int readBits2;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i2 = 16;
        int readBits4 = parsableBitArray.readBits(16);
        int readBits5 = parsableBitArray.readBits(16);
        int readBits6 = parsableBitArray.readBits(3);
        int readBits7 = parsableBitArray.readBits(3);
        int i3 = 2;
        parsableBitArray.skipBits(2);
        int readBits8 = parsableBitArray.readBits(8);
        int readBits9 = parsableBitArray.readBits(8);
        int readBits10 = parsableBitArray.readBits(4);
        int readBits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int readBits12 = parsableBitArray.readBits(i2);
            int readBits13 = parsableBitArray.readBits(i3);
            int readBits14 = parsableBitArray.readBits(i3);
            int readBits15 = parsableBitArray.readBits(12);
            int i5 = readBits11;
            parsableBitArray.skipBits(4);
            int readBits16 = parsableBitArray.readBits(12);
            i4 -= 6;
            if (readBits13 == 1 || readBits13 == 2) {
                i4 -= 2;
                readBits = parsableBitArray.readBits(8);
                readBits2 = parsableBitArray.readBits(8);
            } else {
                readBits = 0;
                readBits2 = 0;
            }
            sparseArray.put(readBits12, new RegionObject(readBits13, readBits14, readBits15, readBits16, readBits, readBits2));
            readBits11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new RegionComposition(readBits3, readBit, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, readBits10, readBits11, sparseArray);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i) {
        int readBits;
        int i2;
        int readBits2;
        int readBits3;
        int i3;
        int i4 = 8;
        int readBits4 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i6 > 0) {
            int readBits5 = parsableBitArray.readBits(i4);
            int readBits6 = parsableBitArray.readBits(i4);
            int i7 = i6 - 2;
            int[] iArr = (readBits6 & 128) != 0 ? generateDefault2BitClutEntries : (readBits6 & 64) != 0 ? generateDefault4BitClutEntries : generateDefault8BitClutEntries;
            if ((readBits6 & 1) != 0) {
                readBits3 = parsableBitArray.readBits(i4);
                i3 = parsableBitArray.readBits(i4);
                readBits = parsableBitArray.readBits(i4);
                readBits2 = parsableBitArray.readBits(i4);
                i2 = i7 - 4;
            } else {
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i2 = i7 - 2;
                readBits2 = parsableBitArray.readBits(i5) << 6;
                readBits3 = parsableBitArray.readBits(6) << i5;
                i3 = readBits7;
            }
            if (readBits3 == 0) {
                i3 = 0;
                readBits = 0;
                readBits2 = 255;
            }
            double d = readBits3;
            double d2 = i3 - 128;
            Double.isNaN(d2);
            Double.isNaN(d);
            double d3 = readBits - 128;
            Double.isNaN(d3);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d);
            iArr[readBits5] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) (d + (1.402d * d2)), 0, 255), Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255));
            i6 = i2;
            readBits4 = readBits4;
            i4 = 8;
            i5 = 2;
        }
        return new ClutDefinition(readBits4, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = null;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = getColor(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = getColor(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = getColor(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = getColor(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = getColor(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = getColor(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = getColor(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i, i2, i3, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArr4 == null ? defaultMap2To8 : bArr4;
                        } else if (i == 2) {
                            bArr3 = bArr5 == null ? defaultMap2To4 : bArr5;
                        } else {
                            bArr2 = null;
                            i4 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i4, i5, paint, canvas);
                            parsableBitArray.byteAlign();
                            continue;
                        }
                        bArr2 = bArr3;
                        i4 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i4, i5, paint, canvas);
                        parsableBitArray.byteAlign();
                        continue;
                    case 17:
                        i4 = paint4BitPixelCodeString(parsableBitArray, iArr, i == 3 ? defaultMap4To8 : null, i4, i5, paint, canvas);
                        parsableBitArray.byteAlign();
                        continue;
                    case 18:
                        i4 = paint8BitPixelCodeString(parsableBitArray, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr5 = buildClutMapTable(4, 4, parsableBitArray);
                                continue;
                            case 33:
                                bArr4 = buildClutMapTable(4, 8, parsableBitArray);
                                continue;
                            case 34:
                                bArr4 = buildClutMapTable(16, 8, parsableBitArray);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int readBits;
        int readBits2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z = z2;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else if (parsableBitArray.readBit()) {
                    z = z2;
                    readBits3 = 0;
                } else {
                    int readBits4 = parsableBitArray.readBits(2);
                    if (readBits4 == 0) {
                        readBits3 = 0;
                        z = true;
                    } else if (readBits4 == 1) {
                        z = z2;
                        readBits3 = 0;
                        i3 = 2;
                        if (i3 != 0 && paint != null) {
                            if (bArr != null) {
                                readBits3 = bArr[readBits3];
                            }
                            paint.setColor(iArr[readBits3]);
                            canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                        }
                        i4 += i3;
                        if (!z) {
                            return i4;
                        }
                        z2 = z;
                    } else if (readBits4 == 2) {
                        readBits = parsableBitArray.readBits(4) + 12;
                        readBits2 = parsableBitArray.readBits(2);
                    } else if (readBits4 != 3) {
                        z = z2;
                        readBits3 = 0;
                    } else {
                        readBits = parsableBitArray.readBits(8) + 29;
                        readBits2 = parsableBitArray.readBits(2);
                    }
                    i3 = 0;
                    if (i3 != 0) {
                        if (bArr != null) {
                        }
                        paint.setColor(iArr[readBits3]);
                        canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                    }
                    i4 += i3;
                    if (!z) {
                    }
                }
                z = z2;
                i3 = readBits;
                readBits3 = readBits2;
                if (i3 != 0) {
                }
                i4 += i3;
                if (!z) {
                }
            }
            i3 = 1;
            if (i3 != 0) {
            }
            i4 += i3;
            if (!z) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[LOOP:0: B:3:0x0009->B:36:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int readBits;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte readBits2 = parsableBitArray.readBits(4);
            if (readBits2 != 0) {
                z = z2;
            } else {
                if (!parsableBitArray.readBit()) {
                    int readBits3 = parsableBitArray.readBits(3);
                    if (readBits3 != 0) {
                        z = z2;
                        i3 = readBits3 + 2;
                        readBits2 = 0;
                    } else {
                        readBits2 = 0;
                        z = true;
                        i3 = 0;
                    }
                } else {
                    if (!parsableBitArray.readBit()) {
                        readBits = parsableBitArray.readBits(2) + 4;
                        readBits2 = parsableBitArray.readBits(4);
                    } else {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 == 0) {
                            z = z2;
                            readBits2 = 0;
                        } else if (readBits4 == 1) {
                            z = z2;
                            readBits2 = 0;
                            i3 = 2;
                        } else if (readBits4 == 2) {
                            readBits = parsableBitArray.readBits(4) + 9;
                            readBits2 = parsableBitArray.readBits(4);
                        } else if (readBits4 != 3) {
                            z = z2;
                            readBits2 = 0;
                            i3 = 0;
                        } else {
                            readBits = parsableBitArray.readBits(8) + 25;
                            readBits2 = parsableBitArray.readBits(4);
                        }
                    }
                    z = z2;
                    i3 = readBits;
                }
                if (i3 != 0 && paint != null) {
                    if (bArr != null) {
                        readBits2 = bArr[readBits2];
                    }
                    paint.setColor(iArr[readBits2]);
                    canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                }
                i4 += i3;
                if (!z) {
                    return i4;
                }
                z2 = z;
            }
            i3 = 1;
            if (i3 != 0) {
                if (bArr != null) {
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (!z) {
            }
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int readBits;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            byte readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z = z2;
                readBits = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z = z2;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    readBits2 = 0;
                    z = true;
                    readBits = 0;
                }
            } else {
                z = z2;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i3, i2, i3 + readBits, i2 + 1, paint);
            }
            i3 += readBits;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    private static byte[] buildClutMapTable(int i, int i2, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) parsableBitArray.readBits(i2);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SubtitleService {
        public final int ancillaryPageId;
        public DisplayDefinition displayDefinition;
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i, int i2) {
            this.subtitlePageId = i;
            this.ancillaryPageId = i2;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i, int i2, int i3, int i4, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.horizontalPositionMinimum = i3;
            this.horizontalPositionMaximum = i4;
            this.verticalPositionMinimum = i5;
            this.verticalPositionMaximum = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i, int i2, int i3, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i;
            this.version = i2;
            this.state = i3;
            this.regions = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i, int i2) {
            this.horizontalAddress = i;
            this.verticalAddress = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<RegionObject> sparseArray) {
            this.id = i;
            this.fillFlag = z;
            this.width = i2;
            this.height = i3;
            this.levelOfCompatibility = i4;
            this.depth = i5;
            this.clutId = i6;
            this.pixelCode8Bit = i7;
            this.pixelCode4Bit = i8;
            this.pixelCode2Bit = i9;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            if (regionComposition == null) {
                return;
            }
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.regionObjects.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i, int i2, int i3, int i4, int i5, int i6) {
            this.type = i;
            this.provider = i2;
            this.horizontalPosition = i3;
            this.verticalPosition = i4;
            this.foregroundPixelCode = i5;
            this.backgroundPixelCode = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.id = i;
            this.nonModifyingColorFlag = z;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }
}
