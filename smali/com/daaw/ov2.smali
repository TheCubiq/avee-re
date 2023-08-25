.class public final Lcom/daaw/ov2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/io/IOException;

.field public final synthetic q:Lcom/daaw/sv2;


# direct methods
.method public constructor <init>(Lcom/daaw/sv2;Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ov2;->q:Lcom/daaw/sv2;

    iput-object p2, p0, Lcom/daaw/ov2;->p:Ljava/io/IOException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ov2;->q:Lcom/daaw/sv2;

    invoke-static {v0}, Lcom/daaw/sv2;->v(Lcom/daaw/sv2;)Lcom/daaw/tv2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ov2;->p:Ljava/io/IOException;

    invoke-interface {v0, v1}, Lcom/daaw/tv2;->c(Ljava/io/IOException;)V

    return-void
.end method
