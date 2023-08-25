.class public abstract Lcom/daaw/y38;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/y38;
    .locals 1

    sget-object v0, Lcom/daaw/s38;->p:Lcom/daaw/s38;

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)Lcom/daaw/y38;
    .locals 1

    new-instance v0, Lcom/daaw/b48;

    invoke-direct {v0, p0}, Lcom/daaw/b48;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b()Z
.end method
