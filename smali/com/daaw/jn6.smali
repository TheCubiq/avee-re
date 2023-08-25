.class public final Lcom/daaw/jn6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/in6;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/in6;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jn6;->a:Lcom/daaw/in6;

    iput-object p2, p0, Lcom/daaw/jn6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/jn6;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/jn6;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/jn6;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/jn6;->c:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/u94;

    invoke-virtual {v1}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/jn6;->d:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/vo6;

    new-instance v3, Lcom/daaw/ol3;

    invoke-direct {v3}, Lcom/daaw/ol3;-><init>()V

    invoke-virtual {v3, v0, v1, v2}, Lcom/daaw/ol3;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
