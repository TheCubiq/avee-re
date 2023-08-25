.class public final Lcom/daaw/md6;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/md6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/md6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/md6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/md6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/md6;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/md6;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/md6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/b94;

    iget-object v0, p0, Lcom/daaw/md6;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/md6;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/md6;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/fd6;

    iget-object v0, p0, Lcom/daaw/md6;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/dd6;

    iget-object v0, p0, Lcom/daaw/md6;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v7

    new-instance v0, Lcom/daaw/ld6;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ld6;-><init>(Lcom/daaw/b94;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/fd6;Lcom/daaw/dd6;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object v0
.end method
