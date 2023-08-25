.class public abstract Lcom/daaw/yk0$a;
.super Lcom/daaw/e7;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/e7<",
        "Lcom/daaw/yk0;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lcom/daaw/yk0;

.field public c:Lcom/daaw/yk0;


# direct methods
.method public constructor <init>(Lcom/daaw/yk0;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/e7;-><init>()V

    iput-object p1, p0, Lcom/daaw/yk0$a;->b:Lcom/daaw/yk0;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/yk0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yk0$a;->h(Lcom/daaw/yk0;Ljava/lang/Object;)V

    return-void
.end method

.method public h(Lcom/daaw/yk0;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/daaw/yk0$a;->b:Lcom/daaw/yk0;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/yk0$a;->c:Lcom/daaw/yk0;

    :goto_1
    if-eqz v0, :cond_2

    sget-object v1, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/daaw/yk0$a;->b:Lcom/daaw/yk0;

    iget-object p2, p0, Lcom/daaw/yk0$a;->c:Lcom/daaw/yk0;

    invoke-static {p2}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lcom/daaw/yk0;->f(Lcom/daaw/yk0;Lcom/daaw/yk0;)V

    :cond_2
    return-void
.end method
