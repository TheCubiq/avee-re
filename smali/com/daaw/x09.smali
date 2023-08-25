.class public Lcom/daaw/x09;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k09;


# instance fields
.field public final a:Lcom/daaw/k09;


# direct methods
.method public constructor <init>(Lcom/daaw/k09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/k09;->a([BII)I

    move-result p1

    return p1
.end method

.method public final b(I)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    check-cast v0, Lcom/daaw/rz8;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rz8;->k(IZ)Z

    return-void
.end method

.method public final e([BIIZ)Z
    .locals 1

    iget-object p2, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    const/4 p3, 0x0

    const/16 p4, 0x8

    const/4 v0, 0x1

    invoke-interface {p2, p1, p3, p4, v0}, Lcom/daaw/k09;->e([BIIZ)Z

    move-result p1

    return p1
.end method

.method public final f([BII)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final h([BIIZ)Z
    .locals 1

    iget-object p2, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    const/4 p3, 0x0

    const/16 p4, 0x8

    const/4 v0, 0x1

    invoke-interface {p2, p1, p3, p4, v0}, Lcom/daaw/k09;->h([BIIZ)Z

    move-result p1

    return p1
.end method

.method public final i([BII)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    check-cast v0, Lcom/daaw/rz8;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/daaw/rz8;->e([BIIZ)Z

    return-void
.end method

.method public final j([BII)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    check-cast v0, Lcom/daaw/rz8;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/daaw/rz8;->h([BIIZ)Z

    return-void
.end method

.method public final u(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    check-cast v0, Lcom/daaw/rz8;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rz8;->l(IZ)Z

    return-void
.end method

.method public zzd()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    invoke-interface {v0}, Lcom/daaw/k09;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public zze()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    invoke-interface {v0}, Lcom/daaw/k09;->zze()J

    move-result-wide v0

    return-wide v0
.end method

.method public zzf()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    invoke-interface {v0}, Lcom/daaw/k09;->zzf()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzj()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/x09;->a:Lcom/daaw/k09;

    invoke-interface {v0}, Lcom/daaw/k09;->zzj()V

    return-void
.end method
