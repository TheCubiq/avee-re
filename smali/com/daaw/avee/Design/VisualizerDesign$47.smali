.class Lcom/daaw/avee/Design/VisualizerDesign$47;
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
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1212
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$47;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 2

    .line 1215
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 1217
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 1219
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$47;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p3, p1, v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V

    goto :goto_0

    .line 1222
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_videoScalingMode:I

    if-ne p3, v0, :cond_2

    .line 1224
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$47;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$100(Lcom/daaw/avee/Design/VisualizerDesign;)I

    move-result p1

    .line 1225
    sget-object p3, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 1227
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment2Instance()Lcom/daaw/avee/comp/VisualUI/Fragment2;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1229
    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign$47;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerDesign;->access$300(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v0

    invoke-static {p3, v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$400(Lcom/daaw/avee/Design/VisualizerDesign;F)F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->setVideoSize(F)V

    .line 1230
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateVideoScaleMode(I)V

    .line 1233
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 1235
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updateVideoScaleMode(I)V

    goto :goto_0

    .line 1237
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    sget p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1212
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign$47;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
