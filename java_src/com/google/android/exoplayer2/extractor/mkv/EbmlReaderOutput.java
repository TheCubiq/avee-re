package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
interface EbmlReaderOutput {
    public static final int TYPE_BINARY = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_MASTER = 1;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNSIGNED_INT = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ElementType {
    }

    void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException;

    void endMasterElement(int i) throws ParserException;

    void floatElement(int i, double d) throws ParserException;

    int getElementType(int i);

    void integerElement(int i, long j) throws ParserException;

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2) throws ParserException;

    void stringElement(int i, String str) throws ParserException;
}
