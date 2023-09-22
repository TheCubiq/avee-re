package com.daaw.avee.comp.Visualizer.Elements;

import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;

public class ColorCorrectionElement extends DummyElement {
    public static final String typeName = "ColorCorrection";

    public String getElementTypeName() {
        return typeName;
    }

    public void initCustomShader() {
        PlayerCore.s().getAppContext().getResources();
        ((DummyElement) this).shaderVert = "//test\n//combined projection and view matrix\nuniform mat4 u_projView;\n\n//\"in\" attributes\nattribute vec3 Position;\nattribute vec2 TexCoord;\nattribute vec4 Color;\n\n//\"out\" varyings to our fragment shader\nvarying vec4 vColor;\nvarying vec2 vTexCoord;\n \nvoid main() {\n\tvColor = Color;\n\tvTexCoord = TexCoord;\n\tgl_Position = u_projView * vec4(Position, 1.0);\n\t//gl_Position = vec4(Position, 0.0, 1.0);\n\n\t    // vTexCoord = Position.xy*madd+madd;\n        // gl_Position = vec4(Position,1.0);\n}";
        ((DummyElement) this).shaderFrag = "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\nuniform sampler2D u_texture;\nuniform float u_hueAmount;\nuniform float u_brightness;\nuniform float u_contrast;\nuniform float u_shadows;\nuniform float u_highlights;\nuniform float u_vibrance;\nuniform float u_saturation;\nuniform float u_invert;\n// uniform float mulR;\n// uniform float mulG;\n// uniform float mulB;\n// uniform float addR;\n// uniform float addG;\n// uniform float addB;\n\nvarying vec2 vTexCoord;\n\nvec4 hue (in vec3 c, in float s, in float a)\n{\n    vec3 P = vec3(0.55735)*dot(vec3(0.55735),c);\n    vec3 U = c-P;\n    vec3 V = cross(vec3(0.55735),U);    \n    c = U*cos(s*6.2832) + V*sin(s*6.2832) + P;\n    return vec4(c, a);\n}\n\nfloat invLerp( float a, float b, float v ) {\n    return (v-a)/(b-a);\n}\n\nvec4 saturate(vec4 col, float adjustment)\n    {\n      const vec3 W = vec3(0.2125, 0.7154, 0.0721);\n      vec3 color = col.rgb;\n      vec3 intensityRGB = vec3(dot(color, W));\n      vec4 intensityRGBA = vec4(intensityRGB, col.a);\n      return mix(intensityRGBA, col, adjustment);\n    }\n\nvoid main()\n{\n  vec4 pixelColor = texture2D(u_texture, vTexCoord);\n  float averageColor = (pixelColor.r + pixelColor.g + pixelColor.b) / 3.0;\n  float maxColor = max(pixelColor.r, max(pixelColor.g, pixelColor.b));\n  const vec3 luma = vec3(0.2125, 0.7154, 0.0721);\n  float luminance = dot(pixelColor.rgb, luma);\n  \n//   pixelColor.r = (pixelColor.r * mulR) + addR; // add/multiply by channel\n//   pixelColor.g = (pixelColor.g * mulG) + addG;\n//   pixelColor.b = (pixelColor.b * mulB) + addB;\n\n  pixelColor.rgb = ((pixelColor.rgb) * max(u_contrast, 0.0));\n\n  pixelColor.rgb += u_brightness - 1.; //u_brightness\n  pixelColor.rgb = ((pixelColor.rgb-vec3(0.5))*u_contrast)+vec3(0.5); // u_contrast\n  pixelColor = hue(pixelColor.rgb, invLerp(360., 0., u_hueAmount), pixelColor.a); // hue\n\n  float vibrAmt = (maxColor - averageColor) * (-3.0 * u_vibrance); // u_vibrance\n  pixelColor.rgb = mix(pixelColor.rgb, vec3(maxColor), vibrAmt);\n\n  pixelColor = saturate(pixelColor, u_saturation); // u_saturation\n\n  float shadow = clamp((pow(luminance, 1.0 / (u_shadows + 1.0)) + (-0.76) * pow(luminance, 2.0 / (u_shadows + 1.0))) - luminance, 0.0, 1.0);\n  float highlight = clamp((1.0 - (pow(1.0 - luminance, 1.0 / (2.0 - u_highlights)) + (-0.8) * pow(1.0 - luminance, 2.0 / (2.0 - u_highlights)))) - luminance, -1.0, 0.0);\n  pixelColor.rgb = (luminance + shadow + highlight) * (pixelColor.rgb / vec3(luminance)); // u_shadows and u_highlights\n\n  if(u_invert > 0.1) { pixelColor = vec4(1.0 - pixelColor.rgb, pixelColor.a); }\n\n  gl_FragColor = clamp(pixelColor, 0.0, 1.0);\n}\n";
    }

    public void initCustomValues() {
        addValueWithProperties("hueAmount", 0.0f, -360.0f, 360.0f);
        addValueWithProperties("brightness", 1.0f, -2.0f, 2.0f);
        addValueWithProperties("contrast", 1.0f, -1.0f, 10.0f);
        addValueWithProperties("shadows", 0.0f, 0.0f, 2.0f);
        addValueWithProperties("vibrance", 0.0f, -10.0f, 10.0f);
        addValueWithProperties("saturation", 1.0f, -10.0f, 10.0f);
        addValueWithProperties("highlights", 1.0f, -10.0f, 1.0f);
        addValueWithProperties("invert", 0.0f, 0.0f, 1.0f);
    }

    public boolean isShaderEditable() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.DummyElement, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
    }
}
