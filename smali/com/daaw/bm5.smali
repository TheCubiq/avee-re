.class public final Lcom/daaw/bm5;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bm5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bm5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bm5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bm5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bm5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bm5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/bm5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/bm5;->h:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/am5;
    .locals 10

    iget-object v0, p0, Lcom/daaw/bm5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/gl5;

    invoke-virtual {v0}, Lcom/daaw/gl5;->a()Lcom/daaw/fl5;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bm5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/en6;

    iget-object v0, p0, Lcom/daaw/bm5;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/bm5;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/bm5;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/vo6;

    iget-object v0, p0, Lcom/daaw/bm5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/bm5;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v8

    sget-object v9, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v9}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/am5;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/am5;-><init>(Lcom/daaw/fl5;Lcom/daaw/en6;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;Lcom/daaw/to6;Landroid/content/Context;Lcom/daaw/g77;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bm5;->a()Lcom/daaw/am5;

    move-result-object v0

    return-object v0
.end method
