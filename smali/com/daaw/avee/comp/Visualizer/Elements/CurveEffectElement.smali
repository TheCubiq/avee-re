.class public Lcom/daaw/avee/comp/Visualizer/Elements/CurveEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "CurveEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "CurveEffect"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/CurveEffectElement;->typeName:Ljava/lang/String;

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
    # const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    # invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "// Cubiqued, https://www.shadertoy.com/view/4ttXRH\nprecision highp float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\nuniform sampler2D u_texture;\n\nvarying vec2 vTexCoord;\n\n#define PI acos(-1.)\n\nuniform float u_innerRadius;\nuniform float u_outerRadius;\nuniform float u_aspectRatio;\n\n\nvoid main()\n{   \n    vec2 uv = vTexCoord * 2.0 - 1.0;\n    uv.x *= u_aspectRatio;\n    uv.y *= -1.;\n    \n    float theta = atan( uv.y, uv.x );\n    float dist = length( uv );\n    \n    //Make center circle and edge black\n   	float a = smoothstep( u_innerRadius - 0.001, u_innerRadius + 0.001, dist );\n    a *= 1.0 - smoothstep( u_outerRadius - 0.001, u_outerRadius + 0.001, dist );\n    \n    uv = vec2((theta + PI) / (PI * 2.0),\n    		  (dist - u_innerRadius) / (u_outerRadius - u_innerRadius)\n             );\n   \n	gl_FragColor = texture2D(u_texture , uv) * a;\n}"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 5

    const/high16 v2, 0xbf800000    # min -1.0f
    const/high16 v3, 0x3f800000    # max 1.0f

    const/4 v1, 0x0
    const-string v0, "innerRadius"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v1, 0x3f800000   #def 1.0f
    const/high16 v3, 0x40400000    #def 2.0f
    const/4 v2, 0x0
    const-string v0, "outerRadius"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V


    const/high16 v1, 0x40000000    #def 2.0f
    const/high16 v3, 0x40800000    #def 4.0f
    const-string v0, "aspectRatio"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    return-void
.end method
