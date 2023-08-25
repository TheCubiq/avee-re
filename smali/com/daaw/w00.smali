.class public Lcom/daaw/w00;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jp;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jp<",
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/x00;

.field public final r:Lcom/daaw/zb;

.field public final s:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/i10;

    new-instance v1, Lcom/daaw/kg1;

    invoke-direct {v1, p1, p2}, Lcom/daaw/kg1;-><init>(Lcom/daaw/bc;Lcom/daaw/cq;)V

    invoke-direct {v0, v1}, Lcom/daaw/i10;-><init>(Lcom/daaw/d51;)V

    iput-object v0, p0, Lcom/daaw/w00;->p:Lcom/daaw/d51;

    new-instance v0, Lcom/daaw/x00;

    invoke-direct {v0, p1, p2}, Lcom/daaw/x00;-><init>(Lcom/daaw/bc;Lcom/daaw/cq;)V

    iput-object v0, p0, Lcom/daaw/w00;->q:Lcom/daaw/x00;

    new-instance p1, Lcom/daaw/zb;

    invoke-direct {p1}, Lcom/daaw/zb;-><init>()V

    iput-object p1, p0, Lcom/daaw/w00;->r:Lcom/daaw/zb;

    invoke-static {}, Lcom/daaw/it0;->b()Lcom/daaw/zw;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/w00;->s:Lcom/daaw/zw;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/w00;->s:Lcom/daaw/zw;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/w00;->r:Lcom/daaw/zb;

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/w00;->q:Lcom/daaw/x00;

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/w00;->p:Lcom/daaw/d51;

    return-object v0
.end method
