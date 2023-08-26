.class final Lcom/daaw/avee/PostExportAdManager$2;
.super Ljava/lang/Object;
.source "PostExportAdManager.kt"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/PostExportAdManager;-><init>(Lcom/daaw/avee/Common/Events/WeakEventR;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/PostExportAdManager;


# direct methods
.method constructor <init>(Lcom/daaw/avee/PostExportAdManager;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/PostExportAdManager$2;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()V
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager$2;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {v0}, Lcom/daaw/avee/PostExportAdManager;->access$isPremium$p(Lcom/daaw/avee/PostExportAdManager;)Lcom/daaw/avee/Common/Events/WeakEventR;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/daaw/avee/PostExportAdManager$2;->this$0:Lcom/daaw/avee/PostExportAdManager;

    invoke-static {v0}, Lcom/daaw/avee/PostExportAdManager;->access$showAd(Lcom/daaw/avee/PostExportAdManager;)V

    :cond_0
    return-void
.end method
