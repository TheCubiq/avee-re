.class public final Lcom/daaw/ga8;
.super Lcom/daaw/gf8;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final b:Lcom/daaw/j58;

.field public final c:Lcom/daaw/ds4;


# direct methods
.method public constructor <init>(Lcom/daaw/d18;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/gf8;-><init>()V

    new-instance v0, Lcom/daaw/ds4;

    sget-object v1, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    invoke-direct {v0, v1}, Lcom/daaw/ds4;-><init>(Lcom/daaw/xp4;)V

    iput-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    :try_start_0
    new-instance v1, Lcom/daaw/j58;

    invoke-direct {v1, p1, p0}, Lcom/daaw/j58;-><init>(Lcom/daaw/d18;Lcom/daaw/ty3;)V

    iput-object v1, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/daaw/ds4;->e()Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->e()Z

    throw p1
.end method


# virtual methods
.method public final a(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/j58;->a(IJ)V

    return-void
.end method

.method public final b(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->z(Lcom/daaw/ob8;)V

    return-void
.end method

.method public final c(Lcom/daaw/rr8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->A(Lcom/daaw/rr8;)V

    return-void
.end method

.method public final d(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->B(Z)V

    return-void
.end method

.method public final e(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->C(Landroid/view/Surface;)V

    return-void
.end method

.method public final f(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->D(F)V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->E()V

    return-void
.end method

.method public final h()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->a0()I

    const/4 v0, 0x2

    return v0
.end method

.method public final i()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->b0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final j()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->c0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Lcom/daaw/vu7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->b()Lcom/daaw/vu7;

    move-result-object v0

    return-object v0
.end method

.method public final l(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0, p1}, Lcom/daaw/j58;->s(Lcom/daaw/ob8;)V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->x()V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->y()V

    return-void
.end method

.method public final zzd()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzd()I

    move-result v0

    return v0
.end method

.method public final zze()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zze()I

    move-result v0

    return v0
.end method

.method public final zzf()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzf()I

    move-result v0

    return v0
.end method

.method public final zzg()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzg()I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzh()I

    move-result v0

    return v0
.end method

.method public final zzi()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzi()I

    move-result v0

    return v0
.end method

.method public final zzj()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzj()I

    const/4 v0, 0x0

    return v0
.end method

.method public final zzk()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzk()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzl()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzm()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzn()Lcom/daaw/l64;

    move-result-object v0

    return-object v0
.end method

.method public final zzo()Lcom/daaw/ni4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzo()Lcom/daaw/ni4;

    move-result-object v0

    return-object v0
.end method

.method public final zzq()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzq()Z

    move-result v0

    return v0
.end method

.method public final zzr()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzr()Z

    const/4 v0, 0x0

    return v0
.end method

.method public final zzs()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga8;->c:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->b()V

    iget-object v0, p0, Lcom/daaw/ga8;->b:Lcom/daaw/j58;

    invoke-virtual {v0}, Lcom/daaw/j58;->zzs()Z

    move-result v0

    return v0
.end method
