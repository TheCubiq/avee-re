.class public final Lcom/daaw/er2;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic p:Landroid/media/AudioTrack;

.field public final synthetic q:Lcom/daaw/or2;


# direct methods
.method public constructor <init>(Lcom/daaw/or2;Landroid/media/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/er2;->q:Lcom/daaw/or2;

    iput-object p2, p0, Lcom/daaw/er2;->p:Landroid/media/AudioTrack;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/er2;->p:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lcom/daaw/er2;->p:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/er2;->q:Lcom/daaw/or2;

    invoke-static {v0}, Lcom/daaw/or2;->b(Lcom/daaw/or2;)Landroid/os/ConditionVariable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/er2;->q:Lcom/daaw/or2;

    invoke-static {v1}, Lcom/daaw/or2;->b(Lcom/daaw/or2;)Landroid/os/ConditionVariable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->open()V

    throw v0
.end method
