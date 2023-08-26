package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.Visualizer.Meter;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public interface IRenderState {
    public static final float edgeWidth = 1.5f;

    /* loaded from: classes.dex */
    public interface IRenderResources {
        AtlasTexture getAtlasTexRoundSegment();

        AtlasTexture getAtlasTexSquareSegment();

        AtlasTexture getAtlasTexSquareYSidesSegment();

        AtlasTexture getAtlasTexWhite();

        Meter getMeter();

        InternalVisualizationDataProvider getVisualizationData();
    }

    void bindFrameBuffer(FrameBuffer frameBuffer);

    void frameResourcesLoadingAdd();

    IBufferRenderer getBufferRenderer();

    float getFrameTimeF();

    boolean getMultiThread();

    boolean getRenderEdges();

    boolean getRenderEdgesPaths();

    IRenderResources getRes();

    int getScreenHeight();

    int getScreenWidth();

    float getTotalFrameTimeF();

    void setBlendMode(int i);

    void setTextureWrapping(int i);
}
