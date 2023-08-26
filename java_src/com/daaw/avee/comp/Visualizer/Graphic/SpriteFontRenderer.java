package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.Graphic.SpriteFont;
/* loaded from: classes.dex */
public class SpriteFontRenderer {
    private BufferRenderer bufferRenderer;

    public SpriteFontRenderer(BufferRenderer bufferRenderer) {
        this.bufferRenderer = bufferRenderer;
    }

    public Vec2i measureTextBounds(SpriteFont spriteFont, String str) {
        float f = spriteFont.getSpriteDescByChar(str.charAt(0)).visualXOffset + 0.0f;
        float f2 = f >= 0.0f ? f : 0.0f;
        int i = 1;
        while (i < str.length() - 1) {
            f2 += spriteFont.getSpriteDescByChar(str.charAt(i)).spaceWidth;
            i++;
        }
        SpriteFont.Glyph spriteDescByChar = spriteFont.getSpriteDescByChar(str.charAt(i));
        return new Vec2i((int) (f2 + spriteDescByChar.visualXOffset + spriteDescByChar.spaceWidth), (int) spriteFont.fontMaxHeight());
    }

    public Vec2i measureText(SpriteFont spriteFont, String str) {
        float f = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            f += spriteFont.getSpriteDescByChar(str.charAt(i)).spaceWidth;
        }
        return new Vec2i((int) f, (int) spriteFont.fontHeight());
    }

    public int measureTextY(SpriteFont spriteFont) {
        return (int) spriteFont.fontHeight();
    }

    public void flush(RenderState renderState) {
        this.bufferRenderer.flush(renderState);
    }

    public void drawText(RenderState renderState, SpriteFont spriteFont, Vec3f vec3f, String str, int i, RenderPassData renderPassData) {
        drawText(renderState, spriteFont, vec3f, str, i, 0, false, 0, 0, 0, 0, renderPassData);
    }

    public void drawText(RenderState renderState, SpriteFont spriteFont, Vec3f vec3f, String str, int i, int i2, RenderPassData renderPassData) {
        drawText(renderState, spriteFont, vec3f, str, i, i2, false, 0, 0, 0, 0, renderPassData);
    }

    public void drawText(RenderState renderState, SpriteFont spriteFont, Vec3f vec3f, String str, int i, int i2, boolean z, int i3, int i4, int i5, int i6, RenderPassData renderPassData) {
        Vec2f vec2f;
        Vec2f vec2f2;
        float f;
        Vec2f vec2f3;
        Vec2f vec2f4;
        SpriteFontRenderer spriteFontRenderer = this;
        SpriteFont spriteFont2 = spriteFont;
        int length = str.length();
        float f2 = vec3f.x;
        float f3 = vec3f.y;
        float f4 = i3 + i5;
        float f5 = i4 + i6;
        Vec2f vec2f5 = new Vec2f(0.0f, 0.0f);
        Vec2f vec2f6 = new Vec2f(0.0f, 0.0f);
        char c = '\n';
        if (!z) {
            float f6 = f3;
            float f7 = f2;
            int i7 = i2;
            while (i7 < length) {
                char charAt = str.charAt(i7);
                if (charAt == c) {
                    f6 += spriteFont.fontHeight();
                    f7 = f2;
                    f = f7;
                    vec2f3 = vec2f6;
                    vec2f4 = vec2f5;
                } else {
                    SpriteFont.Glyph spriteDescByChar = spriteFont2.getSpriteDescByChar(charAt);
                    vec2f5.x = spriteDescByChar.x / spriteFont.textureDim().x;
                    vec2f5.y = spriteDescByChar.y / spriteFont.textureDim().y;
                    vec2f6.x = (spriteDescByChar.x + spriteDescByChar.width) / spriteFont.textureDim().x;
                    vec2f6.y = (spriteDescByChar.y + spriteDescByChar.height) / spriteFont.textureDim().y;
                    f = f2;
                    vec2f3 = vec2f6;
                    vec2f4 = vec2f5;
                    spriteFontRenderer.bufferRenderer.drawRectangleRightBottomWH(renderState, spriteDescByChar.visualXOffset + f7, (spriteDescByChar.visualYOffset + f6) - spriteDescByChar.height, 1.0f, spriteDescByChar.width, spriteDescByChar.height, i, vec2f4, vec2f3, renderPassData, false);
                    f7 += spriteDescByChar.spaceWidth;
                    f6 = f6;
                }
                i7++;
                vec2f5 = vec2f4;
                vec2f6 = vec2f3;
                f2 = f;
                c = '\n';
            }
            return;
        }
        Vec2f vec2f7 = vec2f5;
        char c2 = '\n';
        Vec2f vec2f8 = vec2f6;
        float f8 = f2;
        float f9 = f3;
        int i8 = i2;
        while (i8 < length) {
            char charAt2 = str.charAt(i8);
            if (charAt2 == c2) {
                f9 += spriteFont.fontHeight();
                vec2f = vec2f7;
                vec2f2 = vec2f8;
            } else {
                SpriteFont.Glyph spriteDescByChar2 = spriteFont2.getSpriteDescByChar(charAt2);
                float f10 = i3 - f8;
                float f11 = i4 - f9;
                float f12 = (spriteDescByChar2.width + f8) - f4;
                float f13 = (spriteDescByChar2.height + f9) - f5;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f10 > spriteDescByChar2.width || f12 > spriteDescByChar2.width || f11 > spriteDescByChar2.height || f13 > spriteDescByChar2.height) {
                    vec2f = vec2f7;
                    vec2f2 = vec2f8;
                    f8 += spriteDescByChar2.spaceWidth;
                } else {
                    float f14 = f8 + f10;
                    float f15 = spriteDescByChar2.x + f10;
                    float f16 = spriteDescByChar2.y + f11;
                    float f17 = spriteDescByChar2.width - f12;
                    float f18 = spriteDescByChar2.height - f13;
                    Vec2f vec2f9 = vec2f7;
                    vec2f9.x = f15 / spriteFont.textureDim().x;
                    vec2f9.y = f16 / spriteFont.textureDim().y;
                    vec2f8.x = (f15 + f17) / spriteFont.textureDim().x;
                    vec2f8.y = (f16 + f18) / spriteFont.textureDim().y;
                    vec2f = vec2f9;
                    vec2f2 = vec2f8;
                    spriteFontRenderer.bufferRenderer.drawRectangleRightBottomWH(renderState, f14, f9 + f11, 1.0f, f17, f18, i, vec2f, vec2f2, renderPassData, false);
                    f8 = f14 + spriteDescByChar2.spaceWidth;
                }
            }
            i8++;
            spriteFontRenderer = this;
            spriteFont2 = spriteFont;
            vec2f7 = vec2f;
            vec2f8 = vec2f2;
            c2 = '\n';
        }
    }
}
