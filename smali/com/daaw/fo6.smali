.class public final Lcom/daaw/fo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cy4;
.implements Lcom/daaw/er4;
.implements Lcom/daaw/gy4;


# instance fields
.field public final p:Lcom/daaw/to6;

.field public final q:Lcom/daaw/io6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/to6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/fo6;->p:Lcom/daaw/to6;

    const/16 p2, 0xd

    invoke-static {p1, p2}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/fo6;->q:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 2

    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fo6;->p:Lcom/daaw/to6;

    iget-object v1, p0, Lcom/daaw/fo6;->q:Lcom/daaw/io6;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/zze;->zza()Lcom/google/android/gms/ads/AdError;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/daaw/io6;->m(Ljava/lang/String;)Lcom/daaw/io6;

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    :cond_0
    return-void
.end method

.method public final zza()V
    .locals 0

    return-void
.end method

.method public final zzb()V
    .locals 3

    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fo6;->p:Lcom/daaw/to6;

    iget-object v1, p0, Lcom/daaw/fo6;->q:Lcom/daaw/io6;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final zzg()V
    .locals 1

    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fo6;->q:Lcom/daaw/io6;

    invoke-interface {v0}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    :cond_0
    return-void
.end method
