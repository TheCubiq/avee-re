.class Lcom/daaw/avee/Design/VisualizerThemes$17;
.super Ljava/lang/Object;
.source "VisualizerThemes.java"

# interfaces
.implements Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory;


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

    .line 200
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerThemes$17;->this$0:Lcom/daaw/avee/Design/VisualizerThemes;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    .line 203
    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerThemes;->createVisPreset16(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    return-object p1
.end method
