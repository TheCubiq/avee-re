.class public final Lcom/daaw/jl$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$c<",
        "Lcom/daaw/jl;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic p:Lcom/daaw/jl$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/jl$b;

    invoke-direct {v0}, Lcom/daaw/jl$b;-><init>()V

    sput-object v0, Lcom/daaw/jl$b;->p:Lcom/daaw/jl$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
