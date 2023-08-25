.class public Lcom/daaw/dq$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ut$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/ut$b;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field

.field public final synthetic c:Lcom/daaw/dq;


# direct methods
.method public constructor <init>(Lcom/daaw/dq;Lcom/daaw/zw;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zw<",
            "TDataType;>;TDataType;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/dq$c;->c:Lcom/daaw/dq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/dq$c;->a:Lcom/daaw/zw;

    iput-object p3, p0, Lcom/daaw/dq$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/dq$c;->c:Lcom/daaw/dq;

    invoke-static {v1}, Lcom/daaw/dq;->a(Lcom/daaw/dq;)Lcom/daaw/dq$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/dq$b;->a(Ljava/io/File;)Ljava/io/OutputStream;

    move-result-object v0

    iget-object p1, p0, Lcom/daaw/dq$c;->a:Lcom/daaw/zw;

    iget-object v1, p0, Lcom/daaw/dq$c;->b:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Lcom/daaw/zw;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_2
    const-string p1, "DecodeJob"

    const/4 v1, 0x3

    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_0
    const/4 p1, 0x0

    :catch_2
    :cond_1
    :goto_0
    return p1

    :goto_1
    if-eqz v0, :cond_2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_2
    throw p1
.end method
