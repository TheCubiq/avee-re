.class public final Lcom/daaw/o55;
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

.field public final j:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o55;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/o55;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/o55;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/o55;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/o55;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/o55;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/o55;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/o55;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/o55;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/o55;->j:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/daaw/o55;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/r55;

    invoke-virtual {v0}, Lcom/daaw/r55;->a()Lcom/daaw/on3;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/o55;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/s55;

    invoke-virtual {v0}, Lcom/daaw/s55;->a()Lcom/daaw/pn3;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/o55;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/v55;

    invoke-virtual {v0}, Lcom/daaw/v55;->a()Lcom/daaw/sn3;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/o55;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/gr4;

    iget-object v0, p0, Lcom/daaw/o55;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/jq4;

    iget-object v0, p0, Lcom/daaw/o55;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/ty4;

    iget-object v0, p0, Lcom/daaw/o55;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/o55;->h:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v9

    iget-object v0, p0, Lcom/daaw/o55;->i:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v10

    iget-object v0, p0, Lcom/daaw/o55;->j:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v11

    new-instance v0, Lcom/daaw/n55;

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/daaw/n55;-><init>(Lcom/daaw/on3;Lcom/daaw/pn3;Lcom/daaw/sn3;Lcom/daaw/gr4;Lcom/daaw/jq4;Lcom/daaw/ty4;Landroid/content/Context;Lcom/daaw/th6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/ri6;[B)V

    return-object v0
.end method
