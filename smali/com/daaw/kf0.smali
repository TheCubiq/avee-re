.class public Lcom/daaw/kf0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zw;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/zw<",
        "Lcom/daaw/jf0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/zw;Lcom/daaw/zw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zw<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/daaw/zw<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kf0;->a:Lcom/daaw/zw;

    iput-object p2, p0, Lcom/daaw/kf0;->b:Lcom/daaw/zw;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 0

    check-cast p1, Lcom/daaw/jf0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/kf0;->b(Lcom/daaw/jf0;Ljava/io/OutputStream;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/jf0;Ljava/io/OutputStream;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/jf0;->b()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kf0;->a:Lcom/daaw/zw;

    invoke-virtual {p1}, Lcom/daaw/jf0;->b()Ljava/io/InputStream;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1, p2}, Lcom/daaw/zw;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/kf0;->b:Lcom/daaw/zw;

    invoke-virtual {p1}, Lcom/daaw/jf0;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    goto :goto_0
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kf0;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/kf0;->a:Lcom/daaw/zw;

    invoke-interface {v1}, Lcom/daaw/zw;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/kf0;->b:Lcom/daaw/zw;

    invoke-interface {v1}, Lcom/daaw/zw;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kf0;->c:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/daaw/kf0;->c:Ljava/lang/String;

    return-object v0
.end method
