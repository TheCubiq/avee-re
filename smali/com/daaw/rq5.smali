.class public final Lcom/daaw/rq5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/qq5;

.field public final b:Lcom/daaw/ey6;


# direct methods
.method public constructor <init>(Lcom/daaw/qq5;Lcom/daaw/ey6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rq5;->a:Lcom/daaw/qq5;

    iput-object p2, p0, Lcom/daaw/rq5;->b:Lcom/daaw/ey6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/rq5;->a:Lcom/daaw/qq5;

    invoke-interface {v0, p1, p2}, Lcom/daaw/qq5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rq5;->a:Lcom/daaw/qq5;

    invoke-interface {v0, p1, p2}, Lcom/daaw/qq5;->b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/rq5;->b:Lcom/daaw/ey6;

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {p1, p2, v0}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
