.class public final Lcom/daaw/wk8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/f92;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[Lcom/daaw/hi8;


# direct methods
.method public constructor <init>(Lcom/daaw/f92;IIIIIII[Lcom/daaw/hi8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    iput p2, p0, Lcom/daaw/wk8;->b:I

    iput p3, p0, Lcom/daaw/wk8;->c:I

    iput p4, p0, Lcom/daaw/wk8;->d:I

    iput p5, p0, Lcom/daaw/wk8;->e:I

    iput p6, p0, Lcom/daaw/wk8;->f:I

    iput p7, p0, Lcom/daaw/wk8;->g:I

    iput p8, p0, Lcom/daaw/wk8;->h:I

    iput-object p9, p0, Lcom/daaw/wk8;->i:[Lcom/daaw/hi8;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/wk8;->e:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final b(ZLcom/daaw/o98;I)Landroid/media/AudioTrack;
    .locals 10

    :try_start_0
    sget p1, Lcom/daaw/it5;->a:I

    const/16 v0, 0x1d

    const/4 v1, 0x1

    if-lt p1, v0, :cond_1

    iget p1, p0, Lcom/daaw/wk8;->e:I

    iget v0, p0, Lcom/daaw/wk8;->f:I

    iget v2, p0, Lcom/daaw/wk8;->g:I

    invoke-static {p1, v0, v2}, Lcom/daaw/sl8;->K(III)Landroid/media/AudioFormat;

    move-result-object p1

    invoke-virtual {p2}, Lcom/daaw/o98;->a()Lcom/daaw/x28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/x28;->a:Landroid/media/AudioAttributes;

    new-instance v0, Landroid/media/AudioTrack$Builder;

    invoke-direct {v0}, Landroid/media/AudioTrack$Builder;-><init>()V

    invoke-virtual {v0, p2}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    iget p2, p0, Lcom/daaw/wk8;->h:I

    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    iget p2, p0, Lcom/daaw/wk8;->c:I

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setOffloadedPlayback(Z)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/16 v0, 0x15

    if-lt p1, v0, :cond_2

    new-instance p1, Landroid/media/AudioTrack;

    invoke-virtual {p2}, Lcom/daaw/o98;->a()Lcom/daaw/x28;

    move-result-object p2

    iget-object v3, p2, Lcom/daaw/x28;->a:Landroid/media/AudioAttributes;

    iget p2, p0, Lcom/daaw/wk8;->e:I

    iget v0, p0, Lcom/daaw/wk8;->f:I

    iget v2, p0, Lcom/daaw/wk8;->g:I

    invoke-static {p2, v0, v2}, Lcom/daaw/sl8;->K(III)Landroid/media/AudioFormat;

    move-result-object v4

    iget v5, p0, Lcom/daaw/wk8;->h:I

    const/4 v6, 0x1

    move-object v2, p1

    move v7, p3

    invoke-direct/range {v2 .. v7}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    goto :goto_1

    :cond_2
    iget p1, p2, Lcom/daaw/o98;->a:I

    if-nez p3, :cond_3

    new-instance p1, Landroid/media/AudioTrack;

    const/4 v3, 0x3

    iget v4, p0, Lcom/daaw/wk8;->e:I

    iget v5, p0, Lcom/daaw/wk8;->f:I

    iget v6, p0, Lcom/daaw/wk8;->g:I

    iget v7, p0, Lcom/daaw/wk8;->h:I

    const/4 v8, 0x1

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    goto :goto_1

    :cond_3
    new-instance p1, Landroid/media/AudioTrack;

    const/4 v3, 0x3

    iget v4, p0, Lcom/daaw/wk8;->e:I

    iget v5, p0, Lcom/daaw/wk8;->f:I

    iget v6, p0, Lcom/daaw/wk8;->g:I

    iget v7, p0, Lcom/daaw/wk8;->h:I

    const/4 v8, 0x1

    move-object v2, p1

    move v9, p3

    invoke-direct/range {v2 .. v9}, Landroid/media/AudioTrack;-><init>(IIIIIII)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    move-result v3

    if-ne v3, v1, :cond_4

    return-object p1

    :cond_4
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Lcom/daaw/jj8;

    iget v4, p0, Lcom/daaw/wk8;->e:I

    iget v5, p0, Lcom/daaw/wk8;->f:I

    iget v6, p0, Lcom/daaw/wk8;->h:I

    iget-object v7, p0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    invoke-virtual {p0}, Lcom/daaw/wk8;->c()Z

    move-result v8

    const/4 v9, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lcom/daaw/jj8;-><init>(IIIILcom/daaw/f92;ZLjava/lang/Exception;)V

    throw p1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    :goto_2
    move-object v7, p1

    new-instance p1, Lcom/daaw/jj8;

    const/4 v1, 0x0

    iget v2, p0, Lcom/daaw/wk8;->e:I

    iget v3, p0, Lcom/daaw/wk8;->f:I

    iget v4, p0, Lcom/daaw/wk8;->h:I

    iget-object v5, p0, Lcom/daaw/wk8;->a:Lcom/daaw/f92;

    invoke-virtual {p0}, Lcom/daaw/wk8;->c()Z

    move-result v6

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/jj8;-><init>(IIIILcom/daaw/f92;ZLjava/lang/Exception;)V

    throw p1
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lcom/daaw/wk8;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
