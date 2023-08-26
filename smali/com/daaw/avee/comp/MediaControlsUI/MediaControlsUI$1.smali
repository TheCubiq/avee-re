.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$1;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$1;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$1;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {v0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$000(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
