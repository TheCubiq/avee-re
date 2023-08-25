.class public final Lcom/daaw/qz;
.super Ljava/lang/Exception;
.source ""


# instance fields
.field public final p:I

.field public final q:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;I)V
    .locals 0

    invoke-direct {p0, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p1, p0, Lcom/daaw/qz;->p:I

    iput p4, p0, Lcom/daaw/qz;->q:I

    return-void
.end method

.method public static a(Ljava/lang/Exception;I)Lcom/daaw/qz;
    .locals 3

    new-instance v0, Lcom/daaw/qz;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lcom/daaw/qz;-><init>(ILjava/lang/String;Ljava/lang/Throwable;I)V

    return-object v0
.end method

.method public static b(Ljava/io/IOException;)Lcom/daaw/qz;
    .locals 4

    new-instance v0, Lcom/daaw/qz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, p0, v3}, Lcom/daaw/qz;-><init>(ILjava/lang/String;Ljava/lang/Throwable;I)V

    return-object v0
.end method

.method public static c(Ljava/lang/RuntimeException;)Lcom/daaw/qz;
    .locals 4

    new-instance v0, Lcom/daaw/qz;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, p0, v3}, Lcom/daaw/qz;-><init>(ILjava/lang/String;Ljava/lang/Throwable;I)V

    return-object v0
.end method
