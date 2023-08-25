.class public Lcom/daaw/px2;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final p:Lcom/daaw/mx2;


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lcom/daaw/mx2;I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lcom/daaw/px2;->p:Lcom/daaw/mx2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/mx2;I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/px2;->p:Lcom/daaw/mx2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lcom/daaw/mx2;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, Lcom/daaw/px2;->p:Lcom/daaw/mx2;

    return-void
.end method
