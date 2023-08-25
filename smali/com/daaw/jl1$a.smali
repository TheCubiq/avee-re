.class public final Lcom/daaw/jl1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jl1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/jl1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/jl1;

    invoke-direct {v0}, Lcom/daaw/jl1;-><init>()V

    sput-object v0, Lcom/daaw/jl1$a;->a:Lcom/daaw/jl1;

    return-void
.end method

.method public static synthetic a()Lcom/daaw/jl1;
    .locals 1

    sget-object v0, Lcom/daaw/jl1$a;->a:Lcom/daaw/jl1;

    return-object v0
.end method
