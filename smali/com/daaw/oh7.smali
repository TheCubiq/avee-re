.class public final Lcom/daaw/oh7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/oh7;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/mh7;

    invoke-direct {v0}, Lcom/daaw/mh7;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/mh7;->a()Lcom/daaw/oh7;

    move-result-object v0

    sput-object v0, Lcom/daaw/oh7;->b:Lcom/daaw/oh7;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lcom/daaw/nh7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oh7;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oh7;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/oh7;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/daaw/oh7;

    iget-object v0, p0, Lcom/daaw/oh7;->a:Ljava/util/Map;

    iget-object p1, p1, Lcom/daaw/oh7;->a:Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/oh7;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oh7;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
