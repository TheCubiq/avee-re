.class public final Lcom/daaw/bl5;
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

    iput-object p1, p0, Lcom/daaw/bl5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bl5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bl5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bl5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bl5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bl5;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/al5;
    .locals 8

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/bl5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ek5;

    invoke-virtual {v0}, Lcom/daaw/ek5;->a()Lcom/daaw/dk5;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bl5;->c:Lcom/daaw/m08;

    invoke-static {v0}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/bl5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/vo6;

    iget-object v0, p0, Lcom/daaw/bl5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/bl5;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v6

    new-instance v7, Lcom/daaw/al5;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/al5;-><init>(Lcom/daaw/g77;Lcom/daaw/dk5;Lcom/daaw/qz7;Lcom/daaw/vo6;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object v7
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bl5;->a()Lcom/daaw/al5;

    move-result-object v0

    return-object v0
.end method
