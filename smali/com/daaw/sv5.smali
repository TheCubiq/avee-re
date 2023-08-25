.class public final synthetic Lcom/daaw/sv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/wv5;

.field public final synthetic b:Lcom/daaw/a74;

.field public final synthetic c:Lcom/daaw/th6;

.field public final synthetic d:Lcom/daaw/k95;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wv5;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/daaw/k95;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sv5;->a:Lcom/daaw/wv5;

    iput-object p2, p0, Lcom/daaw/sv5;->b:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/sv5;->c:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/sv5;->d:Lcom/daaw/k95;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lcom/daaw/sv5;->b:Lcom/daaw/a74;

    iget-object v0, p0, Lcom/daaw/sv5;->c:Lcom/daaw/th6;

    iget-object v1, p0, Lcom/daaw/sv5;->d:Lcom/daaw/k95;

    iget-boolean v0, v0, Lcom/daaw/th6;->N:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->C()V

    :cond_0
    invoke-interface {p1}, Lcom/daaw/a74;->v0()V

    invoke-interface {p1}, Lcom/daaw/a74;->onPause()V

    invoke-virtual {v1}, Lcom/daaw/k95;->k()Lcom/daaw/j95;

    move-result-object p1

    return-object p1
.end method
