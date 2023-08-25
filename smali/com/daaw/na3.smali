.class public final Lcom/daaw/na3;
.super Lcom/daaw/ma3;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/ma3;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    return-void
.end method

.method public static f(Ljava/lang/String;Z)Lcom/daaw/ma3;
    .locals 2

    new-instance p1, Lcom/daaw/na3;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lcom/daaw/na3;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    return-object p1
.end method
