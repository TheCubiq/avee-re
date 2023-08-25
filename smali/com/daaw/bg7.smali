.class public final synthetic Lcom/daaw/bg7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/eh7;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eh7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bg7;->p:Lcom/daaw/eh7;

    iput p2, p0, Lcom/daaw/bg7;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bg7;->p:Lcom/daaw/eh7;

    iget v1, p0, Lcom/daaw/bg7;->q:I

    iget-object v0, v0, Lcom/daaw/eh7;->q:Lcom/daaw/kj7;

    invoke-static {v0, v1}, Lcom/daaw/kj7;->c(Lcom/daaw/kj7;I)V

    return-void
.end method
