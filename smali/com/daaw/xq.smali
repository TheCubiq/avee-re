.class public final Lcom/daaw/xq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e00;


# static fields
.field public static final g:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lcom/daaw/zz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.flac.FlacExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/daaw/zz;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating FLAC extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lcom/daaw/xq;->g:Ljava/lang/reflect/Constructor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/xq;->e:I

    return-void
.end method


# virtual methods
.method public declared-synchronized a()[Lcom/daaw/zz;
    .locals 8

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/xq;->g:Ljava/lang/reflect/Constructor;

    const/16 v1, 0xc

    if-nez v0, :cond_0

    const/16 v2, 0xc

    goto :goto_0

    :cond_0
    const/16 v2, 0xd

    :goto_0
    new-array v2, v2, [Lcom/daaw/zz;

    new-instance v3, Lcom/daaw/un0;

    iget v4, p0, Lcom/daaw/xq;->a:I

    invoke-direct {v3, v4}, Lcom/daaw/un0;-><init>(I)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    new-instance v5, Lcom/daaw/d40;

    iget v6, p0, Lcom/daaw/xq;->c:I

    invoke-direct {v5, v6}, Lcom/daaw/d40;-><init>(I)V

    aput-object v5, v2, v3

    const/4 v3, 0x2

    new-instance v5, Lcom/daaw/vq0;

    iget v6, p0, Lcom/daaw/xq;->b:I

    invoke-direct {v5, v6}, Lcom/daaw/vq0;-><init>(I)V

    aput-object v5, v2, v3

    const/4 v3, 0x3

    new-instance v5, Lcom/daaw/tq0;

    iget v6, p0, Lcom/daaw/xq;->d:I

    invoke-direct {v5, v6}, Lcom/daaw/tq0;-><init>(I)V

    aput-object v5, v2, v3

    const/4 v3, 0x4

    new-instance v5, Lcom/daaw/s1;

    invoke-direct {v5}, Lcom/daaw/s1;-><init>()V

    aput-object v5, v2, v3

    const/4 v3, 0x5

    new-instance v5, Lcom/daaw/s;

    invoke-direct {v5}, Lcom/daaw/s;-><init>()V

    aput-object v5, v2, v3

    const/4 v3, 0x6

    new-instance v5, Lcom/daaw/do1;

    iget v6, p0, Lcom/daaw/xq;->e:I

    iget v7, p0, Lcom/daaw/xq;->f:I

    invoke-direct {v5, v6, v7}, Lcom/daaw/do1;-><init>(II)V

    aput-object v5, v2, v3

    const/4 v3, 0x7

    new-instance v5, Lcom/daaw/t20;

    invoke-direct {v5}, Lcom/daaw/t20;-><init>()V

    aput-object v5, v2, v3

    const/16 v3, 0x8

    new-instance v5, Lcom/daaw/rt0;

    invoke-direct {v5}, Lcom/daaw/rt0;-><init>()V

    aput-object v5, v2, v3

    const/16 v3, 0x9

    new-instance v5, Lcom/daaw/c01;

    invoke-direct {v5}, Lcom/daaw/c01;-><init>()V

    aput-object v5, v2, v3

    const/16 v3, 0xa

    new-instance v5, Lcom/daaw/ew1;

    invoke-direct {v5}, Lcom/daaw/ew1;-><init>()V

    aput-object v5, v2, v3

    const/16 v3, 0xb

    new-instance v5, Lcom/daaw/n2;

    invoke-direct {v5}, Lcom/daaw/n2;-><init>()V

    aput-object v5, v2, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zz;

    aput-object v0, v2, v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected error creating FLAC extractor"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_1
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
