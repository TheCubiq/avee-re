.class public final synthetic Lcom/daaw/fy8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vy8;

.field public final synthetic q:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy8;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fy8;->p:Lcom/daaw/vy8;

    iput-object p2, p0, Lcom/daaw/fy8;->q:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fy8;->p:Lcom/daaw/vy8;

    iget-object v1, p0, Lcom/daaw/fy8;->q:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lcom/daaw/vy8;->o(Ljava/lang/Exception;)V

    return-void
.end method
