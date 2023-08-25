.class public Lcom/daaw/qv1$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Lcom/daaw/vk1;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/vk1;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/qv1$h;->b(Lcom/daaw/vk1;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/daaw/vk1;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1, v1}, Lcom/daaw/qv1;->m(Lcom/daaw/qv1;Z)Z

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/16 v0, 0x258

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->A(Lcom/daaw/qv1;)I

    move-result p2

    if-ge p2, v0, :cond_2

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->B(Lcom/daaw/qv1;)I

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->A(Lcom/daaw/qv1;)I

    move-result p1

    rem-int/lit8 p1, p1, 0x1e

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->E(Lcom/daaw/qv1;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/qv1$h$a;

    invoke-direct {p2, p0, p3}, Lcom/daaw/qv1$h$a;-><init>(Lcom/daaw/qv1$h;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :cond_2
    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->A(Lcom/daaw/qv1;)I

    move-result p2

    if-lt p2, v0, :cond_3

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    const-string p3, "loading resources timeout"

    invoke-virtual {p2, p3}, Lcom/daaw/wf1;->d(Ljava/lang/String;)V

    :cond_3
    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->z(Lcom/daaw/qv1;)Lcom/daaw/f40;

    move-result-object p2

    iget-boolean p2, p2, Lcom/daaw/f40;->d:Z

    if-eqz p2, :cond_4

    return-void

    :cond_4
    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->o(Lcom/daaw/qv1;)I

    move-result p3

    if-ne p2, p3, :cond_7

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/wf1;->g()V

    invoke-static {}, Ljava/lang/System;->gc()V

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p2

    if-nez p2, :cond_7

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p2

    iget p2, p2, Lcom/daaw/avee/comp/playback/a;->f:I

    move v5, p2

    goto :goto_0

    :cond_5
    const p2, 0xac44

    const v5, 0xac44

    :goto_0
    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    const-string p3, "failed to get audio sampleRate"

    invoke-virtual {p2, p3}, Lcom/daaw/wf1;->c(Ljava/lang/String;)V

    :cond_6
    iget-object v2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-virtual {p1}, Lcom/daaw/vk1;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Lcom/daaw/vk1;->getHeight()I

    move-result v4

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->H(Lcom/daaw/qv1;)Ljava/io/File;

    move-result-object v6

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->I(Lcom/daaw/qv1;)Ljava/io/OutputStream;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lcom/daaw/qv1;->J(Lcom/daaw/qv1;IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/wf1;->a(Ljava/lang/String;)V

    :cond_7
    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->o(Lcom/daaw/qv1;)I

    move-result p3

    if-lt p2, p3, :cond_9

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result p3

    if-gt p2, p3, :cond_9

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/wf1;->f()Z

    move-result p2

    if-nez p2, :cond_9

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/s7;->f()V

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p2

    invoke-static {}, Lcom/daaw/qv1;->K()J

    move-result-wide v2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->L(Lcom/daaw/qv1;)I

    move-result p3

    invoke-virtual {p2, p1, v2, v3, p3}, Lcom/daaw/s7;->a(Lcom/daaw/vk1;JI)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "failed to add video frame"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/wf1;->d(Ljava/lang/String;)V

    :cond_8
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    invoke-static {}, Lcom/daaw/qv1;->K()J

    move-result-wide p2

    iput-wide p2, p1, Lcom/daaw/avee/comp/playback/a;->n:J

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/s7;->g()I

    move-result p1

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/avee/comp/playback/a;->c()I

    move-result p3

    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/comp/playback/a;->g(II)Lcom/daaw/ke0;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p3}, Lcom/daaw/qv1;->w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p3

    iget-wide v2, p3, Lcom/daaw/avee/comp/playback/a;->n:J

    invoke-virtual {p2, p1, v2, v3}, Lcom/daaw/s7;->b(Lcom/daaw/ke0;J)V

    :cond_9
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result p2

    if-eq p1, p2, :cond_a

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/wf1;->f()Z

    move-result p1

    if-eqz p1, :cond_b

    :cond_a
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->G(Lcom/daaw/qv1;)Lcom/daaw/s7;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/s7;->p(Lcom/daaw/wf1;)Z

    :cond_b
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->q(Lcom/daaw/qv1;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1e

    if-eq p1, p2, :cond_d

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/wf1;->f()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_1

    :cond_c
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p1

    add-int/lit8 p1, p1, 0xa

    rem-int/lit8 p1, p1, 0x14

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->E(Lcom/daaw/qv1;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/qv1$h$c;

    invoke-direct {p2, p0}, Lcom/daaw/qv1$h$c;-><init>(Lcom/daaw/qv1$h;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_d
    :goto_1
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qv1;->X(Lcom/daaw/wf1;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/qv1;->i(Z)Z

    new-instance p1, Lcom/daaw/wf1;

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->v(Lcom/daaw/qv1;)Lcom/daaw/wf1;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/wf1;-><init>(Lcom/daaw/wf1;)V

    iget-object p2, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p2}, Lcom/daaw/qv1;->E(Lcom/daaw/qv1;)Landroid/os/Handler;

    move-result-object p2

    new-instance p3, Lcom/daaw/qv1$h$b;

    invoke-direct {p3, p0, p1}, Lcom/daaw/qv1$h$b;-><init>(Lcom/daaw/qv1$h;Lcom/daaw/wf1;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_e
    :goto_2
    iget-object p1, p0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {p1}, Lcom/daaw/qv1;->n(Lcom/daaw/qv1;)I

    move-result p2

    add-int/2addr p2, v1

    invoke-static {p1, p2}, Lcom/daaw/qv1;->M(Lcom/daaw/qv1;I)V

    return-void
.end method
