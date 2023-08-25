.class public final Lcom/daaw/e98;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:J

.field public final q:J

.field public final synthetic r:Lcom/daaw/h98;


# direct methods
.method public constructor <init>(Lcom/daaw/h98;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e98;->r:Lcom/daaw/h98;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/daaw/e98;->p:J

    iput-wide p4, p0, Lcom/daaw/e98;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/e98;->r:Lcom/daaw/h98;

    iget-object v0, v0, Lcom/daaw/h98;->b:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/b98;

    invoke-direct {v1, p0}, Lcom/daaw/b98;-><init>(Lcom/daaw/e98;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method
