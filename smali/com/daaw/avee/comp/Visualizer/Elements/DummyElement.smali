.class public Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;
.source "DummyElement.java"


# static fields
.field private static color2:I = -0x7f600000

.field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "DummyElement"


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
    sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->color2:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setColor(I)V

    .line 21
    sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->textBlendMode:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setBlendMode(I)V

    const/16 v0, 0x1c

    .line 22
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setFontSize(I)V

    const v0, 0x3d4ccccd    # 0.05f

    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setPosition(FF)V

    const/4 v0, 0x0

    const v1, 0x3fd9999a    # 1.7f

    .line 24
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setLocalPosition(FF)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 25
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setPositionUniform(ZZ)V

    const-string v0, "TEST"

    .line 26
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setText(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "DummyElement"

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method
