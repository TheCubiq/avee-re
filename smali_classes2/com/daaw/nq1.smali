.class public Lcom/daaw/nq1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nq1$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/op0;

.field public final b:Lcom/daaw/zl;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/daaw/nq1$a;

.field public final e:Lcom/daaw/nq1$a;

.field public final f:Ljava/util/concurrent/atomic/AtomicMarkableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicMarkableReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/zl;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/nq1$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/nq1$a;-><init>(Lcom/daaw/nq1;Z)V

    iput-object v0, p0, Lcom/daaw/nq1;->d:Lcom/daaw/nq1$a;

    new-instance v0, Lcom/daaw/nq1$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lcom/daaw/nq1$a;-><init>(Lcom/daaw/nq1;Z)V

    iput-object v0, p0, Lcom/daaw/nq1;->e:Lcom/daaw/nq1$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, Lcom/daaw/nq1;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, Lcom/daaw/nq1;->c:Ljava/lang/String;

    new-instance p1, Lcom/daaw/op0;

    invoke-direct {p1, p2}, Lcom/daaw/op0;-><init>(Lcom/daaw/h10;)V

    iput-object p1, p0, Lcom/daaw/nq1;->a:Lcom/daaw/op0;

    iput-object p3, p0, Lcom/daaw/nq1;->b:Lcom/daaw/zl;

    return-void
.end method

.method public static c(Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/zl;)Lcom/daaw/nq1;
    .locals 3

    new-instance v0, Lcom/daaw/op0;

    invoke-direct {v0, p1}, Lcom/daaw/op0;-><init>(Lcom/daaw/h10;)V

    new-instance v1, Lcom/daaw/nq1;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/nq1;-><init>(Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/zl;)V

    iget-object p1, v1, Lcom/daaw/nq1;->d:Lcom/daaw/nq1$a;

    iget-object p1, p1, Lcom/daaw/nq1$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ki0;

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Lcom/daaw/op0;->f(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/daaw/ki0;->d(Ljava/util/Map;)V

    iget-object p1, v1, Lcom/daaw/nq1;->e:Lcom/daaw/nq1$a;

    iget-object p1, p1, Lcom/daaw/nq1$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ki0;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, Lcom/daaw/op0;->f(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/daaw/ki0;->d(Ljava/util/Map;)V

    iget-object p1, v1, Lcom/daaw/nq1;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0, p0}, Lcom/daaw/op0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    return-object v1
.end method

.method public static d(Ljava/lang/String;Lcom/daaw/h10;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lcom/daaw/op0;

    invoke-direct {v0, p1}, Lcom/daaw/op0;-><init>(Lcom/daaw/h10;)V

    invoke-virtual {v0, p0}, Lcom/daaw/op0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/nq1;->d:Lcom/daaw/nq1$a;

    invoke-virtual {v0}, Lcom/daaw/nq1$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/nq1;->e:Lcom/daaw/nq1$a;

    invoke-virtual {v0}, Lcom/daaw/nq1$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
