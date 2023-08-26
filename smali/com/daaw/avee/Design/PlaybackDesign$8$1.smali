.class Lcom/daaw/avee/Design/PlaybackDesign$8$1;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign$8;->invoke(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/PlaybackDesign$8;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign$8;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$8$1;->this$1:Lcom/daaw/avee/Design/PlaybackDesign$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 172
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 174
    invoke-virtual {v0, v1, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updatePlaystate(ZZ)V

    :cond_0
    return-void
.end method
