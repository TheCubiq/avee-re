.class public abstract Lcom/daaw/gf8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ty3;


# instance fields
.field public final a:Lcom/daaw/i54;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/i54;

    invoke-direct {v0}, Lcom/daaw/i54;-><init>()V

    iput-object v0, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 5

    invoke-interface {p0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/i54;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb()Z
    .locals 5

    invoke-interface {p0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/i54;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc()Z
    .locals 5

    invoke-interface {p0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/gf8;->a:Lcom/daaw/i54;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/i54;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
