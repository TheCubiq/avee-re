package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.Graphic.BufferRenderer;
/* loaded from: classes.dex */
public class BufferRendererEdge extends BufferRenderer {
    Vec2f m0;
    Vec2f m1;
    float texOff02;
    float texOff13;
    private BufferRenderer.Vertex v1;

    public BufferRendererEdge(int i) {
        super(i);
        this.v1 = new BufferRenderer.Vertex();
        this.m0 = new Vec2f(0.0f, 0.0f);
        this.m1 = new Vec2f(0.0f, 0.0f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawRectangle2Patch(IRenderState iRenderState, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        if (checkFlush((RenderState) iRenderState, 4, renderPassData, false)) {
            vec2f.x = renderPassData.translateU(vec2f.x);
            vec2f.y = renderPassData.translateV(vec2f.y);
            vec2f2.x = renderPassData.translateU(vec2f2.x);
            vec2f2.y = renderPassData.translateV(vec2f2.y);
            vec2f2.y = 0.0f;
            this.m0.x = (f + f5) * 0.5f;
            this.m0.y = (f2 + f6) * 0.5f;
            this.m1.x = (f3 + f7) * 0.5f;
            this.m1.y = (f4 + f8) * 0.5f;
            float length = Vec2f.length(f - f5, f2 - f6) * 0.5f * 0.0234375f;
            float length2 = Vec2f.length(f3 - f7, f4 - f8) * 0.5f * 0.0234375f;
            this.v1.posW = 1.0f;
            this.v1.texZ = renderPassData.translateW();
            this.v1.colorRgba = i;
            this.v1.posZ = f9;
            this.v1.posX = this.m0.x;
            this.v1.posY = this.m0.y;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y + length;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = this.m1.x;
            this.v1.posY = this.m1.y;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y + length2;
            updateStreamWrite(this.v1);
            this.v1.posX = this.m1.x;
            this.v1.posY = this.m1.y;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y + length2;
            updateStreamWrite(this.v1);
            this.v1.posX = f;
            this.v1.posY = f2;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f3;
            this.v1.posY = f4;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f5;
            this.v1.posY = f6;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = this.m0.x;
            this.v1.posY = this.m0.y;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y + length;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = f7;
            this.v1.posY = f8;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f.y;
            updateStreamWrite(this.v1);
            this.v1.posX = this.m0.x;
            this.v1.posY = this.m0.y;
            this.v1.texX = vec2f.x;
            this.v1.texY = vec2f2.y + length;
            updateStreamWrite(this.v1);
            this.v1.posX = this.m1.x;
            this.v1.posY = this.m1.y;
            this.v1.texX = vec2f2.x;
            this.v1.texY = vec2f2.y + length2;
            updateStreamWrite(this.v1);
            this.updateParticleCount += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer
    public void drawBatchRectangle2Patch(IRenderState iRenderState, Func3<Integer, float[], int[], Boolean> func3, int i, float f, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        int i2;
        int i3;
        RenderState renderState = (RenderState) iRenderState;
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        vec2f.x = renderPassData.translateU(vec2f.x);
        vec2f.y = renderPassData.translateV(vec2f.y);
        vec2f2.x = renderPassData.translateU(vec2f2.x);
        vec2f2.y = renderPassData.translateV(vec2f2.y);
        vec2f2.y = 0.0f;
        this.v1.posW = 1.0f;
        this.v1.texZ = renderPassData.translateW();
        this.v1.posZ = f;
        int i4 = this.maxTrianglesBatchForRender - (this.maxTrianglesBatchForRender % 4);
        ?? r5 = 0;
        int i5 = 0;
        while (i5 < i) {
            if ((i5 * 4) % i4 == 0 && !checkFlush(renderState, Math.min((i - i5) * 4, i4), renderPassData, r5)) {
                return;
            }
            if (func3.Invoke(Integer.valueOf(i5), fArr, iArr).booleanValue()) {
                this.m0.x = (fArr[r5] + fArr[c]) * 0.5f;
                this.m0.y = (fArr[1] + fArr[5]) * 0.5f;
                this.m1.x = (fArr[2] + fArr[6]) * 0.5f;
                this.m1.y = (fArr[3] + fArr[7]) * 0.5f;
                this.texOff02 = Vec2f.length(fArr[r5] - fArr[c], fArr[1] - fArr[5]) * 0.5f * 0.0234375f;
                this.texOff13 = Vec2f.length(fArr[2] - fArr[6], fArr[3] - fArr[7]) * 0.5f * 0.0234375f;
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f2.y + this.texOff02;
                i2 = i5;
                i3 = i4;
                updateStreamWrite(this.v1, this.m0.x, this.m0.y, this.v1.posZ, iArr, 2);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y + this.texOff13;
                updateStreamWrite(this.v1, this.m1.x, this.m1.y, this.v1.posZ, iArr, 3);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y + this.texOff13;
                updateStreamWrite(this.v1, this.m1.x, this.m1.y, this.v1.posZ, iArr, 3);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 1);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 2);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f2.y + this.texOff02;
                updateStreamWrite(this.v1, this.m0.x, this.m0.y, this.v1.posZ, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f.y;
                updateStreamWrite(this.v1, fArr, iArr, 3);
                this.v1.texX = vec2f.x;
                this.v1.texY = vec2f2.y + this.texOff02;
                updateStreamWrite(this.v1, this.m0.x, this.m0.y, this.v1.posZ, iArr, 0);
                this.v1.texX = vec2f2.x;
                this.v1.texY = vec2f2.y + this.texOff13;
                updateStreamWrite(this.v1, this.m1.x, this.m1.y, this.v1.posZ, iArr, 1);
                this.updateParticleCount += 4;
            } else {
                i2 = i5;
                i3 = i4;
            }
            i5 = i2 + 1;
            i4 = i3;
            r5 = 0;
            c = 4;
        }
    }
}
