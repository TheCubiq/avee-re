package com.daaw.avee.comp.Visualizer.GraphicPreview;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Func.Func4;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderBinder;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
/* loaded from: classes.dex */
public class BufferRendererPreview implements IBufferRenderer {
    private static final int[] verticesColors = {-1, -1, -1, -1, -1, -1};
    private Canvas destCanvas;
    final int lineAlpha;
    Paint paint1;
    final float pointSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BufferRendererPreview() {
        Paint paint = new Paint();
        this.paint1 = paint;
        this.lineAlpha = 70;
        this.pointSize = 3.0f;
        paint.setColor(1090519039);
    }

    void drawPoint(float f, float f2, Paint paint) {
        this.destCanvas.drawCircle(f, f2, 3.0f, paint);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        drawRectangle(iRenderState, f, f2, f3, f4, f7, f8, f5, f6, f9, i, vec2f, vec2f2, renderPassData, false);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle0123(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        drawRectangle(iRenderState, f, f2, f3, f4, f7, f8, f5, f6, f9, i, vec2f, vec2f2, renderPassData, z);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData, boolean z) {
        drawRectangle(iRenderState, f, f2, f3, f4, f5, f6, f7, f8, f9, i, vec2f, vec2f2, renderPassData.getTexturePrimary(), renderPassData.currentBlendMode);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2) {
        this.paint1.setColor(GraphicsUtils.setIntColorAlpha(i, 70));
        this.destCanvas.drawLine(f, f2, f3, f4, this.paint1);
        this.destCanvas.drawLine(f3, f4, f5, f6, this.paint1);
        this.destCanvas.drawLine(f5, f6, f7, f8, this.paint1);
        this.destCanvas.drawLine(f7, f8, f, f2, this.paint1);
        this.destCanvas.drawLine(f3, f4, f7, f8, this.paint1);
        this.destCanvas.drawLine(f5, f6, f, f2, this.paint1);
        drawPoint(f, f2, this.paint1);
        drawPoint(f3, f4, this.paint1);
        drawPoint(f5, f6, this.paint1);
        drawPoint(f7, f8, this.paint1);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle2Patch(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        drawRectangle(iRenderState, f, f2, f3, f4, f5, f6, f7, f8, f9, i, vec2f, vec2f2, renderPassData.getTexturePrimary(), renderPassData.currentBlendMode);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangleEdges(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        drawRectangle(iRenderState, f, f2, f3, f4, f5, f6, f7, f8, f9, i, vec2f, vec2f2, iAtlasTexture, i2);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangle(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        char c2 = 0;
        int i2 = 0;
        while (i2 < i) {
            if (func3.Invoke(Integer.valueOf(i2), fArr, iArr).booleanValue()) {
                this.paint1.setColor(GraphicsUtils.setIntColorAlpha(iArr[c2], 70));
                float f2 = fArr[c2];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[c];
                float f7 = fArr[5];
                float f8 = fArr[6];
                float f9 = fArr[7];
                this.destCanvas.drawLine(f2, f3, f4, f5, this.paint1);
                this.destCanvas.drawLine(f4, f5, f6, f7, this.paint1);
                this.destCanvas.drawLine(f6, f7, f8, f9, this.paint1);
                this.destCanvas.drawLine(f8, f9, f2, f3, this.paint1);
                this.destCanvas.drawLine(f4, f5, f8, f9, this.paint1);
                this.destCanvas.drawLine(f6, f7, f2, f3, this.paint1);
                drawPoint(f2, f3, this.paint1);
                drawPoint(f4, f5, this.paint1);
                drawPoint(f6, f7, this.paint1);
                drawPoint(f8, f9, this.paint1);
            }
            i2++;
            c = 4;
            c2 = 0;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangle2Patch(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        drawBatchRectangle(iRenderState, func3, i, f, vec2f, vec2f2, renderPassData);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangleEdges(IRenderState iRenderState, final Func4<Integer, float[], int[], float[], Boolean> func4, int i, float f, Vec2f vec2f, Vec2f vec2f2, IAtlasTexture iAtlasTexture, int i2, VShaderBinder vShaderBinder) {
        final float[] fArr = new float[8];
        drawBatchRectangle(iRenderState, new Func3<Integer, float[], int[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.GraphicPreview.BufferRendererPreview.1
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr2, int[] iArr) {
                return (Boolean) func4.Invoke(num, fArr2, iArr, fArr);
            }
        }, i, f, vec2f, vec2f2, new RenderPassData(i2, iAtlasTexture, vShaderBinder, (Action3<RenderState, VShaderProgram, RenderPassData>) null));
    }

    public void setDestCanvas(Canvas canvas) {
        this.destCanvas = canvas;
    }
}
