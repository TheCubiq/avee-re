.class public Lcom/daaw/ns1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ns1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/yb<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/ns1$a;


# instance fields
.field public a:Lcom/daaw/ns1$a;

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ns1$a;

    invoke-direct {v0}, Lcom/daaw/ns1$a;-><init>()V

    sput-object v0, Lcom/daaw/ns1;->c:Lcom/daaw/ns1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lcom/daaw/ns1;->c:Lcom/daaw/ns1$a;

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lcom/daaw/ns1;-><init>(Lcom/daaw/ns1$a;I)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ns1$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ns1;->a:Lcom/daaw/ns1$a;

    iput p2, p0, Lcom/daaw/ns1;->b:I

    return-void
.end method


# virtual methods
.method public a(Landroid/os/ParcelFileDescriptor;Lcom/daaw/bc;IILcom/daaw/cq;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p2, p0, Lcom/daaw/ns1;->a:Lcom/daaw/ns1$a;

    invoke-virtual {p2}, Lcom/daaw/ns1$a;->a()Landroid/media/MediaMetadataRetriever;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    iget p3, p0, Lcom/daaw/ns1;->b:I

    if-ltz p3, :cond_0

    int-to-long p3, p3

    invoke-virtual {p2, p3, p4}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime()Landroid/graphics/Bitmap;

    move-result-object p3

    :goto_0
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    return-object p3
.end method
