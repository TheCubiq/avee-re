.class public Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;
.source "FpsTextElement.java"


# static fields
.field private static color2:I = -0x7f600000

.field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "StatText"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 20
    sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->color2:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setColor(I)V

    .line 21
    sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->textBlendMode:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setBlendMode(I)V

    const/16 v0, 0x1c

    .line 22
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setFontSize(I)V

    const v0, 0x3d4ccccd    # 0.05f

    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setPosition(FF)V

    const/4 v0, 0x0

    const v1, 0x3fd9999a    # 1.7f

    .line 24
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setLocalPosition(FF)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 25
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setPositionUniform(ZZ)V

    const-string v0, "fps:{Fps} flush:{StatFlush} res:{WaitResLoad},{ResLoad},{GradualResLoad} rt:{RTSwitch}"

    .line 26
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;->setText(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "StatText"

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method
