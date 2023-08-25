.class public final Lcom/daaw/wr3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:J

.field public final synthetic q:Lcom/daaw/vk4;


# direct methods
.method public constructor <init>(Lcom/daaw/vk4;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wr3;->q:Lcom/daaw/vk4;

    iput-wide p2, p0, Lcom/daaw/wr3;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wr3;->q:Lcom/daaw/vk4;

    iget-wide v1, p0, Lcom/daaw/wr3;->p:J

    invoke-static {v0, v1, v2}, Lcom/daaw/vk4;->j(Lcom/daaw/vk4;J)V

    return-void
.end method
