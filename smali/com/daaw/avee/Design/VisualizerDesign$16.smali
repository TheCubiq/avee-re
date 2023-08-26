.class Lcom/daaw/avee/Design/VisualizerDesign$16;
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

    .line 614
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$16;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V
    .locals 0

    .line 617
    iget p1, p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->selectThemePreset(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 614
    check-cast p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$16;->invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V

    return-void
.end method
