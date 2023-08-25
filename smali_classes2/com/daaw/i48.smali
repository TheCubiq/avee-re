.class public final Lcom/daaw/i48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:J

.field public final synthetic q:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i48;->q:Lcom/daaw/r48;

    iput-wide p2, p0, Lcom/daaw/i48;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/i48;->q:Lcom/daaw/r48;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->y()Lcom/daaw/vk4;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/i48;->p:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vk4;->m(J)V

    iget-object v0, p0, Lcom/daaw/i48;->q:Lcom/daaw/r48;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/r48;->e:Lcom/daaw/t38;

    return-void
.end method
