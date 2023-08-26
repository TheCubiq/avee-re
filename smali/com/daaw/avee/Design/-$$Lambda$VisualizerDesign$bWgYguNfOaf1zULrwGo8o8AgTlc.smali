.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field private final synthetic f$1:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field private final synthetic f$2:Lcom/daaw/avee/comp/Visualizer/CustomScene;

.field private final synthetic f$3:Z

.field private final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$1:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p3, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$2:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    iput-boolean p4, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$3:Z

    iput p5, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$4:I

    return-void
.end method


# virtual methods
.method public final onInvoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$1:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$2:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    iget-boolean v3, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$3:Z

    iget v4, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;->f$4:I

    move-object v5, p1

    check-cast v5, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Design/VisualizerDesign;->lambda$null$2(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
