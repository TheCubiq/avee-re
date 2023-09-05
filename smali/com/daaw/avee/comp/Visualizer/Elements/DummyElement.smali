.class public Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "DummyElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "DummyElement"


# instance fields
.field private shaderFrag:Ljava/lang/String;
.field private shaderVert:Ljava/lang/String;

.field private enableCustomFrag:Z
.field private enableCustomVert:Z

.field public u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
.field public u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
.field public u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
.field public u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
.field public u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
.field public u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

# private VShaderProgram loadedShader;
# private boolean reloadShader;

.field private loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
.field private reloadShader:Z


.field private shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "composition:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 32
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    .line 55
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    .line 51
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;
    
    # Context appContext = PlayerCore.s().getAppContext().getResources()

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    # this.shaderVert = UtilsFileSys.readResource(resources, R.raw.buffer_fisheye_vert);

    const v3, 0x7f0f0034

    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object v3
    # this.shaderVert = "customVertShaderHere";

    # const-string v2, "customVertShaderHere"

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    # this.shaderFrag = "customFragShaderHere";

    # const-string v2, "customFragShaderHere"

    const v3, 0x7f0f0033

    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    # this.enableCustomVert = false;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomVert:Z

    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomFrag:Z




    # this.u_value1 = MVariableFloat.CreateConstantFloat(6.0f);´

    # const/high16 v3, 0x40c00000    # 6.0f
    const v3, 0x40accccd    # 5.4

    .line 68
    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;



    # this.u_value2 = MVariableFloat.CreateConstantFloat(6.0f);

    # const/high16 v3, 0x40c00000    # 6.0f

    const v3, 0x40000000    # 2.0f

    .line 68
    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # u_value3 (0f)

    const v3, 0x0

    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    

    .line 184
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 56
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setBlendMode(I)V

    .line 57
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setScale(FF)V

    .line 59
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 66
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "DummyElement"

    return-object v0
.end method

.method public getFlipMirror()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->flipMirror:Z

    return v0
.end method

.method public getMirrorMode()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorMode:I

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 501
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 502
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 504
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 151
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 152
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 113
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 114
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    .line 117
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V






    # iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomVert:Z

    # const-string v1, "customVertex"

    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    # move-result v0

    # iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomVert:Z
    


    # this.shaderVert = customPropertiesList.getPropertyString("ShaderVertex", "shader_[disabled]");

    # const-string v0, "shader_[disabled]"

    # this.shaderVert insted 

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    const-string v1, "shaderVertex"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    
    # iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomFrag:Z

    # const-string v1, "customFragment"

    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    # move-result v0

    # iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomFrag:Z
    
    
    # this.shaderFrag = customPropertiesList.getPropertyString("ShaderFragment", "shader_[disabled]");

    # const-string v0, "shader_[disabled]"

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    const-string v1, "shaderFragment"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    # todo: prettier with a loop..

    # this.u_value1 = customPropertiesList.getPropertyMVariableFloat("u_value1", this.u_value1);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value1"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # this.u_value2 = customPropertiesList.getPropertyMVariableFloat("u_value2", this.u_value2);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value2"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # this.u_value3 = customPropertiesList.getPropertyMVariableFloat("u_value3", this.u_value3);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value3"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # this.u_value4 = customPropertiesList.getPropertyMVariableFloat("u_value4", this.u_value4);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value4"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # this.u_value5 = customPropertiesList.getPropertyMVariableFloat("u_value5", this.u_value5);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value5"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # this.u_value6 = customPropertiesList.getPropertyMVariableFloat("u_value6", this.u_value6);
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value6"
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    move-result-object v0
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    
    
    
    # this.reloadShader = true;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z



    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 165
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 167
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    .line 173
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 157
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 178
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 8

    .line 130
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 131
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Dummy Element omg"

    .line 133
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;

    const-string v1, "1_appearance"

    const-string v2, "TargetImage"

    invoke-virtual {p1, v2, v3, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    
    # # enableCustomFrag

    # iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomFrag:Z

    # const-string v1, "shader"

    # const-string v2, "customFragment"

    # invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    
    
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    const-string v0, "shader"

    const-string v1, "shaderFragment"

    invoke-virtual {p1, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V



    # iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->enableCustomVert:Z

    # const-string v1, "shader"

    # const-string v2, "customVertex"

    # invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V



    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    const-string v0, "shader"

    const-string v1, "shaderVertex"

    invoke-virtual {p1, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V



    # customPropertiesList.putPropertyMVariableFloat("u_value1", this.u_value1, "3_variables", 0.0f, 6.0f);
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value1"
    const-string v3, "variables"
    # const/high16 v4, 0xc1200000    # -10.0f
    # const/high16 v5, 0x41200000    # 10.0f

    const/high16 v4, 0xbf800000    # -1.0f
    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p1
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # value2
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value2"
    # const-string v3, "variables"
    # const/high16 v4, 0xc1200000    # -10.0f
    # const/high16 v5, 0x41200000    # 10.0f
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # value3
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value3"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # value4
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value4"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # value5
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value5"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    # value5
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    const-string v1, "value6"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 194
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 199


    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v13

    if-nez v13, :cond_0

    # .line 428
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    # .line 433
    :cond_0


    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v14

    .line 205
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 206
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V


    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    
    .line 215

    # VShaderBinder bufferRenderer_FishEyeEffect = renderState.res.getBufferRenderer_FishEyeEffect();

    # iget-object v4, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    # invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_FishEyeEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    # move-result-object v4


    # VShaderBinder customShaderBinder = renderState.res.createCustomShaderBinder(renderState.res.loadShaderFromString(this.shaderVert, this.shaderFrag));

    move-object/from16 v6, p0

    iget-object v5, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    # iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    # iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    # invoke-virtual {v5, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShaderFromString(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # move-result-object v9





    # if (this.loadedShader == null || this.reloadShader ){
    #     this.reloadShader = false;
    #     this.loadedShader = renderResources.safeDisposeShader(this.loadedShader);
    #     this.loadedShader = renderResources.loadShaderFromString(this.shaderVert, this.shaderFrag);
    # }´

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    if-eqz v4, :cond_1

    iget-boolean v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    

    const/4 v4, 0x0

    iput-boolean v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # invoke-interface {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->safeDisposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->safeDisposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v4

    iput-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;


    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    iget-object v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    invoke-virtual {v5, v4, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShaderFromString(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v9

    iput-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # tlog.d("shaderReload")
    const-string v9, "shaderReload"

    invoke-static {v9}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :goto_0

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # check if v4 is not null
    const/4 v4, 0x0

    if-eqz v9, :cond_2

    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->createCustomShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v4

    :cond_2

    # test pass, didn't crash

    .line 218

    move-object/from16 v5, v13

    .line 221
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getBlendMode()I

    move-result v7

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v13, v7, v5, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    iget v8, v14, Landroid/graphics/RectF;->left:F

    iget v9, v14, Landroid/graphics/RectF;->top:F

    const/4 v10, -0x1 # white

    move-object/from16 v7, p1

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v11

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v12
    invoke-virtual/range {v7 .. v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method
