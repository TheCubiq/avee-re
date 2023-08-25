.class public final Lcom/daaw/yz0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ax;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yz0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ax<",
        "Lcom/daaw/yz0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/daaw/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


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

.field public c:Lcom/daaw/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/xz0;->a:Lcom/daaw/xz0;

    sput-object v0, Lcom/daaw/yz0$a;->d:Lcom/daaw/lt0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/yz0$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/yz0$a;->b:Ljava/util/Map;

    sget-object v0, Lcom/daaw/yz0$a;->d:Lcom/daaw/lt0;

    iput-object v0, p0, Lcom/daaw/yz0$a;->c:Lcom/daaw/lt0;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lcom/daaw/mt0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/yz0$a;->e(Ljava/lang/Object;Lcom/daaw/mt0;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Object;Lcom/daaw/mt0;)V
    .locals 2

    new-instance p1, Lcom/daaw/cx;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/daaw/cx;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/ax;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yz0$a;->f(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/yz0$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/daaw/yz0;
    .locals 4

    new-instance v0, Lcom/daaw/yz0;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lcom/daaw/yz0$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lcom/daaw/yz0$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Lcom/daaw/yz0$a;->c:Lcom/daaw/lt0;

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/yz0;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/daaw/lt0;)V

    return-object v0
.end method

.method public d(Lcom/daaw/dj;)Lcom/daaw/yz0$a;
    .locals 0

    invoke-interface {p1, p0}, Lcom/daaw/dj;->a(Lcom/daaw/ax;)V

    return-object p0
.end method

.method public f(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/yz0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Lcom/daaw/lt0<",
            "-TU;>;)",
            "Lcom/daaw/yz0$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/yz0$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/yz0$a;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
