.class public final synthetic Lcom/daaw/zq5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/fr5;

.field public final synthetic b:Lcom/daaw/a74;

.field public final synthetic c:Lcom/daaw/th6;

.field public final synthetic d:Lcom/daaw/gi4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fr5;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/daaw/gi4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zq5;->a:Lcom/daaw/fr5;

    iput-object p2, p0, Lcom/daaw/zq5;->b:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/zq5;->c:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/zq5;->d:Lcom/daaw/gi4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lcom/daaw/zq5;->b:Lcom/daaw/a74;

    iget-object v0, p0, Lcom/daaw/zq5;->c:Lcom/daaw/th6;

    iget-object v1, p0, Lcom/daaw/zq5;->d:Lcom/daaw/gi4;

    iget-boolean v0, v0, Lcom/daaw/th6;->N:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->C()V

    :cond_0
    invoke-interface {p1}, Lcom/daaw/a74;->v0()V

    invoke-interface {p1}, Lcom/daaw/a74;->onPause()V

    invoke-virtual {v1}, Lcom/daaw/gi4;->h()Lcom/daaw/si4;

    move-result-object p1

    return-object p1
.end method
