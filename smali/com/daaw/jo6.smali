.class public final Lcom/daaw/jo6;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jo6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/jo6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/jo6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/jo6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/jo6;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/jo6;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/jo6;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/jo6;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/sa5;

    new-instance v5, Lcom/daaw/vn5;

    invoke-direct {v5}, Lcom/daaw/vn5;-><init>()V

    new-instance v6, Lcom/daaw/yu3;

    invoke-direct {v6}, Lcom/daaw/yu3;-><init>()V

    new-instance v0, Lcom/daaw/vo6;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/vo6;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/sa5;Lcom/daaw/vn5;Lcom/daaw/yu3;[B)V

    return-object v0
.end method
