.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$7;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onCreateView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
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

    .line 248
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$7;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 251
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackPrev:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method
