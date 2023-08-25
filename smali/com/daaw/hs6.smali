.class public final Lcom/daaw/hs6;
.super Lcom/daaw/cq6;
.source ""


# instance fields
.field public final s:I

.field public final t:Ljava/lang/String;

.field public final u:Ljava/util/Map;

.field public final v:[B


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Lcom/daaw/pa6;[B)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x7d4

    const/4 v7, 0x1

    move-object v2, p0

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v2 .. v7}, Lcom/daaw/cq6;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/daaw/pa6;II)V

    iput p1, p0, Lcom/daaw/hs6;->s:I

    iput-object p2, p0, Lcom/daaw/hs6;->t:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/hs6;->u:Ljava/util/Map;

    iput-object p6, p0, Lcom/daaw/hs6;->v:[B

    return-void
.end method
