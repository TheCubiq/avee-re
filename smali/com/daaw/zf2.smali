.class public Lcom/daaw/zf2;
.super Ljava/lang/Exception;
.source ""


# instance fields
.field public final p:Lcom/daaw/mf2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zf2;->p:Lcom/daaw/mf2;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/mf2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/daaw/zf2;->p:Lcom/daaw/mf2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/zf2;->p:Lcom/daaw/mf2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/zf2;->p:Lcom/daaw/mf2;

    return-void
.end method
