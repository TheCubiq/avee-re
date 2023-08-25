.class public interface abstract Lcom/daaw/jl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jl$b;,
        Lcom/daaw/jl$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/daaw/jl$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/jl$b;->p:Lcom/daaw/jl$b;

    sput-object v0, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    return-void
.end method


# virtual methods
.method public abstract D(Lcom/daaw/gl;)Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/gl<",
            "-TT;>;)",
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract E(Lcom/daaw/gl;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gl<",
            "*>;)V"
        }
    .end annotation
.end method
