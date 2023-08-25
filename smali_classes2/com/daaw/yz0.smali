.class public Lcom/daaw/yz0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yz0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/lt0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/xr1<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;Lcom/daaw/lt0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/lt0<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/xr1<",
            "*>;>;",
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yz0;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/daaw/yz0;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/daaw/yz0;->c:Lcom/daaw/lt0;

    return-void
.end method

.method public static a()Lcom/daaw/yz0$a;
    .locals 1

    new-instance v0, Lcom/daaw/yz0$a;

    invoke-direct {v0}, Lcom/daaw/yz0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    .locals 4

    new-instance v0, Lcom/daaw/wz0;

    iget-object v1, p0, Lcom/daaw/yz0;->a:Ljava/util/Map;

    iget-object v2, p0, Lcom/daaw/yz0;->b:Ljava/util/Map;

    iget-object v3, p0, Lcom/daaw/yz0;->c:Lcom/daaw/lt0;

    invoke-direct {v0, p2, v1, v2, v3}, Lcom/daaw/wz0;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lcom/daaw/lt0;)V

    invoke-virtual {v0, p1}, Lcom/daaw/wz0;->s(Ljava/lang/Object;)Lcom/daaw/wz0;

    return-void
.end method

.method public c(Ljava/lang/Object;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/yz0;->b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
