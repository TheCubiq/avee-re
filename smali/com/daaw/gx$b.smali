.class public Lcom/daaw/gx$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/z41;Z)Lcom/daaw/kx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/z41<",
            "TR;>;Z)",
            "Lcom/daaw/kx<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/kx;

    invoke-direct {v0, p1, p2}, Lcom/daaw/kx;-><init>(Lcom/daaw/z41;Z)V

    return-object v0
.end method
