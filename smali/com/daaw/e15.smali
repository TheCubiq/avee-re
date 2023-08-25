.class public final Lcom/daaw/e15;
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

    iput-object p1, p0, Lcom/daaw/e15;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/e15;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/e15;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/e15;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/e15;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/e15;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/e15;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/n05;

    invoke-virtual {v0}, Lcom/daaw/n05;->a()Lcom/daaw/a74;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/e15;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/e15;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/e15;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/k43;

    new-instance v0, Lcom/daaw/d15;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/d15;-><init>(Landroid/content/Context;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/k43;)V

    return-object v0
.end method
