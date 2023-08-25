.class public Lcom/daaw/dl3;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final p:Z

.field public final q:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean p3, p0, Lcom/daaw/dl3;->p:Z

    iput p4, p0, Lcom/daaw/dl3;->q:I

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;
    .locals 2

    new-instance v0, Lcom/daaw/dl3;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1, v1}, Lcom/daaw/dl3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;
    .locals 3

    new-instance v0, Lcom/daaw/dl3;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/daaw/dl3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lcom/daaw/dl3;
    .locals 4

    new-instance v0, Lcom/daaw/dl3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/daaw/dl3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method
