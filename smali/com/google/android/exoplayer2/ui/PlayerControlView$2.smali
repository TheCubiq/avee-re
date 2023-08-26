.class Lcom/google/android/exoplayer2/ui/PlayerControlView$2;
.super Ljava/lang/Object;
.source "PlayerControlView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/ui/PlayerControlView;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$2;->this$0:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$2;->this$0:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->hide()V

    return-void
.end method
