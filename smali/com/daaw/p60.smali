.class public Lcom/daaw/p60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Ljava/io/InputStream;",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/d51;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Lcom/daaw/k60;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p60;->a:Lcom/daaw/d51;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;II)Lcom/daaw/z41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/p60;->a:Lcom/daaw/d51;

    new-instance v1, Lcom/daaw/jf0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/daaw/jf0;-><init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/p60;->a(Ljava/io/InputStream;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p60;->a:Lcom/daaw/d51;

    invoke-interface {v0}, Lcom/daaw/d51;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
