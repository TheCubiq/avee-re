.class public final Lcom/daaw/mj4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/gj4;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/gj4;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/mj4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/mj4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/mj4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/mj4;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/mj4;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/mj4;->c:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/u94;

    invoke-virtual {v1}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/mj4;->d:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/sm4;

    invoke-virtual {v2}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/mj4;->e:Lcom/daaw/m08;

    check-cast v3, Lcom/daaw/cq4;

    invoke-virtual {v3}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/gj4;->f(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/ri6;)Lcom/daaw/ly4;

    move-result-object v0

    return-object v0
.end method
