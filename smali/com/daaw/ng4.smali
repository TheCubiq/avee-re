.class public final Lcom/daaw/ng4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/pg4;


# direct methods
.method public constructor <init>(Lcom/daaw/pg4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ng4;->a:Lcom/daaw/pg4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 8

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/ng4;->a:Lcom/daaw/pg4;

    invoke-static {p1}, Lcom/daaw/pg4;->k(Lcom/daaw/pg4;)Lcom/daaw/aj6;

    move-result-object v7

    invoke-static {p1}, Lcom/daaw/pg4;->l(Lcom/daaw/pg4;)Lcom/daaw/kp6;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/pg4;->f(Lcom/daaw/pg4;)Lcom/daaw/fi6;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/pg4;->e(Lcom/daaw/pg4;)Lcom/daaw/th6;

    move-result-object p1

    iget-object v6, p1, Lcom/daaw/th6;->c:Ljava/util/List;

    const/4 v3, 0x0

    const-string v4, ""

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/kp6;->d(Lcom/daaw/fi6;Lcom/daaw/th6;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ng4;->a:Lcom/daaw/pg4;

    invoke-static {v1}, Lcom/daaw/pg4;->b(Lcom/daaw/pg4;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/qz3;->x(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-virtual {v7, p1, v1}, Lcom/daaw/aj6;->c(Ljava/util/List;I)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
