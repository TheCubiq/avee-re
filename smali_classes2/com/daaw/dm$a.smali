.class public Lcom/daaw/dm$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/dm;->g(Lcom/daaw/zb1;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/daaw/rj1<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zb1;

.field public final synthetic b:Lcom/daaw/dm;


# direct methods
.method public constructor <init>(Lcom/daaw/dm;Lcom/daaw/zb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm$a;->b:Lcom/daaw/dm;

    iput-object p2, p0, Lcom/daaw/dm$a;->a:Lcom/daaw/zb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dm$a;->b:Lcom/daaw/dm;

    iget-object v1, p0, Lcom/daaw/dm$a;->a:Lcom/daaw/zb1;

    invoke-static {v0, v1}, Lcom/daaw/dm;->a(Lcom/daaw/dm;Lcom/daaw/zb1;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dm$a;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method
