.class Lcom/daaw/avee/Design/VisualizerDesign$18;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 633
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$18;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 639
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 641
    invoke-virtual {v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPrefThemeCustomizationIndexes()Ljava/util/List;

    move-result-object v1

    .line 642
    iget p1, p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 643
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 645
    sget p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    .line 652
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setPrefThemeCustomizationIndexes(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 633
    check-cast p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$18;->invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V

    return-void
.end method
