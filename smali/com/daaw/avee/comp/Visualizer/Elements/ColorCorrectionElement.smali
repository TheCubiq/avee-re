.class public Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "ColorCorrectionElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "ColorCorrection"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;-><init>()V

    # .line 20
    # sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->color2:I

    # invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setColor(I)V

    # .line 21
    # sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->textBlendMode:I

    # invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setBlendMode(I)V

    # const/16 v0, 0x1c

    # .line 22
    # invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setFontSize(I)V

    # const v0, 0x3d4ccccd    # 0.05f

    # const/high16 v1, 0x3f800000    # 1.0f

    # .line 23
    # invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setPosition(FF)V

    # const/4 v0, 0x0

    # const v1, 0x3fd9999a    # 1.7f

    # .line 24
    # invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setLocalPosition(FF)V

    # const/4 v0, 0x1

    # const/4 v1, 0x0

    # .line 25
    # invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setPositionUniform(ZZ)V

    # const-string v0, "fps:{Fps} flush:{StatFlush} res:{WaitResLoad},{ResLoad},{GradualResLoad} rt:{RTSwitch}"

    # .line 26
    # invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;->setText(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "ColorCorrection"

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public isShaderEditable()Z
    .locals 1

    const v0, 0x0

    return v0
.end method

.method public initCustomShader()V

    .locals 5

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;
    move-result-object v2
    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;
    move-result-object v2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2



    const v3, 0x7f0f0034
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    # const-string v3, "//test\n//combined projection and view matrix\nuniform mat4 u_projView;\n\n//\"in\" attributes\nattribute vec3 Position;\nattribute vec2 TexCoord;\nattribute vec4 Color;\n\n//\"out\" varyings to our fragment shader\nvarying vec4 vColor;\nvarying vec2 vTexCoord;\n \nvoid main() {\n	vColor = Color;\n	vTexCoord = TexCoord;\n	gl_Position = u_projView * vec4(Position, 1.0);\n	//gl_Position = vec4(Position, 0.0, 1.0);\n\n	    // vTexCoord = Position.xy*madd+madd;\n        // gl_Position = vec4(Position,1.0);\n}"
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;



    # const v3, 0x7f0f0033
    # invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    # move-result-object v3
    	
    # test liquify
    # const-string v3, "precision highp float;\r\nprecision mediump int;\r\nprecision lowp sampler2D;\r\nprecision lowp samplerCube;\r\n\r\nuniform sampler2D u_texture;\r\n\r\nuniform float u_value1;\r\nuniform float u_value2;\r\nuniform float u_value3;\r\nuniform float u_value4;\r\nuniform float u_value5;\r\nuniform float u_value6;\r\nvarying vec2 vTexCoord;\r\n\r\nvec3 mod289(vec3 x) {\r\n    return x - floor(x * (1.0 / 289.0)) * 289.0;\r\n}\r\n\r\nvec4 mod289(vec4 x) {\r\n    return x - floor(x * (1.0 / 289.0)) * 289.0;\r\n}\r\n\r\nvec4 permute(vec4 x) {\r\n    return mod289(((x * 34.0) + 1.0) * x);\r\n}\r\n\r\nvec4 taylorInvSqrt(vec4 r) {\r\n    return 1.79284291400159 - 0.85373472095314 * r;\r\n}\r\n\r\nfloat snoise(vec3 v) {\r\n    const vec2 C = vec2(1.0 / 6.0, 1.0 / 3.0);\r\n    const vec4 D = vec4(0.0, 0.5, 1.0, 2.0);\r\n    vec3 i = floor(v + dot(v, C.yyy));\r\n    vec3 x0 = v - i + dot(i, C.xxx);\r\n    vec3 g = step(x0.yzx, x0.xyz);\r\n    vec3 l = 1.0 - g;\r\n    vec3 i1 = min(g.xyz, l.zxy);\r\n    vec3 i2 = max(g.xyz, l.zxy);\r\n    vec3 x1 = x0 - i1 + C.xxx;\r\n    vec3 x2 = x0 - i2 + C.yyy;\r\n    vec3 x3 = x0 - D.yyy;\r\n    i = mod289(i);\r\n    vec4 p = permute(permute(permute(i.z + vec4(0.0, i1.z, i2.z, 1.0))\r\n           + i.y + vec4(0.0, i1.y, i2.y, 1.0))\r\n           + i.x + vec4(0.0, i1.x, i2.x, 1.0));\r\n    float n_ = 0.142857142857;\r\n    vec3 ns = n_ * D.wyz - D.xzx;\r\n    vec4 j = p - (49.0 + u_value6*50.0) * floor(p * ns.z * ns.z);\r\n    vec4 x_ = floor(j * ns.z);\r\n    vec4 y_ = floor(j - 7.0 * x_);\r\n    vec4 x = x_ * ns.x + ns.yyyy;\r\n    vec4 y = y_ * ns.x + ns.yyyy;\r\n    vec4 h = 1.0 - abs(x) - abs(y);\r\n    vec4 b0 = vec4(x.xy, y.xy);\r\n    vec4 b1 = vec4(x.zw, y.zw);\r\n    vec4 s0 = floor(b0) * 2.0 + 1.0;\r\n    vec4 s1 = floor(b1) * 2.0 + 1.0;\r\n    vec4 sh = -step(h, vec4(0.0));\r\n    vec4 a0 = b0.xzyw + s0.xzyw * sh.xxyy;\r\n    vec4 a1 = b1.xzyw + s1.xzyw * sh.zzww;\r\n    vec3 p0 = vec3(a0.xy, h.x);\r\n    vec3 p1 = vec3(a0.zw, h.y);\r\n    vec3 p2 = vec3(a1.xy, h.z);\r\n    vec3 p3 = vec3(a1.zw, h.w);\r\n    vec4 norm = taylorInvSqrt(vec4(dot(p0, p0), dot(p1, p1), dot(p2, p2), dot(p3, p3)));\r\n    p0 *= norm.x;\r\n    p1 *= norm.y;\r\n    p2 *= norm.z;\r\n    p3 *= norm.w;\r\n    vec4 m = max(0.6 - vec4(dot(x0, x0), dot(x1, x1), dot(x2, x2), dot(x3, x3)), 0.0);\r\n    m = m * m;\r\n    return 42.0 * dot(m * m, vec4(dot(p0, x0), dot(p1, x1), dot(p2, x2), dot(p3, x3)));\r\n}\r\n\r\n#define scalDivt 2.1\r\n\r\nfloat FBM(vec3 v) {\r\n    float sc1 = 1.0 / u_value5 * 0.1;\r\n    float sc2 = sc1 / u_value5 * 0.1;\r\n    float sc3 = sc2 / u_value5 * 0.1;\r\n    float sc1t = 1.0 / scalDivt;\r\n    float sc2t = sc1t / scalDivt;\r\n    float sc3t = sc2t / scalDivt;\r\n    return 1.0 * 0.5 * snoise(v * vec3(sc3, sc3, sc3t)) +\r\n           0.4 * 0.25 * snoise(v * vec3(sc2, sc2, sc2t)) +\r\n           0.15 * 0.125 * snoise(v * vec3(sc1, sc1, sc1t));\r\n}\r\n\r\nvoid main() {\r\n    // mainImage(gl_FragColor, gl_FragCoord.xy);\n    float _control = u_value2 * 1.;\r\n    float _scale = u_value3 * 50.;\r\n    float _complexity = u_value4 * 1000.;\r\n    vec2 uv = vTexCoord * (1.0 - 0.02 * _scale) + (vec2(_scale, _scale) * 0.01);\r\n    float niceNoise1 = FBM(vec3(_complexity * uv, 0.04 * 60.0 * (_control)));\r\n    float niceNoise2 = FBM(vec3(_complexity * uv, 0.04 * 62.0 * (_control) + 300.0));\r\n    gl_FragColor = texture2D(u_texture, uv + vec2(u_value1 * 0.1 * niceNoise1, u_value1 * 0.105 * niceNoise2));\r\n}"
    
    const-string v3, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\nuniform sampler2D u_texture;\nuniform float u_hueAmount;\nuniform float u_brightness;\nuniform float u_contrast;\nuniform float u_shadows;\nuniform float u_highlights;\nuniform float u_vibrance;\nuniform float u_saturation;\nuniform float u_invert;\n// uniform float mulR;\n// uniform float mulG;\n// uniform float mulB;\n// uniform float addR;\n// uniform float addG;\n// uniform float addB;\n\nvarying vec2 vTexCoord;\n\nvec4 hue (in vec3 c, in float s, in float a)\n{\n    vec3 P = vec3(0.55735)*dot(vec3(0.55735),c);\n    vec3 U = c-P;\n    vec3 V = cross(vec3(0.55735),U);    \n    c = U*cos(s*6.2832) + V*sin(s*6.2832) + P;\n    return vec4(c, a);\n}\n\nfloat invLerp( float a, float b, float v ) {\n    return (v-a)/(b-a);\n}\n\nvec4 saturate(vec4 col, float adjustment)\n    {\n      const vec3 W = vec3(0.2125, 0.7154, 0.0721);\n      vec3 color = col.rgb;\n      vec3 intensityRGB = vec3(dot(color, W));\n      vec4 intensityRGBA = vec4(intensityRGB, col.a);\n      return mix(intensityRGBA, col, adjustment);\n    }\n\nvoid main()\n{\n  vec4 pixelColor = texture2D(u_texture, vTexCoord);\n  float averageColor = (pixelColor.r + pixelColor.g + pixelColor.b) / 3.0;\n  float maxColor = max(pixelColor.r, max(pixelColor.g, pixelColor.b));\n  const vec3 luma = vec3(0.2125, 0.7154, 0.0721);\n  float luminance = dot(pixelColor.rgb, luma);\n  \n//   pixelColor.r = (pixelColor.r * mulR) + addR; // add/multiply by channel\n//   pixelColor.g = (pixelColor.g * mulG) + addG;\n//   pixelColor.b = (pixelColor.b * mulB) + addB;\n\n  pixelColor.rgb = ((pixelColor.rgb) * max(u_contrast, 0.0));\n\n  pixelColor.rgb += u_brightness - 1.; //u_brightness\n  pixelColor.rgb = ((pixelColor.rgb-vec3(0.5))*u_contrast)+vec3(0.5); // u_contrast\n  pixelColor = hue(pixelColor.rgb, invLerp(360., 0., u_hueAmount), pixelColor.a); // hue\n\n  float vibrAmt = (maxColor - averageColor) * (-3.0 * u_vibrance); // u_vibrance\n  pixelColor.rgb = mix(pixelColor.rgb, vec3(maxColor), vibrAmt);\n\n  pixelColor = saturate(pixelColor, u_saturation); // u_saturation\n\n  float shadow = clamp((pow(luminance, 1.0 / (u_shadows + 1.0)) + (-0.76) * pow(luminance, 2.0 / (u_shadows + 1.0))) - luminance, 0.0, 1.0);\n  float highlight = clamp((1.0 - (pow(1.0 - luminance, 1.0 / (2.0 - u_highlights)) + (-0.8) * pow(1.0 - luminance, 2.0 / (2.0 - u_highlights)))) - luminance, -1.0, 0.0);\n  pixelColor.rgb = (luminance + shadow + highlight) * (pixelColor.rgb / vec3(luminance)); // u_shadows and u_highlights\n\n  if(u_invert > 0.1) { pixelColor = vec4(1.0 - pixelColor.rgb, pixelColor.a); }\n\n  gl_FragColor = clamp(pixelColor, 0.0, 1.0);\n}\n"

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 10

    # addValueWithProperties("value1", 0.0f, -1.0f, 1.0f);

    const/4 v1, 0x0

    const/high16 v2, 0xbf800000    # -1.0f
    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0xc1200000    # -10.0f
    const/high16 v5, 0x41200000    # 10.0f

    const/high16 v6, 0xc3b40000   # -360.0f
    const/high16 v7, 0x43b40000    # 360.0f

    const/high16 v8, 0xc0000000    # -2.0f
    const/high16 v9, 0x40000000   # 2.0f


    const-string v0, "hueAmount" # 0/-360/360
    invoke-virtual {p0, v0, v1, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    const-string v0, "brightness" # 1/-2/2
    invoke-virtual {p0, v0, v3, v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    const-string v0, "contrast" # 1/-1/10
    invoke-virtual {p0, v0, v3, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "shadows" # 0/0/2
    invoke-virtual {p0, v0, v1, v1, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "vibrance" #0/-10/10
    invoke-virtual {p0, v0, v1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "saturation" # 1/-10/10
    invoke-virtual {p0, v0, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "highlights" # 1/-10/1
    invoke-virtual {p0, v0, v3, v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "invert" # 0/0/1
    invoke-virtual {p0, v0, v1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    return-void
.end method
