.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field private final synthetic f$1:Lcom/daaw/avee/comp/Visualizer/CustomScene;

.field private final synthetic f$2:Z

.field private final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$1:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    iput-boolean p3, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$2:Z

    iput p4, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$3:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$1:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    iget-boolean v2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$2:Z

    iget v3, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;->f$3:I

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Design/VisualizerDesign;->lambda$null$1(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    return-void
.end method
