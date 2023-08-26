package com.daaw.avee.comp.Common;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class ExoPcmData {
    public ByteBuffer buffer;
    public int bufferIndex;
    public long bufferPresentationTimeUs;
    public int channelCount;
    public long positionUs;
    public int sampleRate;
    public boolean enabled = false;
    public int bitDepth = 16;
}
