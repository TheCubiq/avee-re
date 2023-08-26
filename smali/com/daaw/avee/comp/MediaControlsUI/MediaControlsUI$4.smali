.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;-><init>()V
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

    .line 163
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 166
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 169
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$500(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J

    move-result-wide v0

    .line 170
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$600(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method
