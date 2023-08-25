.class public final synthetic Lcom/daaw/gy8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vy8;

.field public final synthetic q:J

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy8;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gy8;->p:Lcom/daaw/vy8;

    iput-wide p2, p0, Lcom/daaw/gy8;->q:J

    iput p4, p0, Lcom/daaw/gy8;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/gy8;->p:Lcom/daaw/vy8;

    iget-wide v1, p0, Lcom/daaw/gy8;->q:J

    iget v3, p0, Lcom/daaw/gy8;->r:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/vy8;->n(JI)V

    return-void
.end method
