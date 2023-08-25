.class public final Lcom/daaw/zi0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zi0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/yi0;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public a:Z

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/yi0;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "http.agent"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/zi0$a;->e:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lcom/daaw/zi0$b;

    invoke-direct {v2, v0}, Lcom/daaw/zi0$b;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "User-Agent"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v0, Lcom/daaw/zi0$b;

    const-string v2, "identity"

    invoke-direct {v0, v2}, Lcom/daaw/zi0$b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "Accept-Encoding"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/daaw/zi0$a;->f:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zi0$a;->a:Z

    sget-object v1, Lcom/daaw/zi0$a;->f:Ljava/util/Map;

    iput-object v1, p0, Lcom/daaw/zi0$a;->b:Ljava/util/Map;

    iput-boolean v0, p0, Lcom/daaw/zi0$a;->c:Z

    iput-boolean v0, p0, Lcom/daaw/zi0$a;->d:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zi0;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zi0$a;->a:Z

    new-instance v0, Lcom/daaw/zi0;

    iget-object v1, p0, Lcom/daaw/zi0$a;->b:Ljava/util/Map;

    invoke-direct {v0, v1}, Lcom/daaw/zi0;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
