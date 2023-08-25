.class public Lcom/daaw/bm$d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ai1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm$d$a;->a()Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ai1<",
        "Lcom/daaw/tb1;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lcom/daaw/bm$d$a;


# direct methods
.method public constructor <init>(Lcom/daaw/bm$d$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$d$a$a;->b:Lcom/daaw/bm$d$a;

    iput-object p2, p0, Lcom/daaw/bm$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 0

    check-cast p1, Lcom/daaw/tb1;

    invoke-virtual {p0, p1}, Lcom/daaw/bm$d$a$a;->b(Lcom/daaw/tb1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/tb1;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/tb1;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/bm$d$a$a;->b:Lcom/daaw/bm$d$a;

    iget-object p1, p1, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object p1, p1, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {p1}, Lcom/daaw/bm;->n(Lcom/daaw/bm;)Lcom/daaw/rj1;

    iget-object p1, p0, Lcom/daaw/bm$d$a$a;->b:Lcom/daaw/bm$d$a;

    iget-object p1, p1, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object p1, p1, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {p1}, Lcom/daaw/bm;->h(Lcom/daaw/bm;)Lcom/daaw/pb1;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/bm$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1}, Lcom/daaw/pb1;->v(Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;

    iget-object p1, p0, Lcom/daaw/bm$d$a$a;->b:Lcom/daaw/bm$d$a;

    iget-object p1, p1, Lcom/daaw/bm$d$a;->b:Lcom/daaw/bm$d;

    iget-object p1, p1, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    iget-object p1, p1, Lcom/daaw/bm;->q:Lcom/daaw/tj1;

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    goto :goto_0
.end method
