.class public abstract Lcom/daaw/c37;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method

.method public final b(I)Lcom/daaw/a37;
    .locals 1

    new-instance p1, Lcom/daaw/b37;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lcom/daaw/b37;-><init>(Lcom/daaw/c37;I)V

    return-object p1
.end method
