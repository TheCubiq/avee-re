.class public final Lcom/daaw/lp6;
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

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lp6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/lp6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/lp6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/lp6;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/lp6;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/lp6;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/lp6;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/lp6;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/lp6;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/daaw/lp6;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/vu5;

    iget-object v0, p0, Lcom/daaw/lp6;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/lp6;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/aq4;

    invoke-virtual {v0}, Lcom/daaw/aq4;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/lp6;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/lp6;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/lp6;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/bq4;

    invoke-virtual {v0}, Lcom/daaw/bq4;->a()Lcom/daaw/gi6;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/lp6;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/hi6;

    iget-object v0, p0, Lcom/daaw/lp6;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/ag;

    iget-object v0, p0, Lcom/daaw/lp6;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/daaw/sl2;

    new-instance v0, Lcom/daaw/kp6;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/daaw/kp6;-><init>(Lcom/daaw/vu5;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/daaw/gi6;Lcom/daaw/hi6;Lcom/daaw/ag;Lcom/daaw/sl2;)V

    return-object v0
.end method
