.class public Lcom/daaw/avee/comp/Visualizer/Elements/ZoomBlurEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "ZoomBlurEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "ZoomBlurEffect"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ZoomBlurEffectElement;->typeName:Ljava/lang/String;

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
    const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "// shader author(s): PixiJS + Cubiq\nuniform float u_strength;\nuniform float u_innerRadius;\nuniform float u_radius;\nuniform float u_passes;\nuniform float u_gradientLength;\nuniform float u_centerX;\nuniform float u_centerY;\nuniform float u_aspectRatio;\n\n\n\n// uniform vec2 resolution;\n\n// #define u_centerX 0.5\n// #define u_centerY 0.5\n\n#define resolution vec2(u_aspectRatio,1.)\n\nvarying vec2 vTexCoord;\nuniform sampler2D u_texture;\n\n\nfloat rand(vec2 co, float seed) {\n  const float a = 12.9898, b = 78.233, c = 43758.5453;\n  float dt = dot(co + seed, vec2(a, b));\n  float sn = mod(dt, 3.14159);\n  return fract(sin(sn) * c + seed);\n}\n\nvoid main()\n{\n  // Define your variables \n  vec2 iCenter = (vec2(u_centerX, u_centerY)+1.)/2.; // Example center position\n  float iStrength = u_strength; // Example u_strength\n  float iInnerRadius = u_innerRadius; // Example inner u_radius\n//   float iRadius = 10000.; // Example u_radius\n  float iRadius = u_radius/0.9; // Example \n  float iMaxKernelSize = u_passes*100.; // Example max kernel size\n\n  //vec2 vTexCoord = gl_FragCoord / resolution.xy;\n  // Convert uCenter, uu_InnerRadius, and uu_Radius to screen space\n  iCenter *= resolution.xy;\n  iInnerRadius *= min(resolution.x, resolution.y);\n  iRadius *= min(resolution.x, resolution.y);\n  \n\n   \n  float minGradient = iInnerRadius * 0.3 * u_gradientLength*5.;\n  float u_innerRadius = (iInnerRadius + minGradient * 0.5) / resolution.x;\n\n  float gradient = iRadius * 0.3;\n  float u_radius = (iRadius - gradient * 0.5) / resolution.x;\n\n\n  float countLimit = iMaxKernelSize;\n\n  vec2 dir = vec2(iCenter.xy / resolution.xy - vTexCoord.xy);\n  float dist = length(vec2(dir.x, dir.y * resolution.y / resolution.x));\n\n  float u_strength = iStrength;\n\n  float delta = 0.0;\n  float gap;\n  if (dist < u_innerRadius) {\n      delta = u_innerRadius - dist;\n      gap = minGradient;\n  } else if (u_radius >= 0.0 && dist > u_radius) {\n      delta = dist - u_radius;\n      gap = gradient;\n  }\n\n  if (delta > 0.0) {\n      float normalCount = gap / resolution.x;\n      delta = (normalCount - delta) / normalCount;\n      countLimit *= delta;\n      u_strength *= delta;\n      if (countLimit < 1.0)\n      {\n          gl_FragColor = texture2D(u_texture, vTexCoord.xy);\n          return;\n      }\n  }\n\n  // randomize the lookup values to hide the fixed number of samples\n  float offset = rand(vTexCoord.xy, 0.0);\n\n  float total = 0.0;\n  vec4 color = vec4(0.0);\n\n  dir *= u_strength;\n\n  for (float t = 0.0; t < iMaxKernelSize; t++) {\n      float percent = (t + offset) / iMaxKernelSize;\n      float weight = 4.0 * (percent - percent * percent);\n      vec2 p = vTexCoord.xy + dir * percent;\n      vec4 mysample = texture2D(u_texture, p);\n\n      // switch to pre-multiplied alpha to correctly blur transparent images\n      // sample.rgb *= sample.a;\n\n      color += mysample * weight;\n      total += weight;\n\n      if (t > countLimit){\n          break;\n      }\n  }\n\n  color /= total;\n  // switch back from pre-multiplied alpha\n  // color.rgb /= color.a + 0.00001;\n\n  gl_FragColor = color;\n}"
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


    const-string v0, "strength" #0.5/0/1
    invoke-virtual {p0, v0, v7, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "innerRadius" #0.3/0/1
    invoke-virtual {p0, v0, v6, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "radius" #1/0/1
    invoke-virtual {p0, v0, v3, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "passes" #0.5/0/1
    invoke-virtual {p0, v0, v7, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "gradientLength" #0.5/0/1
    invoke-virtual {p0, v0, v7, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
     
    const-string v0, "centerX" # 0/-1/1
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "centerY" # 0/-1/1
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "aspectRatio" # 0.5/0/2
    invoke-virtual {p0, v0, v7, v1, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    return-void
.end method
