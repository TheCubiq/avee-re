.class public final Lcom/daaw/gh5;
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

    iput-object p1, p0, Lcom/daaw/gh5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/gh5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/gh5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/gh5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/gh5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/gh5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/gh5;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/gh5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/lh5;

    iget-object v0, p0, Lcom/daaw/gh5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/fi5;

    iget-object v0, p0, Lcom/daaw/gh5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/mg5;

    iget-object v0, p0, Lcom/daaw/gh5;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/gh5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/gh5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/vg5;

    iget-object v0, p0, Lcom/daaw/gh5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/xh5;

    new-instance v0, Lcom/daaw/dh5;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/dh5;-><init>(Lcom/daaw/lh5;Lcom/daaw/fi5;Lcom/daaw/mg5;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vg5;Lcom/daaw/xh5;)V

    return-object v0
.end method
