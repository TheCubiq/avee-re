.class Lcom/daaw/avee/Design/VisualizerExporterDesign$12;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

.field final synthetic val$visualizerDesign:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 486
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;->val$visualizerDesign:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Boolean;
    .locals 1

    .line 490
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;->val$visualizerDesign:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->getUseHighQualityBlur()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 486
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
