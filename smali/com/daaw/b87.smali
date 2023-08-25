.class public final Lcom/daaw/b87;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b87;->a:Ljava/io/InputStream;

    return-void
.end method

.method public static b([B)Lcom/daaw/b87;
    .locals 2

    new-instance v0, Lcom/daaw/b87;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Lcom/daaw/b87;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/daaw/dn7;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/b87;->a:Ljava/io/InputStream;

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/dn7;->P(Ljava/io/InputStream;Lcom/daaw/vr7;)Lcom/daaw/dn7;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/b87;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/b87;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    throw v0
.end method
