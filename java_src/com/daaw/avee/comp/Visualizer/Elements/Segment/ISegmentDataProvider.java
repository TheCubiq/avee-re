package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.ISimpleListFloat;
import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
import com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
/* loaded from: classes.dex */
public interface ISegmentDataProvider extends ICustomizable, IFrameDataProvider {
    ISimpleListFloat createFrameValuesAccessorList(int i, int i2, int i3, ISimpleListFloat iSimpleListFloat);

    float[] getFrameValues(int i, int i2);

    void process(IRenderState iRenderState, InternalVisualizationDataProvider internalVisualizationDataProvider);
}
