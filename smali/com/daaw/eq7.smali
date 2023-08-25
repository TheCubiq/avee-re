.class public final Lcom/daaw/eq7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dq7;


# direct methods
.method public constructor <init>(Lcom/daaw/dq7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eq7;->a:Lcom/daaw/dq7;

    return-void
.end method

.method public static b([BLcom/daaw/x97;)Lcom/daaw/eq7;
    .locals 0

    new-instance p1, Lcom/daaw/eq7;

    invoke-static {p0}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/daaw/eq7;-><init>(Lcom/daaw/dq7;)V

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/eq7;->a:Lcom/daaw/dq7;

    invoke-virtual {v0}, Lcom/daaw/dq7;->a()I

    move-result v0

    return v0
.end method
