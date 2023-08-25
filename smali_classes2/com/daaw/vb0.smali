.class public Lcom/daaw/vb0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Map;)Lcom/daaw/ub0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/ub0;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ub0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ub0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
