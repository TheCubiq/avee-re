.class public Lcom/daaw/bm$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ai1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->N(Lcom/daaw/rj1;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ai1<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/rj1;

.field public final synthetic b:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;Lcom/daaw/rj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    iput-object p2, p0, Lcom/daaw/bm$d;->a:Lcom/daaw/rj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/bm$d;->b(Ljava/lang/Boolean;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Boolean;)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bm$d;->b:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->m(Lcom/daaw/bm;)Lcom/daaw/zl;

    move-result-object v0

    new-instance v1, Lcom/daaw/bm$d$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/bm$d$a;-><init>(Lcom/daaw/bm$d;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->i(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
