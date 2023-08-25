.class public final Lcom/daaw/kr6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/pr6;


# direct methods
.method public constructor <init>(Lcom/daaw/pr6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kr6;->p:Lcom/daaw/pr6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr6;->p:Lcom/daaw/pr6;

    invoke-static {v0}, Lcom/daaw/pr6;->c(Lcom/daaw/pr6;)Lcom/daaw/jr6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/jr6;->b()V

    return-void
.end method
