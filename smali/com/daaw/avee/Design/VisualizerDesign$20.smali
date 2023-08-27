.class Lcom/daaw/avee/Design/VisualizerDesign$20;
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
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 673
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$20;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 677
    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_themeCustomizationIndexes:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 678
    invoke-static {}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->getInstance()Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 681
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->requestUpdateVisualizerTemplates()V

    goto :goto_0

    .line 684
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization16start:I

    if-lt p2, p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_vThemeCustomization116end:I

    if-gt p2, p3, :cond_1

    .line 686
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p2

    .line 687
    invoke-static {p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->themeCustomizationIdentifierToPref(I)I

    move-result p2

    .line 689
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p2, p1, :cond_1

    .line 691
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$20;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_1

    .line 693
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->requestRefreshThemeElementsUiTh()V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 673
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign$20;->invoke(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
