.class public final Lcom/daaw/p64;
.super Lcom/daaw/cq6;
.source ""


# direct methods
.method public constructor <init>(ILjava/util/Map;Lcom/daaw/pa6;I)V
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Response code: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x7d0

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/daaw/cq6;-><init>(Ljava/lang/String;Lcom/daaw/pa6;II)V

    return-void
.end method
