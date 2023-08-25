.class public final Lcom/daaw/bp4;
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

    iput-object p1, p0, Lcom/daaw/bp4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bp4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bp4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bp4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bp4;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bp4;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/bp4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bp4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/bp4;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/bp4;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/f94;

    invoke-virtual {v0}, Lcom/daaw/f94;->a()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/bp4;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/fg5;

    iget-object v0, p0, Lcom/daaw/bp4;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/vo6;

    new-instance v0, Lcom/daaw/ap4;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ap4;-><init>(Landroid/content/Context;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/daaw/fg5;Lcom/daaw/vo6;)V

    return-object v0
.end method
