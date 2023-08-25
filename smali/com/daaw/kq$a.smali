.class public Lcom/daaw/kq$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/kq;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/media/AudioTrack;

.field public final synthetic q:Lcom/daaw/kq;


# direct methods
.method public constructor <init>(Lcom/daaw/kq;Landroid/media/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kq$a;->q:Lcom/daaw/kq;

    iput-object p2, p0, Lcom/daaw/kq$a;->p:Landroid/media/AudioTrack;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/kq$a;->p:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lcom/daaw/kq$a;->p:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/kq$a;->q:Lcom/daaw/kq;

    invoke-static {v0}, Lcom/daaw/kq;->g(Lcom/daaw/kq;)Landroid/os/ConditionVariable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/kq$a;->q:Lcom/daaw/kq;

    invoke-static {v1}, Lcom/daaw/kq;->g(Lcom/daaw/kq;)Landroid/os/ConditionVariable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->open()V

    throw v0
.end method
