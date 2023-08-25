.class public Lcom/daaw/zl$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zl;->f(Ljava/util/concurrent/Callable;)Lcom/daaw/hl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/hl<",
        "Ljava/lang/Void;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Callable;

.field public final synthetic b:Lcom/daaw/zl;


# direct methods
.method public constructor <init>(Lcom/daaw/zl;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zl$c;->b:Lcom/daaw/zl;

    iput-object p2, p0, Lcom/daaw/zl$c;->a:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;)TT;"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/zl$c;->a:Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
