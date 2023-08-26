package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Func.Func4;
import com.daaw.avee.Common.Vec2f;
/* loaded from: classes.dex */
public interface IBufferRenderer {
    void drawBatchRectangle(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData);

    void drawBatchRectangle2Patch(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData);

    void drawBatchRectangleEdges(IRenderState iRenderState, Func4<Integer, float[], int[], float[], Boolean> func4, int i, float f, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder);

    void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2);

    void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z);

    void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData);

    void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z);

    void drawRectangle2Patch(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData);

    void drawRectangleEdges(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder);
}
