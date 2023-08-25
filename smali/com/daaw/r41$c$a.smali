.class public final Lcom/daaw/r41$c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r41$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TA;>;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final synthetic d:Lcom/daaw/r41$c;


# direct methods
.method public constructor <init>(Lcom/daaw/r41$c;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/r41$c$a;->c:Z

    iput-object p2, p0, Lcom/daaw/r41$c$a;->a:Ljava/lang/Object;

    invoke-static {p2}, Lcom/daaw/r41;->d(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/r41$c$a;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/daaw/g60;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TZ;>;)",
            "Lcom/daaw/g60<",
            "TA;TT;TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v0, v0, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v0}, Lcom/daaw/r41;->o(Lcom/daaw/r41;)Lcom/daaw/r41$d;

    move-result-object v0

    new-instance v11, Lcom/daaw/g60;

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v1, v1, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v1}, Lcom/daaw/r41;->f(Lcom/daaw/r41;)Landroid/content/Context;

    move-result-object v2

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v1, v1, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v1}, Lcom/daaw/r41;->l(Lcom/daaw/r41;)Lcom/daaw/e70;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/r41$c$a;->b:Ljava/lang/Class;

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    invoke-static {v1}, Lcom/daaw/r41$c;->a(Lcom/daaw/r41$c;)Lcom/daaw/mq0;

    move-result-object v5

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    invoke-static {v1}, Lcom/daaw/r41$c;->b(Lcom/daaw/r41$c;)Ljava/lang/Class;

    move-result-object v6

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v1, v1, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v1}, Lcom/daaw/r41;->m(Lcom/daaw/r41;)Lcom/daaw/v41;

    move-result-object v8

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v1, v1, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v1}, Lcom/daaw/r41;->n(Lcom/daaw/r41;)Lcom/daaw/mj0;

    move-result-object v9

    iget-object v1, p0, Lcom/daaw/r41$c$a;->d:Lcom/daaw/r41$c;

    iget-object v1, v1, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-static {v1}, Lcom/daaw/r41;->o(Lcom/daaw/r41;)Lcom/daaw/r41$d;

    move-result-object v10

    move-object v1, v11

    move-object v7, p1

    invoke-direct/range {v1 .. v10}, Lcom/daaw/g60;-><init>(Landroid/content/Context;Lcom/daaw/e70;Ljava/lang/Class;Lcom/daaw/mq0;Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/v41;Lcom/daaw/mj0;Lcom/daaw/r41$d;)V

    invoke-virtual {v0, v11}, Lcom/daaw/r41$d;->a(Lcom/daaw/f60;)Lcom/daaw/f60;

    move-result-object p1

    check-cast p1, Lcom/daaw/g60;

    iget-boolean v0, p0, Lcom/daaw/r41$c$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/r41$c$a;->a:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/daaw/f60;->t(Ljava/lang/Object;)Lcom/daaw/f60;

    :cond_0
    return-object p1
.end method
