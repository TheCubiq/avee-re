.class public final Lcom/daaw/eh7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final p:Landroid/os/Handler;

.field public final synthetic q:Lcom/daaw/kj7;


# direct methods
.method public constructor <init>(Lcom/daaw/kj7;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/eh7;->q:Lcom/daaw/kj7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/eh7;->p:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/eh7;->p:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/bg7;

    invoke-direct {v1, p0, p1}, Lcom/daaw/bg7;-><init>(Lcom/daaw/eh7;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
