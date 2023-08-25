.class public Lcom/daaw/bm$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ai1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm$b;->a()Lcom/daaw/rj1;
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

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/bm$b;


# direct methods
.method public constructor <init>(Lcom/daaw/bm$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$b$a;->c:Lcom/daaw/bm$b;

    iput-object p2, p0, Lcom/daaw/bm$b$a;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/bm$b$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 0

    check-cast p1, Lcom/daaw/tb1;

    invoke-virtual {p0, p1}, Lcom/daaw/bm$b$a;->b(Lcom/daaw/tb1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/tb1;)Lcom/daaw/rj1;
    .locals 5
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

    const-string v1, "Received null app settings, cannot send reports at crash time."

    invoke-virtual {p1, v1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lcom/daaw/rj1;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/bm$b$a;->c:Lcom/daaw/bm$b;

    iget-object v2, v2, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v2}, Lcom/daaw/bm;->n(Lcom/daaw/bm;)Lcom/daaw/rj1;

    move-result-object v2

    aput-object v2, p1, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/daaw/bm$b$a;->c:Lcom/daaw/bm$b;

    iget-object v2, v2, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v2}, Lcom/daaw/bm;->h(Lcom/daaw/bm;)Lcom/daaw/pb1;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/bm$b$a;->a:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lcom/daaw/bm$b$a;->c:Lcom/daaw/bm$b;

    iget-boolean v4, v4, Lcom/daaw/bm$b;->e:Z

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/daaw/bm$b$a;->b:Ljava/lang/String;

    :cond_1
    invoke-virtual {v2, v3, v0}, Lcom/daaw/pb1;->w(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object v0

    aput-object v0, p1, v1

    invoke-static {p1}, Lcom/daaw/dk1;->g([Lcom/daaw/rj1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
