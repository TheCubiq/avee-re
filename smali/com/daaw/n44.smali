.class public final Lcom/daaw/n44;
.super Lcom/daaw/px2;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/mx2;)V
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Invalid content range: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/px2;-><init>(Ljava/lang/String;Lcom/daaw/mx2;I)V

    return-void
.end method
