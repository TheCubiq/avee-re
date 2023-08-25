.class public final Lcom/daaw/r67;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field public final b:Lcom/daaw/y17;


# direct methods
.method public synthetic constructor <init>(ZLcom/daaw/y17;Lcom/daaw/q67;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/r67;->a:Z

    iput-object p2, p0, Lcom/daaw/r67;->b:Lcom/daaw/y17;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/f67;

    iget-object v1, p0, Lcom/daaw/r67;->b:Lcom/daaw/y17;

    iget-boolean v2, p0, Lcom/daaw/r67;->a:Z

    invoke-direct {v0, v1, v2, p2, p1}, Lcom/daaw/f67;-><init>(Lcom/daaw/t17;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method
