.class public Lcom/daaw/x00;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/ns1;

.field public final b:Lcom/daaw/bc;

.field public c:Lcom/daaw/cq;


# direct methods
.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 1

    new-instance v0, Lcom/daaw/ns1;

    invoke-direct {v0}, Lcom/daaw/ns1;-><init>()V

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/x00;-><init>(Lcom/daaw/ns1;Lcom/daaw/bc;Lcom/daaw/cq;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ns1;Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x00;->a:Lcom/daaw/ns1;

    iput-object p2, p0, Lcom/daaw/x00;->b:Lcom/daaw/bc;

    iput-object p3, p0, Lcom/daaw/x00;->c:Lcom/daaw/cq;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/ParcelFileDescriptor;II)Lcom/daaw/z41;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
            "II)",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/x00;->a:Lcom/daaw/ns1;

    iget-object v2, p0, Lcom/daaw/x00;->b:Lcom/daaw/bc;

    iget-object v5, p0, Lcom/daaw/x00;->c:Lcom/daaw/cq;

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ns1;->a(Landroid/os/ParcelFileDescriptor;Lcom/daaw/bc;IILcom/daaw/cq;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/x00;->b:Lcom/daaw/bc;

    invoke-static {p1, p2}, Lcom/daaw/dc;->d(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/dc;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/x00;->a(Landroid/os/ParcelFileDescriptor;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap"

    return-object v0
.end method
