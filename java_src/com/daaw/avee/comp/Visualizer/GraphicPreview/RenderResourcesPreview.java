package com.daaw.avee.comp.Visualizer.GraphicPreview;

import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.Visualizer.Meter;
/* loaded from: classes.dex */
public class RenderResourcesPreview implements IRenderState.IRenderResources {
    Meter meter;
    InternalVisualizationDataProvider visualizationData;

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public AtlasTexture getAtlasTexRoundSegment() {
        return null;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public AtlasTexture getAtlasTexSquareSegment() {
        return null;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public AtlasTexture getAtlasTexSquareYSidesSegment() {
        return null;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public AtlasTexture getAtlasTexWhite() {
        return null;
    }

    public RenderResourcesPreview(Meter meter, InternalVisualizationDataProvider internalVisualizationDataProvider) {
        this.meter = meter;
        this.visualizationData = internalVisualizationDataProvider;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public Meter getMeter() {
        return this.meter;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
    public InternalVisualizationDataProvider getVisualizationData() {
        return this.visualizationData;
    }
}
