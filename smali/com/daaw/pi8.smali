.class public final synthetic Lcom/daaw/pi8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dj8;

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dj8;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pi8;->p:Lcom/daaw/dj8;

    iput-wide p2, p0, Lcom/daaw/pi8;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pi8;->p:Lcom/daaw/dj8;

    iget-wide v1, p0, Lcom/daaw/pi8;->q:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/dj8;->o(J)V

    return-void
.end method
