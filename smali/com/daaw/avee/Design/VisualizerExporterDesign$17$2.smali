.class Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->invoke(Lmdesl/graphics/Texture;Ljava/lang/Boolean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

.field final synthetic val$criticalErrorFinal:Lcom/daaw/avee/Common/StatusMsg;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;Lcom/daaw/avee/Common/StatusMsg;)V
    .locals 0

    .line 821
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;->val$criticalErrorFinal:Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 824
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;->val$criticalErrorFinal:Lcom/daaw/avee/Common/StatusMsg;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1, v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$300(Lcom/daaw/avee/Design/VisualizerExporterDesign;ZLcom/daaw/avee/Common/StatusMsg;Z)V

    return-void
.end method
