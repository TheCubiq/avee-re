.class public Lcom/daaw/tb0$c;
.super Ljava/io/IOException;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/pp;


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lcom/daaw/pp;I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lcom/daaw/tb0$c;->q:Lcom/daaw/pp;

    iput p3, p0, Lcom/daaw/tb0$c;->p:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/pp;I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/tb0$c;->q:Lcom/daaw/pp;

    iput p3, p0, Lcom/daaw/tb0$c;->p:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lcom/daaw/pp;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, Lcom/daaw/tb0$c;->q:Lcom/daaw/pp;

    iput p4, p0, Lcom/daaw/tb0$c;->p:I

    return-void
.end method
