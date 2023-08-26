.class Lcom/daaw/avee/Design/VisualizerDesign$42;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1044
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$42;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 1051
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Design/VisualizerThemes;->isTemplateIndex(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1052
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2(I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    goto :goto_0

    .line 1054
    :cond_0
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object p1

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getBasedOnTemplate()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2(I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Can\'t reset visualizer basedOnTemplate not valid"

    .line 1057
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    .line 1079
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p3, p2, p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1044
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign$42;->invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method
