.class public abstract Lcom/daaw/zc8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/zc8;

.field public static final b:Lcom/daaw/zc8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/gc8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/gc8;-><init>(Lcom/daaw/dc8;)V

    sput-object v0, Lcom/daaw/zc8;->a:Lcom/daaw/zc8;

    new-instance v0, Lcom/daaw/lc8;

    invoke-direct {v0, v1}, Lcom/daaw/lc8;-><init>(Lcom/daaw/ic8;)V

    sput-object v0, Lcom/daaw/zc8;->b:Lcom/daaw/zc8;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/oc8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/zc8;
    .locals 1

    sget-object v0, Lcom/daaw/zc8;->a:Lcom/daaw/zc8;

    return-object v0
.end method

.method public static d()Lcom/daaw/zc8;
    .locals 1

    sget-object v0, Lcom/daaw/zc8;->b:Lcom/daaw/zc8;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
