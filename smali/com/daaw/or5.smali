.class public final Lcom/daaw/or5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ji4;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ji4;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/or5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/or5;->b:Lcom/daaw/ji4;

    iput-object p3, p0, Lcom/daaw/or5;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 2

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    iget-object v1, p0, Lcom/daaw/or5;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object p1, p1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p3, Lcom/daaw/gn3;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/oj6;->q(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/daaw/gn3;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/or5;->b:Lcom/daaw/ji4;

    new-instance v1, Lcom/daaw/rm4;

    iget-object v2, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/sz4;

    new-instance v2, Lcom/daaw/nr5;

    invoke-direct {v2, p3}, Lcom/daaw/nr5;-><init>(Lcom/daaw/tq5;)V

    const/4 v3, 0x0

    invoke-direct {p1, v2, v3}, Lcom/daaw/sz4;-><init>(Lcom/daaw/c15;Lcom/daaw/a74;)V

    new-instance v2, Lcom/daaw/hi4;

    iget p2, p2, Lcom/daaw/th6;->b0:I

    invoke-direct {v2, p2}, Lcom/daaw/hi4;-><init>(I)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/ji4;->a(Lcom/daaw/rm4;Lcom/daaw/sz4;Lcom/daaw/hi4;)Lcom/daaw/gi4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-direct {v0, v1}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object v1, p0, Lcom/daaw/or5;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->g()Lcom/daaw/nw5;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/gi4;->h()Lcom/daaw/si4;

    move-result-object p1

    return-object p1
.end method
