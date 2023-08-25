.class public final synthetic Lcom/daaw/v28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/h38;

.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Exception;

.field public final synthetic s:[B

.field public final synthetic t:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h38;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v28;->p:Lcom/daaw/h38;

    iput p2, p0, Lcom/daaw/v28;->q:I

    iput-object p3, p0, Lcom/daaw/v28;->r:Ljava/lang/Exception;

    iput-object p4, p0, Lcom/daaw/v28;->s:[B

    iput-object p5, p0, Lcom/daaw/v28;->t:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/v28;->p:Lcom/daaw/h38;

    iget v1, p0, Lcom/daaw/v28;->q:I

    iget-object v2, p0, Lcom/daaw/v28;->r:Ljava/lang/Exception;

    iget-object v3, p0, Lcom/daaw/v28;->s:[B

    iget-object v4, p0, Lcom/daaw/v28;->t:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/h38;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
