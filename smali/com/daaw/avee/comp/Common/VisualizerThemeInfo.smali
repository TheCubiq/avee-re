.class public Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;
.super Ljava/lang/Object;
.source "VisualizerThemeInfo.java"


# instance fields
.field public final id:I

.field public final isTemplate:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->isTemplate:Z

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    .line 30
    iput-boolean p2, p0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->isTemplate:Z

    return-void
.end method

.method public static CompareElementReUsability(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 45
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->getElementTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->getElementVersion()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->CompareElementVersions(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static CompareElementVersions(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "10"

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 38
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
