.class public final Lcom/daaw/jx5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/s05;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/s05;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/jx5;->a:Lcom/daaw/s05;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/fi6;Lcom/daaw/th6;Landroid/view/View;Lcom/daaw/fx5;)Ljava/lang/Object;
    .locals 3

    new-instance p3, Lcom/daaw/hx5;

    sget-object v0, Lcom/daaw/gx5;->a:Lcom/daaw/gx5;

    invoke-direct {p3, p0, v0}, Lcom/daaw/hx5;-><init>(Lcom/daaw/jx5;Lcom/daaw/c15;)V

    iget-object v0, p0, Lcom/daaw/jx5;->a:Lcom/daaw/s05;

    new-instance v1, Lcom/daaw/rm4;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p3}, Lcom/daaw/s05;->c(Lcom/daaw/rm4;Lcom/daaw/sz4;)Lcom/daaw/pz4;

    move-result-object p1

    new-instance p2, Lcom/daaw/ix5;

    invoke-direct {p2, p0, p1}, Lcom/daaw/ix5;-><init>(Lcom/daaw/jx5;Lcom/daaw/pz4;)V

    invoke-virtual {p4, p2}, Lcom/daaw/fx5;->a(Lcom/google/android/gms/ads/internal/zzf;)V

    invoke-virtual {p1}, Lcom/daaw/pz4;->i()Lcom/daaw/oz4;

    move-result-object p1

    return-object p1
.end method
