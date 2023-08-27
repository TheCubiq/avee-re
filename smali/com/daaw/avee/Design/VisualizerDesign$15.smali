.class Lcom/daaw/avee/Design/VisualizerDesign$15;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
        ">;",
        "Lcom/daaw/avee/Common/VAsyncTask<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 554
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/util/List;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
            ">;)",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation

    .line 558
    new-instance v0, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$15$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$15$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$15;Ljava/util/List;)V

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 554
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$15;->invoke(Ljava/util/List;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method
