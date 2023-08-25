.class public final Lcom/daaw/z66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z66;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/z66;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/z66;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/z66;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/h94;

    invoke-virtual {v1}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/z66;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/u94;

    invoke-virtual {v2}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    new-instance v3, Lcom/daaw/x66;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/x66;-><init>(Lcom/daaw/g77;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object v3
.end method
