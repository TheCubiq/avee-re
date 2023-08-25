.class public final Lcom/daaw/uv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yv2;
.implements Lcom/daaw/xv2;


# instance fields
.field public final p:Landroid/net/Uri;

.field public final q:Lcom/daaw/jx2;

.field public final r:Lcom/daaw/ps2;

.field public final s:I

.field public final t:Landroid/os/Handler;

.field public final u:Lcom/daaw/tv2;

.field public final v:Lcom/daaw/kq2;

.field public final w:I

.field public x:Lcom/daaw/xv2;

.field public y:Lcom/daaw/mq2;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/jx2;Lcom/daaw/ps2;ILandroid/os/Handler;Lcom/daaw/tv2;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uv2;->p:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/uv2;->q:Lcom/daaw/jx2;

    iput-object p3, p0, Lcom/daaw/uv2;->r:Lcom/daaw/ps2;

    iput p4, p0, Lcom/daaw/uv2;->s:I

    iput-object p5, p0, Lcom/daaw/uv2;->t:Landroid/os/Handler;

    iput-object p6, p0, Lcom/daaw/uv2;->u:Lcom/daaw/tv2;

    iput p8, p0, Lcom/daaw/uv2;->w:I

    new-instance p1, Lcom/daaw/kq2;

    invoke-direct {p1}, Lcom/daaw/kq2;-><init>()V

    iput-object p1, p0, Lcom/daaw/uv2;->v:Lcom/daaw/kq2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/wv2;)V
    .locals 0

    check-cast p1, Lcom/daaw/sv2;

    invoke-virtual {p1}, Lcom/daaw/sv2;->A()V

    return-void
.end method

.method public final b(Lcom/daaw/op2;ZLcom/daaw/xv2;)V
    .locals 2

    iput-object p3, p0, Lcom/daaw/uv2;->x:Lcom/daaw/xv2;

    new-instance p1, Lcom/daaw/lw2;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p2, 0x0

    invoke-direct {p1, v0, v1, p2}, Lcom/daaw/lw2;-><init>(JZ)V

    iput-object p1, p0, Lcom/daaw/uv2;->y:Lcom/daaw/mq2;

    const/4 p2, 0x0

    invoke-interface {p3, p1, p2}, Lcom/daaw/xv2;->d(Lcom/daaw/mq2;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(ILcom/daaw/nx2;)Lcom/daaw/wv2;
    .locals 12

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/az2;->c(Z)V

    new-instance p1, Lcom/daaw/sv2;

    iget-object v1, p0, Lcom/daaw/uv2;->p:Landroid/net/Uri;

    iget-object v0, p0, Lcom/daaw/uv2;->q:Lcom/daaw/jx2;

    invoke-interface {v0}, Lcom/daaw/jx2;->zza()Lcom/daaw/kx2;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/uv2;->r:Lcom/daaw/ps2;

    invoke-interface {v0}, Lcom/daaw/ps2;->zza()[Lcom/daaw/ns2;

    move-result-object v3

    iget v4, p0, Lcom/daaw/uv2;->s:I

    iget-object v5, p0, Lcom/daaw/uv2;->t:Landroid/os/Handler;

    iget-object v6, p0, Lcom/daaw/uv2;->u:Lcom/daaw/tv2;

    const/4 v9, 0x0

    iget v10, p0, Lcom/daaw/uv2;->w:I

    const/4 v11, 0x0

    move-object v0, p1

    move-object v7, p0

    move-object v8, p2

    invoke-direct/range {v0 .. v11}, Lcom/daaw/sv2;-><init>(Landroid/net/Uri;Lcom/daaw/kx2;[Lcom/daaw/ns2;ILandroid/os/Handler;Lcom/daaw/tv2;Lcom/daaw/xv2;Lcom/daaw/nx2;Ljava/lang/String;I[B)V

    return-object p1
.end method

.method public final d(Lcom/daaw/mq2;Ljava/lang/Object;)V
    .locals 5

    iget-object p2, p0, Lcom/daaw/uv2;->v:Lcom/daaw/kq2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/daaw/mq2;->d(ILcom/daaw/kq2;Z)Lcom/daaw/kq2;

    iget-wide v1, p2, Lcom/daaw/kq2;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v1, v3

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iget-boolean p2, p0, Lcom/daaw/uv2;->z:Z

    if-eqz p2, :cond_1

    if-nez v0, :cond_1

    return-void

    :cond_1
    iput-object p1, p0, Lcom/daaw/uv2;->y:Lcom/daaw/mq2;

    iput-boolean v0, p0, Lcom/daaw/uv2;->z:Z

    iget-object p2, p0, Lcom/daaw/uv2;->x:Lcom/daaw/xv2;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lcom/daaw/xv2;->d(Lcom/daaw/mq2;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza()V
    .locals 0

    return-void
.end method

.method public final zzd()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/uv2;->x:Lcom/daaw/xv2;

    return-void
.end method
