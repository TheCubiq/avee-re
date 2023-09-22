.class public Lcom/daaw/avee/comp/Visualizer/Elements/LiquifyEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "LiquifyEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "LiquifyEffect"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;-><init>()V
    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/LiquifyEffectElement;->typeName:Ljava/lang/String;

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


    # load the default shadervert
    const v3, 0x7f0f0034
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;


    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    # boilerplate
    const-string v4, "precision highp float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "uniform sampler2D u_texture;\n\nuniform float u_intensity;\nuniform float u_control;\nuniform float u_zoom;\nuniform float u_complexity;\nuniform float u_noiseScale;\nuniform float u_blobs;\n\nvarying vec2 vTexCoord;\n\nvec3 mod289(vec3 x) {\n    return x - floor(x * (1.0 / 289.0)) * 289.0;\n}\n\nvec4 mod289(vec4 x) {\n    return x - floor(x * (1.0 / 289.0)) * 289.0;\n}\n\nvec4 permute(vec4 x) {\n    return mod289(((x * 34.0) + 1.0) * x);\n}\n\nvec4 taylorInvSqrt(vec4 r) {\n    return 1.79284291400159 - 0.85373472095314 * r;\n}\n\nfloat snoise(vec3 v) {\n    const vec2 C = vec2(1.0 / 6.0, 1.0 / 3.0);\n    const vec4 D = vec4(0.0, 0.5, 1.0, 2.0);\n    vec3 i = floor(v + dot(v, C.yyy));\n    vec3 x0 = v - i + dot(i, C.xxx);\n    vec3 g = step(x0.yzx, x0.xyz);\n    vec3 l = 1.0 - g;\n    vec3 i1 = min(g.xyz, l.zxy);\n    vec3 i2 = max(g.xyz, l.zxy);\n    vec3 x1 = x0 - i1 + C.xxx;\n    vec3 x2 = x0 - i2 + C.yyy;\n    vec3 x3 = x0 - D.yyy;\n    i = mod289(i);\n    vec4 p = permute(permute(permute(i.z + vec4(0.0, i1.z, i2.z, 1.0))\n           + i.y + vec4(0.0, i1.y, i2.y, 1.0))\n           + i.x + vec4(0.0, i1.x, i2.x, 1.0));\n    float n_ = 0.142857142857;\n    vec3 ns = n_ * D.wyz - D.xzx;\n    vec4 j = p - (49.0 + u_blobs*50.0) * floor(p * ns.z * ns.z);\n    vec4 x_ = floor(j * ns.z);\n    vec4 y_ = floor(j - 7.0 * x_);\n    vec4 x = x_ * ns.x + ns.yyyy;\n    vec4 y = y_ * ns.x + ns.yyyy;\n    vec4 h = 1.0 - abs(x) - abs(y);\n    vec4 b0 = vec4(x.xy, y.xy);\n    vec4 b1 = vec4(x.zw, y.zw);\n    vec4 s0 = floor(b0) * 2.0 + 1.0;\n    vec4 s1 = floor(b1) * 2.0 + 1.0;\n    vec4 sh = -step(h, vec4(0.0));\n    vec4 a0 = b0.xzyw + s0.xzyw * sh.xxyy;\n    vec4 a1 = b1.xzyw + s1.xzyw * sh.zzww;\n    vec3 p0 = vec3(a0.xy, h.x);\n    vec3 p1 = vec3(a0.zw, h.y);\n    vec3 p2 = vec3(a1.xy, h.z);\n    vec3 p3 = vec3(a1.zw, h.w);\n    vec4 norm = taylorInvSqrt(vec4(dot(p0, p0), dot(p1, p1), dot(p2, p2), dot(p3, p3)));\n    p0 *= norm.x;\n    p1 *= norm.y;\n    p2 *= norm.z;\n    p3 *= norm.w;\n    vec4 m = max(0.6 - vec4(dot(x0, x0), dot(x1, x1), dot(x2, x2), dot(x3, x3)), 0.0);\n    m = m * m;\n    return 42.0 * dot(m * m, vec4(dot(p0, x0), dot(p1, x1), dot(p2, x2), dot(p3, x3)));\n}\n\n#define scalDivt 2.1\n\nfloat FBM(vec3 v) {\n    float sc1 = 1.0 / u_noiseScale * 0.1;\n    float sc2 = sc1 / u_noiseScale * 0.1;\n    float sc3 = sc2 / u_noiseScale * 0.1;\n    float sc1t = 1.0 / scalDivt;\n    float sc2t = sc1t / scalDivt;\n    float sc3t = sc2t / scalDivt;\n    return 1.0 * 0.5 * snoise(v * vec3(sc3, sc3, sc3t)) +\n           0.4 * 0.25 * snoise(v * vec3(sc2, sc2, sc2t)) +\n           0.15 * 0.125 * snoise(v * vec3(sc1, sc1, sc1t));\n}\n\nvoid main() {\n    // mainImage(gl_FragColor, gl_FragCoord.xy);\n    float _control = u_control * 1.;\n    float _scale = u_zoom * 50.;\n    float _complexity = u_complexity * 1000.;\n    vec2 uv = vTexCoord * (1.0 - 0.02 * _scale) + (vec2(_scale, _scale) * 0.01);\n    float niceNoise1 = FBM(vec3(_complexity * uv, 0.04 * 60.0 * (_control)));\n    float niceNoise2 = FBM(vec3(_complexity * uv, 0.04 * 62.0 * (_control) + 300.0));\n    gl_FragColor = texture2D(u_texture, uv + vec2(u_intensity * 0.1 * niceNoise1, u_intensity * 0.105 * niceNoise2));\n}"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
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

    const v6, 0x3e99999a    # 0.3f
    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v8, 0x40000000   # 2.0f


    const-string v0, "intensity" #0.3/0/1
    invoke-virtual {p0, v0, v6, v1, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "control" #0/-10/10
    invoke-virtual {p0, v0, v1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    const-string v0, "complexity" #0.3/0/1
    invoke-virtual {p0, v0, v6, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "noiseScale" #0.3/0/1
    invoke-virtual {p0, v0, v6, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "blobs" #0/0/0.5
    invoke-virtual {p0, v0, v1, v1, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "zoom" #0/-1/1
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    

    return-void
.end method
