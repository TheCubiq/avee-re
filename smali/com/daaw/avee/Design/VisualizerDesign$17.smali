.class Lcom/daaw/avee/Design/VisualizerDesign$17;
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

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;Landroid/content/Context;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$17;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 628
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$17;->val$context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000a6

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 629
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 622
    check-cast p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$17;->invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V

    return-void
.end method
