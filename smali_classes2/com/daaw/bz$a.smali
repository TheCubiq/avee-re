.class public final Lcom/daaw/bz$a;
.super Lcom/daaw/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/bz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/h<",
        "Lcom/daaw/pl;",
        "Lcom/daaw/bz;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lcom/daaw/pl;->p:Lcom/daaw/pl$a;

    sget-object v1, Lcom/daaw/bz$a$a;->q:Lcom/daaw/bz$a$a;

    invoke-direct {p0, v0, v1}, Lcom/daaw/h;-><init>(Lcom/daaw/nl$c;Lcom/daaw/z40;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pq;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/bz$a;-><init>()V

    return-void
.end method
