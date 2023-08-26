.class Lcom/daaw/avee/Design/PlaybackDesign$44;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;->updateKeepScreenOnLock(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;

.field final synthetic val$forceScreenOn:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;Z)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$44;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    iput-boolean p2, p0, Lcom/daaw/avee/Design/PlaybackDesign$44;->val$forceScreenOn:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 618
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 620
    iget-boolean v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$44;->val$forceScreenOn:Z

    if-nez v1, :cond_1

    iget v1, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    sget-boolean v1, Lcom/daaw/avee/Design/PlaybackDesign;->isPlaying:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-boolean v2, p0, Lcom/daaw/avee/Design/PlaybackDesign$44;->val$forceScreenOn:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->setKeepScreenOnLock(ZZ)V

    :cond_2
    return-void
.end method
