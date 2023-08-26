.class Lcom/daaw/avee/Design/VisualizerThemes$19;
.super Ljava/lang/Object;
.source "VisualizerThemes.java"

# interfaces
.implements Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerThemes;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerThemes;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerThemes;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerThemes$19;->this$0:Lcom/daaw/avee/Design/VisualizerThemes;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(I)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes$19;->this$0:Lcom/daaw/avee/Design/VisualizerThemes;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/daaw/avee/Design/VisualizerThemes;->access$100(Lcom/daaw/avee/Design/VisualizerThemes;IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1
.end method
