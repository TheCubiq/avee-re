.class public abstract Lcom/daaw/t48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xd8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/daaw/w48<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/daaw/t48<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lcom/daaw/xd8;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract e([BII)Lcom/daaw/t48;
.end method

.method public abstract f([BIILcom/daaw/l88;)Lcom/daaw/t48;
.end method

.method public final synthetic g([BLcom/daaw/l88;)Lcom/daaw/xd8;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/daaw/t48;->f([BIILcom/daaw/l88;)Lcom/daaw/t48;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic h([B)Lcom/daaw/xd8;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/t48;->e([BII)Lcom/daaw/t48;

    move-result-object p1

    return-object p1
.end method
