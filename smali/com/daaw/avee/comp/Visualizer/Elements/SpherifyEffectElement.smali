.class public Lcom/daaw/avee/comp/Visualizer/Elements/SpherifyEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "SpherifyEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "Spherify"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/SpherifyEffectElement;->typeName:Ljava/lang/String;

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
    const-string v4, "// Cubiq - Spherify\nprecision highp float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n\n\nfloat focalLength = 50.0;\nfloat sphereRotation = 0.;\n\n\nvarying vec2 vTexCoord;\n\nuniform sampler2D u_texture;\nuniform float u_radius;\nuniform float u_rotation;\nuniform float u_aspectRatio;\nuniform float u_textureAspect;\nuniform float u_camDistance;\n\nconst int MAX_STEPS = 500;\nconst float MAX_TRACE_DISTANCE = 1000.0;\nconst float MIN_HIT_DISTANCE = 0.001;\n\n#define PI 3.1415 \n#define TWO_PI (PI*2.0)\n\nint floatToInt(float f) { return int(f); }\n\nvec3 rotatePointAbout(in vec3 p, in vec3 o, in float r) {\n    float cosTheta = cos(r);\n    float sinTheta = sin(r);\n    vec3 relativePosition = p - o;\n    vec3 rotatedPoint = vec3(relativePosition.x * cosTheta + relativePosition.z * sinTheta, relativePosition.y, relativePosition.x * sinTheta - relativePosition.z * cosTheta);\n    return rotatedPoint + o;\n}\n\nfloat sdSphere(in vec3 p, in vec3 o, in float r) {\n    return length(p - o) - r;\n}\n\nvec4 rayMarch(in vec3 ro, in vec3 rd) {\n    float distanceTraveled = 0.0;\n    for (int iterations=0; iterations < MAX_STEPS; ++iterations) {\n        vec3 sphereOrigin = vec3(0.0, 0.0, -1000.0*u_camDistance);\n        float sphereRadius = u_radius*4.0;\n        vec3 currentPosition = ro + rd * distanceTraveled;\n        vec3 relativePosition = rotatePointAbout(currentPosition, sphereOrigin, sphereRotation);\n        float distanceToClosest = sdSphere(relativePosition, sphereOrigin, sphereRadius);\n        if (distanceToClosest < MIN_HIT_DISTANCE) {\n            relativePosition -= sphereOrigin;\n            vec3 normal = normalize(currentPosition - sphereOrigin);\n            float phi = atan(relativePosition.z, relativePosition.x);\n            float theta = atan(relativePosition.y, sqrt(pow(relativePosition.z, 2.0) + pow(relativePosition.x, 2.0)));\n            vec2 uv = vec2((phi + PI) / TWO_PI, (theta + PI/2.) / PI);\n            vec4 color = texture2D(u_texture, uv*vec2(u_textureAspect*2.,1.));\n            \n            return color;\n        }\n        if (distanceTraveled > MAX_TRACE_DISTANCE) {\n            break;\n        }\n        distanceTraveled += distanceToClosest;\n    }\n    return vec4(0.0);\n}\n\nvoid main() {\n    vec2 xy = vTexCoord - 0.5;\n    xy *= vec2(u_aspectRatio, 1.);\n\n    // vec2 xy = vTexCoord.xy;\n    //sphereRotation =+ iTime;\n    sphereRotation =+ u_rotation * TWO_PI;\n    vec3 rayOrigin = vec3(0.0, 0.0, 0.0);\n    vec3 rayDirection = normalize(vec3(xy, -focalLength));\n    gl_FragColor = rayMarch(rayOrigin, rayDirection);\n}\n"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 5

    const/high16 v1, 0x3f800000    #def 1.0f
    const/4 v2, 0x0 # min 0.0f
    const/high16 v3, 0x3f800000    # max 1.0f

    const-string v0, "radius"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "rotation"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "camDistance"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v3, 0x40000000    #max 2.0f

    const/high16 v1, 0x3f000000    #def 0.5f
    const-string v0, "textureAspect"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    

    const/high16 v1, 0x40000000    #def 2.0f
    const/high16 v3, 0x40800000    #def 4.0f
    const-string v0, "aspectRatio"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    
    return-void
.end method
