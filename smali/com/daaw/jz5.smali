.class public final Lcom/daaw/jz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jz5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/jz5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/jz5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/jz5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/jz5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/jz5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/jz5;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/jz5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/jz5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v0, p0, Lcom/daaw/jz5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/jz5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/qf6;

    iget-object v0, p0, Lcom/daaw/jz5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/az5;

    iget-object v0, p0, Lcom/daaw/jz5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/tg6;

    iget-object v0, p0, Lcom/daaw/jz5;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v8

    new-instance v0, Lcom/daaw/iz5;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/iz5;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/qf6;Lcom/daaw/az5;Lcom/daaw/tg6;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object v0
.end method
