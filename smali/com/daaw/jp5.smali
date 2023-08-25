.class public final Lcom/daaw/jp5;
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

    iput-object p1, p0, Lcom/daaw/jp5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/jp5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/jp5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/jp5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/jp5;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/hp5;
    .locals 7

    iget-object v0, p0, Lcom/daaw/jp5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/jp5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/pp4;

    invoke-virtual {v0}, Lcom/daaw/pp4;->a()Lcom/daaw/op4;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/jp5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/zo5;

    iget-object v0, p0, Lcom/daaw/jp5;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/to5;

    invoke-virtual {v0}, Lcom/daaw/to5;->a()Lcom/daaw/so5;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/jp5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/f94;

    invoke-virtual {v0}, Lcom/daaw/f94;->a()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v6

    new-instance v0, Lcom/daaw/hp5;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/hp5;-><init>(Landroid/content/Context;Lcom/daaw/op4;Lcom/daaw/zo5;Lcom/daaw/so5;Lcom/google/android/gms/ads/internal/util/zzg;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/jp5;->a()Lcom/daaw/hp5;

    move-result-object v0

    return-object v0
.end method
