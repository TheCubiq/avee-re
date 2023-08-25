.class public final Lcom/daaw/hb5;
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

    iput-object p1, p0, Lcom/daaw/hb5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/hb5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/hb5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/hb5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/hb5;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/daaw/hb5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hb5;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/yi5;

    invoke-virtual {v1}, Lcom/daaw/yi5;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/hb5;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/u94;

    invoke-virtual {v2}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/hb5;->d:Lcom/daaw/m08;

    invoke-interface {v3}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/k43;

    iget-object v4, p0, Lcom/daaw/hb5;->e:Lcom/daaw/m08;

    invoke-interface {v4}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/daaw/x33;

    new-instance v6, Lcom/daaw/g43;

    invoke-direct {v6, v0}, Lcom/daaw/g43;-><init>(Landroid/content/Context;)V

    invoke-direct {v5, v6}, Lcom/daaw/x33;-><init>(Lcom/daaw/g43;)V

    invoke-static {}, Lcom/daaw/k73;->L()Lcom/daaw/j73;

    move-result-object v0

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzchu;->q:I

    invoke-virtual {v0, v6}, Lcom/daaw/j73;->s(I)Lcom/daaw/j73;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    invoke-virtual {v0, v6}, Lcom/daaw/j73;->u(I)Lcom/daaw/j73;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzchu;->s:Z

    const/4 v6, 0x1

    if-eq v6, v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/daaw/j73;->t(I)Lcom/daaw/j73;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/k73;

    new-instance v2, Lcom/daaw/gb5;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/daaw/gb5;-><init>(Lcom/daaw/k43;Ljava/lang/String;Lcom/daaw/k73;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/daaw/x33;->b(Lcom/daaw/w33;)V

    return-object v5
.end method
