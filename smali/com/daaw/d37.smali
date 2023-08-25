.class public Lcom/daaw/d37;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/x27;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Lcom/daaw/c37;
    .locals 1

    new-instance p0, Lcom/daaw/x27;

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/daaw/x27;-><init>(I)V

    return-object p0
.end method

.method public static b(Ljava/util/Comparator;)Lcom/daaw/c37;
    .locals 1

    new-instance v0, Lcom/daaw/y27;

    invoke-direct {v0, p0}, Lcom/daaw/y27;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
