.class public Lcom/daaw/dm$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/dm;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/dm;


# direct methods
.method public constructor <init>(Lcom/daaw/dm;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm$d;->a:Lcom/daaw/dm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm$d;->a:Lcom/daaw/dm;

    invoke-static {v0}, Lcom/daaw/dm;->c(Lcom/daaw/dm;)Lcom/daaw/bm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/bm;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dm$d;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
